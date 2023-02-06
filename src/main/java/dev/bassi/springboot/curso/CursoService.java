package dev.bassi.springboot.curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> getCursoByTopicoId(String id) {
        return new ArrayList<>(cursoRepository.findCursoByTopicoId(id));
    }

    public Curso getCursoById(String id){
        return cursoRepository.findById(id).orElse(null);
    }

    public void addCurso(Curso curso){
        cursoRepository.save(curso);
    }

    public void deleteCursoById(String id) {
        cursoRepository.deleteById(id);
    }
}
