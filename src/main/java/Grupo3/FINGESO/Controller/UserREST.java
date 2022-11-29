package Grupo3.FINGESO.Controller;


import Grupo3.FINGESO.Model.UserEntity;
import Grupo3.FINGESO.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserREST {
    @Autowired
    private UserService userService;

    @GetMapping
    private ResponseEntity<List<UserEntity>> getUsers(){
        return ResponseEntity.ok(userService.findAll());
    }
}
