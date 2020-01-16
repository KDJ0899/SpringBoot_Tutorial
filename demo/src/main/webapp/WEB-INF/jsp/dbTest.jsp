<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table>
        <tr>
            <th>SEQ</th>
            <th>ITEMID</th>
        </tr>
 
 
        <c:forEach var="list" items="${list}">
            <tr>
                <td><p>${list.SEQ}</p></td>
                <td><p>${list.ITEMID}</p></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>