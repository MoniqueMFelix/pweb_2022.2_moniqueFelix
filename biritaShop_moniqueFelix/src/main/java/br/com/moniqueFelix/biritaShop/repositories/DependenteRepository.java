package br.com.moniqueFelix.biritaShop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.moniqueFelix.biritaShop.model.Dependente;

@Repository
public interface DependenteRepository extends JpaRepository<Dependente, Long> {
  
}
