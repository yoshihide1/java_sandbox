package sandbox.sample;

import java.util.Currency;
import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sandbox.sample.model.Money;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
		var money = new Money(100, Currency.getInstance(Locale.JAPAN));
		var money2 = new Money(2100, null);
		money2.add(money);
		System.out.println(money);
		// var list = new ArrayList<Money>();
	}

}
