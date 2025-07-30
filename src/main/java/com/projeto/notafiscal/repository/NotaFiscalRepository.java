package com.projeto.notafiscal.repository;

import com.projeto.notafiscal.model.NotaFiscal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class NotaFiscalRepository extends JpaRepository<NotaFiscal, Long> {


}
