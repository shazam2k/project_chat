package projeto1.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto1.demo.entities.LogIn;
import projeto1.demo.mapper.LogInMapper;
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

//    public boolean (String userName, String passCode){
//
//
//
//        return;
//    }

        public List<LogInModel> listarLogIn (){

            log.info("Iniciando busca por livros");

            List<LogInModel> lista1 = new ArrayList<>();

            for(LogIn logIn : logInRepository.listarlogIn()){
                LogInModel logInModel = logInMapper.LogInParaModel(logIn);
                lista1.add(logInModel);

            }

            log.info("{} Registros de livros encontrados", lista1.size());

            return lista1;
        }
}
