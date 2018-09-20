<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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


<div class="container">
    <div class="page-header" onclick="/login.jsp"> <h1>   LEAVE MANAGEMENT SYSTEM</h1></div>

    <div class="jumbotron bg-img">
        <form:form  style="width:250px"  action="/login" method="post" modelAttribute="employee">
            <img src="../../../../../../Downloads/Lena.png" width="183" height="183" alt=""/><br>
            <div class="form-group">
                <label for="uname">UserName:</label> <br><input type="text" class="form-control" name="username" id="uname" placeholder="username" required>
            </div>
            <div class="form-group">
                <br><label for="password">Password:</label><br><input type="password" class="form-control" name="password" id="password" placeholder="password" required>
            </div>
            <br><input type="submit" class="btn btn-primary"  value="Login"/>
        </form:form>
    </div></div>
</body>
</html>