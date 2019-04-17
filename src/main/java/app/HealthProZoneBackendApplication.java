package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Carlos Cuaya
 */
@SpringBootApplication
@EntityScan("persistence")
@EnableJpaRepositories("persistence") 
@ComponentScan({"services", "controller"})
public class HealthProZoneBackendApplication {

  public static void main(String[] args) {
    var ctx = SpringApplication.run(HealthProZoneBackendApplication.class, args);
  }
}
