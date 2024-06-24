<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>signup</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="nav1.css">
        <style>
        *{
            margin: 0px;
            padding: 0px;
        }
        form{
            /* border: 1.5px solid rgb(41, 196, 247); */
            box-shadow: 0px 0px 10px 5px rgb(41, 196, 247);
            border-radius: 20px;
            /* margin: auto; */
            width: fit-content;
            height: fit-content;
            padding: 15px;
            margin-left: 8%;
            /* margin-top: 10%; */
        }
        h1{
            /* border: 1.5px solid rgb(41, 196, 247); */
            text-align: center;
            margin: 5px;
            
        }
        label{
            font-size: larger;
        }
        input{
            border-radius: 10px;
            height: 30px;
            padding: 5px;
            font-size: medium;
        }
        button{
            width: 200px;
            height: 30px;
            line-height: 10px;
            padding: 10px;
            text-align: center;
            border-radius: 10px;
            margin-left: 18%;
        }
        button:hover{
            cursor: pointer;
            background-color:rgb(162, 222, 241);
            font-size: large;
        }
        div{
            margin: 5px;
            border-radius: 10px;
            padding: 5px;
        }
/*        form span{
            position: absolute;
            margin-left: 23%;
            font-size: larger;
        }
        form span:hover{
            height: 30px;
            width: 30px;
            border-radius: 130px;
            background-color: rgb(41, 196, 247);
            line-height: 30px;
            text-align: center;
            cursor: pointer;
        }*/
        form select{
            border-radius:10px;
            height: 30px;
            padding: 5px;
            font-size: medium;
        }
        body{
            display: flex;
            margin-top: 5%;
            background-image:url('signbg.avif');
            background-repeat:no-repeat;
            background-size:100vw;
        }
        .check{
            display: flex;
        }
        .check #term{
            margin-left: 25%;
        }
        .check a{
            text-decoration: none;
            color: black;
        }
        .check a:hover{
            text-decoration: underline;
            color: rgb(18, 123, 235);
        }
        .check h3{
            margin-left: 5%;
            text-align: center;
        }
        .kal{
            background-image: url('anipet2.png');
            margin-left: 5%;
            width: 400px;
            height: 500px;
            background-size: 400px;
            background-repeat: no-repeat;
            animation-name: san1;
            animation-duration: 5s;
            animation-fill-mode: both;
            animation-iteration-count: infinite;
        }
        @keyframes san1 {
            0%{
                background-image: url('anipet2.png');
            }
            50%{
                background-image: url('anipet1.png');
            }
        }
    </style>
    </head>
    <body>
         <jsp:include page="nav.jsp"></jsp:include>
        <div class="kal">

    </div>
    <form  action="http://localhost:8080/petminor/signup" method="post">
<!--        <span><b>&times;</b></span>-->
        <h1>Sign Up</h1><br>
        <label for="name">Name</label>&nbsp;&nbsp;
        <input type="text" id="name" name="name" placeholder="Enter your name" required><br><br>
        <label for="email">Email</label>&nbsp;&nbsp;
        <input type="email" id="email" name="email" placeholder="Enter your email" required><br><br>
        <div id="msg_email"></div>
        <label for="phn">Phone No.</label>&nbsp;&nbsp;
        <input type="text" id="phn" name="phn" oninput="validate_phoneno()" placeholder="Enter your phone no" required><br>
        <div id="msg_phoneno"></div>
        <label for="password">Password</label>&nbsp;&nbsp;
        <input type="password" id="password" name="password" oninput="validate_password()" placeholder="Enter your password" required><br>
        <div id="msg_pass"></div>
        <label for="cpas">Confirm Password</label>&nbsp;&nbsp;
        <input type="password" id="cpas" name="cpass" oninput="validate_cpass()" placeholder="Enter your confirm password" required><br>
        <div id="msg_conpass"></div>
         <label for="name">Verify Question</label>&nbsp;&nbsp;
        <select name="ques">
            <option>Select...</option>
            <option>What is your Nickname?</option>
            <option>Where do you live?</option>
            <option>What is your Hobby?</option>
        </select><br><br>
         <label for="ans">Verify Answer</label>&nbsp;&nbsp;
        <input type="text" id="ans" name="ans" placeholder="Enter your answer" required><br><br>
        <div class="check">
        <input type="checkbox" id="term" oninput="" required><h3><a href="javascript:alert('Acceptance of Terms:-

