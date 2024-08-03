package com.universal.bankarchitecture.domain.bank.entity;

import com.universal.bankarchitecture.base.BaseEntity;
import com.universal.bankarchitecture.domain.account.entity.BankAccountEntity;
import com.universal.bankarchitecture.domain.user.entity.UserEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 * 은행 엔티티
 * @fileName    : BankEntity
 * @author      : ewjin
 * @since       : 2024. 7. 21.
 */
@Getter
@Setter
@Entity(name = "BANK")
public class BankEntity extends BaseEntity {

	private String bankName; // 은행 이름

	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private UserEntity user;

	@ManyToOne
	@JoinColumn(name = "BANK_ACCOUNT_ID")
	private BankAccountEntity bankAccount;
}
