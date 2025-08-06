package com.jsp.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository sr;

    // Save a new student
    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        return sr.save(student);
    }

    // Get all students
    @GetMapping("/findall")
    public List<Student> getAllStudents() {
        return sr.findAll();
    }

    // Get student by ID
    @GetMapping("/find/{id}")
    public Student getStudentById(@PathVariable int id) {
        return sr.findById(id).orElse(null);
    }

    // Update student by ID
    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student newData) {
        Student student = sr.findById(id).orElse(null);
        if (student != null) {
            student.setName(newData.getName());
            student.setEmail(newData.getEmail());
            student.setCgpa(newData.getCgpa());
            student.setYop(newData.getYop());
            return sr.save(student);
        }
        return null;
    }

    // Delete student by ID
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        sr.deleteById(id);
        return "Student deleted";
    }
}
