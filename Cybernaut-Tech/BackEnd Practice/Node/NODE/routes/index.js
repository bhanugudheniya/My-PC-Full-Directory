var express = require('express');
var router = express.Router();
var User = require('../model/schema');

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});

// Add Data
router.post('/addData', (req,res) =>{
  const name = req.body.name
  const rollnumber = req.body.rollnumber

  new User({
    name : name,
    rollnumber : rollnumber
  }).save(function(err,data){
    if(err){
      console.log(err)
    }
    else{
      console.log(data)
      res.json(data)
    }
  })
})

// Get Data
router.get('/getData', function(req,res){
  User.find(function(err,data){
    if(err){
      console.log(err)
    }
    else{
      console.log(data)
      res.json(data)
    }
  })
})

    //////////////////////////////////////////////////////updating data///////////////////////////////////
    router.post('/update/:id', (req, res, next) => {
      const id = req.params.id;
      let UserUpdate = {
          _id: id,
          name: req.body.name,
          rollnumber: req.body.name
      };
      User.findOneAndUpdate({ _id: id }, UserUpdate, (err, data) => {
          if (err) {
              console.log(err)
          } else {
              // console.log(data)
              res.json(data)
          }
  
      })
  })
  
  /////////////////edit 
  router.get('/edit/:id', (req, res) => {
      let id = req.params.id;
      User.findById(id, function(err, data) {
          res.json(data);
      })
  })
  
  //////////////////////////////////////////////////delete data///////////////////////////////////////////////
  router.get('/delete/:id', (req, res) => {
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
