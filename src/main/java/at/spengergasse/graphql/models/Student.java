package at.spengergasse.graphql.models;


// Student is a model class, with lombok annotations.
// A student has a name, a school class
// The lombok annotations generate getters, setters, toString, equals and hashCode methods.

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Student {
    private String name;

    // A student belongs to a school class.
    // A school class has many students.
    // The school class is the owner of the relationship.
    @ManyToOne
    private SchoolClass schoolClass;

    @Id
    private Long id;

}
