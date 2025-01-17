<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>ºÓ«Œ∏Ù</title>
</head>
<body>
    <header>
        <jsp:include page="${header}" />
    </header>
    <nav>
        <jsp:include page="${menu}" />
    </nav>
    <main>
        <jsp:include page="${content}" />
    </main>
    <footer>
        <jsp:include page="${footer}" />
    </footer>
</body>
</html>
