package projeto1.demo.mapper;

import org.mapstruct.Mapper;
import projeto1.demo.entities.LogIn;
import projeto1.demo.model.LogInModel;

@Mapper(componentModel = "spring")
public abstract class LogInMapper {

    public abstract LogInModel LogInParaModel(LogIn logIn);

}
