package dev.bassi.springboot.topico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicoController {
	
	@Autowired
	private TopicoService topicoService;
	
}
