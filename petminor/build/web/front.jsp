<%-- 
    Document   : front
    Created on : Nov 21, 2023, 4:48:06 PM
    Author     : Sayantan Ghosh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>front</title>
    <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />
    <style>
        *{
    margin:0px;
    padding:0px;
    list-style:none;
}
body{
    background-color: rgb(237 229 230);
}
html{
    scroll-behavior: smooth;
}
.container{
    display:flex;
    align-items:center;
    justify-content: center;
}
nav {
    display:flex;
    align-items:center;
    justify-content: center;
    font-size:20px;
     position: fixed;
     z-index: 3;
    top:5px;
    background: #03e9f4;
    /*left:100px;  */
}

    
nav a {
    color: black;
padding: 15px 25px;
text-decoration: none;
position: sticky;
z-index: 2000;
}
nav a::before{
    content:'';
    position:absolute;
    top:38px;
    left:0px;
    width:0px;
    height:2px;
    
    background: #fff;
    transition:.5s;
}
nav a ul::before {
   /*  content: none; /* This will remove the ::before pseudo-element */
   /*  position:none;
    top:none;
    left:none;
    width:none;
    height:none; */ 
    content:none;
    background:none;
}

nav a:hover::before{
    color: rgb(107, 70, 70);
    width:100%;
    
}
.image{
    position:absolute;
    top:100px;
    right:10px;
}
.image img{
    width: 311px;
    border-top-left-radius: 10px;
    border-top-left-radius: 646px;
    border-top-right-radius: 479px;
    border-bottom-left-radius: 566px;
}
.image2 img{
    width:1000px;
    position:absolute;
    top:100px;
    left:10px;
}
.container input{
    position:absolute;
    z-index: 4;
    top:20px;
    right:15px;
    padding:5px;
    width:120px;
    border-radius: 30px;
    transition:all .2s ;
}
.button{
height: 23px;
z-index:100;
position: absolute;
top: 1.5rem;
right: 20px;
}
.container input:hover{
    width:150px;
    cursor: pointer;
}
.box{
    width:100%;
    height:250px;
}
/* .box::before{

.svg{
    width:100vw;
}
*/section {
    position: absolute;
    direction: left;
    top: 59px;
    right:34px;
    z-index: 2;
    background-image: url('you1.png');
background-size: 500px;
background-repeat: no-repeat;
width:500px;
height: 550px;
animation-name: abir1;
animation-duration: 10s;
 animation-fill-mode: linear; 
animation-iteration-count: infinite;
 animation-timing-function: ease; 
}/*
*/@keyframes abir1 {/*
/* 0% {
background-image: url('my12.png');
}
25% {
background-image: url('my1.png');
} */
0%{
background-image: url('you1.png');
}
50%{
background-image: url('catu.png');
}
}
nav ul ul {
display: none;
position: absolute; 
transition:all 0.7s ease-in-out;
top: 60px;  
}
nav ul ul li{
padding: 5px;
background-color:white;
transform: translatex(0px);
transition:all 0.7s ease-in-out;
width:184px;
}
nav ul ul li:hover{
transform:translatex(-30px);
background-color:#f5cfcd;
color:white;

}
nav ul li:hover ul {
display:block; 
}
.para{
position:absolute;
top:200px;
left:5px;
}

