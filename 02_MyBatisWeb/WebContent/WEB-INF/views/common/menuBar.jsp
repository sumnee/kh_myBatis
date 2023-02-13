<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<!-- head 필요없어서 삭제함~ 한글 안쓰면 위에 부분도 삭제 가능! -->
    <head>
        <style>
            h1 {
                text-align: center;
                color: red;
            }
            .menu {
                display: table-cell;
                width: 250px;
                height: 50px;
                text-align: center;
                vertical-align: middle;
                font-size: 20px;
                background-color: black;
                color: white;
            }

            .menu:hover {
                background: grey;
                cursor: pointer;
            }
            .login-table {
                float: right;
            }
            .login-area {
                height: 80px;
            }
        </style>
    </head>
    <body>
        <h1>Welcome to MyBatisWeb</h1>
        <br>
        <div class="login-area">
            <form action="/member/login.do" method="post">
                <table class="login-table">
                    <tr>
                        <td>아이디 : </td>
                        <td><input type="text" name="member-id"></td>
                        <td rowspan="2"><button style="height: 50px;">LOGIN</button></td>
                    </tr>
                    <tr>
                        <td>비밀번호 : </td>
                        <td><input type="password" name="member-pw"></td>
                    </tr>
                </table>
            </form>
            <c:if test="${sessionScope.member ne null }">
           		<table class="login-table">
           			<tr>
	           			<td>
	           				<b>${sessionScope.member.memberName }</b>님 환영합니다!
	           			</td>
        			</tr>
        			<tr>
	           			<td>
	           				<a href="/member/logout.do">로그아웃</a>
	           			</td>
        			</tr>
        		</table>
        	</c:if>
        		
        </div>
        <div>
            <div class="menu" onclick="">Home</div>
            <div class="menu" onclick="">MemberList</div>
            <div class="menu" onclick="">ClassList</div>
            <div class="menu" onclick="">Notice</div>
            <div class="menu" onclick="">ETC</div>
        </div>
    </body>
</html>