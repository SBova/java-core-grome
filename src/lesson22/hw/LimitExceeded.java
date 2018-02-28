package lesson22.hw;

import lesson22.hw.BadRequestException;

public class LimitExceeded extends BadRequestException {

    public LimitExceeded(String message) {
        super(message);
    }
}