.work{
position:relative;
top:90vh;
display:flex;
}
.left{
border:2px solid black;
width:300px;
height:300px;
margin:20px;
border-radius:15px;
overflow:hidden;
box-shadow: 0px 0px 10px 5px rgb(41, 196, 247); 
}
.left:hover{
background-size: 350px;
}
.left::after{
content:"";
position:absolute;
top:0px;
width:200px;
height:200px;
margin:62px 59px;
background-image: url('consult.png');
background-size: 200px;
background-repeat: no-repeat;
z-index:4;
border-radius:15px;
transition:all 0.7s;
}
.left:hover::after{
transform: scale(1.2);
}
.left::before{
content: "";
position:absolute; 
width:0px;
height:300px;
background-color: #0099ff;
border-radius:15px;
transition:all 0.9s;
}
.left:hover::before{
width:300px;
}
.left h3{
position:absolute;
z-index:5;
top: 269px;
left: 99px;
}
.mid{
border:2px solid black;
width:300px;
height:300px;
margin: 20px;
border-radius:15px;
box-shadow: 0px 0px 10px 5px rgb(41, 196, 247);
}
.mid h3{
position:absolute;
z-index:100;
top: 276px;
left:450px;
}
.mid img{
width:100px;
position:absolute;
z-index:99;
top: 117px;
left: 485px;
transition: all 0.7s;
}
.mid:hover img{
top:245px;
left:610px;
width:50px;
}
.mid::before{
content:"";
position:absolute;
width:300px;
height:0px;
background-color: #0099ff;
border-radius:15px;
transition:all 0.9s;
}
.mid::after{
content:"";
position:absolute;
top:-281px;
width:300px;
height:300px;
background-image: url('medi.png');
background-size: 300px;
background-repeat: no-repeat;
z-index:4;
border-radius:15px;
visibility: hidden;
transition:all 0.5s linear;
}
.mid:hover::after{
top:0px;
visibility: visible;
}
.mid:hover::before{
height:300px;
}
.right{
border:2px solid black;
width:300px;
height:300px;
margin:20px;
border-radius:15px;
box-shadow: 0px 0px 10px 5px rgb(41, 196, 247);
}
.right::after{
content:"";
position:absolute;
top:36px;
width:200px;
height:200px;
margin:62px 59px;
background-image: url('sht.png');
background-size: 200px;
background-repeat: no-repeat;
z-index:4;
border-radius:15px;
transition:all 0.7s;
}
.right:hover:after{
transform:scale(1.4);
}
.right::before{
content: "";
position:absolute; 
width:300px;
height:300px;
background-color: #0099ff;
border-radius:15px;
transition:all 1s reverse;
transform:scale(0);
transform-origin: right;
transition:transform 0.5s ease-in-out;
}
.right:hover:before{
transform:scale(1);
}
.right:hover{
box-shadow: 0px 0px 10px 5px rgb(41, 196, 247);
}
.right h3{
position: absolute;
top: 269px;
left: 118px;
}
.fourth{
border:2px solid black;
width:300px;
height:300px;
margin:20px;
transition: all 0.5s ease;
border-radius:15px;
box-shadow: 0px 0px 10px 5px rgb(41, 196, 247);

}
.color{
background-color: #0099ff;
position:absolute;
z-index: 1;
width:300px;
height:0px;
transition: all 0.9s ease;
border-radius:15px;
}
.fourth:hover .color{
height: 300px;
}
.fourth::before{
content:"";
position:absolute;
z-index: 2;
top: 8px;
width: 300px;
height: 200px;
margin: 62px 5px;
background-image: url('feed2.png');
background-size: 300px;
background-repeat: no-repeat;
z-index:4;
border-radius:15px;
transform:rotateY(0deg);
transition:all 0.9s ease-in-out;
}
.fourth:hover:before{
transform:rotatey(-90deg);
}
.fourth::after{
content:"";
position:absolute;
z-index: 3;
top: -3px;
width: 300px;
height: 200px;
margin: 72px 0px;
background-image: url('feed3.png');
background-size: 300px;
background-repeat: no-repeat;
z-index:4;
border-radius:15px;
transform:rotateY(90deg);
transition:all 0.9s ease-in-out;
}
.fourth:hover:after{
transform:rotateY(0deg);
}
.provide{
position:absolute;
top:895px;
margin:auto 575px;
width:auto;
}
.fourth h3{
position: absolute;
top: 269px;
left: 118px;
}
.gif{
position:absolute;
width:100vw;
top:550px;
background-color:#f5cfcd;
}
.letter{
color:rgb(28, 74, 224);
position: absolute;
overflow:hidden;
top:670px;
z-index: 1;
font-size:50px;
font-style: italic;
height:50px;
left:100px;
width:0px;
animation-name: letter;
animation-duration:15s;
/* animation-fill-mode: both; */
animation-iteration-count: infinite;
animation-delay: 3s;
/* transition:all 0.9s ease-in-out 2s;  */
}
@keyframes letter {
0%{
width:0px;
}
25%{
width:0px;
}
50%{
width:0px;
}
75%{
width:400px;
}
100%{
width:400px;
}
}
.values{
height:100vh;
width:1000px;
position:relative;
top:646px;
background-color:#0099ff; 
border-radius:0px 857px 0px 0px;
display:flex;
}
.values h1{
position:relative;
left:308px;
top:100px;
font-size: 46px;
}
.values1{
border:2px solid black;
width:230px;
height:200px;
margin:auto;
transition: all 0.5s ease;
background-color: yellow;
position:relative;
border-radius:15px 125px 125px 15px;
left:-200px;
top:35px;
transition:all 0.9s;
}
.values1 img{
width: 155px;
height: 210px;
transition:all 0.9s;
}
.values1:hover img{
transform:scale(1.2);
}
.values2{
border:2px solid black;
margin:auto;
width:230px;
height:200px;
transition: all 0.5s ease;
border-radius:300px;
background-color: orange;
position:relative;
left:-181px;
top:35px;
}
.values2 img{
width: 269px;
height: 210px;
transition: all 0.9s;
position: relative;
top: -8px;
left: -30px;
}
.values2:hover img{
transform:scale(1.2);
}
.values3{
border:2px solid black;
margin:auto;
width:230px;
height:200px;
transition: all 0.5s ease;
border-radius:125px 15px 15px 125px;
position:relative;
left:-150px;
top:35px;
background-color: #06a07e;
}
.values3 img{
width: 269px;
height: 210px;
transition: all 0.9s;
position: relative;
top: -8px;
left: -30px;
}
.values3:hover img{
transform:scale(1.2);
}
.vgif img{
width: 500px;
height: 543px;
position: relative;
left: 840px;
top:40px;
}
.content{
position: relative;
left: 33px;
font-size: 20px;
font-style: italic;
}
.para p{
font-size: x-large;
}
.profile{
width:50px;
height:50px;
border-radius: 100px;
position:absolute;
top:10px;
right:200px;
}
span{
    color: red;
}
.logo{
    width: 100px;
    position: absolute;
    top: -19px;
    left: 16px
}
.write h2{
    position: absolute;
    top: 16px;
    left: 108px;
    color:white;
}
.blue{
    color: rgb(41, 196, 247);
}
.container .pas{
    display:flex;
}
.user a{
    position:absolute;
    top: 60px;
    right: 184px;
    text-decoration: none;
    
}
    </style>
