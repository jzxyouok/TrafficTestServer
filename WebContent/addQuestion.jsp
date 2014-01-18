<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>驾校考试题目管理</title>

<!-- Bootstrap core CSS -->
<link
	href="<%=request.getContextPath()%>/source/bootstrap/css/bootstrap.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="<%=request.getContextPath()%>/source/css/template.css"
	rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy this line! -->
<!--[if lt IE 9]><script src="<%=request.getContextPath()%>/source/bootstrap/js/ie8-responsive-file-warning.js"></script><![endif]-->

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="<%=request.getContextPath()%>/source/bootstrap/js/html5shiv.js"></script>
      <script src="<%=request.getContextPath()%>/source/bootstrap/js/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">驾校考题管理</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">新增</a></li>
					<li><a href="#about">列表</a></li>
					<li><a href="#contact">app下载</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div class="container">

		<div class="page-header">
			<h1>增加新题目</h1>
			<p class="lead">在此页面增加新的驾校考试题目</p>
		</div>
		<div class="well">
			<form role="form">
				<input type="hidden" name="act" value="dosave"/>
				<div class="form-group">
					<label for="exampleInputEmail1">题目内容</label>
					<textarea class="form-control" placeholder="请输入题目内容" id="exampleInputEmail1" rows="3"></textarea>
				</div>
				
				<div class="form-group">
					<label for="exampleInputFile">题目图片</label> <input type="file" id="exampleInputFile">
				</div>
				
				<div class="form-group">
					<label for="exampleInputOption1">选项</label>&nbsp;  &nbsp;  <input type="checkbox" value=""> 正确 <input
						type="text" class="form-control"
						placeholder="选项内容">
				</div>
				
				<div class="form-group">
					<button type="submit" id="addOptionBtn" class="btn btn btn-default btn-xs">增加选项</button>
				</div>
				
				
				<button type="submit" class="btn btn-primary">提交</button>
			</form>
		</div>
	</div>
	<!-- /.container -->
</body>
</html>

<!-- Bootstrap core JavaScript 
             ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script
	src="<%=request.getContextPath()%>/source/js/jquery-1.10.2.min.js"></script>
<script
	src="<%=request.getContextPath()%>/source/bootstrap/js/bootstrap.min.js"></script>
	
<script>
$(document).ready(function(){
	$("#addOptionBtn").click(function(){
		//增加新选项
		$("#addOptionBtn").parent().before(
				"<div class=\"form-group\">\
					<label for=\"exampleInputOption1\">选项</label>&nbsp;  &nbsp;  <input type=\"checkbox\" value=\"\"> 正确 <input\
					type=\"text\" class=\"form-control\"\
					placeholder=\"选项内容\">\
				</div>"
			);
		
	});
})

</script>