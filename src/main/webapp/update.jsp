<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<title>修改信息</title>
		<style type="text/css">
			table {
				width: 300px;
				border-collapse: collapse;
			}
			
			h3 {
				text-align: center;
			}
			
			div {
				margin: 0 auto;
				width: 300px;
			}
		</style>
		<script type="text/javascript" src="js/jquery-1.12.2.min.js"></script>
	</head>

	<body>
		<div>
			<h3>修改新闻信息</h3>
			<form action="查询所有.html" method="post" onsubmit="return false;">
				<table border="1">
					<tr>
						<th>新闻标题</th>
						<td><input type="text" name="title" value="" /></td>
					</tr>
				<%--	<tr>
						<th>性别</th>
						<td>
							<input type="radio" name="sex" value="男" />男
							<input type="radio" name="sex" value="女" checked="checked" />女
						</td>
					</tr>--%>
					<tr>
						<th>新闻摘要</th>
						<td><input type="text" name="summary" value="" /></td>
					</tr>
					<tr>
						<th>作者</th>
						<td><input type="text" name="author" value="" /></td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="修改" />&nbsp;
							<input type="reset" value="重置" /></td>
					</tr>
				</table>
			</form>
		</div>

		<script type="text/javascript">
			//window.location.search   ?id=2
			$(function(){
				$.ajax({
					type:"get",
					url:"query.do?id=${param.id}", // el表达式,param el中内置对象，存储路径中提交的参数
					dataType:"json",
					success:function(data){
						if(data.code == 1){
						    var news = data.info;
						    $("input[name='title']").val(news.title);
						    $("input[name='summary']").val(news.summary);
						    $("input[name='author']").val(news.author);
						   /* if(emp.sex == '男'){
						        $("input[value='男']").attr("checked", "checked");
							}else{
                                $("input[value='女']").attr("checked", "checked");
							}*/
                        }else{
						    alert(data.info);
						}
					}
				})
			})

		</script>

		<script type="text/javascript">
			$("form").submit(function(){
			    $.ajax({
					type:"post",
					url:"update.do" + window.location.search,
					data:$("form").serialize(),
					dataType:"json",
					success:function(data){
					    if(data.code == 1){
					        window.location.href = "index.jsp";
						}else{
					        alert(data.info);
						}
					}
				})
			})

		</script>

	</body>

</html>