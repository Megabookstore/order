package com.megabookstore.api.order_product.domain;

import com.megabookstore.api.common.ErrorCode;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
public class Count {

    public final int MIN_COUNT = 1;

    @Column(nullable = false, columnDefinition = "integer default 1")
    private int count;

    public Count(int count) {
        validate(count);
        this.count = count;
    }

    private void validate(int count) {
        validateCountNotLessThanOne(count);
    }

    private void validateCountNotLessThanOne(int count) {
        if (count < MIN_COUNT) {
            throw new IllegalArgumentException(ErrorCode.COUNT_LESS_THAN_ONE.getErrorMessage());
        }
    }
}
