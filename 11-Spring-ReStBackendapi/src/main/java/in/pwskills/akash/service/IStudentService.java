package in.pwskills.akash.service;

import java.util.List;

import in.pwskills.akash.model.Student;

public interface IStudentService {
	
	/*
	 * Input  : Student object
	 * Output : PK value of the student object
	 */
	Integer saveStudent(Student s);
	
	/*
	 * Input  : Student object
	 * Output : No return type 
	 */
	void updateStudent(Student s);
	
	/*
	 * Input  : Id of the student
	 * Output : No return type 
	 */
	void deleteStudent(Integer id);
	
	/*
	 * Input  : Id of the student
	 * Output : Student Object if present otherwise null
	 */
	Student getOneStudent(Integer id);
	
	/*
	 * Input  : no input
	 * Output : List<Student> object 
	 */
	List<Student> getAllStudents();

	
}