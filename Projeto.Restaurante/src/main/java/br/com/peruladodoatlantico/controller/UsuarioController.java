package br.com.peruladodoatlantico.controller;

import java.util.ArrayList;

import br.com.peruladodoatlantico.model.Usuario;

		public class UsuarioController {
			ArrayList<Usuario> usuarios;

		public void CadastrarUsuario(
				String nome, String email) { 
				Usuario usuarioNovo =
		new Usuario(nome, email);
				usuarios.add(usuarioNovo);
				}

}
