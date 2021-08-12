package com.infosys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.entity.Item;

@Repository
public interface ItemDAO extends JpaRepository<Item, Long>{

}