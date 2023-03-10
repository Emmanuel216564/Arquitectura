package uia.com.api.inventario.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import uia.com.api.inventario.model.Partida;

import java.util.List;

public interface PartidaRepository extends CrudRepository<Partida, Long>, QueryByExampleExecutor<Partida> {
    List<Partida> findByName(String name);
}
