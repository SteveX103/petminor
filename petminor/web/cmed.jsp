<%-- 
    Document   : cmed
    Created on : Nov 23, 2023, 3:00:59 AM
    Author     : Sayantan Ghosh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>cat medicine</title>
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
        <img src="image/catmed1.jpg" alt="pic not found">
        <p class="cat1"><b>HomeoPet Solutions Feline Skin & Itch Drops</b></p>
        </div>
        <div class="cat12">
            <p>HomeoPet Solutions Feline Skin & Itch Drops are a homeopathic remedy designed for cats with skin and itch issues. These drops contain natural ingredients that aim to alleviate itching, scratching, and other skin irritations in felines. They are typically used for various skin conditions, including allergies and dry, flaky skin. HomeoPet is a well-known brand in homeopathic pet care, and these drops are commonly used to provide relief from skin-related discomfort in cats.<h2>price:130.00 ₹</h2></p>
            <div class="cat13">
            QUANTITY: <input type="number" required>
            <button><a href="Transaction.html">order</a></button>
           
            </div>
        </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid16.mp4">
        </video>
    </div>
    </div>
    <div class="full">
    <div class="cat">
        <div class="catty">
            <img src="image/dogmed4.webp" alt="pic not found">
            <p class="cat1"><b>Albomar</b></p>
            </div>
            <div class="cat12">
                <p>Albomar 60 ML- Albendazole 25MG offered by us, refers to a type of oral suspension which is widely used for protecting the life stages of worms. This medicine is mainly used as a complete killing dewormer. This is basically recommended for use for doctors, hospitals, and registered medical practitioners. Albomar 60 ML- Albendazole 25MG acts as a medical supplement for pets, and animals. This supplement is used to treat infections caused by worms. This supplement is used to control gastric and constipation problem in goats, sheeps, and other animals. This supplement should be given to your animals as per your doctors prescription.<h2>price:150.00(60ml.) ₹</h2></p>
                <div class="cat13">
                QUANTITY: <input type="number" required>
                <button><a href="Transaction.html">order</a></button>
               
                </div>
            </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid17.mp4">
        </video>
    </div>
    </div>
    <div class="full">
    <div class="cat">
        <div class="catty">
            <img src="image/catmed2.webp" alt="pic not found">
            <p class="cat1"><b>Ronvac Combined Vaccine for Cats </b></p>
            </div>
            <div class="cat12">
                <p>Ronvac is an inactivated vaccine containing the 3 core viruses – feline panleucopaenia virus, feline herpesvirus type 1 (rhinotracheitis), and feline calicivirus. Ronvac vaccine is exclusively for feline patients.  Indicated for high-risk animals, such as those who live in shelters or have access to the street. It provides protection against the Feline Respiratory Complex (responsible for over 80% of diseases of the upper respiratory tract in cats). <h2>price:120.00 ₹</h2></p>
                <div class="cat13">
                QUANTITY: <input type="number" required>
                <button><a href="Transaction.html">order</a></button>
                
                </div>
            </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid18.mp4">
        </video>
    </div>
    </div>
    <div class="full">
    <div class="cat">
        <div class="catty">
            <img src="image/catmed3.webp" alt="pic not found">
            <p class="cat1"><b>AUDICLEAN - For clean and healthy ears</b></p>
            </div>
            <div class="cat12">
                <p>All-natural and safe solution to clean & deodorize the pet’s ears. It removes ear wax and debris, cleanses excessive dirt from the ears, reduces ear itching, irritation and head shaking along by maintaining ear health & controlling bad odor. It helps in reducing the chances of ear infections.<h2>price:130.00(60ml.) ₹</h2></p>
                <div class="cat13">
                QUANTITY: <input type="number" required>
                <button><a href="Transaction.html">order</a></button>
                
                </div>
            </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid19.mp4">
        </video>
    </div>
    </div>
    <div class="full">
    <div class="cat">
        <div class="catty">
            <img src="image/catmed4.webp" alt="pic not found">
            <p class="cat1">	
                <b>Areion Vet Feli D Syrup</b></p>
            </div>
            <div class="cat12">
                <p>Areion Vet Feli-D Dewomed Oral Suspension For Cats is Efficient and effective treatment, It Broad spectrum protection. A safe and single dose is efficient for effective treatment And No starvation is required before or after treatment . It ensures complete deworming of your cat and provides protection against all form of worm infestations commonly found in pets.<h2>price:95.00(30ml.) ₹</h2></p>
                <div class="cat13">
                QUANTITY: <input type="number" required>
                <button><a href="Transaction.html">order</a></button>
                
                </div>
            </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid20.mp4">
        </video>
    </div>
    </div>
</body>
</html>