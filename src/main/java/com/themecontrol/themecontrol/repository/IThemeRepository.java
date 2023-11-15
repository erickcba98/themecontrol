package com.themecontrol.themecontrol.repository;

import com.themecontrol.themecontrol.model.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IThemeRepository extends JpaRepository<Theme, Long>{
    
}
