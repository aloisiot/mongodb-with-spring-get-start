package dev.aloisiot.mongodbgetstart.service;

import dev.aloisiot.mongodbgetstart.model.Pacote;
import dev.aloisiot.mongodbgetstart.model.Status;
import dev.aloisiot.mongodbgetstart.repository.PacoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacoteService {

    private PacoteRepository repository;

    @Autowired
    public PacoteService(PacoteRepository repository) {
        this.repository = repository;
    }

    public Pacote adicionar (Pacote pacote) {
        return repository.save(pacote);
    }

    public List<Pacote> listarTodos(){
        return repository.findAll();
    }

    public List<Pacote> listarTodosACaminho(){
        return repository.findAllByStatus(Status.A_CAMINHO);
    }
}
