// Classe que acessa o banco de dados e salva os dados.

package com.project.demo.repository;

import com.project.demo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