</head>
<body>
    <div  class="container">
        
        <jsp:include page="nav.jsp"></jsp:include>
        <%String email = (String)session.getAttribute("email"); %>
                        <img src="logo.jpg" class="profile"></img>
                        <form action="profile.jsp" method="post">
                            <input type="hidden" value="<%out.print(email);%>" name="email">
                            <div class="user"><button type="submit">User profile</button></div>
                        </form>

                   
        <svg class="svg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1440 320"><path fill="#03e9f4" fill-opacity="1" d="M0,160L15,138.7C30,117,60,75,90,64C120,53,150,75,180,74.7C210,75,240,53,270,48C300,43,330,53,360,90.7C390,128,420,192,450,224C480,256,510,256,540,245.3C570,235,600,213,630,197.3C660,181,690,171,720,176C750,181,780,203,810,202.7C840,203,870,181,900,154.7C930,128,960,96,990,122.7C1020,149,1050,235,1080,272C1110,309,1140,299,1170,293.3C1200,288,1230,288,1260,272C1290,256,1320,224,1350,218.7C1380,213,1410,235,1425,245.3L1440,256L1440,0L1425,0C1410,0,1380,0,1350,0C1320,0,1290,0,1260,0C1230,0,1200,0,1170,0C1140,0,1110,0,1080,0C1050,0,1020,0,990,0C960,0,930,0,900,0C870,0,840,0,810,0C780,0,750,0,720,0C690,0,660,0,630,0C600,0,570,0,540,0C510,0,480,0,450,0C420,0,390,0,360,0C330,0,300,0,270,0C240,0,210,0,180,0C150,0,120,0,90,0C60,0,30,0,15,0L0,0Z"></path></svg> 
       <img src="logo.png" class="logo"></img>
            <div class="write">
            <h2><i>Pawsitive Care</i></h2>
        </div>
    </div> 
    <!-- <div class="image">
    <img src="dog1.jpg" alt=""> 
</div> -->
<!-- <div class="image2">
    <img src="vet.jpg" alt="">
</div> -->
</div>
<section>
    
</section>
<div class="para">
    <h1>Welcome to <span class="blue"> Pawsitive Care</span> <br>
        Your Pet Care Companion!
    </h1>
    <p>Need an <span>appointment</span>, <span>medicine</span> or <span>food suggestion</span> for your pet? Easily schedule and<br> manage appointments through our website, ensuring your pet receives timely and top-notch<br> care. Our team of certified pet consultants is here to provide personalized advice tailored<br> to your pet's unique needs. Whether you have questions about nutrition, behavior,<br> or health, our experts are just a message away.</p>
</div>
<marquee direction="right" class="gif" scrollamount="15" data-aos="fade-up" >
    <img src="runbg.gif"></img>
</marquee>
<div class="letter">
<p>your pet destination</p>
</div>
<h1 class="provide">Our Services</h1>
<div class="work" >
    <a href="video.html"><div class="left" data-aos="flip-left">
        <h3>Short video </h3>
        </div></a>
    <a href="booking consultant form.html"><div class="mid" data-aos="fade-up">
        <h3>Vet Appointment</h3>
        <img src="medikit.png" alt="">
        </div></a>
    <a href=""><div class="right" data-aos="flip-left">
        <h3>feedback</h3>
        </div></a>
    <a href="about us1.html"><div class="fourth" data-aos="flip-left">
       <div class="color">   
        <h3>About us</h3>
       </div>
        </div></a>
</div>
<div class="values" data-aos="fade-left">
<h1><i>Our Values</i></h1>
<div class="values1">
    <img src="kitten.png" alt="">
    <p class="content">Trust & Safety</p>
</div>
<div class="values2">
    <img src="mid3.png" alt="">
    <p class="content">Expert Veterinary Service</p>
</div>
<div class="values3">
    <img src="right.png" alt="">
    <p class="content">Compassionate Care</p>
</div>
</div>
<div class="vgif" data-aos="fade-up">
    <img src="gif2.gif" alt="">
</div>
<script src="https://unpkg.com/aos@next/dist/aos.js"></script>
<script>
  AOS.init({
    offset:300,
    duration:1000,
  });
</script>
</body>
</html>
