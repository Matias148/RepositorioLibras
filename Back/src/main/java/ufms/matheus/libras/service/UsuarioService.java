package ufms.matheus.libras.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import ufms.matheus.libras.entity.Usuario;
import ufms.matheus.libras.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> buscarTodos(String name, String email, String senha){
        Usuario cliente = new Usuario();
        cliente.setName(name);
        cliente.setEmail(email);
        cliente.setSenha(senha);

        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withIgnoreCase();
        Example example = Example.of(cliente, exampleMatcher);

        return  usuarioRepository.findAll(example);
    }

    public List<Usuario> buscarTodos(){
        return  usuarioRepository.findAll();
    }


    public Usuario salvar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> buscarId(Long id){
        return usuarioRepository.findById(id);
    }

    public void deletar(Long id){
        usuarioRepository.deleteById(id);
    }

    public  Usuario alterar(Long id, Usuario usuario){
        return usuarioRepository.save(usuario);
    }

}
