package services;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import bean.Question;
import bean.QuestionAnswer;
import dao.AnswerDAO;
import dao.QuestionDAO;

/**
 * A class to combine the questions with its answers
 * 
 * @author: leharbhatt
 * @version: 1.0
 * @since : 02/20/2019
 *
 */

public class QuestionAnswerGenerator {
	public List<QuestionAnswer> generator(int quizId) {
		QuestionDAO questionDao = new QuestionDAO();
		AnswerDAO answerDao = new AnswerDAO();
		List<Question> questionList = questionDao.getQuestionsByQuizId(quizId);
		List<QuestionAnswer> questionAnswerList = new ArrayList<QuestionAnswer>();
		for (Question question : questionList) {
			int questionId = question.getQuestionId();
			QuestionAnswer questionAnswer = new QuestionAnswer();
			questionAnswer.setQuestionId(question.getQuestionId());
			questionAnswer.setQuiz(question.getQuiz());
			questionAnswer.setQuestion(question.getQuestion());
			questionAnswer.setPoints(question.getPoints());
			questionAnswer.setMultiple(question.isMultiple());
			questionAnswer.setAnswerList(answerDao.getAnswersByQuestionId(questionId));
			questionAnswerList.add(questionAnswer);
		}
		return questionAnswerList;

	}

	public String ObjectToJSON(List<QuestionAnswer> list) {
		GsonBuilder gsonBuilder = new GsonBuilder();  
		gsonBuilder.serializeNulls();  
		Gson gson = gsonBuilder.create();
		String result = gson.toJson(list);
		return result;
	}
}
