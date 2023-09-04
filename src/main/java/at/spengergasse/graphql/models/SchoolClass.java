package at.spengergasse.graphql.models;

// A school class has many students. The school class is the owner of the relationship.
// A school class has a name, a teacher and many students.
// The lombok annotations generate getters, setters, toString, equals and hashCode methods.
// the entity annotation is used by the jakarta persistence framework.
// the id annotation is used by the jakarta persistence framework.
// the many to one annotation is used by the jakarta persistence framework.

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SchoolClass {
    private String name;
    private String teacher;

    @Id
    private Long id;

    // A school class has many students.
    @OneToMany()
    private List<Student> students;
}
