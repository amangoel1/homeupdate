<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>HomeService</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="styles.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.7.5/css/mdb.min.css" rel="stylesheet">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>

<style>
    
    
    .sidenav {
      margin-top:75px;
      height: 94%;
      width:250px;
      position: fixed;
      top: 0;
      left: 0;
      background-color: #111;
      overflow-x: hidden;
      transition: 1s;
      padding-top: 60px;
    }

    .toggle_btn
    {
      position: realtive;
      background-color: rgb(34, 33, 33);
      color: whitesmoke;
      border:0;
      cursor: pointer;
      width:50px;
      height:40px;
      top:0;
      left:0;
    }
    
    .sidenav a {
      padding: 8px 8px 8px 32px;
      text-decoration: none;
      font-size: 25px;
      color: #818181;
      display: block;
      transition: 0.3s;
    }
    .sidenav label
      {
          color: white;
      }
    
    .sidenav a:hover {
      color: #f1f1f1;
    }
    
    .sidenav .closebtn {
      position: absolute;
      top: 0;
      right: 25px;
      font-size: 36px;
      margin-left: 50px;
    }
  
    
    </style>
<script>
        function openSidebar() {
          
          document.getElementById("mySidenav").style.display = "block";
        }

        function closeSidebar() {
         document.getElementById("mySidenav").style.display = "none";
        }
</script>
<body>
    <div>
        <nav class="navbar  navbar-custom navbar-dark navbar-expand-lg  sticky-top "  >
            <div class="logo">
                <img  src="images/aboutus.png" height="60px" width="60px"  style="cursor: pointer"/>
            </div>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>
              
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                  <ul class="navbar-nav mr-auto">
                    <li>
                                <h1 class="text-white align-bottom mx-3 my-2">Home Service</h1>
                    </li>
                        
                    <li class="nav-item ">
                      <input class=" search " type="search" placeholder="Search" aria-label="Search"><a><i id="nav_search_icon" class="fa fa-search" href="search.html"></i></a>
                    </li>

                 

                  </ul>
                  
                    <form class="form-inline my-2 my-lg-0 ">

                        <a href="#" class="notification mg-15 ">
                            <span><i class="fa fa-envelope"></i></span>
                            <span class="badge">2</span>
                        </a>
                        
                        <a href="#" class="notification mg-35 ">
                          <span><i class="fa fa-bell"></i></span>
                          <span class="badge">3</span>
                        </a>
                        
                        <a href="#" class="btn btn-col btn-sm">
                            <span class="fa fa-sign-out my-2 mr-3"></span> Log out
                        </a>
                            
                    </form>
                 
                </div>
              </nav>
        </div>
              
              <button class="toggle_btn hide-large" onclick="openSidebar()" >&#9776;</button>
              <div class="sidenav sidenav-collapse animate-left  "  id="mySidenav">
                
                  <a href="javascript:void(0)" class="closebtn hide-large" onclick="closeSidebar()" >&times;</a>
                  <div class="d-inline-flex  "> 
                  <img src="images/profile.png"  class="profile_pic"> <label class="p-2">Mandeep <br><small>Admin</small> </label>
                  </div>

                  <a href="#">Dashboard</a>
                  <a href="#">User Profile</a>
                  <a href="#">Services</a>
                  <a href="#">Requests</a>
                  <a href="#">Contact</a>
              </div> 
              

                

              
                    
                
               <div class="content " >
                 
                <div class="top_head border"> List of Workers <br> <small>Recently added</small></div>
                   
                
                 <table class="table w-75 ">
                    <thead  >
                      <tr>
                        <th scope="col">Name</th>
                        <th scope="col">Service</th>
                        <th scope="col">Status</th>
                        <th scope="col">Price(/hour)</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <th >Kailash</th>
                        <td>Electrician</td>
                        <td>Not alloted</td>
                        <td>110</td>
                      </tr>
                      <tr>
                          <th >Manish</th>
                          <td>plumber</td>
                          <td>Not alloted</td>
                          <td>100</td>
                      </tr>
                      <tr>
                          <th >Kailash</th>
                          <td>Electrician</td>
                          <td>Not alloted</td>
                          <td>950</td>
                      </tr>
                    </tbody>
                  </table>
                </div> 
             
            

              </body>
</html>