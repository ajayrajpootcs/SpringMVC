<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employees</title>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
            padding: 8px;
        }
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body >
    <h2>Employees</h2>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Age</th>
                <th>Salary</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="employee">
                <tr>
                    <td>${employee.id}</td>
                    <td>${employee.name}</td>
                    <td>${employee.gender}</td>
                    <td>${employee.age}</td>
                    <td>${employee.salary}</td>
                    <td><input type='button' value='Update' class="updateButton" data-employee-id="${employee.id}"></td>
                    <td><input type='button' value='Delete' class="deleteButton" data-employee-id="${employee.id}" ></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <script>
	    $('.updateButton').on('click', function (e) {
				var employeeId = $(this).data('employee-id');
				
	    	   $.ajax({
	    	   type:'GET',
	    	   url :"/SpringHibernate/result/" + employeeId,
	    	   success: function(data) {
	    	        console.log('success',data);
	    	        window.location.href = "/SpringHibernate/updateform/" + employeeId;
	    	   },
	    	   error:function(exception){alert('Exeption:'+exception);}
	    	}); 
	    	 e.preventDefault();
	    	});
	    $('.deleteButton').on('click', function (e) {
			var employeeId = $(this).data('employee-id');
			
    	   $.ajax({
    	   type:'POST',
    	   url :"/SpringHibernate/delete/" + employeeId,
    	   success: function(data) {
    	        console.log('success',data);
    	        window.location.href = "/SpringHibernate/list/"
    	        location.reload(true); 
    	   },
    	   error:function(exception){alert('Exeption:'+exception);}
    	}); 
    	 e.preventDefault();
    	});
    </script>
</body>
</html>
