package com.universal.bankarchitecture.domain.account.entity;

import com.universal.bankarchitecture.base.BaseEntity;
import com.universal.bankarchitecture.domain.bank.entity.BankEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * 은행 계좌 정보를 담고있는 엔티티입니다.
 * @fileName    : AccountEntity
 * @author      : ewjin
 * @since       : 2024. 8. 1.
 */
@Entity(name = "BANK_ACCOUNT")
public class BankAccountEntity extends BaseEntity {

	private int accountNumber; // 계좌 번호
	private double balance; // 잔액

	@ManyToOne
	@JoinColumn(name = "BANK_ID")
	private BankEntity bank;

}
