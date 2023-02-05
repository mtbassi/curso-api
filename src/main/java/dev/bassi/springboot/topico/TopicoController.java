package dev.bassi.springboot.topico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicoController {
	
	@Autowired
	private TopicoService topicoService;
	
	@RequestMapping("/topicos")
	public List<Topico> getTopicos(){
		return topicoService.getTopicos();
	}
	
}
