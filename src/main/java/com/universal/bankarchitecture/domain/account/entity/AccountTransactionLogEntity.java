package com.universal.bankarchitecture.domain.account.entity;

import com.universal.bankarchitecture.base.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

/**
 * 계좌 거래 내역을 위한 엔티티입니다.
 * @fileName    : AccountTransaction
 * @author      : ewjin
 * @since       : 2024. 8. 3.
 */
@Getter
@Entity(name = "ACCOUNT_TRANSACTION_LOG")
public class AccountTransactionLogEntity extends BaseEntity {

	/** 조회할 은행계좌 */
	@ManyToOne
	@JoinColumn(name = "ACCOUNT_ID", nullable = false)
	// @JoinColumn(name = "account_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
	private BankAccountEntity bankAccountEntity;

}
