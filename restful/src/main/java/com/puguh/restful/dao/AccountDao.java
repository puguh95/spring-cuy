package com.puguh.restful.dao;

import com.puguh.restful.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AccountDao extends JpaRepository<Account,Long>{
}
