<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Application Management</title>
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
                       margin-left:60px; background-color:rgba(119, 187, 130, 1)">Application Management</td> 
		</tr>
</table>




<form action="members/details" method= post>
<div style="height: 15px; width: 500;margin-top:55px; padding: 10px 300px 40px 570px;font-weight:bold;font-size:23px;font-family:Colonna MT" >Existing Application</div>
		
		<div style="height: 15px;margin-top:-45px; width: 20; padding: 50px 200px 10px 500px; size: 50px">
		<label style = "font-family:Colonna MT; font-size: 19px;">Enter Application Number</label>
		
		<input type=text id= "appnumber" name=appnumber  style="font-size: 11px;font-weight: bold">
		
		<!-- <label style = "font-family:Colonna MT; font-size: 19px;">Premium Value from DB</label>
		<input type=text name=premiumamount style="font-size: 11px;font-weight: bold"> -->
		</div>
		
		
		<div style="color: white; padding:50px 200px 40px 620px">			
		<button class="btn btn-primary" style="background-color:rgba(119, 187, 130, 1);"><span title="edit"
							class="glyphicon glyphicon-pencil" style="color:white;background-color:rgba(119, 187, 130, 1);"></span></button>
		</div>
</form>


<div>
<div style="height: 15px; width: 500;margin-top:55px; padding: 20px 300px 40px 570px;font-weight:bold;font-size:23px;font-family:Colonna MT" >New Application</div>
		
		<div style="height: 15px;margin-top:-45px; width: 20; padding: 50px 200px 10px 500px; size: 50px">
		<label style = "font-family:Colonna MT; font-size: 19px;"></label>
		</div>
		
		<div style="color: white; padding:10px 200px 40px 620px">
		<!-- <input type="button" value="Submit" onclick="editAssociate(document.getElementById('policynumber').value)"> -->
		
		<!-- <button class="button" style="color: white; background-color: #22914b;" onclick="editAssociate('201705241001')">Show Premium</button> -->
		<button class="btn btn-primary" style="background-color:rgba(119, 187, 130, 1)" onclick="editAssociate(document.getElementById('appnumber').value)"><span title="edit"
							class="glyphicon glyphicon-pencil" style="color:white;background-color:rgba(119, 187, 130, 1)"></span></button> 
		</div>
</div>
<!-- 
seperate line just to test session.get attribute -->
		<!-- <form action="demo1" method= post>
		<input type=text id= "policynumber" name=policynumber  style="font-size: 11px;font-weight: bold" >
		<input type="submit" style="color: white; background-color:rgba(119, 187, 130, 1)" value="Calculate Premium">
		</form> -->


<div class="modal fade" id="editModal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header"><!-- 
				for cross mark in top right corner -->
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
<!-- 					<h4 class="modal-title add">Edit Associate</h4> -->
 		  <table id="Table1"  border="0" cellspacing="0" cellpadding="0" runat="Server"   style=" background-color:rgba(119, 187, 130, 1)">
                <tr align="left">
                   <td style="margin-top:-5px; width:1365px; color:white; font-weight:lighter; font-family:Colonna MT; font-size:44pt;
                       margin-left:60px;">Application Details</td>          
                </tr>
          </table>
				</div>
				<div class="modal-body">
					<!-- Row start -->
					<div class="row">
						<div class="col-md-12 col-sm-6 col-xs-12">
							<div class="panel panel-default">
								<div class="panel-body">
									<form id="editAssociate"  class="form-horizontal row-border" action="updateAssociate"
										method="post">
<!-- 										<div class="form-group"> -->
<!-- 											<label class="col-md-4 control-label">AssociateID</label> -->
<!-- 											<div class="col-md-8"> -->
												<input type="hidden" name="sno" class="form-control">
<!-- 											</div> -->
<!-- 										</div> -->


										<div class="form-group">
											<label class="col-md-4 control-label" style="text-align:left">Application ID</label>
											<div class="col-md-8">
												<input class="form-control" type="text" name="Applicant_Full_Name" style="font-size: 11px;font-weight: normal">
											</div>
										</div>
										
										<div class="form-group">
											<label class="col-md-4 control-label" style="text-align:left">Application Name</label>
											<div class="col-md-8">
												<input class="form-control" type="text" name="Applicant_Full_Name" style="font-size: 11px;font-weight: normal">
											</div>
										</div>
										<div class="form-group">
											<label class="col-md-4 control-label" style="text-align:left">Upstream Application</label>
											<div class="col-md-8">
												<input class="form-control" type="text" name="City" style="font-size: 11px;font-weight: normal">
											</div>
										</div>
										
										<div class="form-group">
											<label class="col-md-4 control-label" style="text-align:left">Downstream Application</label>
											<div class="col-md-8">
												<input class="form-control" type="text" name="Cell_Phone_No" style="font-size: 11px;font-weight: normal">
											</div>
										</div>
										
																			
										<div class="modal-footer">
											<button type="button" class="btn btn-danger"
												data-dismiss="modal"style="color:#161616;background-color:#efc9c9">Close</button>
											<button type="submit" id="associateEdit" class="btn btn-success" style="color:#161616;background-color:rgba(119, 187, 130, 1)">Submit</button>
										</div> 
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>

<div style="height:80px; border-top:1px solid #e5e5e5; padding:-20px; clear:both; bottom:0;position:absolute;width:100%;">
<div class="nine_font" style="padding:30px 20px 30px 20px; text-align:center; background-color:rgba(119, 187, 130, 1);color: white" >© 2017 Cognizant Technology Solutions.<br />
        All rights reserved.</div>
</div>
</body>
</html>
 