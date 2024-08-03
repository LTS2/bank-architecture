package com.universal.bankarchitecture.domain.account.entity;

import com.universal.bankarchitecture.base.BaseEntity;

import jakarta.persistence.Entity;

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
}
