const mongoose = require('mongoose');
const Schema = mongoose.Schema;
let user = new Schema({
    Name: {
        type: String
    },
    Email: {
        type: String
    },
    Phone: {
        type: Number
    },
    Message: {
        type: String
    },

});
module.exports = mongoose.model('User', user);