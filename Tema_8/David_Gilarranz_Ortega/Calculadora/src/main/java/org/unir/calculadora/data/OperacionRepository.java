package org.unir.calculadora.data;

import org.springframework.data.repository.CrudRepository;
import org.unir.calculadora.data.model.Operacion;

import java.util.UUID;

public interface OperacionRepository extends CrudRepository<Operacion, UUID> { }
