<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.PreparedStatement" %><%--
  Created by IntelliJ IDEA.
  User: hp450g1
  Date: 2019-06-14
  Time: 오후 1:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원 가입</title>
</head>
<body>
    <%

        String url = "jdbc:mysql://localhost:3306/redonearth_android";
        String id = "root";
        String password = "111111";

        Connection connection = null;
        PreparedStatement pstmt = null;

        String userID = request.getParameter("userID");
        String userPassword = request.getParameter("userPassword");
        String userEmail = request.getParameter("userEmail");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, id, password);

            String sql = "INSERT INTO user VALUES (?, ?, ?)";
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, userID);
            pstmt.setString(2, userPassword);
            pstmt.setString(3, userEmail);

            int result = pstmt.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            out.println("드라이버 로딩 실패");
        } catch (SQLException e) {
            e.printStackTrace();
            out.println("에러: " + e);
        }
        finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    %>
</body>
</html>
