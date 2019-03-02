package com.Quizzer.code.controller;

import com.Quizzer.code.exceptions.StudentResultsException;
import com.Quizzer.code.model.db.Quiz;
import com.Quizzer.code.model.db.SubmitQuiz;
import com.Quizzer.code.model.response.ResponseVO;
import com.Quizzer.code.service.StudentResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * This class is the controller that logs the results of a student in a quiz
 *
 * @author Abhinab Mohanty
 *
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class StudentsResultsController {

    @Autowired
    StudentResultsService studentResultsService;

    @RequestMapping(method = RequestMethod.POST, value = "/results")
    public ResponseEntity<?> addResult(@RequestBody SubmitQuiz submitQuiz) throws StudentResultsException {

        try {

            studentResultsService.addResult(submitQuiz);
            return new ResponseEntity<>(new ResponseVO(HttpStatus.ACCEPTED.toString(), null, null),
                    HttpStatus.ACCEPTED);

        } catch (StudentResultsException e) {
            return new ResponseEntity<>(new ResponseVO(HttpStatus.BAD_REQUEST.toString(), e.getMessage(), null),
                    HttpStatus.ACCEPTED);
        }
    }
}