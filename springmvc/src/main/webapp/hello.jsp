<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hello</title>
<script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
<script type="text/javascript">

     function submit(){
    	 alert('进入方法了');
    	
     }
     
     function test(){
    	 alert($('#password1').val());
        $.ajax({
        	url:'${contextPath}/show.do',
        	type:'POST',
        	data:{
        		'username':$('#username').val(),
        		'password':$('#password1').val(),
        		'age':$('#age').val()
        	},
        	success:function(data){
        		alert(data);
        	}
        	
        });
     }
 	function getXmlHttpRequest(){
		var xhr;
		if( window.XMLHttpRequest ){
			//判断成立说明用户用的是ie7+ ,其他的浏览器
			xhr = new XMLHttpRequest();
		}else{
			//说明用户使用的ie7以下的版本
			xhr=new ActiveXObject("Microsoft.XMLHTTP");
		}
		return xhr;
	}
     
</script>
</head>
<body>
   <form id="fm">
     账户：<input id="username" type="text"/> <br/>
     密码：<input id="password" type="text" /> <br/>
         <input type="button" onclick="test()" value="测试">
   </form>
   <br>
   <a href="${contextPath }/show1.do">点我</a>
</body>
</html>