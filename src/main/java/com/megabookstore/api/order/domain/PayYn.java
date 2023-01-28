package com.megabookstore.api.order.domain;

import com.megabookstore.api.common.ErrorCode;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
public class PayYn {

    @Column(nullable = false, length = 1, columnDefinition = "varchar(1) default N")
    private String payYn;

    public PayYn(String payYn) {
        validate(payYn);
        this.payYn = payYn;
    }

    private void validate(String payYn) {
        validatePayYnNotNull(payYn);
        validatePayYnCode(payYn);
    }

    private void validatePayYnCode(String payYn) {
        if (!(payYn == "Y" || payYn =="N")) {
            throw new IllegalArgumentException(ErrorCode.PAY_CODE_PATTERN.getErrorMessage());
        }
    }

    private void validatePayYnNotNull(String payYn) {
        if (Objects.isNull(payYn)) {
            throw new IllegalArgumentException(ErrorCode.PAY_CODE_NOT_EMPTY.getErrorMessage());
        }
    }
}
