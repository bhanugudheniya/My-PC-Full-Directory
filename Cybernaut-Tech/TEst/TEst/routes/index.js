var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
    res.json('index', { title: 'Express' });

    router.get('/contact', function(req, res, next) {
        res.json({ contact: 'hello' });
    })

});

module.exports = router;