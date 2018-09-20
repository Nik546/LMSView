<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; ISO-8859-1" language="java" %>
<!DOCTYPE html>

<html>
<head>
    <style>
        body  {
            background-image: url("http://blog.visme.co/wp-content/uploads/2017/07/50-Beautiful-and-Minimalist-Presentation-Backgrounds-040.jpg");

        }
    </style>
</head>
<body>


</body>
</html>
<html>
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-blue-grey.css">
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans'>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
    html,body,h1,h2,h3,h4,h5 {font-family: "Open Sans", sans-serif}
</style>
<body class="w3-theme-l5">

<!-- Navbar -->
<div class="w3-top">
    <div class="w3-bar w3-theme-d2 w3-left-align w3-large">
        <a class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-theme-d2" href="javascript:void(0);" onclick="openNav()"><i class="fa fa-bars"></i></a>
        <a href="/leaves" class="w3-bar-item w3-button w3-padding-large w3-theme-d4"><i class="fa fa-home w3-margin-right"></i>Home</a>
        <a href="/empLeave"  class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white" title="Apply Leave"><i class="fa fa-user"></i></a>
        <a href="#" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white" title="Leave History"><i class="fa fa-envelope"></i></a>
        <div href="#" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white" title="Leave Status"><i class="fa fa-globe"></i><div>


        </div>
        </div>
        <a href="/" class="w3-bar-item w3-button w3-hide-small w3-right w3-padding-large w3-hover-white" title="My Account">
            <img src="https://blog.clearcompany.com/hs-fs/hub/212972/file-1187053509-jpg/IMG-Blog-Posts/employee-obsessed.jpg?t=1536086700123&width=599&name=employee-obsessed.jpg" class="w3-circle" style="height:23px;width:23px" alt="Avatar">
        </a>
    </div>
</div>

<!-- Navbar on small screens -->


