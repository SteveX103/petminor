<%-- 
    Document   : cfood
    Created on : Nov 23, 2023, 2:49:29 AM
    Author     : Sayantan Ghosh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CAT FOOD</title>
      <link rel="stylesheet" href="nav1.css">
    <style>
        .cat{
            border: 1.5px solid rgb(41, 196, 247);
            border-radius: 30px;
            height: fit-content;
            width: 80%;
            padding: 15px;
            display: flex;
            margin: 10px;
            background-color: aliceblue;
        }
        .catty img{
            height: 130px;
            width: 130px;
        }
        .cat1{
            /* display: inline; */
            margin-top: 0;
            /* text-align: center; */
            margin-left: 10%;
        }
        .catty{
           border-right: 1.5px solid rgb(41, 196, 247);
           
        }
        .cat12{
            justify-content: center;
            padding: 15px;
        }
        .cat12 h2{
            display: inline;
        }
        .cat13 button{
            margin-left: 10%;
            width: 180px;
            height: 30px;
            border-radius: 30px;
        }
        .cat13 button:hover{
            cursor: pointer;
            font-size: 1rem;
            background-color:rgb(41, 196, 247);
        }
        .cat13 button a{
            text-decoration: none;
            color: black;
        }
        .cat13{
            display: inline;
            margin-left: 25%;
        }
        .cat13 input{
            border-radius: 20px;
            height: 30px;
        }
        .cat13 select{
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
    <div class="cat">
        <div class="catty">
        <img src="image/whiskas.jpg" alt="pic not found">
        <p class="cat1"><b>Whiskas Cat Dry Food for Adult Cats</b></p>
        </div>
        <div class="cat12">
            <p>Whiskas is a well-known brand specializing in cat food products. They offer a variety of options, including dry kibble and wet food, designed to meet the nutritional needs of cats. Whiskas cat food is formulated to provide a balanced diet that supports feline health and vitality. The brand often focuses on taste and texture preferences to cater to cats' discerning palates.<h2>price:130.00(100g.) ₹</h2></p>
            <div class="cat13">
            QUANTITY: <input type="number" required>
            <button><a href="Transaction.html">order</a></button>
            
            </div>
        </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid6.mp4">
        </video>
    </div>
    </div>
    <div class="full">
    <div class="cat">
        <div class="catty">
            <img src="image/purepetc.webp" alt="pic not found">
            <p class="cat1"><b>Purepet Adult Dry Cat Food</b></p>
            </div>
            <div class="cat12">
                <p>Purepet offers a range of cat food products, including dry kibble and wet food, designed to provide balanced nutrition for cats. The brand focuses on affordability while maintaining quality standards in its formulations. Purepet cat food caters to different life stages and dietary preferences of felines, making it accessible to a wide range of cat owners. It aims to support overall cat health and well-being while being budget-friendly.<h2>price:160.00(100g.) ₹</h2></p>
                <div class="cat13">
                QUANTITY: <input type="number" required>
                <button><a href="Transaction.html">order</a></button>
                
                </div>
            </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid7.mp4">
        </video>
    </div>
    </div>
    <div class="full">
    <div class="cat">
        <div class="catty">
            <img src="image/droolsc1.webp" alt="pic not found">
            <p class="cat1"><b>Drools Food for Adult Cat</b></p>
            </div>
            <div class="cat12">
                <p>Drools is a reputable brand in the pet food industry, offering a variety of cat food products, including dry kibble and wet food. They emphasize high-quality ingredients and nutritional balance to support feline health. Drools cat food is formulated to meet the specific dietary needs of cats at different life stages and with various preferences. The brand is known for its commitment to scientific research and development in crafting pet food, making it a trusted choice among cat owners. <h2>price:120.00(100g.) ₹</h2></p>
                <div class="cat13">
                QUANTITY: <input type="number" required>
                <button><a href="Transaction.html">order</a></button>
                
                </div>
            </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid8.mp4">
        </video>
    </div>
    </div>
    <div class="full">
    <div class="cat">
        <div class="catty">
            <img src="image/grainzero.webp" alt="pic not found">
            <p class="cat1"><b>Grain Zero Dry Cat Food</b></p>
            </div>
            <div class="cat12">
                <p>KEY BENEFITS: High-quality protein from deboned sardine, mackerel & chicken liver helps build strong muscles. An optimum balance of Omega 3 & 6 fatty acids promotes shiny coat and healthy skin. We use only high quality, human grade protein & natural sources of fibre to provide optimal nutrient absorption.<h2>price:230.00(100g.) ₹</h2></p>
                <div class="cat13">
                QUANTITY: <input type="number" required>
                <button><a href="Transaction.html">order</a></button>
                
                </div>
            </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid9.mp4">
        </video>
    </div>
    </div>
    <div class="full">
    <div class="cat">
        <div class="catty">
            <img src="image/meo.jpg" alt="pic not found">
            <p class="cat1">	
                <b>ME-O Tuna Adult Dry Cat Food</b></p>
            </div>
            <div class="cat12">
                <p>Me-O is a popular brand of cat food known for its wide range of products. They offer dry kibble and wet food options designed to meet the nutritional needs of cats. Me-O emphasizes the use of high-quality ingredients and balanced nutrition to support feline health. Their formulations cater to various life stages and preferences of cats, making it a widely recognized choice among cat owners.<h2>price:250.00(100g.) ₹</h2></p>
                <div class="cat13">
                QUANTITY: <input type="number" required>
                <button><a href="Transaction.html">order</a></button>
               
                </div>
            </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid10.mp4">
        </video>
    </div>
    </div>
</body>
</html>
