package pe.edu.galaxy.training.ajw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.galaxy.training.ajw.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
