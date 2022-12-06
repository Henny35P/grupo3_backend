package Grupo3.FINGESO.Controller;


import Grupo3.FINGESO.Model.UserEntity;
import Grupo3.FINGESO.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    @CrossOrigin("*")
    private ResponseEntity<List<UserEntity>> getUsers(){
        return ResponseEntity.ok(userService.findAll());
    }
    @PostMapping
    @CrossOrigin("*")
    private ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user){
        try{
            UserEntity user1 = userService.save(user);
            return ResponseEntity.created(new URI("/User"+user1.getId())).body(user1);
        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        }
    }

    @PostMapping(value = "/login")
    @CrossOrigin("*")
    private Long matchUser(@RequestBody UserEntity user) {
        List<UserEntity> userEntities = userService.findAll();
        long value;
        for (UserEntity userEntity : userEntities) {
            if (Objects.equals(user.getMail(), userEntity.getMail())) {
                if (Objects.equals(user.getPass(), userEntity.getPass()))
                    return userEntity.getId();
                else {
                    value = -1;
                    return value;
                }
            }
        }
        value = 0;
        return value;
    }

}
