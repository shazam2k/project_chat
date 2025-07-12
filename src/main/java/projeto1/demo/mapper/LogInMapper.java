package projeto1.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import projeto1.demo.entities.LogIn;
import projeto1.demo.model.LogInInputModel;
import projeto1.demo.model.LogInModel;

@Mapper(componentModel = "spring")

public interface LogInMapper {

    public abstract LogInModel LogInToModel(LogIn logIn);

    @Mapping(target = "id", ignore = true)
    @Mapping(source = "role", target = "role")
    public abstract LogIn logInInputToLogIn (LogInInputModel input);


}
