package com.themecontrol.themecontrol.dto;

import com.themecontrol.themecontrol.model.Theme;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseThemeDTO {

    private String nameCourse;
    private List<Theme> themes;

    public CourseThemeDTO() {
    }

    public CourseThemeDTO(String nameCourse, List<Theme> themes) {
        this.nameCourse = nameCourse;
        this.themes = themes;
    }

}
