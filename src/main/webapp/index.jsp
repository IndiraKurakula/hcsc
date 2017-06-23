<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Management	</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="jquery.monthpicker.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.0.6/handlebars.js">

</script>
<script type="text/javascript">

//	To edit the associate Details for the super user
function editAssociate(value) {
	
	alert("Here alert value" + value);
	alert("Here we are2");
	$("#editModal").modal("show");
	alert("Here we are 2nd");
	
/* 	$("#Policy_Number").val(value); */
	/* alert("Here Policy_Number value " + Policy_Number); */
	alert("Here we are 3rd");
	$.ajax({
		method :  "POST",
		url : "demo",
		data : "id="+value,
		success : function(data) {
			var associate=JSON.parse(data);
			$("[name='Policy_Number']").val(associate.Policy_Number);
			$("[name='Applicant_Full_Name']").val(associate.Applicant_Full_Name);
			$("[name='City']").val(associate.City);
			$("[name='Cell_Phone_No']").val(associate.Cell_Phone_No);
			$("[name='Gender']").val(associate.Gender);
			$("[name='Premium_Amount']").val(associate.Premium_Amount);
			$("[name='Policy_Status']").val(associate.Policy_Status);
			$()
		}
	});
}

</script>


</head>
<body>

<table id="Table1"  border="0" cellspacing="0" cellpadding="0" runat="Server"  style="width:100%" >
               
               
		<tr align="left">
<!-- 		<td style="width: 100%; height: 105px;" align="right"></td> -->
			 <td style="margin-top:-5px; width:1365px; color:white; font-weight:lighter; font-family:Colonna MT; font-size:44pt;
                       margin-left:60px; background-image:url(images/inner_top.jpg)";>Application Management</td> 
		</tr>
</table>




<form action="rest/members" method= post>
<div style="height: 15px; width: 500;margin-top:55px; padding: 50px 300px 40px 490px;font-weight:bold;font-size:23px;font-family:Colonna MT" ></div>
		
		 <%
		  String msg=(String)request.getAttribute("msg");
           try{
       		if(msg.equals(null))
       		{
       			int a=2+3;
       		}
       		else
       		{%>	
       		<center>
       		
       		<font size="3" color="red"><div><%=request.getAttribute("msg")%></div></font></center>
       			<%}
       	}catch(NullPointerException e){}
       		%> 
		
		
		
		<div style="height: 15px;margin-top:-45px; width: 20; padding: 80px 200px 10px 500px; size: 50px">
		<label style = "font-family:Colonna MT; font-size: 19px;">Enter User ID</label>		
		<input type=text id= "usernumber" name=usernumber  style="font-size: 11px;font-weight: bold">
		</div>
		
		
		<div style="color: white; padding:50px 200px 40px 620px">		
		<button class="btn btn-primary" style="background-color:rgba(119, 187, 130, 1);"><span title="edit"
							class="glyphicon glyphicon-pencil" style="color:white;background-color:rgba(119, 187, 130, 1);"></span></button>
		</div>
</form>


<div style="height:80px; border-top:1px solid #e5e5e5; padding:-20px; clear:both; bottom:0;position:absolute;width:100%;">
<div class="nine_font" style="padding:30px 20px 30px 20px; text-align:center; background-image:url(images/footer.jpg);color: white" ><br />
        </div>
</div>
</body>
</html>
 