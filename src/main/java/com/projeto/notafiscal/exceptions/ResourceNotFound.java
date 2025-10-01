package com.projeto.notafiscal.exceptions;

public class ResourceNotFound extends RuntimeException{

    public ResourceNotFound(String mensagem){
        super(mensagem);
    }
}
