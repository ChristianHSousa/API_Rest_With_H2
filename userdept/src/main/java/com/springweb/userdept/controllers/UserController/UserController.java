package com.springweb.userdept.controllers.UserController;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import com.springweb.userdept.entities.User.User;
import com.springweb.userdept.repositories.UserRepository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//- RestController é aonde vai acontecer as requisições

@RestController
@RequestMapping(value = "/users")

public class UserController {

    @Autowired // - Mecanismo de injeção de dependencia | não seja necessária instanciar na mão
    private UserRepository repository;

    @GetMapping // - Expõe que requisição é um GET
    public List<User> findAll(){
        List<User> result = repository.findAll();
        return result;
    }
    @GetMapping(value = "/{id}") //-- Explicita o caminho na (/users/id{})
    public User findByID(@PathVariable Long id){
        //-- exemplo não possui tratamento de exceções
        User result = repository.findById(id).get();
        return result;
    }

    // -- Método para salvar usuário no banco 
    @PostMapping //-- Explicita que é um insert
    public User insertUser(@RequestBody User user){
        // RequestBody -> Configura que objeto vai ser o corpo da requisição | vai ser passado pela URL
        User result = repository.save(user);
        return result;
    }
}
