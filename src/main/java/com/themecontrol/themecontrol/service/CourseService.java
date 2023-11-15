package com.themecontrol.themecontrol.service;

import com.themecontrol.themecontrol.dto.CourseThemeDTO;
import com.themecontrol.themecontrol.model.Course;
import com.themecontrol.themecontrol.repository.ICourseRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService implements ICourseService {

    @Autowired
    ICourseRepository courseRepository;

    // 1. Crear un nuevo curso
    @Override
    public void saveCourse(Course course) {
        courseRepository.save(course);
    }

    // 3. Obtener todos los cursos
    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    // 4. Obtener un tema de un determinado curso
    @Override
    public CourseThemeDTO courseThemeDto(Long idCourse) {
        CourseThemeDTO courseThemeDto = new CourseThemeDTO();
        Course course = this.findCourse(idCourse);
        courseThemeDto.setNameCourse(course.getName());
        courseThemeDto.setThemes(course.getListTheme());
        return courseThemeDto;
    }

    // 5. Obtener todos los cursos que contengan como nombre la palabra "Java"
    @Override
    public List<Course> javaCourses() {
        String java = "Java";
        String courseJava;
        List<Course> listCourse = this.getCourses();
        List<Course> listCourseJava = new ArrayList<>();

        for (Course c : listCourse)
        {
            courseJava = c.getName();
            boolean containsJava = courseJava.contains(java);
            if (containsJava == true)
            {
                listCourseJava.add(c);
            }
        }
        return listCourseJava;
    }

    // 6. Modificar los datos de un curso
    @Override
    public void editCourse(Course course) {
        this.saveCourse(course);
    }

// Obtener un curso
    @Override
    public Course findCourse(Long idCourse) {
        return courseRepository.findById(idCourse).orElse(null);
    }

    // Eliminar un curso
    @Override
    public void deleteCourse(Long idCourse) {
        courseRepository.deleteById(idCourse);
    }

}
