<%--
  Created by IntelliJ IDEA.
  User: Qianxia
  Date: 2017/1/16
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="page-wrapper">
    <div class="container-fluid">
        <!--正文开始 -->
        <div class="row">
            <div class="white-box">
                <div style="width: 50%;margin-left:25%;margin-top: 12%;margin-bottom:12%;">
                    <table cellspacing="0" cellpadding="0" width="540" align=center border=0>
                        <tbody>
                        <tr>
                            <td valign="top" height=270>
                                <div align=center><br><img height=211 src="/assets/images/error.gif" width=329><br><br>
                                    <table cellSpacing=0 cellPadding=0 width="80%" border=0>
                                        <tbody>
                                        <tr>
                                            <td><span style="color:red">异常状态码:</span><c:out value="${status}"/></td>
                                        </tr>
                                        <tr>
                                            <td height=8></td>
                                        </tr>
                                        <tr>
                                            <td><span style="color:red">异常原因:</span><c:out value="${reason}"/></td>
                                        </tr>
                                        <tr>
                                            <td height=8></td>
                                        </tr>
                                        <tr>
                                            <td><span style="color:red">异常描述:</span><c:out value="${description}"/></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </td>
                        </tr>
                        <TR>
                            <TD height=5></TD>
                        <TR>
                            <td align=middle>
                                <table cellSpacing=0 cellPadding=0 width=480 border=0>
                                    <tbody>
                                    <tr>
                                        <td width=6><IMG height=26 src="/assets/images/left.gif" width=7></td>
                                        <td background=/assets/images/bg.gif>
                                            <div align=center>
                                                <a href="/admin/index.html">返回首页</a>　 　|　　
                                                <a href="javascript:history.go(-1)">返回出错页</a>　 　|　　
                                                <a href="/admin/index.html">关闭本页</a>
                                            </div>
                                        </td>
                                        <td width=7><img src="/assets/images/right.gif"></td>
                                    </tr>
                                    </tbody>
                                </table>
                            </td>
                        </TR>
                        </tbody>
                    </table>
                </div>
                <p align=center>　</p>
                <p align=center>　</p>
            </div>
        </div>
    </div>
</div>