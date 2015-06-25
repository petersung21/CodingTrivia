//#!/bin/env node

var mysql = require('mysql');
var express = require('express');

var app = express();

//app configuration
var ipaddr = process.env.OPENSHIFT_NODEJS_IP || '127.0.0.1';
var port = process.env.OPENSHIFT_NODEJS_PORT || 8080;

//mySQL configuration
var mysqlHost = process.env.OPENSHIFT_MYSQL_DB_HOST || 'localhost';
var mysqlPort = process.env.OPENSHIFT_MYSQL_DB_PORT || 3306;
var mysqlUser = 'adminlfZayJq'; //mysql username
var mysqlPass = '31ED3dEr4gDu'; //mysql password
var mysqlDb   = 'nodejs'; //mysql database name

//Connection String
var mysqlString = 'mysql://'   + mysqlUser + ':' + mysqlPass + '@' + mysqlHost + ':' + mysqlPort + '/' + mysqlDb;

//Connection to mySQL
var mysqlClient = mysql.createConnection(mysqlString);
mysqlClient.connect(function(err){
    if (err){
        console.log(err);
    }
});

app.get('/', function (req,res){
    res.send('OK');
});

app.get('/mysql', function(req,res){
    mysqlClient.query('SELECT * FROM `mysql`.`JavaQuestions`', function(err,rows,fields){
    if (err){
        res.send(err);
    }else {
        res.send(rows[1]);
    }
    });
});

app.listen(port, ipaddr);

