var express = require('express');
var router = express.Router();
var User = require('../model/NodeSchema');

/* GET home page. */
router.get('/', function(req, res, next) {
    res.render('index', { title: 'Express' });
});

// Add Data 
router.post('/addData', (req, res) => {
    const name = req.body.name
    const rollnumber = req.body.rollnumber
    new User({
        name: name,
        rollnumber: rollnumber
    }).save(function(err, data) {
        if (err) {
            console.log(err)
        } else {
            console.log(data)
            res.json(data)
        }
    })
})

//Get Data
router.get('/getData', function(req, res) {
    User.find(function(err, data) {
        if (err) {
            console.log(err)
        } else {
            res.json(data)
        }
    })
})
module.exports = router;

// Update Data
router.post('/updateData/:id', (req, res, next) => {
    const id = req.param.id;
    let UserUpdate = {
        _id: id,
        name: req.body.name,
        rollnumber: req.body.rollnumber
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

//////////////////////////////////////////////////delete data///////////////////////////////////////////////
router.get('/deleteData/:id', (req, res) => {
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