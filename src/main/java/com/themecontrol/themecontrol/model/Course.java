package com.themecontrol.themecontrol.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_course")
    private Long idCourse;

    @Column(name = "name")
    private String name;

    @Column(name = "modality")
    private String modality;

    @Column(name = "date_finish")
    private String dateFinish;

    @OneToMany
    @Column(name = "list_theme")
    private List<Theme> listTheme;

    public Course() {
    }

    public Course(Long idCourse, String name, String modality, String dateFinish, List<Theme> listTheme) {
        this.idCourse = idCourse;
        this.name = name;
        this.modality = modality;
        this.dateFinish = dateFinish;
        this.listTheme = listTheme;
    }

}
