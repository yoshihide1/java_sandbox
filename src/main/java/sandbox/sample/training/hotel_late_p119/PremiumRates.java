package sandbox.sample.training.hotel_late_p119;

import sandbox.sample.model.Money;

/**
 * プレミアム料金
 */
public class PremiumRates implements HotelRates {

    @Override
    public Money fee() {
        return new Money(10000);
    }

    @Override
    public Money busySeasonFee() {
        return fee().add(new Money(5000));
    }

}
