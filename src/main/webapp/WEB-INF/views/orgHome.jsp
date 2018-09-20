<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html; ISO-8859-1" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        .bg-bod {
            /* The image used */
            background-image: url("http://wallpaperscraft.site/ui/images/2/WDF_1534298.jpg");

            min-height: 100%;
            /*min-width:  100%;*/

            /* Center and scale the image nicely */
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
        } </style>
    <style>
        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #333;
        }

        li {
            float: left;
        }

        li a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        li a:hover {
            background-color: #111;
        }
    </style>

    <title>Title</title>
</head>
<body  class="bg-bod" >
<style>
    .bg-img {
        /* The image used */
        background-image: url("https://cdn0.tnwcdn.com/wp-content/blogs.dir/1/files/2018/04/6534567897654-796x417.jpg");

        min-height: 380px;

        /* Center and scale the image nicely */
        background-position: center;
        background-repeat: no-repeat;
        background-size: cover;
    } </style>
<style>
    .bg-img1 {
        /* The image used */
        background-image: url("http://backgroundcheckall.com/wp-content/uploads/2017/12/registration-page-background-images-10.jpg");

        min-height: 380px;

        /* Center and scale the image nicely */
        background-position: center;
        background-repeat: no-repeat;
        background-size: cover;
    } </style>
<nav><ul>
    <li><a class="active" href="/orgHome">Home</a></li>
    <li><a href="/AddEmployee">Add Employee</a></li>
    <li><a href="/getAllEmployee">Delete Employee</a></li>
    <li><a href="/addCompany1">Add Company</a></li>
    <li><a href="/DeleteCompany">Delete Company</a></li>
    <li><a href="/addHoliday1">Add Holiday</a></li>
</ul></nav>


<div class="container">
    <div class="page-header" onclick="/orgHome.jsp"> </div>
    <form:form  class="container" style=" width: 100% ;length: 100%" action="/register" method="post" modelAttribute="employee">
        <h1 color='ff0000'>Welcome Admin</h1>

        <div class="form-group">
            <label for="firstname"> Firstname:</label><br><form:input type="text" name="firstname" path="firstname" id="firstname" placeholder="first name" />
        </div>
        <div class="form-group">
            <label for="lastname">Last name:</label><br><form:input type="text" name="lastname" path="lastname" id="lastname" placeholder="last name" />
        </div>
        <div class="form-group">
            <label for="mailid">Mail id:</label> <br><form:input type="email" name="mailid" path="mailid" id="mailid" placeholder="mailid" />
        </div>
        <div class="form-group" style="width: 60%;length: 60%">
            <form:label for="gender" path="gender">Gender:</form:label> <br>
            <input type="radio" name="gender" id="gender" value="male">Male</input>
            <input type="radio" name="gender" id="gender" value="female">Female</input>
        </div>
        <div class="form-group">
            <label for="uname1">UserName:</label> <br><form:input type="text" path="username" class="form-group" name="uname" id="uname1" placeholder="username" />
        </div>
        <div class="form-group">
            <label for="password1">Password:</label><br><form:input type="password" path="password" class="form-group" name="password" id="password1" placeholder="password" />
        </div>
        <div class="form-group">
            <label for="company">Company:</label><br><form:input path="companyName" type="text" class="form-group" name="companyName
" id="company" placeholder="Company name" />
        </div>
        <div class="form-group">
            <label for="Manager">Managerfor:</label><br><form:input path="manager" type="text" class="form-group" name="Manager" id="Manager" placeholder="Manager" />
        </div>

        <div class="form-group" style="width: 10%;length: 10%">
            <br><input type="submit" class="btn btn-primary btn-block" placeholder="SignUp">
            <button name="reset"  class="btn btn-danger btn-block" onclick="/RegisterEmployee.jsp" placeholder="reset">Reset</button>
        </div>

    </form:form>
</div>
</body>
</html>