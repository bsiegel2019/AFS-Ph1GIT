<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Drone Management</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link href="<c:url value='/resources/css/app.css' />" rel="stylesheet"></link>
</head>
<body ng-app="myApp" class="ng-cloak">
	<div class="generic-container" ng-controller="DroneController as ctrl">

		<div class="panel panel-default">
			<div class="panel-heading">
				<span class="lead">Drone Central</span>
			</div>
			<div class="tablecontainer">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>Drone ID</th>
							<th>Drone Owner</th>
							<th>Drone Name</th>
							<th>Drone Type</th>
							<th>Wing/Rotor Span</th>
							<th>Drone Status</th>
							<th>Drone Image</th>
							<th width="20%"></th>
						</tr>
					</thead>
					<tbody>
						<tr ng-repeat="dr in ctrl.drones">
							<td><span ng-bind="dr.droneId"></span></td>
							<td><span ng-bind="dr.droneOwnerName"></span></td>
							<td><span ng-bind="dr.droneName"></span></td>
							<td><span ng-bind="dr.droneType"></span></td>
							<td><span ng-bind="dr.droneSpan"></span></td>
							<td><span ng-bind="dr.droneStatus"></span></td>
							<td><span ng-bind="dr.droneImage"></span></td>
							<td>
								<button type="button" ng-click="ctrl.remove(dr.droneId)"
									class="btn btn-danger custom-width">Remove</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>

		<div>
			<h4>
				<a href="droneAdd">Click here to Add a New Drone!</a>
			</h4>
		</div>

		<script
			src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
		<script src="<c:url value='/resources/js/app.js' />"></script>
		<script src="<c:url value='/resources/js/service/drone_service.js' />"></script>
		<script
			src="<c:url value='/resources/js/controller/drone_controller.js' />"></script>
</body>
</html>