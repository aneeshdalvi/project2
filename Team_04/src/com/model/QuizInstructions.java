package com.model;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QuizInstructions extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.sendError(405, "HTTP GET METHOD CANNOT BE CALLED BY THE INSTRUCTIONS SERVLET...");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        PrintWriter pw = response.getWriter();
        pw.println("<html><head>");
        pw.println("<title>Quiz Information</title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<form action =\"./login\" method=\"post\">");
        pw.println("<p style=\"font-size:200%;\" align=\"center\"> INSTRUCTIONS FOR QUIZ. </p>");
        pw.println("<div style=\"font-family:Sans-serif;border:3px; font-size:100%; border-style:solid; border-color:black; padding: 3em;\">");
        pw.println("The following are the instructions realted to the quiz : <br></div>");
        pw.println("<input type = \"submit\" name=\"submit\" value = \"START QUIZ\" align = \"center\">");
        pw.println("</form>");
        pw.println("</body>");
        pw.println("</html>");
    }
}