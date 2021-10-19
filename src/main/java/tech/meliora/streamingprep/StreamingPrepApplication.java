package tech.meliora.streamingprep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class StreamingPrepApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamingPrepApplication.class, args);
	}

}
