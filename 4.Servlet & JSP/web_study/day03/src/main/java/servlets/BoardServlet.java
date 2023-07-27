package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/board")
public class BoardServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("<h1>상단!!</h1>");

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/board/list.jsp");
        rd.forward(req, resp); // <jsp:forward />
        //rd.include(req, resp); // <jsp:include />

        out.print("<h1>하단</h1>");
    }
}
