<%-- 
    Document   : login
    Created on : Nov 21, 2023, 7:04:17 PM
    Author     : Sayantan Ghosh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>login page</title>
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
            margin-left: 7%;
            margin-top: 5%
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
            margin-left: 17%;
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
/*        form p{
            float:right;
        }*/
        form p a{
            text-decoration: none;
            color:black;
            font-size: 14px;
        }
        form p a:hover{
            text-decoration: underline;
            color:rgb(18, 123, 235);
/*            font-size: 15px;*/
        }
        form #new{
/*            float:left;*/
              margin-left:13%;
              font-size: 14px;
        }
        .san{
            display:flex;
        }
        body{
            display: flex;
            margin-top: 10%;
            background-image:url('signbg.avif');
            background-repeat:no-repeat;
            background-size:100vw;
        }
        .kal{
            background-image: url('anipet2.png');
            margin-left: 7%;
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
    <form action="http://localhost:8080/petminor/login" method="post">
<!--        <span><b>&times;</b></span>-->
        <h1>Login</h1><br>
         <label for="email">Email</label>&nbsp;&nbsp;
        <input type="email" id="email" name="email" placeholder="Enter your email" required><br><br>
        <div id="msg_email"></div>
        <label for="password">Password</label>&nbsp;&nbsp;
        <input type="password" id="password" name="password" oninput="validate_password()" placeholder="Enter your password" required><br><br>
        
        <button type="submit" onclick="validate_button()">Login</button><br>
        <div id="msg_bttn"></div>
        <div class="san">
            <p><a href="http://localhost:8080/petminor/forgot.html"><b>Forgot Password?</b></a></p><br><br>
            <p id="new"><b>New User?<a href="signup.html"> Sign Up</b></a></p>
        </div>
    </form>
           <script>
               
            function validate_button(){
//                var a=document.getElementById("email").value;
//                var b=document.getElementById("password").value;
               
                alert("login successful");
//                if(a==null || b==null){
//                    alert("login unsuccessful");
//                }
        
//            else{
//                
//            }
            }
            </script>
    </body>
</html>