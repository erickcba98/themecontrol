package com.themecontrol.themecontrol.service;

import com.themecontrol.themecontrol.model.Theme;
import com.themecontrol.themecontrol.repository.IThemeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThemeService implements IThemeService {

    @Autowired
    IThemeRepository themeRepository;

    // 2. Crear tema y asociar a un curso
    @Override
    public void saveTheme(Theme theme) {
        themeRepository.save(theme);
    }

    // 7. Modificar los datos de un determinado tema
    @Override
    public void editTheme(Theme theme) {
        this.saveTheme(theme);
    }

    // Obtener todos los temas
    @Override
    public List<Theme> getThemes() {
        return themeRepository.findAll();
    }
    
    // Eliminar un tema
    @Override
    public void deleteTheme(Long idTheme) {
        themeRepository.deleteById(idTheme);
    }

    // Obtener un tema
    @Override
    public Theme findTheme(Long idTheme) {
        return themeRepository.findById(idTheme).orElse(null);
    }
}
