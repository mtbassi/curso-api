package dev.bassi.springboot.topico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TopicoController {
	
	@Autowired
	private TopicoService topicoService;
	
	@RequestMapping("/topicos")
	public List<Topico> getTopicos(){
		return topicoService.getTopicos();
	}

	@RequestMapping("/topicos/{id}")
	public Topico getTopicoById(@PathVariable String id){
		return topicoService.getTopicoById(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topicos")
	public void addTopico(@RequestBody Topico topico){
		topicoService.addTopico(topico);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topicos/{id}")
	public void updateTopico(@RequestBody Topico topico, @PathVariable String id){
		topicoService.updateTopico(topico, id);
	}
	
}
