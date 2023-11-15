package com.themecontrol.themecontrol.controller;

import com.themecontrol.themecontrol.dto.CourseThemeDTO;
import com.themecontrol.themecontrol.model.Course;
import com.themecontrol.themecontrol.service.ICourseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    private ICourseService courseService;

    // 1
    @PostMapping("/course/save")
    public String saveCourse(@RequestBody Course course) {
        courseService.saveCourse(course);
        return "The course was saved successfully";
    }

    // 3
    @GetMapping("/course/get")
    public List<Course> getCourses() {
        return courseService.getCourses();
    }

    // 4
    @GetMapping("/course/getdto/{idCourse}")
    public CourseThemeDTO courseThemeDto(@PathVariable Long idCourse) {
        return courseService.courseThemeDto(idCourse);
    }

    // 5
    @GetMapping("/course/javacourses")
    public List<Course> javaCourses() {
        return courseService.javaCourses();
    }

    // 6
    @PutMapping("/course/edit")
    public String editCourse(Course course) {
        courseService.editCourse(course);
        return "The course was successfully modified";
    }

    @GetMapping("/course/find/{idCourse}")
    public Course findCourse(@PathVariable Long idCourse) {
        return courseService.findCourse(idCourse);
    }

    @DeleteMapping("/course/delete/{idCourse}")
    public String deleteCourse(@PathVariable Long idCourse) {
        courseService.deleteCourse(idCourse);
        return "The course was successfully deleted";
    }

}
