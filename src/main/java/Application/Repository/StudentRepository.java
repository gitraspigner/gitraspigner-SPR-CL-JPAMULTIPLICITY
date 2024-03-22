package Application.Repository;

import Application.Model.Classroom;
import Application.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA Repository interface for the Student entity
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

    Object saveClassroomToStudent(long studentId, Classroom classroom);
}
