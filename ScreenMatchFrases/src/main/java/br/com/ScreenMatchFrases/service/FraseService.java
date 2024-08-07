package br.com.ScreenMatchFrases.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.ScreenMatchFrases.DTO.FraseDTO;
import br.com.ScreenMatchFrases.model.Frase;
import br.com.ScreenMatchFrases.repository.FraseRepository;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
