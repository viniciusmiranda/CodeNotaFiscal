package com.projeto.notafiscal.service;

import com.projeto.notafiscal.repository.NotaFiscalRepository;
import org.springframework.stereotype.Service;

@Service
public class NotaFiscalImportService {
    NotaFiscalRepository notaFiscalRepository;

    NotaFiscalImportService(NotaFiscalRepository notaFiscalRepository) {
        this.notaFiscalRepository = notaFiscalRepository;
    }
    public String dadosNotaFiscal(){
        return notaFiscalRepository.leituraDadosNotaFiscal();
    }
}
