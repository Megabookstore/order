package com.megabookstore.api.common;

import lombok.Getter;

@Getter
public enum ErrorCode {

    PAY_CODE_PATTERN("결제여부는 'Y'나 'N'만 허용합니다."),
    PAY_CODE_NOT_EMPTY("결제여부는 빈 값을 허용하지 않습니다."),
    COUNT_LESS_THAN_ONE("수량은 1보다 작을 수 없습니다.");

    private final String errorMessage;

    ErrorCode(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
