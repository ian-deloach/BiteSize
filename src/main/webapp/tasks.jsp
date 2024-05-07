<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <c:import url="components/bootstrapHeader.jsp"/>
    <title>My Tasks</title>
</head>
<body>
<c:import url="components/navbar.jsp"/>

    <table>
        <thead>
            <th>Name</th>
            <th>Urgency</th>
            <th>Deadline</th>
            <th>Description</th>
        </thead>
        <tbody>
            <c:forEach var="task" items="${tasks}">
                <tr>
                    <td>${task.name}</td>
                    <td>${task.urgency}</td>
                    <td>${task.deadline}</td>
                    <td>${task.description}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>


<c:import url="components/bootstrapBody.jsp"/>
</body>
</html>