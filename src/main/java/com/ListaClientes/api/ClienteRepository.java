package com.ListaClientes.api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente,Long> {
    Cliente findByNome(String nome);
    void deleteByNome(String nome);

}
