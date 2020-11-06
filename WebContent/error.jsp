<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Error</title>
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

</style>
</head>
<body>

<h1 style="text-align:center"><span style="color: #ff3333;">ERROR MESSAGE</span></h1>
<p style="text-align:center"><b>!!! This barcode already exist in the database !!!</b></p>
<div class="container">
<center>
  <img  src="error.jpeg" style="width:100%">
  <form action  = "ReinsertInfo" method = "post">
	    <input type="submit" value="Try Again" ></input>
  </form>
  </center>
</div>

</body>
</html>
