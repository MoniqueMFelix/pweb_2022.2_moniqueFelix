package br.com.moniqueFelix.biritaShop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.moniqueFelix.biritaShop.model.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
  
}
