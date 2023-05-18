package br.com.moniqueFelix.biritaShop.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.moniqueFelix.biritaShop.model.Cliente;
import br.com.moniqueFelix.biritaShop.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
  List<Pedido> findByClientePedido(Cliente cliente);
}