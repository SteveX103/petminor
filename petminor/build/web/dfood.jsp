<%-- 
    Document   : dfood
    Created on : Nov 23, 2023, 2:56:12 AM
    Author     : Sayantan Ghosh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DOG FOOD</title>
      <link rel="stylesheet" href="nav1.css">
    <style>
        .dog{
            border: 1.5px solid rgb(41, 196, 247);
            border-radius: 30px;
            height: fit-content;
            width: 80%;
            padding: 15px;
            display: flex;
            margin: 10px;
            background-color: aliceblue;
        }
        .dogy img{
            height: 130px;
            width: 130px;
        }
        .dog1{
            /* display: inline; */
            margin-top: 0;
            /* text-align: center; */
            margin-left: 10%;
        }
        .dogy{
           border-right: 1.5px solid rgb(41, 196, 247);
        }
        .dog12{
            justify-content: center;
            padding: 15px;
        }
        .dog12 h2{
            display: inline;
        }
        .dog13 button{
            margin-left: 10%;
            width: 180px;
            height: 30px;
            border-radius: 30px;
        }
        .dog13 button:hover{
            cursor: pointer;
            font-size: 1rem;
            background-color:rgb(41, 196, 247);
        }
        .dog13 button a{
            text-decoration: none;
            color: black;
        }
        .dog13{
            display: inline;
            margin-left: 25%;
        }
        .dog13 input{
            border-radius: 20px;
            height: 30px;
        }
        .dog13 select{
            border-radius: 20px;
            border: 1.5px solid black;
            height: 30px;
            width: 120px;
        }
        .full{
            display: flex;
            margin-top:5%;
        }
        .vid1 video{
            width: 230px;
            height: 230px;
            margin: 0;
            border-radius: 15px;
        }
    </style>
</head>
<body>
    <jsp:include page="nav.jsp"></jsp:include>
    <div class="full">
    <div class="dog">
        <div class="dogy">
        <img src="image/pedi.jpg" alt="pic not found">
        <p class="dog1"><b>Pedigree Dry Dog Food</b></p>
        </div>
        <div class="dog12">
            <p>Pedigree is a well-known brand of dog food that has been in the market for decades. They offer a variety of dog food products, including dry kibble and canned options, formulated to meet the nutritional needs of dogs. Pedigree emphasizes the importance of balanced nutrition to support dogs' overall health, including strong teeth and bones. They cater to different life stages and sizes of dogs, making it a popular choice among pet owners.<h2>price:130.00(100g.) ₹</h2></p>
            <div class="dog13">
            QUANTITY: <input type="number" required>
            <button><a href="Transaction.html">order</a></button>
            
            </div>
        </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid1.mp4">
        </video>
    </div>
    </div>
    <div class="full">
    <div class="dog">
        <div class="dogy">
            <img src="image/drools.webp" alt="pic not found">
            <p class="dog1"><b>Drools Optimum Dog Dry Food</b></p>
            </div>
            <div class="dog12">
                <p>Drools is a prominent brand in the pet food industry, offering a range of dog food products. Their offerings include dry kibble, wet food, and treats, catering to various dietary preferences and needs. Drools is known for using high-quality ingredients and balanced nutrition in their formulations to support dogs' health and vitality. They have options for different life stages and sizes of dogs, making it a versatile choice for pet owners.<h2>price:160.00(100g.) ₹</h2></p>
                <div class="dog13">
                QUANTITY: <input type="number" required>
                <button><a href="Transaction.html">order</a></button>
                
                </div>
            </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid2.mp4">
        </video>
    </div>
    </div>
    <div class="full">
    <div class="dog">
        <div class="dogy">
            <img src="image/himalaya.png" alt="pic not found">
            <p class="dog1"><b>Himalaya Healthy Dog Dry Food</b></p>
            </div>
            <div class="dog12">
                <p>Himalaya Pet Care offers a line of dog food products made with natural and herbal ingredients. Their dog food range includes dry kibble and treats. Himalaya emphasizes the use of botanicals and Ayurvedic principles to promote overall health and well-being in dogs. They offer specialized formulations for various health concerns, such as skin and coat health, joint support, and digestion.<h2>price:120.00(100g.) ₹</h2></p>
                <div class="dog13">
                QUANTITY: <input type="number" required>
                <button><a href="Transaction.html">order</a></button>
                
                </div>
            </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid3.mp4">
        </video>
    </div>
    </div>
    <div class="full">
    <div class="dog">
        <div class="dogy">
            <img src="image/royalcanin.webp" alt="pic not found">
            <p class="dog1"><b>Royal Canin Dog Dry Food</b></p>
            </div>
            <div class="dog12">
                <p>Royal Canin is a renowned brand specializing in premium dog food and cat food. Their products are tailored to meet specific dietary needs based on a pet's age, size, breed, and health condition. The company emphasizes scientific research and veterinary input in formulating their pet food, aiming to provide optimal nutrition for pets. Royal Canin offers a wide range of dry and wet dog food options, focusing on promoting overall health and well-being in pets.<h2>price:230.00(100g.) ₹</h2></p>
                <div class="dog13">
                QUANTITY: <input type="number" required>
                <button><a href="Transaction.html">order</a></button>
                
                </div>
            </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid4.mp4">
        </video>
    </div>
    </div>
    <div class="full">
    <div class="dog">
        <div class="dogy">
            <img src="image/purepet.webp" alt="pic not found">
            <p class="dog1">	
                <b>Purepet Dry Dog Food</b></p>
            </div>
            <div class="dog12">
                <p>Purepet is a popular brand offering a range of dog food products, including dry kibble and wet food. They aim to provide affordable yet nutritious options for pet owners. Purepet emphasizes the use of high-quality ingredients to support a dog's overall health and vitality. Their formulations cater to different life stages and sizes of dogs, making it accessible to a wide range of pet owners. <h2>price:250.00(100g.) ₹</h2></p>
                <div class="dog13">
                QUANTITY: <input type="number" required>
                <button><a href="Transaction.html">order</a></button>
                
                </div>
            </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid5.mp4">
        </video>
    </div>
    </div>
</body>
</html>
