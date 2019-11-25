<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
		<title>Drone List</title>
    </head>
    <body>
        <h3>Welcome to Our Drones!</h3>
        <form:form method="POST"
          action="droneConfirmation" modelAttribute="drone">
             <form:input type="hidden" path="droneId"/>
             <table>
				<tr>
                    <td><form:label path="droneOwnerName">Drone Owner Name *</form:label></td>
                    <td><form:input path="droneOwnerName" required="required"/></td>
                </tr>
                <tr>
                    <td><form:label path="droneName">Drone Name *</form:label></td>
                    <td><form:input path="droneName" required="required"/></td>
                </tr>
                <tr>
                    <td><form:label path="droneType">Drone Type</form:label></td>
                    <td><form:input path="droneType"/></td>
                </tr>
                <tr>
                    <td><form:label path="droneSpan">Drone Span (Wing or Rotor)</form:label></td>
                    <td><form:input path="droneSpan"/></td>
                </tr>
                <tr>
                    <td><form:label path="droneStatus">Drone Status</form:label></td>
                    <td><form:input path="droneStatus"/></td>
                </tr>
                <tr>
                    <td><form:label path="droneImage">Drone Image</form:label></td>
                    <td><form:input path="droneImage"/></td>
                </tr>
               <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>