<%@ page language="java" contentType="text/html" 
pageEncoding="ISO-8859-1"%>

<%@ include file="CommonHeader.jsp" %>

<h1 align="center"><font face="arial narrow">Sign up</font></h1>

<body>

<div class="container">
  <form action="Register" method="post">
  <div class="row">
    <div class="col-25">
      <label for="name">Enter Your Name:</label>
    </div>
    <div class="col-75">
      <input type="text" id="name" name="name" placeholder="Your Name">
    </div>
  </div>
  <br>
  
  <div class="row">
    <div class="col-25">
      <label for="lname">Enter Your Email ID:</label>
    </div>
    <div class="col-75">
      <input type="text" id="email" name="email" placeholder="Your email ID">
    </div>
  </div>
  <br>
  
  <div class="row">
    <div class="col-25">
      <label for="gender">Gender:</label>
    </div>
    <div class="col-75">
      <select id="gender" name="gender">
      	<option value="selectGender">Select Gender</option>
        <option value="Male">Male</option>
        <option value="Female">Female</option>
        <option value="other">Other</option>
      </select>
    </div>
  </div>
  <br>
  
  <div class="row">
    <div class="col-25">
      <label for="username">Enter A Username:</label>
    </div>
    <div class="col-75">
      <input type="text" id="username" name="username" placeholder="Username">
    </div>
  </div>
  <br>
  
  <div class="row">
    <div class="col-25">
      <label for="password">Enter A Password:</label>
    </div>
    <div class="col-75">
      <input type="text" id="passwd" name="passwd" placeholder="New Password">
    </div>
  </div>
  <br>
  
  <div class="row">
    <div class="col-25">
      <label for="confirm">Confirm Password:</label>
    </div>
    <div class="col-75">
      <input type="text" id="confirm" name="confirm" placeholder="Confirm Password">
    </div>
  </div>
  <br>
  
  <div class="row">
    <div class="col-25">
      <label for="address">Address</label>
    </div>
  <div class="col-75">
      <textarea id="address" name="address" placeholder="Address" style="height:100px"></textarea>
    </div>
  </div>
  <br>
  
  <div class="row">
    <div class="col-25">
      <label for="pinCode">PIN Code:</label>
    </div>
    <div class="col-75">
      <input type="text" id="pinCode" name="pinCode" placeholder="PIN Code">
    </div>
  </div>
  <br><br>
  
  <div class="row">
    <input type="submit" value="SIGN UP">
  </div>
  <div class="row">
  <br>
  
    <input type="reset" value="RESET">
  </div>
  </form>
</div>

</body>

</body>
</html>