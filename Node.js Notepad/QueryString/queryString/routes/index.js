var express = require('express');
var router = express.Router();
var http = require('http');

/* GET home page. */
router.get('/', function(req, res, next) {
    res.render('index', { title: 'Express' });
});

http.createServer(function(req, res) {
    res.writeHead(200, { 'Content-type': 'text/html' });
    res.write(req.url);
    res.end();
})

module.exports = router;