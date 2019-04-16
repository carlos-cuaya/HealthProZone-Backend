package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author Carlos Cuaya
 */
@SpringBootApplication
@EntityScan("persistence")
public class HealthProZoneBackendApplication {

  public static void main(String[] args) {
    var ctx = SpringApplication.run(HealthProZoneBackendApplication.class, args);
  }
}
