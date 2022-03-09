const mongoose = require('mongoose');
const Schema = mongoose.Schema;
let user = new Schema({
    question: {
        type: String
    },
    optionA: {
        type: String
    },
    optionB: {
        type: String
    },
    optionC: {
        type: String
    },
    optionD: {
        type: String
    }


});
module.exports = mongoose.model('User', user);