You are responsible for maintaining the confidentiality of your username and password for the PetsApp Service,
and you agree not to authorise anyone else to use your username and password. You are responsible for all activity 
under your account. You agree to notify us promptly of any unauthorised use of your account.')">Terms & Conditions</a></h3>
        </div>
        <button type="submit" onclick="validate_button()">Sign Up</button>
        <div id="msg_bttn"></div>
    </form>
    <script>
        function validate_password(){
            var pass=document.getElementById("password").value
            if(pass.length < 8)
            {
                document.getElementById("msg_pass").style.backgroundColor="rgb(162, 222, 241)"
                document.getElementById("msg_pass").style.color="black"
                document.getElementById("msg_pass").innerHTML="Password must have at least 8 characters"
            }
            else if(pass.length >= 8 && pass.length <=15 )
            {
                document.getElementById("msg_pass").style.backgroundColor="rgb(162, 222, 241)"
                document.getElementById("msg_pass").style.color="black"
                document.getElementById("msg_pass").innerHTML="your password pattern is correct"
            }
            else{
                document.getElementById("msg_pass").innerHTML="password limit is 15 that is esceeeded by you"
                document.getElementById("msg_pass").style.color="black"
                document.getElementById("msg_pass").style.backgroundColor="rgb(162, 222, 241)"
                
            } 
        }
        function validate_button(){
            var pass=document.getElementById("password").value
            if(pass.length<8 || pass.length>15)
            {
                alert("please set your password within limit")
            }
            var c=document.getElementById("password").value
            var d=document.getElementById("cpas").value
            if(c==d)
            {
                // document.getElementById("msg_bttn").style.backgroundColor="rgb(162, 222, 241)"
                // document.getElementById("msg_bttn").style.color="black"
                document.getElementById("msg_bttn").innerHTML=""
            } 
            else{
                alert("please re-check your confiem password")
            }
            var no=document.getElementById("phn").value
            if(isNaN(no))
            {
                alert("please enter a valid number")
            }
            else if(no.length>10 || no.length<10){
                alert("please enter a valid number")
            }
            else{
                 document.getElementById("msg_bttn").style.backgroundColor="rgb(162, 222, 241)"
                 document.getElementById("msg_bttn").style.color="black"
                document.getElementById("msg_bttn").innerHTML="signup suucessful"
                alert("signup successful");
            }
        }
        function validate_cpass()
        {
            var c=document.getElementById("password").value
            var d=document.getElementById("cpas").value
            if(c==d)
            {
                document.getElementById("msg_conpass").style.backgroundColor="rgb(162, 222, 241)"
                document.getElementById("msg_conpass").style.color="black"
                document.getElementById("msg_conpass").innerHTML="password is ok"
            }
            else{
                document.getElementById("msg_conpass").style.backgroundColor="rgb(162, 222, 241)"
                document.getElementById("msg_conpass").style.color="black"
                document.getElementById("msg_conpass").innerHTML="password is incorrect"
            }
        }
        function validate_phoneno()
        {
            var no=document.getElementById("phn").value
            if(isNaN(no))
            {
                document.getElementById("msg_phoneno").style.backgroundColor="rgb(162, 222, 241)"
                document.getElementById("msg_phoneno").style.color="black"
                document.getElementById("msg_phoneno").innerHTML="Please enter a valid number"
            }
            else if(no.length==10){
                document.getElementById("msg_phoneno").style.backgroundColor="rgb(162, 222, 241)"
                document.getElementById("msg_phoneno").style.color="black"
                document.getElementById("msg_phoneno").innerHTML="your number is valid" 
                }
            else if(no.length>10){
                document.getElementById("msg_phoneno").style.backgroundColor="rgb(162, 222, 241)"
                document.getElementById("msg_phoneno").style.color="black"
                document.getElementById("msg_phoneno").innerHTML="Please enter a valid number"
            }
            else{
                document.getElementById("msg_phoneno").style.backgroundColor="rgb(162, 222, 241)"
                document.getElementById("msg_phoneno").style.color="black"
                document.getElementById("msg_phoneno").innerHTML="please enter a valid number"
                
            }
        }
    </script>
    </body>
</html>
