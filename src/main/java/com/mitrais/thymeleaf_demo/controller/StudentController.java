package com.mitrais.thymeleaf_demo.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.mitrais.thymeleaf_demo.model.Student;
import com.mitrais.thymeleaf_demo.model.Task;
import com.mitrais.thymeleaf_demo.utils.StudentUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Handles requests for the student model.
 * 
 */
@Controller
public class StudentController {

    @RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
    public String saveStudent(@Valid @ModelAttribute Student student, BindingResult errors, Model model) {
        if (!errors.hasErrors()) {
            // get mock objects
            List<Student> students = StudentUtils.buildStudents();
            // add current student
            students.add(student);
            model.addAttribute("students", students);
        }
        return ((errors.hasErrors()) ? "addStudent.html" : "listStudents.html");
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
    public String addStudent(Model model) {
        model.addAttribute("student", new Student());
        return "addStudent.html";
    }

    @RequestMapping(value = "/listStudents", method = RequestMethod.GET)
    public String listStudent(HttpServletRequest request, HttpServletResponse response, Model model, @RequestParam(name = "param1", required = false) String param1) {

        model.addAttribute("students", StudentUtils.buildStudents());
        model.addAttribute("username", "aji");
        model.addAttribute("lastname", "mulyadi");
        model.addAttribute("welcomeMsgKey","welcome.message.parameterize");

        request.setAttribute("nameReq","test");

        Student student = new Student();
        student.setId(1);
        student.setName("Reno");
        student.setGender('M');
        student.setAge(20);

        Task task = new Task();
        task.setStudent(student);

        model.addAttribute("task",task);

        Date date = new Date();
        model.addAttribute("todayDate", date);

        model.addAttribute("todayCalendar", Calendar.getInstance());

        return "listStudents.html";
    }

}
