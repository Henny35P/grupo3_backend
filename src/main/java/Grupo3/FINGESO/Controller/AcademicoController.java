package Grupo3.FINGESO.Controller;

import Grupo3.FINGESO.Model.AcademicoEntity;
import Grupo3.FINGESO.services.AcademicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/Academico")
public class AcademicoController {
    @Autowired
    private AcademicoService academicoService;

    @GetMapping(value = "/{idUser}")
    @CrossOrigin("*")
    private ResponseEntity<AcademicoEntity> getAcademico(@PathVariable Long idUser){
        return ResponseEntity.ok(academicoService.getAcademicoEntityByUser_Id(idUser));
    }

    @PutMapping
    @CrossOrigin("*")
    private ResponseEntity<AcademicoEntity> updateAcademico(@RequestBody AcademicoEntity academico){
        try {
            AcademicoEntity academico1 = academicoService.save(academico);
            return ResponseEntity.created(new URI("/Academico"+academico1.getId())).body(academico1);
        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        }
    }

    @GetMapping
    @CrossOrigin("*")
    private ResponseEntity<List<AcademicoEntity>> getAll(){
        return ResponseEntity.ok(academicoService.findAll());
    }
}