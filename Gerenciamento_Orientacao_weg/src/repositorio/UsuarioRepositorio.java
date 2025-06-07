package repositorio;

import java.util.ArrayList;
import java.util.List;

import Dominio.Usuario;

public class UsuarioRepositorio {

    private static final List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public void removerUsuario(int index) {
        usuarios.remove(index);
    }

    public void atualizarUsuario(int index, Usuario novoUsuario) {
        usuarios.set(index, novoUsuario);
    }

    public Usuario pegarUsuario(int index) {
        return usuarios.get(index);
    }

    public boolean verificarSeUsuarioExiste(Usuario usuario) {
        return usuarios.contains(usuario);
    }
    
   
}
