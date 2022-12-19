package Grupo3.FINGESO.Controller;


import Grupo3.FINGESO.Model.CompromisoEntity;
import Grupo3.FINGESO.repository.CompromisoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/compromisos")
public class CompromisoController {


    @Autowired
    private final CompromisoRepository compromisoRepository;

    CompromisoController(CompromisoRepository compromisoRepository) {
        this.compromisoRepository = compromisoRepository;}

    @GetMapping()
    @CrossOrigin("*")
    List<CompromisoEntity> all(){
        return compromisoRepository.findAll();
    }

    @PostMapping()
    @CrossOrigin("*")
    CompromisoEntity newCompromiso(@RequestBody CompromisoEntity newCompromiso){
        return compromisoRepository.save(newCompromiso);
    }
}
