package io.polarpoint.basket.repository;

import io.polarpoint.basket.domain.BasketEntry;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the BasketEntry entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BasketEntryRepository extends JpaRepository<BasketEntry, Long> {

}
