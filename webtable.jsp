<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>

<table id="items">

 <tr>
   <th>Name</th>
   <th>Age</th> 
   <th>Department</th>
 </tr>
 <tr>
   <td>Somnath Biswas</td>
   <td>32</td>
   <td>comp.sc</td>
 </tr>
 <tr>
   <td>John Denour</td>
   <td>35</td>
   <td>Devops</td>
 </tr>

<tr>
   <td>Rajkamal Raj</td>
   <td>34</td>
   <td>Selenium</td>
 </tr>
 
 <tr>
   <td>Stella Desouja</td>
   <td>30</td>
   <td>Cucumber</td>
 </tr>

</table>


<!-- this is for alert box operation -->
		<button type="button" onclick="return popUp()" id="btnClick">Alert
			check</button>

<script>

function popUp(){

	alert("alert box in javascript triggered by selenium");

}
</script>
</body>
</html>
