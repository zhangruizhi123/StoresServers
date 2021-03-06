<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<c:set var="ctx" value="<%=request.getContextPath()%>"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>书籍类型管理</title>
<jsp:include page="_mate.jsp"></jsp:include>
<style type="text/css">
.width-50{
display:inline-block;
width:50px;
}

</style>
<script type="text/javascript" src="${ctx}/js/jquery.form.js"></script>
<script type="text/javascript">

function sexs(show){
	if(show){
		return "男";
	}else{
		return "女";
	}
}
//查询
function searchs(){
	
	var name=$("#name").val();
	
	$('#tt').datagrid('load',{name: name});
}

//删除列
function remove(){
	var row = $('#tt').datagrid('getSelected');
	if(!row){
		alertMsg("请选择要删除的行");
		return false;
	}
	var id=row.id;
	$.ajax({
		url:'${ctx}/admin/system/remove?id='+id,
		type:'get',
		success:function(result){
			if(result.flag){
				$('#tt').datagrid('reload');  
				alertMsg("删除成功");
			}else{
				alertMsg("删除失败");
			}
		}
	});
}

var id=0;
var submitUrl="";
//添加数据
function add(){
	$("#nameAdd").val("");
	$("#mail").val("");
	$("#phone").val("");
	$("#password").val("");
	$("#repassword").val("");
	submitUrl="${ctx}/admin/system/add";
	$('#winAdd').window('open');
}

function submits(){
	var result={};
	var sex=$("input[name=sex]:checked").val();
	result.sex=sex;
	result.id=id;
	
	var name=$("#nameAdd").val();
	if(name==""){
		toast("用户名不能为空");
		return false;
	}
	result.name=name;
	var mail=$("#mail").val();
	if(mail==""){
		toast("邮箱不能为空");
		return false;
	}
	result.mail=mail;
	
	var phone=$("#phone").val();
	if(phone==""){
		toast("电话不能为空");
		return false;
	}
	result.phone=phone;
	
	var password=$("#password").val();
	
	if(password==""){
		toast("密码不能为空");
		return false;
	}
	result.password=password;
	
	
	var repassword=$("#repassword").val();
	if(repassword==""){
		toast("电话不能为空");
		return false;
	}
	result.repassword=repassword;
	
	if(repassword!=password){
		toast("密码和确认码不能相同");
		return false;
	}
	
	$.ajax({
		url:submitUrl,
		type:'post',
		data:result,
		success:function(date){
			if(date.flag){
				$('#tt').datagrid('reload'); 
			}
			toast(date.message);
		}
	});
}

//修改列
function update(){
	
	submitUrl="${ctx}/admin/system/update";
	var row = $('#tt').datagrid('getSelected');
	if(!row){
		alertMsg("请选择要修改的行");
		return false;
	}
	id=row.id;
	$('#winAdd').window('open');
	if(row.sex==0){
		$("input[name=sex][value=0]").attr("checked","checked");
	}else{
		$("input[name=sex][value=1]").attr("checked","checked");
	}
	
	$("#nameAdd").val(row.name);
	$("#phone").val(row.phone);
	$("#mail").val(row.mail);
	
}
</script>
</head>
<body>
	<div class="table">
		<table id="tt" class="easyui-datagrid" style="width:100%;"
			url="${ctx}/admin/system/list"
			title="书籍类型" iconCls="icon-save"
			toolbar="#tb"
			singleSelect="true"
			rownumbers="true" pagination="true">
			<thead>
				<tr>
					<th field="id" hidden="true" width="150" align="center">id</th>
					<th field="name" width="100" align="center">用户名</th>
					<th field="sex" width="50" align="center" formatter="sexs">性别</th>
					<th field="phone" width="200" align="center">电话</th>
					<th field="mail" width="200" align="center">邮箱</th>
					<th field="createTime" width="150" align="center" formatter="dateTimeFormat">创建日期</th>
					<th field="updateTime" width="150" align="center" formatter="dateTimeFormat">修改日期</th>
				</tr>
			</thead>
		</table>
		
		<div id="tb">
			<div>
			<span>用户名称: </span><input type="text" name="name" id="name">
			<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="searchs()" >查询</a>
			</div>
			<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="add()">添加</a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="remove()">删除</a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="update()">修改</a>
		</div>
	</div>
	
	
	<!-- 添加数据窗口 -->

	
	<div id="winAdd" closed="true" class="easyui-dialog" style="padding:20px;width:400px;height:300px;"
			title="My Dialog" iconCls="icon-ok"
			buttons="#dlg-buttons" >
		<form id="fmtt" action="${ctx}/book/add" method="post">
			<div class="padding5">
				<label class="width-50">用户名: </label><input id="nameAdd" name="name" type="text" style="width:180px;" class="easyui-validatebox">
			</div>
			<div class="padding5">
				<label class="width-50" >电话: </label><input id="phone" name="phone" type="text" style="width:180px;" class="easyui-validatebox">
			</div>
			<div class="padding5">
				<label class="width-50" >邮箱: </label><input id="mail" name="name" type="text" style="width:180px;" class="easyui-validatebox">
			</div>
			<div class="padding5">
				<label class="width-50" >密码: </label><input id="password" name="password" type="password" style="width:180px;" class="easyui-validatebox">
			</div>
			<div class="padding5">
				<label class="width-50" >确认码: </label><input id="repassword" name="repassword" type="password" style="width:180px;" class="easyui-validatebox">
			</div>
			
			<div class="padding5">
				<label class="width-50" >性别: </label><input type="radio" name="sex" value="1">男 <input type="radio" checked="checked" name="sex" value="0">女
			</div>
			
		
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="submits()">提交</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#winAdd').dialog('close')">取消</a>
	</div>

</body>
</html>