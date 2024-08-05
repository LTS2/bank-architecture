package com.universal.bankarchitecture.domain.account.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @fileName    : AccountManagerTest
 * @author      : ewjin
 * @since       : 2024. 8. 3.
 */
@SpringBootTest
class AccountManagerTest {

	// @Autowired
	private AccountManager accountManager;

	@AfterEach
	void cleanUp() {
		// DB 초기화 하는 메서드

	}

	@Test
	@DisplayName("입금 로직")
	void deposit() {
		Assertions.assertThat("1").isEqualTo("1");

	}

	@Test
	@DisplayName("출금 로직")
	void withdraw() {
	}

	@Test
	@DisplayName("유효한 계좌 번호인지 검사")
	void isAccount() {
	}

	@Test
	@DisplayName("계좌 잔액 검사")
	void hasMoney() {
	}

	@Test
	@DisplayName("계좌 비밀번호 검사")
	void isPassword() {
	}

	@Test
	@DisplayName("계좌 개설")
	void createAccountNumber() {
		// 0. 입력값(이름, 생년월일, 전화번호, 직업, 개설 은행 Id)
		// 0.1 해당 유저 정보가 개설 은행 Id에 존재할 경우 개설 불가.
		// TODO: 개설한지 현재로부터 2주가 지나지 않았을 경우 개설 불가.
		// 1. 랜덤 계좌 생성하는 메서드
		// 1.1 은행사별 계좌번호는 고유해야 하기 때문에 중복이 되지 않도록 로직을 짜야함.
		// 2.
	}
}