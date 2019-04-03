<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>HomeService</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="resources/css/styles.css"/>
    <link rel="stylesheet" href="resources/css/userStyles.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <script src="resources/js/adminPanel.js"></script>

</head>

<body>
    <div>
        <nav class="navbar  navbar-custom navbar-dark fixed-top navbar-expand-lg"    >
            <div class="logo">
                <img  src="resources/css/aboutus.png" />
            </div>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>
              
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                  <ul class="navbar-nav mr-auto">
                    <li>
                                <h1 class="text-white align-bottom mx-3 my-2">Home Service</h1>
                    </li>
                        
                   
                  </ul>
                  
                    <form class="form-inline my-2 my-lg-0 ">
                        <input class="search " type="search" placeholder="Search" aria-label="Search"><a><i id="nav_search_icon" class="fa fa-search" href="search.html"></i></a>

                        <div class="btn-group show-on-hover"  >
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                                    <a href="#" class="notification mg-35 ">
                                            <span><i class="fa fa-bell"></i></span>
                                            <span class="badge">0</span>
                                    </a>
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu" style="padding: 25px; background-color: rgb(88, 103, 133)"  role="menu">
                                    <li style="width:250px;"><a href="#" style="color: white" >Irfan has accept your request</a></li>
                                    <hr>
                                    <li style="width:250px;"><a href="#" style="color: white" >Irfan has accept your request</a></li>
                                     <hr>
                                     <li style="width:250px;"><a href="#" style="color:white" >Irfan has accept your request</a></li>
                                     <hr>
                                     <li style="width:250px;"><a href="#" style="color: white" >Irfan has accept your request</a></li>
                                     <hr>
                                     <li style="width:250px;"><a href="#" style="color: white" >Irfan has accept your request</a></li>
                                    </ul>
                    </div>
                    
                        
                        <a href="#" class="btn logout-btn btn-sm">
                            <span class="fa fa-sign-out my-2 mr-3"></span> Log out
                        </a>
                            
                    </form>
                 
                </div>
              </nav>
        </div>
              
              <button class="toggle_btn hide-large" onclick="openSidebar()" >&#9776;</button>
              <div class="sidenav sidenav-collapse  "  id="mySidenav">
                
                  <a href="javascript:void(0)" class="closebtn hide-large" onclick="closeSidebar()" >&times;</a>
                  <div class="d-inline-flex  "> 
                  <img src="images/profile.png"  class="profile_pic"> <label class="p-2">Irfan <br><small>User</small> </label>
                  </div>

                  <a href="userPanel.html">Dashboard</a>
                  <a href="userPanelProfile.html">Profile</a>
                  <a href="userRequestStatus.html">Request status</a>
              </div> 

              <div class="content " >
                 <div class="table-responsive">
                    <div class="top-head-table border" style="margin-top: 10%"> <h2>Request status</h2> </div>
                       
                
                     <table class="table w-75  ">
                        <thead  >
                          <tr>
                            <th scope="col">Service Name</th>
                            <th scope="col">Service description</th>
                            <th scope="col">Date</th>
                            <th scope="col">Time</th>
                            <th scope="col">Status</th>
                            <th scope="col">Worker name</th>
                            <th scope="col">Contact number</th>
                            
                            
                            
                          </tr>
                        </thead>
                        <tbody>
                          <tr>
                            <td >Electrician</td>
                            <td>Wires Changing</td>
                            <td>22/09/2018</td>
                            <td>9:00 am-3:00pm</td>
                            <td style="color: red">Approved</td>
                            <td>Rohit</td>
                            <td>0989897798</td>
                          </tr>
                          <tr>
                                <td >Electrician</td>
                                <td>Wires Changing</td>
                                <td>22/09/2018</td>
                                <td>9:00 am-3:00pm</td>
                                <td style="color: red">Approved</td>
                                <td>Rohit</td>
                                <td>0989897798</td>
                          </tr>
                          <tr>
                                <td >Electrician</td>
                                <td>Wires Changing</td>
                                <td>22/09/2018</td>
                                <td>9:00 am-3:00pm</td>
                                <td style="color: red">Approved</td>
                                <td>Rohit</td>
                                <td>0989897798</td>
                          </tr>
                          <tr>
                                <td >Electrician</td>
                                <td>Wires Changing</td>
                                <td>22/09/2018</td>
                                <td>9:00 am-3:00pm</td>
                                <td style="color: green">Decline</td>
                                <td>Rohit</td>
                                <td>0989897798</td>
                         </tr>
                         <tr>
                                <td >Electrician</td>
                                <td>Wires Changing</td>
                                <td>22/09/2018</td>
                                <td>9:00 am-3:00pm</td>
                                <td style="color: red">Approved</td>
                                <td>Rohit</td>
                                <td>0989897798</td>
                          </tr>
                          <tr>
                                <td >Electrician</td>
                                <td>Wires Changing</td>
                                <td>22/09/2018</td>
                                <td>9:00 am-3:00pm</td>
                                <td style="color: green">Decline</td>
                                <td>Rohit</td>
                                <td>0989897798</td>
                          </tr>
                          <tr>
                                <td >Electrician</td>
                                <td>Wires Changing</td>
                                <td>22/09/2018</td>
                                <td>9:00 am-3:00pm</td>
                                <td style="color: red">Approved</td>
                                <td>Rohit</td>
                                <td>0989897798</td>
                          </tr>
                        </tbody>
                      </table>
                    </div> 
                 </div>
              </body>
</html>