<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	
	
	<style>
	body {
    font-family: Open Sans;
}

h1 {
    text-align: center;
}

#title {
    text-decoration: underline;
}

#quiz {
    text-indent: 10px;
    display:none;
}

.button {
    border:4px solid;
    border-radius:5px;
    width: 40px;
    padding-left:5px;
    padding-right: 5px;
    position: relative;
    float:right;
    background-color: #DCDCDC;
    color: black;
    margin: 0 2px 0 2px;
}

.button.active {
    background-color: #F8F8FF;
    color: #525252;
}

button {
    position: relative;
    float:right;
}

.button a {
    text-decoration: none;
    color: black;
}

#container {
    width:50%;
    margin:auto;
    padding: 0 25px 40px 10px;
    background-color: #1E90FF;
    border:4px solid #B0E0E6;
    border-radius:5px;
    color: #FFFFFF;
    font-weight: bold;
    box-shadow: 5px 5px 5px #888;
}

ul {
    list-style-type: none;
    padding: 0;
    margin: 0;
}

#prev {
    display:none;
}

#start {
    display:none;
    width: 90px;
}
	</style>
		<title>Dynamic Quiz Project</title>
		<link type='text/css' rel='stylesheet' href='stylesheet.css'/>
		<link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Open Sans"/>
		
	</head>
	<body>
		<div id='container'>
			<div id='title'>
				<h1>Quiz Instructions</h1>
			</div>
   			<br/>
  			<div id='quiz'></div>
    		<div class='button' id='next'><a href='#'>Next</a></div>
    		<div class='button' id='prev'><a href='#'>Prev</a></div>
    		<div class='button' id='start'> <a href='#'>Start Over</a></div>
    		<!-- <button class='' id='next'>Next</a></button>
    		<button class='' id='prev'>Prev</a></button>
    		<button class='' id='start'> Start Over</a></button> -->
    	</div>

		<script type='text/javascript' src='https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js'></script>
		<script type="text/javascript" src='questions.json'></script>
		<script type='text/javascript' src='jsquiz.js'></script>
	</body>
</html>