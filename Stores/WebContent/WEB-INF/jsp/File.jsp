<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<c:set var="ctx" value="<%=request.getContextPath()%>"/>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${ctx}/js/jquery.min.js"></script>
<title>文件上传</title>
<script type="text/javascript">
$(function(){
	var cont=$("#frameId")[0].contentWindow.document;
	cont.onreadystatechange=function(){
		//alert($(this.body).html());
	}
	var $fBody=$($("#frameId")[0].contentWindow.document.body);
	$fBody.append("<h2>tttt</h2>");
	var $from=$("<from action='${ctx}/file/upload' method='post' enctype='multipart/form-data' ></from>");
	var $file=$("<input type='file' name='abc'>");
	var $sub=$("<input type='submit'name='ab' value='提交'>");
	$from.append($file);
	$from.append($sub);
	$fBody.append($from);
	debugger;
});

</script>
</head>
<body>
	<form id="fm" action="<%=path%>/file/upload" method="post"
		enctype="multipart/form-data">
		<input type="file" name="abc"> 
		<input type="submit" name="ab" value="提交">
	</form>
	
	<iframe id="frameId" style="width:500px;height:300px;border:1px solid #f00;"></iframe>

</body>
</html>