package Grupo3.FINGESO.Controller;

import Grupo3.FINGESO.Model.AcademicoEntity;
import Grupo3.FINGESO.Model.ComiteEntity;
import Grupo3.FINGESO.services.ComiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/Comite")
public class ComiteController {
    @Autowired
    private ComiteService comiteService;

    @GetMapping
    @CrossOrigin("*")
    private ResponseEntity<List<ComiteEntity>> getAll(){
        return ResponseEntity.ok(comiteService.findAll());
    }

    @GetMapping("/Evaluadores/{id_evaluado}")
    @CrossOrigin("*")
    private ResponseEntity<Set<AcademicoEntity>> getEvaluadores(@PathVariable Long id_evaluado){
        List<ComiteEntity> comiteEntities = comiteService.getComiteEntitiesByEvaluado_Id(id_evaluado);
        if (comiteEntities.size()>0)
            return ResponseEntity.ok(comiteEntities.get(0).getIntegrantes());
        else
            return ResponseEntity.ok(null);
    }

    @PutMapping("/Evaluados")
    @CrossOrigin("*")
    private ResponseEntity<List<AcademicoEntity>> getEvaluados(@RequestBody AcademicoEntity academico){
        List<ComiteEntity> comiteEntities = comiteService.getComiteEntitiesByIntegrantesIsContaining(academico);
        List<AcademicoEntity> evaluados = new ArrayList<>();
        for (ComiteEntity comiteEntity : comiteEntities) {
            evaluados.add(comiteEntity.getEvaluado());
        }
        return ResponseEntity.ok(evaluados);
    }
}
