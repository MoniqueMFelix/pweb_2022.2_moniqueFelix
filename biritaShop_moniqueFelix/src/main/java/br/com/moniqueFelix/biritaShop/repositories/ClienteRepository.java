package br.com.moniqueFelix.biritaShop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.moniqueFelix.biritaShop.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}