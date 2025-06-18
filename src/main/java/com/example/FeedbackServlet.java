package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

public class FeedbackServlet extends HttpServlet {
    private ArrayList<String> feedbacks = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String message = request.getParameter("message");

        feedbacks.add("From " + name + ": " + message);
        request.getSession().setAttribute("feedbackList", feedbacks);

        response.sendRedirect("thanks.jsp");
    }
}
