package projeto1.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import projeto1.demo.model.LogInInputModel;
import projeto1.demo.model.LogInModel;
import projeto1.demo.service.LogInService;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class logInController {

    @Autowired
    LogInService logInService;

//    @PostMapping("/login")
//    @ResponseStatus(HttpStatus.OK)
//    public String logIn (@RequestBody LogInInputModel input){
//        return logInService.signIn(input);
//
//    }

    @PostMapping("/signIn")
    @ResponseStatus(HttpStatus.OK)
    public LogInModel signIn (@RequestBody LogInInputModel input){
        return logInService.saveSignIn(input);
    }

    @GetMapping("/login/listar")
    @ResponseStatus(HttpStatus.OK)
    public List<LogInModel> lista(){
        return logInService.listarLogIn();
    }

    @GetMapping("/home")
    @ResponseStatus(HttpStatus.OK)
    public String teste(){
        return "Hello World";
    }


}
