package content.creator.helper;

import content.creator.dao.QuizContentDAO;
import content.creator.operations.DataOps;

import java.sql.SQLException;
import java.util.List;

public final class ViewContentDetailsHelper {
  private ViewContentDetailsHelper() {}

  public static List<QuizContentDAO> getQuizContent(int quizId) throws SQLException {
    String queryString = getContentQuery(quizId);
    return DataOps.getDataCreateContent(queryString);
  }

  private static String getContentQuery(int quizId) {
    String COL_NAME = "quizId";
    return String.format("SELECT * FROM quiz_content WHERE %s = %s", COL_NAME, quizId);
  }
}
