package br.edu.unifcv.faculdade.service;

import br.edu.unifcv.faculdade.model.Usuario;

public class UsuarioService {

    private Usuario mUsuario;

    public UsuarioService(Usuario mUsuario) {
        this.mUsuario = mUsuario;
    }

    public boolean isLoginOk() {
        return mUsuario.getNome().trim().equalsIgnoreCase("admin")
                && mUsuario.getSenha().trim().equalsIgnoreCase("123mudar");
    }
}
