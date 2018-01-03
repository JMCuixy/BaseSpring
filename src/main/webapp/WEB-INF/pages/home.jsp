<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" type="image/png" sizes="16x16" href="images/favicon.png">
    <title>后台管理</title>
</head>
<body>
  <div>
      <span><%= (request.getLocale().getCountry()) %></span>
  </div>
  <div>
      <form action="/picture" method="post" enctype="multipart/form-data">
          <input type="file" name="picture">
          <input type="submit">
      </form>
  </div>
</body>
</html>
