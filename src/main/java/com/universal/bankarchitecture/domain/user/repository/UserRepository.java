package com.universal.bankarchitecture.domain.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universal.bankarchitecture.domain.user.entity.UserEntity;

/**
 * @fileName    : UserRepository
 * @author      : ewjin
 * @since       : 2024. 8. 4.
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
}
