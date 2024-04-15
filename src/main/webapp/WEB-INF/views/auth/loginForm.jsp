<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

<form action="/auth/login" method="post">
<input type="text" name= "username" placeholder="아이디" required="required"/>
<input type="password" name= "password" placeholder="비밀번호" required="required"/>
<button>로그인</button>
</form>

				<div class="login__register">
                        <span>계정이 없으신가요?</span>
                        <a href="/joinForm">가입하기</a>
                    </div>
</body>
</html>