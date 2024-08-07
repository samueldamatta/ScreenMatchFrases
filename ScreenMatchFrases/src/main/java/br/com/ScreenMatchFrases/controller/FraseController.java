package br.com.ScreenMatchFrases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.ScreenMatchFrases.DTO.FraseDTO;
import br.com.ScreenMatchFrases.service.FraseService;

@RestController
public class FraseController {
    @Autowired
    private FraseService servico;

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria(){
        return servico.obterFraseAleatoria();
    }
}
