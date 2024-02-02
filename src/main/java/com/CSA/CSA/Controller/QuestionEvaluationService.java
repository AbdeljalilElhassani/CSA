package com.CSA.CSA.Controller;

import entities.QuestionEvaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionEvaluationService {

    @Autowired
    private QuestionEvaluationRepository questionEvaluationRepository;


    public void saveQuestionEvaluation(QuestionEvaluation questionEvaluation) {
        questionEvaluationRepository.save(questionEvaluation);
    }
}
