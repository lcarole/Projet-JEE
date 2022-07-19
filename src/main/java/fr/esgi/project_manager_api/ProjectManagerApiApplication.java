package fr.esgi.project_manager_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("fr.esgi.project_manager_api.models")
@EnableJpaRepositories("fr.esgi.project_manager_api.repository")
public class ProjectManagerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectManagerApiApplication.class, args);
    }

}
