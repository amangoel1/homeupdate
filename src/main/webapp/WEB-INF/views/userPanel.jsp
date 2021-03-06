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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="resources/css/styles.css"/>
    <link rel="stylesheet" href="resources/css/userStyles.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <script src="resources/js/adminPanel.js"></script>

</head>

<body >
    <div>
        <nav class="navbar  navbar-custom navbar-dark navbar-expand-lg  fixed-top "  >
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
                  <img src="resources/css/profile.png"  class="profile_pic"> <label class="p-2">Irfan <br><small>User</small> </label>
                  </div>

                  <a href="userPanel.html">Dashboard</a>
                  <a href="userPanelProfile.html">Profile</a>
                  <a href="userRequestStatus.html">Request status</a>
              </div> 

               <div class="content" >
                 
                <div class="top-head-table border"> List of Services Available <br> <small>Recently added</small></div>
                <table  border="2" class="  w-75 " style="margin-left: 15%;">
                    <tr style="background-color: red">
                        <th>Service Name</th>
                        <th>Click to see</th>
                    </tr>
                    <tr style="background-color: white">
                        <td>Electrician</td>
                        <td><a href="ElectricianServiceDetails.html"><button type="button" class="w-100" style="background-color: red" data-toggle="modal" data-target="#Electrician">
                                Click here
                              </button>
                            </a></td>
                    </tr>

                    <tr style="background-color: white">
                            <td>Plumber</td>
                            <td><a href="PlumberServiceDetails.html><button type="button" class="w-100" style="background-color: red" data-toggle="modal" data-target="#Plumber">
                                    Click here
                                 </button> 
                               </a> </td>
                        </tr>

                        <tr style="background-color: white">
                                <td>Mechanic</td>
                                <td><a href="MechanicServiceDetails.html><button type="button" class="w-100" style="background-color: red" data-toggle="modal" data-target="#Mechanic">
                                        Click me
                                      </button></a>
                                    </td>
                            </tr>
                </table>
       
                </div> 
             <!--Electrician model-->

                <div  class="modal fade"   id="Electrician">
                        <div class="modal-dialog modal-dialog-centered">
                          <div class="modal-content">
                          
                            <!-- Modal Header -->
                            <div class="modal-header">
                              <h4 class="modal-title">Electrician Details</h4>
                              <button type="button" class="close" data-dismiss="modal">&times;</button>
                            </div>
                            
                            <!-- Modal body -->
                            <table border="3"  style="margin-left: 10%; margin-right: 10% ">
                                    <tr>
                                        <th>Service Name</th>
                                        <th>Service Details</th>
                                        <th>Prize</th>
                                        <th>Available time</th>
                                    </tr>
                                    <tr style="background-color: white">
                                     <c:forEach items="${services}" var ="service">
                                        <td>${service.serviceName}</td>
                                        <td>${service.serviceDetails} </td>
                                        <td>${service.price }</td>
                                        <td>${service.availableTimings}</td>
                                        </c:forEach>
                                    </tr>
                            </table> 
                            <!-- Modal footer -->
                            <div class="modal-footer">
                                <a href="request.html"><input type="button" value="Request" style="background: red"></a>
                              </div>
                            
                          </div>
                        </div>
                      </div>
                      
              <!--Plumber model-->

              <div  class="modal fade" id="Plumber">
                    <div class="modal-dialog modal-dialog-centered">
                      <div class="modal-content">
                      
                        <!-- Modal Header -->
                        <div class="modal-header">
                          <h4 class="modal-title">Plumbing service Details</h4>
                          <button type="button" class="close" data-dismiss="modal">&times;</button>
                        </div>
                        
                        <!-- Modal body -->
                        <table border="3"   style="margin-left: 10%; margin-right: 10%">
                                <tr>
                                    <th>Service Name</th>
                                    <th>Service Details</th>
                                    <th>Prize</th>
                                    <th>Available time</th>
                                </tr>
                                <tr style="background-color: white">
                                    <c:forEach items="${services}" var ="service">
                                        <td>${service.serviceName}</td>
                                        <td>${service.serviceDetails} </td>
                                        <td>${service.price }</td>
                                        <td>${service.availableTimings}</td>
                                        </c:forEach>
                                </tr>
                        </table> 
                        <!-- Modal footer -->
                        <div class="modal-footer">
                            <a href="request.html"><input type="button" value="Request" style="background: red"></a>
                          </div>
                        
                      </div>
                    </div>
                  </div>
                  

                    <!--Mechanic model-->

                <div  class="modal fade" id="Mechanic">
                        <div class="modal-dialog modal-dialog-centered">
                          <div class="modal-content">
                          
                            <!-- Modal Header -->
                            <div class="modal-header">
                              <h4 class="modal-title">Mechanic Service Details</h4>
                              <button type="button" class="close" data-dismiss="modal">&times;</button>
                            </div>
                            
                            <!-- Modal body -->
                            <table border="3"   style="margin-left: 10%; margin-right: 10%">
                                    <tr>
                                        <th>Service Name</th>
                                        <th>Service Details</th>
                                        <th>Prize</th>
                                        <th>Available time</th>
                                    </tr>
                                    <tr style="background-color: white">
                                         <c:forEach items="${services}" var ="service">
                                        <td>${service.serviceName}</td>
                                        <td>${service.serviceDetails} </td>
                                        <td>${service.price }</td>
                                        <td>${service.availableTimings}</td>
                                        </c:forEach>
                                    </tr>
                            </table> 
                            <!-- Modal footer -->
                            <div class="modal-footer">
                                <a href="request.html"><input type="button" value="Request" style="background: red"></a>
                              </div>
                            
                          </div>
                        </div>
                      </div>
                      
              </body>
</html>