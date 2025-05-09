package com.jpa.jpa_test.repository;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<AbstractReadWriteAccess.Item, Long> {


}
