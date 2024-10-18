package sandbox.sample.training.hotel_late_p119;

import sandbox.sample.model.Money;

public interface HotelRates {
    Money fee();

    Money busySeasonFee(); // 繁忙期
}
