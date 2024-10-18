package sandbox.sample.model;

import java.util.Currency;
import java.util.Locale;
import java.util.Objects;

public record Money(int amount, Currency currency) {

    /**
     * コンパクトコンストラクタ
     * 
     * @param amount
     * @param currency
     */
    public Money {
        if (amount < 0) {
            throw new IllegalArgumentException("0以上の値を設定してください。");
        }
        if (Objects.isNull(currency)) {
            throw new IllegalArgumentException("通過の単位を設定してください");
        }
    }

    /**
     * コンストラクタ
     * 
     * @param other
     * @return
     */
    public Money(final int amount) {
        this(amount, Currency.getInstance(Locale.JAPAN));
    }

    /**
     * 加算する
     * 
     * @param other
     * @return
     */
    public Money add(final Money other) {
        if (!other.currency.equals(this.currency)) {
            throw new IllegalArgumentException("通過の単位が違います");
        }
        var added = other.amount + this.amount;
        return new Money(added, this.currency);
    }

}
