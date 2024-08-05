package com.universal.bankarchitecture.domain.user.entity;

import com.universal.bankarchitecture.base.BaseEntity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 * 유저 엔티티
 * @fileName    : UserEntity
 * @author      : ewjin
 * @since       : 2024. 7. 29.
 */
@Getter
@Setter
@Entity(name = "USER")
public class UserEntity extends BaseEntity {

	/** 이름 */
	String name;
	/** 생년월일 */
	String birthDate;
	/** 직업 */
	String job;
}

