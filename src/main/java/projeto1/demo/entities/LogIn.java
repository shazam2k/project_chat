package projeto1.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "projeto_chat", name = "login")
@Getter
@Setter

public class LogIn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "pass_code")
    private String passCode;

    @Column(name = "role")
    private String role;
}
