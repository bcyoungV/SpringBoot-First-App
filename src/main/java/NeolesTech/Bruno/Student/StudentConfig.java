package NeolesTech.Bruno.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

  @Bean
  CommandLineRunner commandLineRunner(
      StudentRepository repository){
    return args -> {
      Student bruno = new Student(
          "Bruno",
          "brunocasaca@hotmail.com",
          LocalDate.of(2010, Month.JANUARY, 5));

      Student breno = new Student(
           "Breno",
          "brenocasaca@gmail.com",
          LocalDate.of(2000, Month.AUGUST, 29));

      Student caio = new Student(
          "Caio",
          "caiotiago@hotmail.com",
          LocalDate.of(2002, Month.MAY, 2));

      Student leo = new Student(
           "Leandro",
          "leandrogato@hotmail.com",
          LocalDate.of(2019, Month.JANUARY, 21));

      repository.saveAll(List.of(bruno, breno, caio, leo));
    };
  }

}
