package com.universal.bankarchitecture.domain.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.universal.bankarchitecture.domain.bank.entity.BankEntity;

/**
 * @fileName    : IBankRepository
 * @author      : ewjin
 * @since       : 2024. 7. 21.
 */
@Repository
public interface IBankRepository extends JpaRepository<BankEntity, Long> {
	// hibernate vs Spring Data JPA
}
