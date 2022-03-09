const express = require('express');

const mongoose = require('mongoose');

const User = require('../model/testquery');

// router.get('/', function(req, res, next) {
//     res.json(User)
// res.render('<h1>Working</h1>')

// const pass = req.body.password
// })

/*<input name = "password">
 */

// const User = require('/model/testquery');
const router = express.Router();

router.get('/', function(req, res) {
    User.find(function(err, data) {
        if (err) {
            console.log(err)
        } else {
            res.json(data)
        }
    })
})


router.post('/add', function(req, res) {
    const Question = req.body.Question
    const OptionA = req.body.OptionA
    const OptionB = req.body.OptionB
    const OptionC = req.body.OptionC
    const OptionD = req.body.OptionD
    const Answer = req.body.Answer
    new User({
        Question: Question,
        OptionA: OptionA,
        OptionB: OptionB,
        OptionC: OptionC,
        OptionD: OptionD,
        Answer: Answer
    }).save(function(err, data) {
        if (err) {
            console.log(err)
        } else {
            console.log(data)
            res.json(data)
        }
    })
})

module.exports = router;

///////////////////////Updating Data//////////////////////////////
router.post('/update/:id', (req, res, next) => {
    const id = req.params.id;
    let UserUpdate = {
        _id: id,
        heading: req.body.heading,
        email: req.body.email,
        phone: req.body.phone,
        username: req.body.username,
        password: req.body.password

    };
    User.findOneAndUpdate({ _id: id }, UserUpdate, (err, data) => {
        if (err) {
            console.log(err)
        } else {
            res.json(data)
            console.log(data)
        }
    })
})

////////////////////Delete Data///////////////////////////////////////
router.post('/delete/:id', (req, res) => {
    let id = req.params.id
    User.findOneAndRemove(id, (err, data) => {
        if (err) {
            console.log(err)
        } else {
            res.json(data)
            console.log(data)
        }
    })
})
module.exports = router;