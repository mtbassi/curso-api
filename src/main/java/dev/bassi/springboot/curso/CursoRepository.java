package dev.bassi.springboot.curso;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CursoRepository extends CrudRepository<Curso, String> {

    public List<Curso> findCursoByTopicoId(String id);

}
