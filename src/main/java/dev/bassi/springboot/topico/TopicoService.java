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

	public Topico getTopicoById(String id) {
		return topicoRepository.findById(id).orElse(null);
	}

	public void addTopico(Topico topico) {
		topicoRepository.save(topico);
	}

    public void updateTopico(Topico topico, String id) {
    	topicoRepository.save(topico);
	}
}
