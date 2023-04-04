// Classe que acessa o banco de dados e salva os dados.

package com.project.demo.repository;

import com.project.demo.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
