<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

        <!DOCTYPE html>
<html>

<body>

    <h2>Dear employee, you are Welcome!</h2>
    <br>
    <br>
    <br>

    Your name: ${employee.name}
    <br>
    <br>

    Your surname: ${employee.surname}
    <br>
    <br>

    Your salary: ${employee.salary}
    <br>
    <br>

    Your department: ${employee.department}
    <br>
    <br>

    Your role: ${employee.role}
    <br>
    <br>

    Language(s):
    <ul>

        <c:forEach var="lang" value="${employee.languages}">

            <li>${lang}</li>

        </c:forEach>

    </ul>

    Phone Number: ${employee.phoneNumber}
    <br>
    <br>

    Email: ${employee.email}


</body>

</html>