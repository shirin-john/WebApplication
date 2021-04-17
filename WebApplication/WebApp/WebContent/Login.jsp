<%@ page language="java" contentType="text/html"%>

<%@ include file = "CommonHeader.jsp" %>

<br><br>
<h1 align="center"><font face="arial narrow">Login</font></h1>

<head>
<style>

* {
  box-sizing: border-box;
}

input[type=text] {
  width: 85%;
  padding: 12px;
  border: 1px solid #ccc;
  font-family: arial narrow;
  font-size:13px;
  margin-left: 03%;
  border-radius: 03px;
  resize: vertical;
}

input[type=password] {
  width: 85%;
  padding: 12px;
  border: 1px solid #ccc;
  font-family: arial narrow;
  font-size:13px;
  margin-left: 03%;
  border-radius: 03px;
  resize: vertical;
}

label {
  padding: 18px 0 ;
  display: inline-block;
  font-family: arial narrow;
  font-size: 16px;
  text-align: center;
  margin-left: -1.5%;
}

input[type=submit] {
  background-color: #0099ff;
  color: white;
  padding: 13px 202px;
  font-family: arial narrow;
  font-size: 16px;
  border: none;
  border-radius: 03px;
  margin-left: 2.5%;
  cursor: pointer;
}

input[type=reset] {
  background-color: #0099ff;
  color: white;
  padding: 13px 202px;
  font-family: arial narrow;
  font-size: 16px;
  border: none;
  border-radius: 03px;
  margin-left: 2.5%;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #0066ff;
}

input[type=reset]:hover {
  background-color: #ff0000;
}


.container {
  border-radius: 08px;
  background-color: white;
  margin-left: 33%;
  padding: 30px 30px 55px 30px;
  length: 60%;
  width: 50%;
}

.col-25 {
  float: left;
  width: 25%;
  margin-top: 6px;
}

.col-75 {
  float: left;
  width: 75%;
  margin-top: 6px;
}

.row:after {
  content: "";
  display: table;
  clear: both;
}

</style>
</head>

<body>

<div class="container">
<br>
  <form action="LoginCheck" method="post">
  <div class="row">
    
    <div class="col-75">
      <input type="text" id="username" name="username" placeholder="Username">
    </div>
  </div>
  <br><br>
  <div class="row">
    
    <div class="col-75">
      <input type="password" id="password" name="password" placeholder="Password">
    </div>
  </div>
  <div>
  <label style="font-size: 15px; margin-left: 02%">
      <input type="checkbox" checked="checked" name="remember" >Remember me
  </label>
  
      <a href="http://localhost:8080/WebApp/Login.jsp"><font style="font-family: arial narrow; color:blue; text-align: right; margin-left:33.5%">Forgot password?</font></a>
  </div>
   
  <br>
  <div class="row">
    <input type="submit" value="LOGIN">  
  </div>
  <div class="row">
  <br>
    <input type="reset" value="RESET">
  </div>
  </form>
</div>

</body>
</html>