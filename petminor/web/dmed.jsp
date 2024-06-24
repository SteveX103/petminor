<%-- 
    Document   : dmed
    Created on : Nov 23, 2023, 3:02:20 AM
    Author     : Sayantan Ghosh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>dog medicine</title>
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
            border-radius: 20px;
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
        <img src="image/dogmed1.png" alt="pic not found">
        <p class="dog1"><b>Hartz Ultra Guard Dual Action Drops for Dogs & Puppies</b></p>
        </div>
        <div class="dog12">
            <p>Hartz Ultra Guard Dual Action Drops is a topical medication for dogs. It is designed to provide both flea and tick control, targeting two common pet parasites. The drops are easy to apply and offer lasting protection for up to 30 days. Hartz is a well-known brand in the pet care industry, and this product is often used by pet owners as a preventive measure against fleas and ticks.<h2>price:130.00 ₹</h2></p>
            <div class="dog13">
            QUANTITY: <input type="number" required>
            <button><a href="Transaction.html">order</a></button>
            
            </div>
        </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid11.mp4">
        </video>
    </div>
    </div>
    <div class="full">
    <div class="dog">
        <div class="dogy">
            <img src="image/dogmed2.jpg" alt="pic not found">
            <p class="dog1"><b>Himalaya Scavon Vet Cream</b></p>
            </div>
            <div class="dog12">
                <p>Himalaya Scavon Vet Cream is a topical medication designed for dogs. It is formulated to aid in wound healing and skin infections. The cream contains natural ingredients known for their antimicrobial and anti-inflammatory properties. Himalaya is a reputable brand in pet care, and Scavon Vet Cream is commonly used to promote skin health in dogs. It should be applied as directed by a veterinarian for the treatment of skin conditions or wound care.<h2>price:150.00(50g.) ₹</h2></p>
                <div class="dog13">
                QUANTITY: <input type="number" required>
                <button><a href="Transaction.html">order</a></button>
                 </div>
            </div>
    </div>
    <div class="image/vid1">
        <video controls muted loop autoplay>
            <source src="vid12.mp4">
        </video>
    </div>
    </div>
    <div class="full">
    <div class="dog">
        <div class="dogy">
            <img src="image/dogmed3.jpg" alt="pic not found">
            <p class="dog1"><b>Himpyrin</b></p>
            </div>
            <div class="dog12">
                <p>Himpyrin syrup is a unique herbal preparation to relieve pain, fever and inflammation (redness, heat, and swelling) in dogs and cats. This formula has long term anti-inflammatory health benefits, acts as analgesic (relieve joint inflammation and arthritis) /antipyretic (multiple underlying causes), promotes healing and reduces swelling and is effective in cases of injury or post-surgery.<h2>price:120.00(30ml.) ₹</h2></p>
                <div class="dog13">
                QUANTITY: <input type="number" required>
                <button><a href="Transaction.html">order</a></button>
               
                </div>
            </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid13.mp4">
        </video>
    </div>
    </div>
    <div class="full">
    <div class="dog">
        <div class="dogy">
            <img src="image/dogmed4.webp" alt="pic not found">
            <p class="dog1"><b>Albomar</b></p>
            </div>
            <div class="dog12">
                <p>Albomar 60 ML- Albendazole 25MG offered by us, refers to a type of oral suspension which is widely used for protecting the life stages of worms. This medicine is mainly used as a complete killing dewormer. This is basically recommended for use for doctors, hospitals, and registered medical practitioners. Albomar 60 ML- Albendazole 25MG acts as a medical supplement for pets, and animals. This supplement is used to treat infections caused by worms. This supplement is used to control gastric and constipation problem in goats, sheeps, and other animals. This supplement should be given to your animals as per your doctors prescription.<h2>price:150.00(60ml.) ₹</h2></p>
                <div class="dog13">
                QUANTITY: <input type="number" required>
                <button><a href="Transaction.html">order</a></button>
                
                </div>
            </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid14.mp4">
        </video>
    </div>
    </div>
    <div class="full">
    <div class="dog">
        <div class="dogy">
            <img src="image/dogmed5.webp" alt="pic not found">
            <p class="dog1">	
                <b>Himalaya Anxocare Tablets For Dogs</b></p>
            </div>
            <div class="dog12">
                <p>Himalaya Anxocare Tablets are a natural supplement designed for dogs to manage stress and anxiety. These tablets contain herbal ingredients known for their calming properties. They can be used in various situations that cause stress in dogs, such as travel, thunderstorms, or separation anxiety. Himalaya is a reputable brand in pet care, and these tablets are often used to promote relaxation and reduce anxiety in dogs. <h2>price:120.00(60g.) ₹</h2></p>
                <div class="dog13">
                QUANTITY: <input type="number" required>
                <button><a href="Transaction.html">order</a></button>
                
                </div>
            </div>
    </div>
    <div class="vid1">
        <video controls muted loop autoplay>
            <source src="image/vid15.mp4">
        </video>
    </div>
    </div>
</body>
</html>
