package com.themecontrol.themecontrol.controller;

import com.themecontrol.themecontrol.model.Theme;
import com.themecontrol.themecontrol.service.IThemeService;
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
public class ThemeController {

    @Autowired
    private IThemeService themeService;

    // 2
    @PostMapping("/theme/save")
    public String saveTheme(@RequestBody Theme theme) {
        themeService.saveTheme(theme);
        return "The theme was saved successfully";
    }

    // 7
    @PutMapping("/theme/edit")
    public String editTheme(@RequestBody Theme theme) {
        themeService.editTheme(theme);
        return "The theme was successfully modified";
    }

    @GetMapping("/theme/find/{idTheme}")
    public Theme findTheme(@PathVariable Long idTheme) {
        return themeService.findTheme(idTheme);
    }

    @GetMapping("/theme/get")
    public List<Theme> getThemes() {
        return themeService.getThemes();
    }

    @DeleteMapping("/theme/delete/{idTheme}")
    public String deleteTheme(@PathVariable Long idTheme) {
        themeService.deleteTheme(idTheme);
        return "The topic was successfully deleted";
    }

}
