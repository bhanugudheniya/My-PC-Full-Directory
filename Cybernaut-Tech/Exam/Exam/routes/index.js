var express = require('express');
var router = express.Router();
var User = require('../models/test');

/* GET home page. */
router.get('/', function(req, res, next) {
    res.render('index', { title: 'Express' });
});
// router.get('/contact', function(req, res, next) {
//     res.json({ contact: 'hello' });
// });
// router.get('/Courses', (req, res) => {

// })
// router.post('/add', (req, res) => {
//     const question = req.body.Question
//     const optionB = req.body.option
//     const answer = req.body.Answer
//     console.log(optionB)
//     new User({
//         Question: question,
//         OptionB: optionB,
//         Answer: answer
//     }).save((err, data) => {
//         if (err) {
//             console.log(err)
//         } else {
//             console.log(data)
//             res.json(data)
//         }
//     })
// });

// 
router.post('/add', (req, res) => {
    const question = req.body.Question
    const optionA = req.body.option
    const optionB = req.body.option
    const optionC = req.body.option
    const optionD = req.body.option
    const answer = req.body.Answer
    console.log(optionA)
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

router.get('/Output', (req, res) => {
    User.find((err, data) => {
        if (err) {
            console.log(err)
        } else {
            console.log(data)
            res.render('Output', { data: data })
        }
    })
})

module.exports = router;