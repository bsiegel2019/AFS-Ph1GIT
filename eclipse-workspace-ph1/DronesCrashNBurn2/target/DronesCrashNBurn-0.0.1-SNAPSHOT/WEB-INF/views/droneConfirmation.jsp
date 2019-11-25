<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Drone Confirmation</title>
</head>
<body>
	<h3>Enjoy the Drone!</h3>
	<table>
		<tr>
			<td>Drone Owner Name:</td>
			<td>${droneOwnerName}</td>
		</tr>
		<tr>
			<td>Drone Name:</td>
			<td>${droneName}</td>
		</tr>
		<tr>
			<td>Drone Type:</td>
			<td>${droneType}</td>
		</tr>
		<tr>
			<td>Drone Span (Wing or Rotor):</td>
			<td>${droneSpan}</td>
		</tr>
		<tr>
			<td>Drone Status:</td>
			<td>${droneStatus}</td>
		</tr>
		<tr>
			<td>Drone Image:</td>
			<td>${droneImage}</td>
		</tr>
		<tr>
			<td><a href="droneManagement">Back to the Drones!</a></td>
		</tr>
	</table>
</body>
</html>