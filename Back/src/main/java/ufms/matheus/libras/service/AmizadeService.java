package ufms.matheus.libras.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import ufms.matheus.libras.entity.Amizade;
import ufms.matheus.libras.entity.Usuario;
import ufms.matheus.libras.entity.Verbete;
import ufms.matheus.libras.repository.AmizadeRepository;
import ufms.matheus.libras.repository.VerbeteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AmizadeService {

    @Autowired
    private AmizadeRepository amizadeRepository;

    public List<Amizade> buscarTodos(){
        return  amizadeRepository.findAll();
    }


    public Amizade salvar(Amizade verbete){
        return amizadeRepository.save(verbete);
    }

    public Optional<Amizade> buscarId(Long id){
        return amizadeRepository.findById(id);
    }

    public void deletar(Long id){
        amizadeRepository.deleteById(id);
    }

    public  Amizade alterar(Long id, Amizade amizade){
        return amizadeRepository.save(amizade);
    }

}
