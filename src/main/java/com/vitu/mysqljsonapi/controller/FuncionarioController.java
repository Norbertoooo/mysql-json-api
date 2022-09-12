package com.vitu.mysqljsonapi.controller;

import com.vitu.mysqljsonapi.domain.Funcionario;
import com.vitu.mysqljsonapi.domain.FuncionarioDto;
import com.vitu.mysqljsonapi.repository.FuncionarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class FuncionarioController {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Autowired
    ModelMapper modelMapper;

    @GetMapping
    public List<Funcionario> getAll() {
        return funcionarioRepository.findAll();
    }

    @PostMapping
    public Funcionario create(@RequestBody FuncionarioDto funcionarioDto) {
        return funcionarioRepository.save(modelMapper.map(funcionarioDto, Funcionario.class));
    }

}
