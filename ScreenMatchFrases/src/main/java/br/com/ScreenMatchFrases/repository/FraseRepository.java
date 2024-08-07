package br.com.ScreenMatchFrases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import br.com.ScreenMatchFrases.model.Frase;

public interface FraseRepository extends JpaRepository<Frase, Long>{

    @Query("SELECT f FROM Frase f ORDER BY function('Random') LIMIT 1")
    Frase buscaFraseAleatoria();
}
