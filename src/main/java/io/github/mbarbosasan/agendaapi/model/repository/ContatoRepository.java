package io.github.mbarbosasan.agendaapi.model.repository;

import io.github.mbarbosasan.agendaapi.model.entities.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
