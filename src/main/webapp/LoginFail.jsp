<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Status</title>
</head>
<style>
.edit_header 
{
    font-family: Verdana, Geneva, sans-serif;
    font-size: 11px;
    font-weight: bold;
    height: 35;
     }
.button {
    display: block;
    width: 100px;
    height: 35px;
    background: #175668;
    padding: 8px;
    text-align: center;
    border-radius: 5px;
    color: white;
    font-weight: bold;
}

div.home_header{
	height: 5em;
    width: 100%;
	padding-top: 1em;
	padding-bottom: 1px;
	color:teal ;
	background-color:white;
	clear: left;
	text-align: center;
}
</style> 

<body style="margin:0px">

<table id="Table1"  border="0" cellspacing="0" cellpadding="0" runat="Server"  style="width:100%" >
               
               
		<tr align="left">
<!-- 		<td style="width: 100%; height: 105px;" align="right"></td> -->
			 <td style="margin-top:-5px; width:1365px; color:white; font-weight:lighter; font-family:Colonna MT; font-size:44pt;
                       margin-left:60px;background-color:rgba(119, 187, 130, 1); background-image:url(images/inner_top.jpg)";>Application Management</td> 
		</tr>
</table>
           
           
<form action="/HCSC_Applications/index.jsp" class=edit_header>
	<center><br><br><br><br>
	<br><p style="font-size:20px;">Your User id is Inactive<br/></p>
	<br><br><br>
	<input type="submit"  class="button" value="HOME" style="text-align:center; background-color:rgba(119, 187, 130, 1);color: white"></center>
</form>





<div style="height:80px; border-top:1px solid #e5e5e5; padding:-20px; clear:both; bottom:0;position:absolute;width:100%;">
<div class="nine_font" style="padding:30px 20px 30px 20px; text-align:center; background-color:rgba(119, 187, 130, 1); background-image:url(images/footer.jpg);color: white" >© 2017 Cognizant Technology Solutions.<br />
        All rights reserved.</div>
</div>
</body>
</html>