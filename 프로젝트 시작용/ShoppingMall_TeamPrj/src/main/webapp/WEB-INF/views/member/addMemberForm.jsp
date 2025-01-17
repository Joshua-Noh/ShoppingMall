<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>회원 등록</h2>
<form action="${pageContext.request.contextPath}/member/addMember.do" method="post">
    이름: <input type="text" name="name" required /><br>
    이메일: <input type="email" name="email" required /><br>
    <button type="submit">등록</button>
</form>
