package projeto1.demo.mapper;

import org.mapstruct.Mapper;
import projeto1.demo.entities.LogIn;
import projeto1.demo.model.LogInModel;

@Mapper(componentModel = "spring")

public interface LogInMapper {


    public abstract LogInModel LogInToModel(LogIn logIn);

}
