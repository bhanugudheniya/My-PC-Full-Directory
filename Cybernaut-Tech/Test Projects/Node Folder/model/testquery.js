const mongoose = require('mongoose');
const Schema = mongoose.Schema;

let user = new Schema({
    Question: {
        type: String
    },
    OptionA: {
        type: String
    },
    OptionB: {
        type: String
    },
    OptionC: {
        type: String
    },
    OptionD: {
        type: String
    },
    Answer: {
        type: String
    }
});

module.exports = mongoose.model('User', user);