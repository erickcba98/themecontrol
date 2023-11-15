package com.themecontrol.themecontrol.service;

import com.themecontrol.themecontrol.model.Theme;
import java.util.List;

public interface IThemeService {

    // 2. Crear tema y asociar a un curso
    public void saveTheme(Theme theme);

    // 7. Modificar los datos de un determinado tema
    public void editTheme(Theme theme);
    
    // Obtener todos los temas
    public List<Theme> getThemes();

    // Eliminar tema
    public void deleteTheme(Long idTheme);

    // Obtener un tema
    public Theme findTheme(Long idTheme);

}
