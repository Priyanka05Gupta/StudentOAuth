package com.example.StudentOauth.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.StudentOauth.model.Student;
import com.example.StudentOauth.service.StudentService;

@RestController
//@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/new_student")
    public ModelAndView register(Model model){
		
		Student student = new Student(); 
//		List<String> cityList = Arrays.asList("Pune","Mumbai"); 
//		List<String> genderList = Arrays.asList("M", "F");
		  
		model.addAttribute("student", student); 
//		model.addAttribute("city", cityList);
//		model.addAttribute("gender", genderList);
//		 
    	System.out.println("New Student");
        return new ModelAndView("new");
    }
	
	@PostMapping(value="/save")
	public ResponseEntity<String> create(Student student) throws Exception{
		System.out.println("Inside Create()!!");
		studentService.create(student);
		return new ResponseEntity<String>("Created new Student!!", HttpStatus.OK);
	}
	
	@RequestMapping(value="/")
	public ModelAndView findAll(Model model) throws Exception{
		System.out.println("inside FindAll() method");
		
//	   try {
		   Iterable<Student> iterateStud = studentService.findAll();
			model.addAttribute("iterateStud", iterateStud); 
			return new ModelAndView("index");
//	       return new ResponseEntity<Iterable<Student>>(iterateStud, HttpStatus.OK);
//	   }catch(Exception e) {
//		   return new ResponseEntity<Iterable<Student>>(HttpStatus.BAD_REQUEST);
//	   }
	}
	
	@GetMapping(value="/findById")
	public ResponseEntity<Optional<Student>> findByStudentId(@RequestParam("studentId")Integer studentId) throws Exception{
		System.out.println("findByStudentId :"+studentId);
		Optional<Student> emp = studentService.findByStudentId(studentId);
        if(emp!=null) {
            return new ResponseEntity<Optional<Student>>(emp, HttpStatus.OK);
        }else {
            return new ResponseEntity<Optional<Student>>(HttpStatus.NOT_FOUND);
        }		
	}

}
