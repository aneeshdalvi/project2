package content.creator.servlet;

import static content.creator.helper.CreateContentHelper.generateRandom;
import static content.creator.helper.CreateContentHelper.saveDataToDb;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "create")
public class CreateContentServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    String score = request.getParameter("score");
    String isCorrect = request.getParameter("choice");
    String questionText = request.getParameter("question_text");
    String responseRedirect = "viewContentList.jsp";
    int quizId = generateRandom(100, 999);
    int questionId = generateRandom(1000, 9999);
    Map<Integer, ArrayList<String>> answerBundle = new HashMap<>();
    for (int i = 1; i <= 4; i++) {
      ArrayList<String> ansList = new ArrayList<>();
      String ansChoice = request.getParameter(Integer.toString(i));
      ansList.add(ansChoice);
      if (isCorrect.equals(Integer.toString(i))) {
        ansList.add("true");
      } else {
        ansList.add("false");
      }
      int ansId = generateRandom(10000, 99999);
      answerBundle.put(ansId, ansList);
    }
    try {
      saveDataToDb(quizId, questionId, questionText, answerBundle, score);
    } catch (SQLException sqlEx) {
      System.out.println(sqlEx.getMessage());
      responseRedirect = "createContent.jsp";
    } finally {
      response.sendRedirect(responseRedirect);
    }
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {}
}
