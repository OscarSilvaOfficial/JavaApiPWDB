package br.com.perfectworlddb.repository;

import br.com.perfectworlddb.model.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepository extends JpaRepository<Items, Long> {

}
