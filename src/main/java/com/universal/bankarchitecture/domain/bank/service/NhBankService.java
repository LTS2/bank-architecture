package com.universal.bankarchitecture.domain.bank.service;

import org.springframework.stereotype.Service;

/**
 * @fileName    : BankService
 * @author      : ewjin
 * @since       : 2024. 7. 21.
 * @implNote    : 농협은행
 */
@Service
public class NhBankService {

	private void test() {
		// 은행 메서드의 경우 각 은행마다 동일한 입출금이 동작하는데 이런 경우 abstract 와 interface 중에 뭐가 더 나을까?
		// 그 다음으로는 implements 로 받는 게 좋을까 DI 로 받는 게 좋을까?
	}
}
