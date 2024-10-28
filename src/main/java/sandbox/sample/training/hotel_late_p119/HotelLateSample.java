package sandbox.sample.training.hotel_late_p119;

public class HotelLateSample {
    public static void main(String[] args) {
        var regularRate = new RegularRates();
        var premiumRate = new PremiumRates();

        show(regularRate);
        show(premiumRate);
    }

    private static void show(HotelRates hotelRates) {
        System.out.println(hotelRates.fee().amount());
        System.out.println(hotelRates.busySeasonFee().toString());
    }
}
