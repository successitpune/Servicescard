package com.superadmin.superadmin.Service;

import com.superadmin.superadmin.Dao.JarRepository;
import com.superadmin.superadmin.entities.Jar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JarService {

        private final JarRepository jarRepository;

        @Autowired
        public JarService(JarRepository jarRepository) {
            this.jarRepository = jarRepository;
        }

        public List<Jar> getAllJars() {
            return jarRepository.findAll();
        }

        public Optional<Jar> getJarById(Long id) {
            return jarRepository.findById(id);
        }

        public Jar createOrUpdateJar(Jar jar) {
            return jarRepository.save(jar);
        }

        public void deleteJar(Long id) {
            jarRepository.deleteById(id);
        }
    }



