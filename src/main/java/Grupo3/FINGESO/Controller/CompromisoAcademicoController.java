package Grupo3.FINGESO.Controller;

import Grupo3.FINGESO.Model.CompromisoEntity;
import Grupo3.FINGESO.Model.Compromiso_Academico;
import Grupo3.FINGESO.services.CompromisoAcademicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Compromiso/Academico")
public class CompromisoAcademicoController {
    @Autowired
    private CompromisoAcademicoService compromisoAcademicoService;

    @PostMapping
    @CrossOrigin("*")
    private ResponseEntity<Compromiso_Academico> saveRelation(@RequestBody Compromiso_Academico compromiso_academico){
        try{
            Compromiso_Academico compromiso_academico1 = compromisoAcademicoService.save(compromiso_academico);
            return ResponseEntity.created(new URI("Compromiso/Academico"+compromiso_academico1.getId())).body(compromiso_academico1);
        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        }
    }

    @CrossOrigin("*")
    @GetMapping("/{id}")
    private ResponseEntity<List<CompromisoEntity>> getCompromisosById(@PathVariable Long id){
        List<Compromiso_Academico> lista = compromisoAcademicoService.findByAcademico_Id(id);
        List<CompromisoEntity> compromisos = new ArrayList<CompromisoEntity>();
        for (Compromiso_Academico compromisoAcademico : lista) {
            compromisos.add(compromisoAcademico.getCompromiso());
        }

        return ResponseEntity.ok(compromisos);
    }
}
