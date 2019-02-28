package pe.edu.galaxy.training.ajw.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import pe.edu.galaxy.training.ajw.domain.Usuario;
import pe.edu.galaxy.training.ajw.service.UsuarioService;
import pe.edu.galaxy.training.ajw.util.UtilFaces;

@Named
@ViewScoped
public class ListadoManagedBean implements Serializable{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private static final long serialVersionUID = 1L;
	
	private List<Usuario> usuarioList;
	
	private Usuario usuarioSelect;
	
	@Autowired
	private UsuarioService usuarioService;

	@PostConstruct
	public void init() {
		logger.info("");
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
		buscarTodo();
	}
	
	public void buscarTodo() {
		logger.info("");
		usuarioList = usuarioService.buscarTodo();
	}
	
	public void guardar() {
		logger.info("");
		
		usuarioService.registrar(usuarioSelect);
		
		buscarTodo();
		
		UtilFaces.agregarMensaje("INFO", "Se guardó correctamente.", null);
		
		UtilFaces.ejecutarScript("PF('wvDlgUsuario').hide();");
	}
	
	public void abrirDlgUsuario() {
		limpiar();
		UtilFaces.ejecutarScript("PF('wvDlgUsuario').show();");
	}
	
	public void limpiar() {
		usuarioSelect = new Usuario();
	}
	
	public List<Usuario> getUsuarioList() {
		return usuarioList;
	}
	
	public Usuario getUsuarioSelect() {
		return usuarioSelect;
	}
	
	public void setUsuarioSelect(Usuario usuarioSelect) {
		this.usuarioSelect = usuarioSelect;
	}

}
