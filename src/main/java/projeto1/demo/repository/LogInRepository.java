package projeto1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import projeto1.demo.entities.LogIn;

import java.util.List;

public interface LogInRepository extends JpaRepository<LogIn, Integer> {

    @Query("SELECT i from LogIn i")
    List<LogIn> listarlogIn();
}
