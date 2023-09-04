package at.spengergasse.graphql.repos;

import at.spengergasse.graphql.models.SchoolClass;
import org.springframework.data.repository.CrudRepository;

public interface SchoolClassRepo extends CrudRepository<SchoolClass, Long> {
}
