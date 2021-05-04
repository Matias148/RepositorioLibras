package ufms.matheus.libras.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import ufms.matheus.libras.entity.Usuario;
import ufms.matheus.libras.entity.Verbete;
import ufms.matheus.libras.pojo.FileStorageException;
import ufms.matheus.libras.pojo.FileStorageProperties;
import ufms.matheus.libras.repository.UsuarioRepository;
import ufms.matheus.libras.repository.VerbeteRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;

@Service
public class VerbeteService {

    @Autowired
    private VerbeteRepository verbeteRepository;

    public List<Usuario> buscarTodos(String titulo, String descricao, String tituloLibras, String descricaoLibras){
        Verbete cliente = new Verbete();
        cliente.setTitulo(titulo);
        cliente.setDescricao(descricao);
        //cliente.setTituloLibras(tituloLibras);
        //cliente.setDescricaoLibras(descricaoLibras);

        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withIgnoreCase();
        Example example = Example.of(cliente, exampleMatcher);

        return  verbeteRepository.findAll(example);
    }

    public List<Verbete> buscarTodos(){
        return  verbeteRepository.findAll();
    }


    public Verbete salvar(Verbete verbete){
        return verbeteRepository.save(verbete);
    }

    public Optional<Verbete> buscarId(Long id){
        return verbeteRepository.findById(id);
    }

    public void deletar(Long id){
        verbeteRepository.deleteById(id);
    }

    public  Verbete alterar(Long id, Verbete usuario){
        return verbeteRepository.save(usuario);
    }

}
