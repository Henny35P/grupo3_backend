package Grupo3.FINGESO.Controller;


import Grupo3.FINGESO.Model.AcademicoEntity;
import Grupo3.FINGESO.Model.CompromisoEntity;
import Grupo3.FINGESO.repository.AcademicoRepository;
import Grupo3.FINGESO.repository.CompromisoRepository;
import Grupo3.FINGESO.services.AcademicoService;
import Grupo3.FINGESO.services.CompromisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
@RestController
@RequestMapping("/compromisos")
public class CompromisoController {

    @Autowired
    private CompromisoService compromisoService;

    @GetMapping
    @CrossOrigin("*")
    private ResponseEntity<List<CompromisoEntity>> all(){
        return ResponseEntity.ok(compromisoService.findAll());
    }

    @PostMapping()
    @CrossOrigin("*")
    private ResponseEntity<CompromisoEntity> newCompromiso(@RequestBody CompromisoEntity newCompromiso){
        try{
            List<CompromisoEntity> compromisoEntities = compromisoService.getCompromisoEntitiesByAcademico_Id(
                    newCompromiso.getAcademico().getId());
            if (compromisoEntities.size() >= 3){
                return ResponseEntity.ok(null);
            }
            CompromisoEntity compromiso = compromisoService.save(newCompromiso);
            return ResponseEntity.created(new URI("/compromisos"+compromiso.getId())).body(compromiso);
        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        }
    }
    @GetMapping(value = "/{id_academico}")
    @CrossOrigin("*")
    private ResponseEntity<List<CompromisoEntity>> getByIdAcademico(@PathVariable Long id_academico){
        return ResponseEntity.ok(compromisoService.getCompromisoEntitiesByAcademico_Id(id_academico));
    }
}
