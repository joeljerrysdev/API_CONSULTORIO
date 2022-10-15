package com.Clinica.ClinicaOndontologica.service;

import com.Clinica.ClinicaOndontologica.model.Dentista;
import com.Clinica.ClinicaOndontologica.model.Endereco;
import com.Clinica.ClinicaOndontologica.repository.DentistaRepository;
import com.Clinica.ClinicaOndontologica.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {
    @Autowired
    EnderecoRepository repository;
    public Endereco salvar(Endereco endereco){
        return  repository.save(endereco);
    }
    public List<Endereco> buscar() {
        List<Endereco> enderecoList = repository.findAll();
        return enderecoList;
    }
    public ResponseEntity alterar(Endereco endereco){
        if (repository.findById(endereco.getId()).isPresent()){
            repository.save(endereco);
            return new ResponseEntity("Alterado dados do endereco de id: "+endereco.getId(), HttpStatus.OK);
        }
        return new ResponseEntity("Id: "+endereco.getId()+" não encontrado",HttpStatus.OK);

    }
    public ResponseEntity excluir(Long id){
        if ((repository.findById(id).isPresent())){
            repository.deleteById(id);
            return new ResponseEntity("Excluido Endereco de id: "+id, HttpStatus.OK);
        }
        return new ResponseEntity("Endereco não encontrado", HttpStatus.NOT_FOUND);
    }
    public ResponseEntity buscaPorId(Long id){
        if(repository.findById(id).isPresent()){
            return new ResponseEntity(repository.findById(id),HttpStatus.OK);
        }
        return new ResponseEntity("ID: "+id+" não encontrado", HttpStatus.NOT_FOUND);
    }
}
