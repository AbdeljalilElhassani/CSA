package com.CSA.CSA.Controller;

import entities.QuestionEvaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuestionEvaluationController {
    @Autowired
    private QuestionEvaluationService questionEvaluationService;

   /* @Autowired
    public QuestionEvaluationController(QuestionEvaluationService questionEvaluationService) {
        t his.questionEvaluationService = questionEvaluationService;
    }*/
    @GetMapping("/addQuestionEvaluation")
    public String showQuestionEvaluationForm(Model model) {
        model.addAttribute("questionEvaluation", new QuestionEvaluation());
        return "questionEvaluationForm"; // Thymeleaf template name for the form
    }

    @PostMapping("/addQuestionEvaluation")
    public String addQuestionEvaluation(@ModelAttribute QuestionEvaluation questionEvaluation) {
        questionEvaluationService.saveQuestionEvaluation(questionEvaluation);
        return "redirect:/success"; // Redirect to a success page or another page as needed
    }
}
