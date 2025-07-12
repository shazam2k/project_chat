package projeto1.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projeto1.demo.entities.LogIn;
import projeto1.demo.mapper.LogInMapper;
import projeto1.demo.model.LogInInputModel;
import projeto1.demo.model.LogInModel;
import projeto1.demo.repository.LogInRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class LogInService {

    @Autowired
    LogInRepository logInRepository;

    @Autowired
    LogInMapper logInMapper;

        public List<LogInModel> listarLogIn (){

            log.info("Iniciando busca por livros");

            List<LogInModel> lista1 = new ArrayList<>();

            for(LogIn logIn : logInRepository.listarlogIn()){
                LogInModel logInModel = logInMapper.LogInToModel(logIn);
                lista1.add(logInModel);
                log.info(logIn.getPassCode());
                log.info(logIn.getUserName());
            }

            log.info("{} Registros de livros encontrados", lista1.size());

            return lista1;
        }

//    public String signIn(LogInInputModel input) {
//        List<LogInModel> lista1 = listarLogIn();
//
//        for (LogInModel logInModel : lista1) {
//            String pass_code_input = input.getPassCode();
//            String user_name_input = input.getUserName();
//
//
//            String pass_Code = logInModel.getPassCode();
//            String user_name = logInModel.getUserName();
//
//            log.info(pass_Code);
//            log.info(user_name);
//
//            log.info("Input username: " + user_name_input);
//            log.info("Input password: " + pass_code_input);
//
//            if (pass_Code.equals(pass_code_input) && user_name.equals(user_name_input)) {
//                log.info("true");
//                return "True";
//            }
//        }
//
//        return "Senha incorreta, tente de novo ou faça cadrastro";
//    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Transactional
    public LogInModel saveSignIn (LogInInputModel input){

        log.info("Entrou");

        LogIn logIn = logInMapper.logInInputToLogIn(input);
        logIn.setPassCode(passwordEncoder.encode(input.getPassCode()));

        LogIn logIn2 = logInRepository.save(logIn);

        LogInModel logIn3 = logInMapper.LogInToModel(logIn);

        log.info("Salvou");

        return logIn3;
    }
}
