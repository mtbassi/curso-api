package dev.bassi.springboot.topico;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicoService {

	@Autowired
	private TopicoRepository topicoRepository;

	public List<Topico> getTopicos() {
		List<Topico> topicos = new ArrayList<>();
		topicoRepository.findAll().forEach(topicos::add);
		return topicos;
	}

}
