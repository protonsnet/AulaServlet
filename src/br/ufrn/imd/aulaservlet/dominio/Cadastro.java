package br.ufrn.imd.aulaservlet.dominio;
/**
 * Referencia:
 *
 */

import java.util.ArrayList;
import java.util.Comparator; 
import java.util.List;

public class Cadastro {
	private List usuarios = new ArrayList();
	
	public Cadastro() {
		this.usuarios = new ArrayList<Usuario>();
		usuarioPadrao();
	}
	
	/**
	 * Adiciona usuários
	 */
	public void addUsuario(Usuario u) {
		usuarios.add(u);
	}
	
	/**
	 * Listar usuários
	 */
	
	public List listarUsuarios() {
        return usuarios;
    }	
	
	/**
	 * Método buscar
	 */
	public int buscar(String login) {
		Usuario u = new Usuario(login);
		Comparator<Usuario> c = new Comparator<Usuario>() {
			@Override  
            public int compare (Usuario u1, Usuario u2) {  
                return u1.getLogin().compareTo(u2.getLogin());  
            }
		};
		
		for(int i=0; i<usuarios.size(); i++) {
			if(c.compare(u, (Usuario) usuarios.get(i))==0) {
				return i;
			}
		}
		return -1;
	}
	
	private void usuarioPadrao(){
		Usuario u = new Usuario("admin","admin", "Administrador");

		this.addUsuario(u);

	}

}
