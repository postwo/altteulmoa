<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.0.min.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
</head>
<body>
<h2>회원가입</h2> 
<form action="/auth/join" method="post">
        
                    <p>아이디</p>
                    <input type="text" placeholder="아이디를 입력해주세요." name="userId"required="required" />
           
                    <p>비밀번호</p>
                    <input input type="password" name="password" " placeholder="비밀번호를 입력해주세요" required="required" maxlength='20'/>
           
                    <p>닉네임</p>
                    <input type="text" name="nickname" placeholder="닉네임을 입력해주세요" required="required"/>                 
                <font id="label2" size ="2"></font>
                
                  <p>이름</p>
                    <input type="text" name="name" placeholder="이름을 입력해주세요" required="required"/>
                
                    <p>나이</p>
                    <input type="text" name="age" placeholder="나이를 입력해주세요" required="required"/>
          
                    <p>이메일</p>
                    <input type="text" name="email" placeholder="ex)abc@naver.com"required="required"/>                  
                	<font id="label3" size ="2"></font>
       
                    <p>비밀번호 힌트</p>
                    <select id="hint" name="hintNo" required="required">
                        <option disabled selected>선택해 주세요.</option>
                        <option value="1">나의 출신 초등학교는?</option>
                        <option value="2">내가 좋아하는 캐릭터는?</option>
                        <option value="3">다시 태어나면 되고 싶은 것은?</option>
                        <option value="4">가장 좋아하는 색깔은?</option>
                        <option value="5">나의 출신 고향은?</option>
                    </select>
                
                    <p>비밀번호 정답</p>
                    <input type="text" name="hintanswer" placeholder="정답을 입력해주세요" value="" required="required"/>
 
                    <p>도로명 주소</p>
                    <input class="form-control" "id="streetAddr" placeholder="도로 주소" name="streetAddress" type="text" readonly="readonly" required="required"/>
                 	<input type="button" class="btn btn-default" onclick="execPostCode()"  value="주소 찾기">  
     
                    <p>읍/면/동</p>
                     <input class="form-control" id="userDetailAddr" placeholder="읍/면/동" name="streetDetailAddress" type="text" readonly="readonly" required="required">
            
                    <p>상세 주소</p>
                    <input class="form-control" placeholder="상세주소" name="detailAddress" id="detailAddr" type="text" required="required"/>
       				<br/>
                   <button>회원가입</button>
 </form>                     
</body>
<script src="/js/join.js"></script>
</html>