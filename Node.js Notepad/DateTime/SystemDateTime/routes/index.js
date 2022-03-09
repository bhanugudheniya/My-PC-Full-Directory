var express = require('express');
var router = express.Router();
var http = require('http');
var dt = require('./Datamodule');

/* GET home page. */
router.get('/', function(req, res, next) {
    res.render('index', { title: 'Express' });
});

http.createServer(function(req, res) {
    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.write("The Date and Time are currently : " + dt.myDateTime());
    res.end();
}).listen(5000);
module.exports = router;