package sandbox.sample.training.hotel_late_p119;

import sandbox.sample.model.Money;

/**
 * 通常料金
 */
public class RegularRates implements HotelRates {

    @Override
    public Money fee() {
        return new Money(5000);
    }

    @Override
    public Money busySeasonFee() {
        return fee().add(new Money(3000));
    }

}
