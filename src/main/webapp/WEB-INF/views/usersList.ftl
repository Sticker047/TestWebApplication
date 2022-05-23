<!DOCTYPE html>
<html lang="en">
<body>
<h1>Users list</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Age</th>
    </tr>
    <#list users as user>
        <tr>
            <td><a href="/TestWebApplication_war/user/${user.id}">${user.id}</a></td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.age}</td>
            <td><a href="/TestWebApplication_war/delete/${user.id}">Delete</a> </td>
            <td><a href="/TestWebApplication_war/update/${user.id}">Update</a> </td>
        </tr>
    </#list>
</table>

<a href="/TestWebApplication_war/addUser">Create user</a>
</body>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
</html>