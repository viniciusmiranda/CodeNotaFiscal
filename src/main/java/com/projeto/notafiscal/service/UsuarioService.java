package com.projeto.notafiscal.service;

import com.projeto.notafiscal.model.Usuario;
import com.projeto.notafiscal.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;
    public UsuarioService(UsuarioRepository repository)
    {
        this.repository = repository;
    }
    public List<Usuario> listarUsuarios(){
        return repository.findAll();
    }
    public Optional<Usuario> buscarPorId(Long id){
        return repository.findById(id);
    }
    public Usuario salvarUsuario(Usuario usuario){
        return repository.save(usuario);
    }
    public void deletarUsuario(Long id){
        repository.deleteById(id);
    }

}
