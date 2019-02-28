package pe.edu.galaxy.training.ajw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.galaxy.training.ajw.domain.Usuario;
import pe.edu.galaxy.training.ajw.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> buscarTodo(){
		return usuarioRepository.findAll();
	}

	public void registrar(Usuario usuario){
		usuarioRepository.save(usuario);
	}

}
