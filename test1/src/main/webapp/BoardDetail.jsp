<%@ page import="smhrd.model.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시글 상세보기</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <h1>게시글 상세보기</h1>
    </header>
    <main>
        <%
        BoardVO board = (BoardVO) request.getAttribute("board");
        if (board == null) {
            out.print("<p>게시글을 찾을 수 없습니다.</p>");
            out.print("<a href='Board.jsp'>목록으로</a>");
            return;
        }
        %>
        <h2>제목: <%= board.getPostTitle() %></h2>
        <p>작성자: <%= board.getUserId() %></p>
        <p>작성일: <%= board.getCreatedAt() %></p>
        <p>조회수: <%= board.getPostViews() %></p>
        <div>
            <%
            if (board.getPostContent() != null) {
                java.io.Reader contentReader = board.getPostContent().getCharacterStream();
                char[] buffer = new char[1024];
                int bytesRead;
                while ((bytesRead = contentReader.read(buffer)) != -1) {
                    out.print(new String(buffer, 0, bytesRead));
                }
            } else {
                out.print("<p>내용이 없습니다.</p>");
            }
            %>
        </div>
        <%
        if (board.getPostFileName() != null && !board.getPostFileName().isEmpty()) {
            String filePath = request.getContextPath() + "/" + board.getPostFilePath();
            String fileExtension = board.getPostFileName().substring(board.getPostFileName().lastIndexOf(".") + 1).toLowerCase();
            boolean isImage = fileExtension.equals("jpg") || fileExtension.equals("jpeg") || fileExtension.equals("png") || fileExtension.equals("gif");
        %>
            <p>첨부파일:</p>
            <% if (isImage) { %>
                <img src="<%= filePath %>" alt="<%= board.getPostFileName() %>" style="max-width: 200px; max-height: 200px;">
            <% } %>
            <p><a href="<%= filePath %>" download><%= board.getPostFileName() %></a></p>
        <%
        } else {
        %>
            <p>첨부파일 없음</p>
        <%
        }
        %>
        <a href="Board.jsp">목록으로</a>
    </main>
</body>
</html>
