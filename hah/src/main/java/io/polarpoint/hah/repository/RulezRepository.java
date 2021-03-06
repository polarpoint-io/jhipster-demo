package io.polarpoint.hah.repository;

import io.polarpoint.hah.domain.Rulez;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Rulez entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RulezRepository extends JpaRepository<Rulez, Long> {

}
