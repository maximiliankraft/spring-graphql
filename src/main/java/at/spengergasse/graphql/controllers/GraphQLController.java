package at.spengergasse.graphql.controllers;

import at.spengergasse.graphql.models.School;
import at.spengergasse.graphql.models.SchoolClass;
import at.spengergasse.graphql.models.Student;
import at.spengergasse.graphql.repos.SchoolClassRepo;
import at.spengergasse.graphql.repos.SchoolRepo;
import at.spengergasse.graphql.repos.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

/*** <s>@RestController</s> */
@Controller
@AllArgsConstructor
public class GraphQLController {

    SchoolRepo schoolRepo;
    StudentRepo studentRepo;
    SchoolClassRepo schoolClassRepo;

    /*** <s>@GetMapping</s>("/schools") */
    @QueryMapping
    public Iterable<School> schools() {
        return schoolRepo.findAll();
    }

    @QueryMapping
    public School school(Long id) {
        return schoolRepo.findById(id).orElse(null);
    }

    @QueryMapping
    public Iterable<Student> students() {
        return studentRepo.findAll();
    }

    @QueryMapping
    public Student student(Long id) {
        return studentRepo.findById(id).orElse(null);
    }

    @QueryMapping
    public Iterable<SchoolClass> schoolClasses() {
        return schoolClassRepo.findAll();
    }

    @QueryMapping
    public SchoolClass schoolClass(Long id) {
        return schoolClassRepo.findById(id).orElse(null);
    }

    // todo add mutation for school, student and schoolClass


}
