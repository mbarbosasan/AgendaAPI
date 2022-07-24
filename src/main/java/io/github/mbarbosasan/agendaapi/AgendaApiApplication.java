package io.github.mbarbosasan.agendaapi;

import io.github.mbarbosasan.agendaapi.model.entities.Contato;
import io.github.mbarbosasan.agendaapi.model.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AgendaApiApplication {

    @Bean
    public CommandLineRunner commandLinerRunner(@Autowired ContatoRepository contatoRepository) {
        return args -> {
          Contato contato = new Contato();
          contato.setNome("Moises");
          contato.setEmail("moisesbarbosa23@gmail.com");
          contato.setFavorito(false);
          contatoRepository.save(contato);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(AgendaApiApplication.class, args);
    }

}
