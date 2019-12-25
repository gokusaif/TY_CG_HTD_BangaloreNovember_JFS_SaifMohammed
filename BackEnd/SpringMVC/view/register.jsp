<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form action="./register" method="post">
		<fieldset>
			<h2>Employee Details</h2>
			<table>
				<tr>
					<td>Name :</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Email :</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
		</fieldset>
		<br>
		<fieldset>
			<h2>Employee Permanent Address</h2>
			<table>
				<tr>
					<td>Address Type</td>
					<td><select name="other[0].addressType">
							<option value="P" selected>Permanent</option>
							<option value="T">Temporary</option>
					</select></td>
				</tr>
				<tr>
					<td>Address 1 :</td>
					<td><input type="text" name="other[0].address1"></td>
				</tr>
				<tr>
					<td>Address 2 :</td>
					<td><input type="text" name="other[0].address2"></td>
				</tr>
			</table>
		</fieldset>
		<fieldset>
			<h2>Employee Temporary Address</h2>
			<table>
				<tr>
					<td>Address Type</td>
					<td><select name="other[1].addressType">
							<option value="P">Permanent</option>
							<option value="T" selected>Temporary</option>
					</select></td>
				</tr>
				<tr>
					<td>Address 1 :</td>
					<td><input type="text" name="other[1].address1"></td>
				</tr>
				<tr>
					<td>Address 2 :</td>
					<td><input type="text" name="other[1].address2"></td>
				</tr>
				<tr>
					<td><input type="submit" name="Submit"></td>
					<td><input type="reset" name="Reset"></td>
				</tr>
			</table>
		</fieldset>


	</form>
</body>
</html>