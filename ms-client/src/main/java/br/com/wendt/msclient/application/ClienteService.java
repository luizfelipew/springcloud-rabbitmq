package br.com.wendt.msclient.application;

import br.com.wendt.msclient.domain.Cliente;
import br.com.wendt.msclient.infra.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ClienteService {

    private final ClienteRepository repository;

    @Transactional
    public Cliente save(final Cliente cliente) {
        return repository.save(cliente);
    }

    public Optional<Cliente> getByCPF(final String cpf) {
        return repository.getByCpf(cpf);
    }
}
