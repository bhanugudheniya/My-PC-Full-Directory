var mongoose = require('mongoose');

var user = mongoose.Schema({
    name : String,
    rollnumber : Number
});

module.exports = mongoose.model('User', user)