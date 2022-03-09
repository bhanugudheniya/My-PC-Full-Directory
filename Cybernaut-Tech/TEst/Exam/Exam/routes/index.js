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
router.post('/add', function(req, res) {
    const question = req.body.question
    const optionA = req.body.optionA
    const optionB = req.body.optionB
    const optionC = req.body.optionC
    const optionD = req.body.optionD
    new User({
        question: question,
        optionA: optionA,
        optionB: optionB,
        optionC: optionC,
        optionD: optionD
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