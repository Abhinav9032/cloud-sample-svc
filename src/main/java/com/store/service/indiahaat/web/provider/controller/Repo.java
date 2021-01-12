package com.store.service.indiahaat.web.provider.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<EntityClass, Long> {


}
