package br.com.fiap.sprint.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@ControllerAdvice
public class GlobalErrorController {

    // Handler para exceções não tratadas, usando um caminho diferente
    @RequestMapping("/global-error")  // Alterar o mapeamento para evitar conflito
    public String handleCustomError(Model model) {
        model.addAttribute("error", "Ocorreu um erro inesperado.");
        model.addAttribute("message", "Por favor, tente novamente mais tarde.");
        return "error"; // Nome do arquivo HTML de erro
    }

    // Captura qualquer exceção não tratada e redireciona para a página de erro personalizada
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e, Model model) {
        model.addAttribute("error", "Ocorreu um erro inesperado.");
        model.addAttribute("message", e.getMessage());
        return "error"; // Nome do arquivo HTML de erro
    }

    // Redireciona para a página inicial
    @GetMapping("/")
    public String index() {
        return "index"; // Nome do arquivo HTML de índice
    }
}
