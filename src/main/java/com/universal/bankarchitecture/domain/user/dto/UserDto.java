package com.universal.bankarchitecture.domain.user.dto;

import com.universal.bankarchitecture.domain.bank.dto.BankDto;
import com.universal.bankarchitecture.domain.bank.entity.BankEntity;

/**
 * @fileName    : UserDto
 * @author      : ewjin
 * @since       : 2024. 7. 29.
 */
public class UserDto {
	private Long id;
	private double money; // TODO: account class 로 빼기.

	private BankDto bankDto;
	private BankEntity bankEntity;

}


