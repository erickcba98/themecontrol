package com.themecontrol.themecontrol.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_theme")
    private Long idTheme;
    
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    
    public Theme() {
    }

    public Theme(Long idTheme, String name, String description) {
        this.idTheme = idTheme;
        this.name = name;
        this.description = description;
    }

}
