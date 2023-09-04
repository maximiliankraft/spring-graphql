package at.spengergasse.graphql.models;


// School is a model class, with lombok annotations.
// A school has a name, a location and many school classes.
// The lombok annotations generate getters, setters, toString, equals and hashCode methods.

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class School {
    @Id
    private Long id;

    private String name;
    private String location;

    // A school has many school classes.
    @OneToMany()
    private List<SchoolClass> schoolClasses;
}
