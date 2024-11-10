<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <c:import url="components/bootstrapHeader.jsp"/>
    <title>Create Schedule</title>
    <script src="<%= request.getContextPath() %>/js/test.js"></script>
</head>
<body>
    <c:import url="components/navbar.jsp"/>

    <h2>Schedule Builder</h2>
    <script>
        init();
    </script>

    <c:import url="components/footer.jsp"/>
    <c:import url="components/bootstrapBody.jsp"/>
</body>
</html>