<!-- Page Container -->
<div class="w3-container w3-content" style="max-width:1400px;margin-top:80px">
    <!-- The Grid -->
    <div class="w3-row">
        <!-- Left Column -->
        <div class="w3-col m3">
            <!-- Profile -->
            <div class="w3-card w3-round w3-white">
                <div class="w3-container">
                    <h4 class="w3-center">My Profile</h4>
                    <p class="w3-center"><img src="https://blog.clearcompany.com/hs-fs/hub/212972/file-1187053509-jpg/IMG-Blog-Posts/employee-obsessed.jpg?t=1536086700123&width=599&name=employee-obsessed.jpg" class="w3-circle" style="height:106px;width:106px" alt="Avatar"></p>
                    <hr>
                    <p><i class="fa fa-pencil fa-fw w3-margin-right w3-text-theme"></i> Developer, UI</p>
                    <p><i class="fa fa-home fa-fw w3-margin-right w3-text-theme"></i> Herndon, VA</p>
                    <p><i class="fa fa-birthday-cake fa-fw w3-margin-right w3-text-theme"></i> April 1, 1988</p>
                </div>
            </div>
            <br>




            <br>

            <!-- End Left Column -->
        </div>

        <!-- Middle Column -->
        <div class="w3-col m7">

            <div class="w3-row-padding">
                <div class="w3-col m12">
                    <div class="w3-card w3-round w3-white">
                        <div class="w3-container w3-padding">


                        </div>
                    </div>
                </div>
            </div>
            <html>
            <head>
                <style>
                    table {
                        font-family: arial, sans-serif;
                        border-collapse: collapse;
                        width: 100%;
                    }

                    td, th {
                        border: 2px solid #dddddd;
                        text-align: left;
                        padding: 20px;
                    }

                    tr:nth-child(even) {
                        background-color: #dddddd;
                    }
                </style>
            </head>
            <body>

            <h2>My Actions</h2>

            <table>



                <tr>
                    <th>Employee Id</th>
                    <th>Leave Type</th>
                    <th>Start Date</th>
                    <th>End Date</th>
                    <th>No of Days</th>

                </tr>



            </table>




            <h2>My Requests</h2>

            <table>
                <tr>
                    <th>Leaveid</th>
                    <th>Leave Type</th>
                    <th>Start Date</th>
                    <th>End Date</th>
                    <th>Status</th>

                </tr>

                <c:forEach var="leave" items="${leavesApply}">
                    <form:form action="/deleteNowLeave" modelAttribute="appliedLeave">

                        <tr>

                            <td> <form:input type="hidden" name="LeaveId" path="LeaveId" value="${leave.getLeaveId()}"/> ${leave.getLeaveId()}</td>
                            <td> <form:input type="hidden" name="Type" path="Type" value="${leave.getType()}"/> ${leave.getType()}</td>
                            <td> <form:input type="hidden" name="fromDate" path="fromDate" value="${leave.getFromDate()}"/> ${leave.getFromDate()}</td>
                            <td> <form:input type="hidden" name="toDate" path="toDate" value="${leave.getToDate()}"/> ${leave.getToDate()}</td>
                            <td> <form:input type="hidden" name="noOfDays" path="noOfDays" value="${leave.getNoOfDays()}"/> ${leave.getNoOfDays()}</td>


                                <%--<td>  <div class="form-group" style="width: 10%;length: 10%">--%>
                                <%--<br><input type="submit" class="btn btn-primary btn-block" placeholder="Delete">--%>
                                <%--</div></td>--%>
                        </tr>
                    </form:form>
                </c:forEach>



            </table>

            <h2>Remaining Leaves</h2>

            <table>
                <tr>
                    <th>Leave Type</th>
                    <th>Remaining Leaves</th>


                </tr>

            </table>

            </body>
            </html>







            <!-- End Middle Column -->
        </div>

        <!-- Right Column -->
        <div class="w3-col m2">
            <div class="w3-card w3-round w3-white w3-center">
                <div class="w3-container">
                    <p>Upcoming Events:</p>
                    <img src="http://ukrainepress.ru/wp-content/uploads/2012/04/Dogdevie_lesa.jpg" alt="Forest" style="width:100%;">
                    <p><strong>Holiday</strong></p>
                    <p>Friday 15:00</p>
                    <p><button class="w3-button w3-block w3-theme-l4">Info</button></p>
                </div>
            </div>
            <br>

            <div class="w3-card w3-round w3-white w3-center">
                <div class="w3-container">
                    <p>Admin</p>
                    <img src="https://www.knoxblue.com/wp-content/uploads/2011/04/professional-woman-1.jpg" alt="Avatar" style="width:50%"><br>
                    <span>Joe Elizabeth</span>
                    <div class="w3-row w3-opacity">

                    </div>
                </div>
            </div>
            <br>

            <div class="w3-card w3-round w3-white w3-padding-16 w3-center">
                <p>ADS</p>
            </div>
            <br>

            <div class="w3-card w3-round w3-white w3-padding-32 w3-center">
                <p><i class="fa fa-bug w3-xxlarge"></i></p>
            </div>

            <!-- End Right Column -->
        </div>

        <!-- End Grid -->
    </div>

    <!-- End Page Container -->
</div>
<br>

<!-- Footer -->
<footer class="w3-container w3-theme-d3 w3-padding-16">
    <h5>Footer</h5>
</footer>

<footer class="w3-container w3-theme-d5">
    <p>Powered by <a href="https://www.w3schools.com/w3css/default.asp" target="_blank">w3.css</a></p>
</footer>

<script>
    // Accordion
    function myFunction(id) {
        var x = document.getElementById(id);
        if (x.className.indexOf("w3-show") == -1) {
            x.className += " w3-show";
            x.previousElementSibling.className += " w3-theme-d1";
        } else {
            x.className = x.className.replace("w3-show", "");
            x.previousElementSibling.className =
                x.previousElementSibling.className.replace(" w3-theme-d1", "");
        }
    }

    // Used to toggle the menu on smaller screens when clicking on the menu button
    function openNav() {
        var x = document.getElementById("navDemo");
        if (x.className.indexOf("w3-show") == -1) {
            x.className += " w3-show";
        } else {
            x.className = x.className.replace(" w3-show", "");
        }
    }
</script>

</body>
</html>
