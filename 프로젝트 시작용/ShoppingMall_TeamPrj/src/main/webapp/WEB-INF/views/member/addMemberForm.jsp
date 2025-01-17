<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>회원 등록</h2>
<form action="${pageContext.request.contextPath}/member/addMember.do" method="post">
    이름: <input type="text" name="user_name" required /><br>
    비밀번호: <input type="password" name="password" required /><br>
    이메일: <input type="email" name="email" required /><br>
    휴대전화번호: <input type="text" name="phone_number" required /><br>
    주소: <input type="text" name="address" required /><br>
    생년월일: <input type="date" name="date_of_birth" required /><br>
    성별: 
    <select name="gender" required>
        <option value="Male">남성</option>
        <option value="Female">여성</option>
        <option value="Other">기타</option>
    </select><br>
    <button type="submit">등록</button>
</form>
