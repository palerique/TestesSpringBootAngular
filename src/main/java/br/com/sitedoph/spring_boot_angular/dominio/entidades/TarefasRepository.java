package br.com.sitedoph.spring_boot_angular.dominio.entidades;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by paler on 28/04/2016.
 */
@RepositoryRestResource
public interface TarefasRepository extends CrudRepository<Tarefa, Long> {

}
