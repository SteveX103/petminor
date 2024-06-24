<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>pet medicine</title>
     <link rel="stylesheet" href="nav1.css">
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        #shop{
            display: flex;
            border: 1.5px solid rgb(41, 196, 247);
            border-radius: 30px;
            width: fit-content;
            height: fit-content;
            margin: auto;
            margin-top: 15%;
            background-color: aliceblue;
        }
        .medicine{
            height: 200px;
            width: 200px;
            border: 2px solid black;
            padding: 30px;
            margin: 20px;
            border-radius: 30px;
        }
        .medicine:hover{
            background-color: rgb(41, 196, 247);
            font-size: 1.3rem;
            cursor: pointer;
        }
        .medicine h1{
            text-align: center;
            padding: 50px;
            padding-left: 5%;  
        }
        .medicine h1 a{
            text-decoration: none;
        }
        @keyframes san1{
            
        }
    </style>
</head>
<body>
     <jsp:include page="nav.jsp"></jsp:include>
    <div id="shop">
        <div class="medicine">
            <h1><a href="dmed.jsp">DOG MEDICINE</a></h1>
        </div>
        <div class="medicine">
            <h1><a href="cmed.jsp">CAT MEDICINE</a></h1>
        </div>
    </div>
</body>
</html>