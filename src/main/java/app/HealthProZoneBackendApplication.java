package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Carlos Cuaya
 */
@SpringBootApplication
//@EntityScan("persistence")
@ComponentScan({"services", "controller", "persistence"})
public class HealthProZoneBackendApplication {

  public static void main(String[] args) {
    var ctx = SpringApplication.run(HealthProZoneBackendApplication.class, args);
  }
}
