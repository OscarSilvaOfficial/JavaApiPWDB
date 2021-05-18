package br.com.bossabox.toolmanager.repository;

import br.com.bossabox.toolmanager.model.Tools;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToolsRepository extends JpaRepository<Tools, Long> {

}
