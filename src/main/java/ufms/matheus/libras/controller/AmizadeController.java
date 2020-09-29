package ufms.matheus.libras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ufms.matheus.libras.entity.Amizade;
import ufms.matheus.libras.entity.Usuario;
import ufms.matheus.libras.service.AmizadeService;
import ufms.matheus.libras.service.UsuarioService;

@Controller
@RequestMapping("/api/amizade")
public class AmizadeController {

    @Autowired
    private AmizadeService amizadeService;

    @GetMapping("{id}")
    @ResponseBody
    public ResponseEntity<?> buscarId(@PathVariable("id") Long id){
        return new ResponseEntity(amizadeService.buscarId(id), HttpStatus.OK);
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<?> buscar(){
        return new ResponseEntity(amizadeService.buscarTodos(), HttpStatus.OK);
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<?> salvar(@RequestBody Amizade amizade){
        return new ResponseEntity(amizadeService.salvar(amizade), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    @ResponseBody
    public ResponseEntity<?> deletar(@PathVariable("id") Long id){
        amizadeService.deletar(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("{id}")
    @ResponseBody
    public ResponseEntity<?> alterar(@PathVariable("id") Long id,
                                     @RequestBody Amizade amizade){
        return new ResponseEntity( amizadeService.alterar(id, amizade), HttpStatus.NO_CONTENT);
    }
}
