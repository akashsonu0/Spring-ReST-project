package in.pwskills.akash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.akash.model.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer>{

}