package Grupo3.FINGESO.Controller;

import Grupo3.FINGESO.Model.AcademicoEntity;
import Grupo3.FINGESO.Model.Academico_User_Entity;
import Grupo3.FINGESO.Services.AcademicoService;
import Grupo3.FINGESO.Services.AcademicoUserService;
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
        List<AcademicoEntity> academicoEntities = academicoService.findAll();
        long id = -1;
        for (AcademicoEntity academicoEntity : academicoEntities) {
            if (Objects.equals(idUser, academicoEntity.getUser().getId())) {
                return ResponseEntity.ok(academicoService.getById(academicoEntity.getId()));
            }
        }
        return ResponseEntity.ok(null);
    }

}
