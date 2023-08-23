package mk.ukim.finki.wpeshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class WpEshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(WpEshopApplication.class, args);
	}

}
