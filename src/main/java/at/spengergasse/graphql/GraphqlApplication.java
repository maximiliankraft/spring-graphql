package at.spengergasse.graphql;

import at.spengergasse.graphql.models.School;
import at.spengergasse.graphql.models.SchoolClass;
import at.spengergasse.graphql.models.Student;
import at.spengergasse.graphql.repos.SchoolClassRepo;
import at.spengergasse.graphql.repos.SchoolRepo;
import at.spengergasse.graphql.repos.StudentRepo;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Log
@SpringBootApplication
public class GraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Bean
	CommandLineRunner testData(SchoolRepo schoolRepo, StudentRepo studentRepo, SchoolClassRepo schoolClassRepo) {
		return args -> {

			var schoolClass = new SchoolClass("1AHBGM", "A",1L, null);
			schoolClassRepo.save(schoolClass);

			var student1 = new Student("Max Mustermann", schoolClass, 1L);
			var student2 = new Student("Maria Musterfrau", schoolClass, 2L);
			studentRepo.save(student1);
			studentRepo.save(student2);

			schoolClass.setStudents(List.of(student1, student2));
			schoolClassRepo.save(schoolClass);

			var school = new School(1L, "Wien","HTL Spengergasse", List.of(schoolClass));

			schoolRepo.save(school);

			log.log(java.util.logging.Level.INFO, "Test data added");


		};
	}

}
