package projeto1.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import projeto1.demo.model.LogInModel;
import projeto1.demo.service.LogInService;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class logInController {

    @Autowired
    LogInService logInService;

    @PostMapping("/login/{userName}/{passCode}")
    @ResponseStatus(HttpStatus.OK)
    public void logIn (@RequestBody String userName, @RequestBody String passCode){

    }

    @PostMapping("/signIn")
    @ResponseStatus(HttpStatus.OK)
    public void signIn (@RequestBody String userName, @RequestBody String passCode){

    }

    @GetMapping("/login/listar")
    @ResponseStatus(HttpStatus.OK)
    public List<LogInModel> lista(){
        return logInService.listarLogIn();
    }

}
