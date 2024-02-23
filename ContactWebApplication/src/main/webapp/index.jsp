<html>
<head>
<title>Contact List</Title>
</head>
<body>
<h3>Contact Details</h3>
<form action="addUser">
<input type="number" name="id" placeholder="Enter Contact S.No"><br>
<input type="text" name="userName" placeholder="Enter Contact Name"><br>
<input type="text" name="mobileNumber" placeholder="Enter Contact Number" maxlength="10"><br>
<input type="submit" name="submit"><br>
</form>

<h3>Find Contact Detail</h3>
<form action="findUser">
<input type="number" name="id" placeholder="Enter Contact S.No"><br>
<input type="submit" name="submit"><br>
</form>

<h3>Delete Contact list</h3>
<form action="deleteUser">
<input type="number" name="id" placeholder="Enter Contact S.No"><br>
<input type="submit" name="submit"><br>
</form>

<h3>Update Contact list</h3>
<form action="updateUser">
<input type="number" name="id" placeholder="Enter Contact S.No"><br>
<input type="submit" name="submit"><br>
</form>


</body>
</html>