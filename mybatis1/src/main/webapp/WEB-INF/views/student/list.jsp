<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="R" value="/" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet" media="screen">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="${R}res/common.js"></script>
<link rel="stylesheet" href="${R}res/common.css">
</head>
<body>
	<div class="container">
		<table class="table table-bordered mt5">
			<tbody>
				<c:forEach var="script" items="${ scripts }">

					<c:if
						test="${not empty script.value && script.value ne 'question'}">
						<tr>
							<td><img src="${script.value }" style="width: 400px;"></td>
						</tr>
					</c:if>
					<tr data-url="/student/list/${next}">
						<td>${ script.content }</td>
					</tr>
					<c:if test="${script.value eq 'question'}">
						<tr>
							<td><input data-url="/student/list/${ script.scriptIdx +1}"
								type="button" class="btn btn-primary" value="예" /><input
								data-url="/student/list/${ script.scriptIdx +2}" type="button"
								class="btn btn-warning" value="아니오" /></td>
						</tr>
					</c:if>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
