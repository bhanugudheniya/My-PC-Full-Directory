var express = require('express');
var router = express.Router();
var User = require('../model/Schema');

//  GET home page. */
router.get('/', function(req, res, next) {
    res.render('index', { title: 'Express' });
});

// router.get('/name', function(req, res, next){
//   res.json({Name : 'Bhanu Gudheniya'});
// });

router.post('/add', (req, res) => {
    const question = req.body.Question
    const optionA = req.body.option
    const optionB = req.body.option
    const optionC = req.body.option
    const optionD = req.body.option
    const answer = req.body.Answer
        // console.log(optionA)
    new User({
        Question: question,
        OptionA: optionA,
        OptionB: optionB,
        OptionC: optionC,
        OptionD: optionD,
        Answer: answer
    }).save((err, data) => {
        if (err) {
            console.log(err)
        } else {
            console.log(data)
            res.json(data)
        }
    })
});

router.get('/index', (req, res) => {
    User.find((err, data) => {
        if (err) {
            console.log(err)
        } else {
            console.log(data)
            res.render('index', { data: data })
        }
    })
});
router.post('/check', (req, res) => {
    const Answer = req.body.Answer
    let chk = {
        Answer: Answer
    }
    User.find(chk, (err, data) => {
        if (err) {
            console.log(err)
        } else {
            res.json(data)
        }

    })
})

module.exports = router;