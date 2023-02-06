package dev.bassi.springboot.curso;

import dev.bassi.springboot.topico.Topico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @RequestMapping("/topicos/{id}/cursos")
    public List<Curso> getCursoByTopicoId(@PathVariable String id){
        return cursoService.getCursoByTopicoId(id);
    }

    @RequestMapping("/topicos/all/cursos/{id}")
    public Curso getCursoById(@PathVariable String id){
        return cursoService.getCursoById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topicos/{topicoId}/cursos")
    public void addCurso(@RequestBody Curso curso, @PathVariable String topicoId){
        curso.setTopico(new Topico(topicoId, "", ""));
        cursoService.addCurso(curso);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topicos/{topicoId}/cursos")
    public void updateCurso(@RequestBody Curso curso, @PathVariable String topicoId){
        curso.setTopico(new Topico(topicoId, "", ""));
        cursoService.addCurso(curso);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topicos/all/cursos/{id}")
    public void deleteCursoById(@PathVariable String id){
        cursoService.deleteCursoById(id);
    }

}
