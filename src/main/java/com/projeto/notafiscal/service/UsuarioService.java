package com.projeto.notafiscal.service;

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

    public List<Usuario> listarUsuario(UsuarioRepository repository){
        return repository.findAll();
    }

}
