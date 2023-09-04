package at.spengergasse.graphql.repos;

import at.spengergasse.graphql.models.School;
import org.springframework.data.repository.CrudRepository;

public interface SchoolRepo extends CrudRepository<School, Long> {
}
