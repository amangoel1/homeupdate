
     
      
function validation(){
           var fname=document.getElementById('fname').value;
           var lname=document.getElementById('lname').value;
           var email=document.getElementById('email').value;
           var contact=document.getElementById('contact').value;
           var pswd=document.getElementById('pswd').value;
           var conpswd=document.getElementById('conpswd').value;                

           if(fname==""){
               document.getElementById('firstname').innerHTML="**Please fill the first name field";
               return false;
           }
           if((fname.length <= 2) || (fname.length > 20)) {
               document.getElementById('firstname').innerHTML="**First name length must be between 2 and 20";
               return false;
           }
           if(!isNaN(fname)){
               document.getElementById('firstname').innerHTML="**First name can't be a number. Please write valid name";
               return false;
           }

           
           if(lname==""){
               document.getElementById('lastname').innerHTML="**Please fill the last name field";
               return false;
           }
           if((lname.length <= 2) || (lname.length > 20)) {
               document.getElementById('lastname').innerHTML="**Last name length must be between 2 and 20";
               return false;
           }
           if(!isNaN(lname)){
               document.getElementById('lastname').innerHTML="**Last name can't be a number. Please write valid name";
               return false;
           }


           if(email==""){
               document.getElementById('emailId').innerHTML="**Please fill the email id field";
               return false;
           }

           if(email.indexOf('@')<=0){
               document.getElementById('emailId').innerHTML="**@ Invalid position";
               return false;
           }
           if((email.charAt(email.length-4)!='.') && (email.charAt(email.length-3)!='.')){
               document.getElementById('emailId').innerHTML="** Invalid email id";
               return false;
           }
   

           if(contact==""){
               document.getElementById('contactNo').innerHTML="**Please fill the contact field";
               return false;
           }
           
           if(isNaN(contact)){
               document.getElementById('contactNo').innerHTML="**Mobile number can't be a character, please write a valid mobile number.";
               return false;
           }
           if(contact.length!=10){
               document.getElementById('contactNo').innerHTML="**Invalid mobile number , length can not greater than 10.";
               return false;
           }

   


           if(pswd==""){
               document.getElementById('password').innerHTML="**Please fill the password field";
               return false;
           }
           if((pswd.length <= 6) || (pswd.length > 20)) {
               document.getElementById('password').innerHTML="**Password length must be between 6 and 20";
               return false;
           }
          


           if(conpswd==""){
               document.getElementById('confirmpass').innerHTML="**Please fill the confirm password field";
               return false;
           }
           if(pswd!=conpswd){
               document.getElementById('confirmpass').innerHTML="**Password is not matching with confirm password";
               return false;
           }

         
   }