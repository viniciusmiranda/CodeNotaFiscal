package com.projeto.notafiscal.service;

import com.projeto.notafiscal.exceptions.ResourceNotFoundException;
import com.projeto.notafiscal.model.Usuario;
import com.projeto.notafiscal.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Usuario buscarPorId(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuário com Id" + id + "não foi encontrado."));
    }
    public Usuario salvarUsuario(Usuario usuario){
        return repository.save(usuario);
    }
    public void deletarUsuario(Long id){
        if(!repository.existsById(id)){
            throw new ResourceNotFoundException("Usuário com Id" + id + "não foi encontrado.");
        }
        repository.deleteById(id);
    }

}
