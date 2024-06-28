package com.superadmin.superadmin.Controller;

import com.superadmin.superadmin.Service.JarService;
import com.superadmin.superadmin.entities.Jar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins ="http://localhost:3000")
public class JarController {

        private final JarService jarService;

        @Autowired
        public JarController(JarService jarService) {
            this.jarService = jarService;
        }

        @GetMapping
        public List<Jar> getAllJars() {
            return jarService.getAllJars();
        }

        @GetMapping("/{id}")
        public Optional<Jar> getJarById(@PathVariable Long id) {
            return jarService.getJarById(id);
        }

        @PostMapping
        public Jar createJar(@RequestBody Jar jar) {
            return jarService.createOrUpdateJar(jar);
        }

        @PutMapping("/{id}")
        public Jar updateJar(@PathVariable Long id, @RequestBody Jar jar) {
            jar.setId(id); // Ensure the ID from path variable is set in the jar object
            return jarService.createOrUpdateJar(jar);
        }

        @DeleteMapping("/{id}")
        public void deleteJar(@PathVariable Long id) {
            jarService.deleteJar(id);
        }
    }



