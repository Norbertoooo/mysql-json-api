package com.vitu.mysqljsonapi.controller;

import com.vitu.mysqljsonapi.domain.Funcionario;
import com.vitu.mysqljsonapi.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class FuncionarioController {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @GetMapping
    public List<Funcionario> getAll() {
        return funcionarioRepository.findAll();
    }

    @PostMapping
    public Funcionario create(@RequestBody Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

}
