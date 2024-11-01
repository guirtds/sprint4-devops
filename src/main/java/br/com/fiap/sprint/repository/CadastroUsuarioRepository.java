package br.com.fiap.sprint.repository;

import br.com.fiap.sprint.model.CadastroUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroUsuarioRepository extends JpaRepository<CadastroUsuario, Long> {
}
