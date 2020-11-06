<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Product's Page</title>
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}

* {
  box-sizing: border-box;
}

/* Style inputs */
input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

input[type=submit] {
  background-color: #ff3333;
  color: white;
  padding: 12px 20px;
  border: none;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #ff3333;
}

/* Style the container/contact section */
.container {
  border-radius: 5px;
  background-color: #ffcccc;
  padding: 100px;
}

.column {
  float: left;
  width: 50%;
  margin-top: 6px;
  padding: 20px;
}

.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .column, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}
</style>
</head>
<body>

<h1 style="text-align:center" > Thank you for the info !!!</h1>
<div class="container">
<div class="row">
    <div class="column">
     <img src="info.jpeg" style="width:100%">
    </div>
   <div class="column">
<ul>
<li ><label><b><ins>Name</ins> : </b></label>
${prod.getName()}</li><br>
<li ><label><b><ins>Color</ins> : </b></label>
${prod.getColor()}</li><br>
<li ><label ><b><ins>Description</ins> : </b></label>
${prod.getDescription()}</li><br>
<li ><label ><b><ins>Barcode</ins> : </b></label>
${prod.getBarcode()}</li><br>
</ul>  
<br><br>
<form action  = "ReinsertInfo" method = "post">
<input type="submit" value = "Submit again for another product" ></input>
</form>
   </div>
  </div>
</div>

</body>
</html>