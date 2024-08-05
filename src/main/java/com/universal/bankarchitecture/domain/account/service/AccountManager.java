package com.universal.bankarchitecture.domain.account.service;

import lombok.extern.slf4j.Slf4j;

/**
 * 입출금 공통 기능을 제공하는 추상 클래스입니다.
 *
 * @fileName AccountManager
 * @author ewjin
 * @since 2024. 7. 29.
 */
@Slf4j
public abstract class AccountManager {

	/**
	 * 특정 은행의 지정된 계좌에 금액을 입금합니다.
	 *
	 * @param userId 입금 하려는 사용자 ID
	 * @param userAccountNumber 사용자의 출금 계좌
	 * @param accountNumber 입금받을 상대방 계좌 번호
	 * @param bankId 은행 ID
	 * @param amount 입금할 금액
	 */
	protected void deposit(int userId, int accountNumber, int bankId, double amount) {
		// 0. 올바른 계좌인지 확인.

		// 1. userId의 accountNumber에 출금하는 금액이 계좌 잔액보다 많을 경우 - 메서드로 빼기 유효성 검사.
		if (!hasMoney(userId, amount)) {
			return;
		}
		;
		// 2. 그 이후 메서드...
	}

	/**
	 * 특정 은행의 지정된 계좌에 금액을 인출합니다.
	 *
	 * @param userId 사용자 ID
	 * @param accountNumber 계좌 번호`
	 * @param bankId 은행 ID
	 * @param amount 출금할 금액
	 */
	void withdraw(int userId, int accountNumber, int bankId, int amount) {

	}

	/**
	 * 주어진 사용자 ID에 대해 계좌가 존재하는지 확인합니다.
	 *
	 * @param userId 계좌 보유 여부를 확인할 사용자의 ID
	 * @param accountNumber 계좌 보유 여부를 확인할 사용자의 계좌번호
	 * @return 계좌가 있을 경우 {@code true}, 없을 경우 {@code false}
	 */
	boolean isAccount(int userId, int accountNumber) {

		return true;
	}

	/**
	 * 주어진 사용자 ID 계좌에 출금하려는 금액이 남아있는 잔액보다 많은지 확인합니다.
	 *
	 * @param userId 사용자 ID
	 * @param amount 금액
	 * @return 계좌에 남아있는 금액이 인출하려는 금액보다 많을 경우{@code true}, 적을 경우{@code false}
	 */
	boolean hasMoney(int userId, double amount) {
		return true;
	}

	/**
	 * 계좌 비밀번호 검사합니다.
	 *
	 * @param userId 사용자 ID 
	 * @param password 사용자가 입력한 비밀번호
	 */
	boolean isPassword(int userId, int password) {
		// 1. 비밀번호 검사

		return false;
	}

	/**
	 * 계좌 번호를 생성하는 로직입니다.
	 *
	 * @param
	 *
	 */
	int createAccountNumber() {
		// 1. 각 은행별 계좌 번호 생성 로직
		return 1;
	}

}
