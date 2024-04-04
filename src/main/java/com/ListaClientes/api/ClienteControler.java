package com.ListaClientes.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

import static java.nio.file.Files.delete;

@RestController
@RequestMapping("/clientes")
public class ClienteControler {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{nomeCliente}")
    public Cliente getClienteByName(@PathVariable String nomeCliente) {
        return clienteRepository.findByNome(nomeCliente);
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @DeleteMapping("/{nomeCliente}")
    public void deleteClienteByName(@PathVariable String nomeCliente) {
        clienteRepository.deleteByNome(nomeCliente);
        }
    }

