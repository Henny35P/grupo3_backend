package Grupo3.FINGESO.Controller;

import Grupo3.FINGESO.Model.AcademicoEntity;
import Grupo3.FINGESO.services.AcademicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    @CrossOrigin("*")
    private ResponseEntity<List<AcademicoEntity>> getAll(){
        return ResponseEntity.ok(academicoService.findAll());
    }
}