package projeto1.demo.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class LogInModel {

    private int id;

    private String userName;

    private String passCode;

    private String role;

}
