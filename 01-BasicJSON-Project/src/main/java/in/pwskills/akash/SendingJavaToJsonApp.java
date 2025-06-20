package in.pwskills.akash;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.pwskills.akash.bean.Student;

public class SendingJavaToJsonApp 
{
    public static void main( String[] args )
    {
    	
    	try {
    		// use ObjectMapper class
    		ObjectMapper mapper = new ObjectMapper();
    		
    		//Create a Student object
    		Student student = new Student(10,"sachin",51);
    		
    		String jsonStudent = mapper.writeValueAsString(student);
    		System.out.println(jsonStudent);
    		
    		mapper.writeValue(new File("student.json"), student);
			System.out.println("Json data created...");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	
    	
    	
    	
    }
}
