package com.projeto.notafiscal.controller;

import com.projeto.notafiscal.service.NotaFiscalImportService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class NotaFiscalController {
    private final NotaFiscalImportService notaFiscalImportService;

    public NotaFiscalController(NotaFiscalImportService notaFiscalImportService){
        this.notaFiscalImportService = notaFiscalImportService;
    }

    @GetMapping("/listar")
    public String mensagem(){
        return notaFiscalImportService.dadosNotaFiscal();
    }


}
