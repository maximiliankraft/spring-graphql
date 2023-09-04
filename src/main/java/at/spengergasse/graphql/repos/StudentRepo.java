package at.spengergasse.graphql.repos;

import at.spengergasse.graphql.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Long> {
}
