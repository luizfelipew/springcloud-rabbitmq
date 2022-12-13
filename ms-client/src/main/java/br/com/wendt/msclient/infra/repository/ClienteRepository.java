package br.com.wendt.msclient.infra.repository;

import br.com.wendt.msclient.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> getByCpf(String cpf);
}
