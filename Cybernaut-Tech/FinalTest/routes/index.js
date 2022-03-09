var express = require('express');
var router = express.Router();
var User = require('../models/test')

/* GET home page. */
router.get('/', function(req, res, next) {
    res.render('index', { title: 'Express' });
});

// router.get('/about', (req, res) => {
//     res.render('about', { title: 'Express' });
// });

// router.get('/services', (req, res) => {
//     res.render('services', { title: 'Express' });
// });

// router.get('/portfolio', (req, res) => {
//     res.render('portfolio', { title: 'Express' });
// });

// router.get('/team', (req, res) => {
//     res.render('team', { title: 'Express' });
// });

// router.get('/contact', (req, res) => {
//     res.render('contact', { title: 'Express' });
// });

// router.get('/google', (req, res) => {
//     res.redirect('https://www.google.com');
// });

// router.get('/dashboard', (req, res) => {
//     res.render('dashboard', { title: 'Table' });
// });

router.post('/add', (req, res) => {
    const name = req.body.name //name from table
    const email = req.body.email
    const phone = req.body.phone
    const message = req.body.message
    new User({
        Name: name, //name : from form , Name from Schema
        Email: email,
        Phone: phone,
        Message: message
    }).save((err, data) => {
        if (err) {
            console.log(err)
        } else {
            console.log(data)
        }
    })
});

router.get('/dashboard', (req, res) => {
    User.find((err, data) => {
        if (err) {
            console.log(err)
        } else {
            console.log(data)
            res.render('dashboard', { data: data })
        }
    })
})

/*router for update */

router.post('/update/:id', (req, res) => {
    id = { "_id": req.params.id }
    let updata = {
        Name: req.body.name,
        Email: req.body.email,
        Phone: req.body.phone,
        Message: req.body.message
    }
    User.findByIdAndUpdate(id, updata, (err, data) => {
        if (err) {
            console.log(err)
        } else {

            console.log(data)
            res.redirect('/dashboard')
        }
    })
})

/*Delete routing*/

router.post('/delete/:id', (req, res) => {
    id = { "_id": req.params.id };
    // let updata = {
    //     Name: req.body.name,
    //     Email: req.body.email,
    //     Phone: req.body.phone,
    //     Message: req.body.message
    // }
    User.findByIdAndRemove(id, (err, data) => {
        if (err) {
            console.log(err)
        } else {

            // console.log(data)
            res.redirect('/dashboard')
        }
    })
});

module.exports = router;