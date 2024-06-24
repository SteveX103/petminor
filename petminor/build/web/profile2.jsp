<%-- 
    Document   : profile2
    Created on : Nov 23, 2023, 1:46:57 PM
    Author     : Sayantan Ghosh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>profile2</title>
    <style>
       body{
            background-color: #252954;
        } 
        #container{
            /* border: 2px solid black; */
            display:flex;
            flex-direction:row;
            flex-wrap:wrap;
            align-items: stretch;
            width:100%;
            height:500px;
            padding:40px;
            /* justify-content: space-around; */
            background-color: aliceblue;
        } 
        .box{
            display: flex;
            width: 300px; 
            height:30px;
            /* border:2px solid black; */
            position:relative;
            top:10px;
            

            /* height:200px; */
        }
        .img{
            /* border:1px solid red; */
            border-radius: 130px;
            width: 150px;
            margin:10px auto;
            
            justify-content:center;
        }
        label{
            font-size: 20px;
        }
        button{
            width:150px;
            margin:auto 590px;
            height: 30px;
            border-radius: 16px;
            text-align:center;
            background-color: transparent;
            transition:.8s;
            position:relative;
            overflow:hidden;
        }
       /*  button:hover{
           background-color: #3498db;
        }  */  
        /*  button::before{
            content:'';
            position:absolute;
            top:0;
            border-radius:0 0 50% 50%;
            left:0;
            width:100%;
            height:0%;
            
            background-color: #3b46a5;
            z-index:-1 ;
            transition:.8s; */
       /*  } 
        button:hover::before{
            height:180%;
        } */
        button::before{
            content: '';
            background: #478feede;
            height:100%;
            width:0;
            position:absolute;
            left:0;
            bottom:0;
            text-align: center;
            z-index:-1;
            transition:.9s;
        }
        button:hover::before{
            width:100%;
            
        }
        input:hover{
            box-shadow: 10px 10px 10px  rgba(34, 155, 224, 0.4); 
        }
            
            
           
         
    </style>
</head>
<body>
<%
    HashMap<String, String> profile = (HashMap<String, String>)request.getAttribute("profile");
%>
    
        <div class="img">
        <img src="img/cat.png" alt="" class="img">

        </div>
        <button class="btn"><span>update profile picture</span></button>
        <hr>
        <div id="container">   
    <div class="box">
        <label for="name">full Name:</label>
        
        <input type="text" name="name" id="name" placeholder="<%out.print(profile.get("name"));%>">
    </div>
    <div class="box">
        <label for="birth">D.O.B:</label>
        
        <input type="date" name="date" id="birth" placeholder="enter your name">
    </div>
    <div class="box">
        <label for="address">address:</label>
        <input type="text" name="address" id="address" placeholder="enter your name">
    </div>
    <div class="box">
        <label for="gen">
        Gender:
        <input type="text" name="gender"  id="gen">Male
        </label>
    </div>
    <div class="box">
        <label for="mobile">mobile:</label>
        <input type="text" name="mobile no" id="mobile" placeholder="<%out.print(profile.get("phone"));%>">
    </div>
    <div class="box">
        <label for="email">Email:</label>
        <input type="email" name="email" id="email" placeholder="<%out.print(profile.get("email"));%>">
    </div>
    <div class="box">
        <label for="qualification">Qualification:</label>
        <input type="text" name="qualification" id="qualification" placeholder="enter your qualification">
    </div>
    <button>save changes</button>
</div>
</body>
</html>
