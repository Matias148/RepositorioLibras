package ufms.matheus.libras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ufms.matheus.libras.entity.Usuario;
import ufms.matheus.libras.entity.Verbete;
import ufms.matheus.libras.service.UsuarioService;
import ufms.matheus.libras.service.VerbeteService;

@Controller
@RequestMapping("/api/verbete")
public class VerbeteController {

    @Autowired
    private VerbeteService verbeteService;

    @GetMapping("{id}")
    @ResponseBody
    public ResponseEntity<?> buscarId(@PathVariable("id") Long id){
        return new ResponseEntity(verbeteService.buscarId(id), HttpStatus.OK);
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<?> buscar(@RequestParam(name="titulo", required = false) String titulo,
                                    @RequestParam(name="descricao", required = false) String descricao,
                                    @RequestParam(name="tituloLibras", required = false) String tituloLibras,
                                    @RequestParam(name="descricaoLibras", required = false) String descricaoLibras){
        return new ResponseEntity(verbeteService.buscarTodos(titulo, descricao, tituloLibras, descricaoLibras), HttpStatus.OK);
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<?> salvar(@RequestBody Verbete verbete){
        return new ResponseEntity(verbeteService.salvar(verbete), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    @ResponseBody
    public ResponseEntity<?> deletar(@PathVariable("id") Long id){
        verbeteService.deletar(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("{id}")
    @ResponseBody
    public ResponseEntity<?> alterar(@PathVariable("id") Long id,
                                     @RequestBody Verbete verbete){
        return new ResponseEntity( verbeteService.alterar(id, verbete), HttpStatus.NO_CONTENT);
    }
}
