<%@ page import="com.google.gson.Gson" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%--
  Created by IntelliJ IDEA.
  User: hp450g1
  Date: 2019-06-14
  Time: 오후 1:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <%

        String url = "jdbc:mysql://localhost:3306/redonearth_android";
        String id = "root";
        String password = "111111";

        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String userID = request.getParameter("userID");
        String userPassword = request.getParameter("userPassword");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, id, password);

            String sql = "SELECT * FROM user WHERE userID = ? AND userPassword = ?";
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, userID);
            pstmt.setString(2, userPassword);
            rs = pstmt.executeQuery(sql);

            List<Map<String, String>> list = new ArrayList<>();

            while(rs.next()) {
                Map<String, String> map = new HashMap<>();
                map.put("userID", rs.getString("userID"));
                map.put("userPassword", rs.getString("userPassword"));

                list.add(map);
            }

            String json = new Gson().toJson(list);

            out.println(json);

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
