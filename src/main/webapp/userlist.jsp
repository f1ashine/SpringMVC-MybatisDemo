<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://libs.baidu.com/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript">
	window.onload = function(){
		$("#btn").click(function(){
			$('#content').load("user/query.do","id="+$("#text").val(),function(resText,status,xhr){
				if(status=="success"){
					var info = JSON.parse(resText);
					alert(info.msg.password);
				}
				if(status=="error"){
					alert("请求失败！");
				}
				
			})
		});
		$(".back").click(function(){
			$(window).attr('location','http://localhost:8080/ssm/');
		});
	}
</script>
</head>
<body>
id:<input type="text" id="text"/>
<input type="button" id="btn" value="查询"/>
<p id="content"></p>
<input type="button" value="回退" class="back"/>
</body>
</html>