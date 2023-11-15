package com.themecontrol.themecontrol.service;

import com.themecontrol.themecontrol.dto.CourseThemeDTO;
import com.themecontrol.themecontrol.model.Course;
import java.util.List;

public interface ICourseService {
    
    // 1. Crear un nuevo curso
    public void saveCourse(Course course);
    
    // 3. Obtener todos los cursos
    public List<Course> getCourses();
    
    // 4. Obtener todos los temas de un determinado curso
    public CourseThemeDTO courseThemeDto(Long idCourse);
    
    // 5. Obtener todos los cursos que contengan como nombre la palabra "Java"
    public List<Course> javaCourses();
    
    // 6. Modificar los datos de un curso
    public void editCourse(Course course);
    
    public Course findCourse(Long idCourse);
    
    public void deleteCourse(Long idCourse);
}