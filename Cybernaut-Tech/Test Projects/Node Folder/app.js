const express = require('express');
const app = express();
const mongoose = require('mongoose');
const bodyParser = require('body-parser');

const userRoute = require('./routes/user')

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

app.use('/user', userRoute);

mongoose.connect('mongodb://localhost:27017/exam', { useNewUrlParser: true })

module.exports = app;