<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>ȸ�� ���</h2>
<form action="${pageContext.request.contextPath}/member/addMember.do" method="post">
    �̸�: <input type="text" name="name" required /><br>
    �̸���: <input type="email" name="email" required /><br>
    <button type="submit">���</button>
</form>
