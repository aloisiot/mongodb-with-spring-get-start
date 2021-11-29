package dev.aloisiot.mongodbgetstart.repository;

import dev.aloisiot.mongodbgetstart.model.Pacote;
import dev.aloisiot.mongodbgetstart.model.Status;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacoteRepository extends MongoRepository<Pacote, Integer> {

    List<Pacote> findAllByStatus(Status status);
}
