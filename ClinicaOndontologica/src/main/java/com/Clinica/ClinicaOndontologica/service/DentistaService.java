package com.Clinica.ClinicaOndontologica.service;

import com.Clinica.ClinicaOndontologica.model.Dentista;
import com.Clinica.ClinicaOndontologica.repository.DentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistaService {
    @Autowired
    DentistaRepository repository;
    public Dentista salvar(Dentista dentista){
        return  repository.save(dentista);
    }
    public List<Dentista> buscar() {
        List<Dentista> dentistaList = repository.findAll();
        //List<Dentista> dentistaDTOList = new ArrayList<>();

//        for(Dentista e : dentistaList){
//
//            dentistaDTOList.add(new DentistaDTO(e));
//        }

        return dentistaList;
    }
    public ResponseEntity alterar(Dentista dentista){
        if (repository.findById(dentista.getId()).isPresent()){
            repository.save(dentista);
            return new ResponseEntity("Alterado dados do dentista de id: "+dentista.getId(),HttpStatus.OK);
        }
        return new ResponseEntity("Id: "+dentista.getId()+" não encontrado",HttpStatus.OK);

    }
    public ResponseEntity excluir(Long id){
        if ((repository.findById(id).isPresent())){
            repository.deleteById(id);
            return new ResponseEntity("Excluido Dentista de id: "+id, HttpStatus.OK);
        }
        return new ResponseEntity("Dentista não encontrado", HttpStatus.NOT_FOUND);
    }
    public ResponseEntity buscaPorId(Long id){
        if(repository.findById(id).isPresent()){
            return new ResponseEntity(repository.findById(id),HttpStatus.OK);
        }
        return new ResponseEntity("ID: "+id+" não encontrado", HttpStatus.NOT_FOUND);
    }
}
