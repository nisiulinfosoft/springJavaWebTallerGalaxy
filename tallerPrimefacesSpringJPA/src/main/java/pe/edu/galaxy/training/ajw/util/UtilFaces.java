package pe.edu.galaxy.training.ajw.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;

public class UtilFaces {
	
	public static void agregarMensaje(String tipoMensaje, String mensaje, String detalle){
    	FacesContext context = FacesContext.getCurrentInstance();
    	if (tipoMensaje.equalsIgnoreCase("INFO")){
    		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, mensaje, detalle));
    	}else if(tipoMensaje.equalsIgnoreCase("WARN")){
    		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, mensaje, detalle));
    	}else if(tipoMensaje.equalsIgnoreCase("ERROR")){
    		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, mensaje, detalle));
    	}
    }
	
	public static void ejecutarScript(String script){
		/*
		RequestContext.getCurrentInstance().execute(script); Deprecated
		*/
		PrimeFaces.current().executeScript(script);
    }

}
