package sandbox.sample.model;

import java.util.Currency;
import java.util.Objects;


public class Money {
    private final int amount;
    // 通過の単位
    private final Currency currency;


    /**
     * コンストラクタ
     * @param amount
     * @param currency
     */
    public Money(final int amount,final Currency currency){
        if(amount < 0) {
            throw new IllegalArgumentException("0以上の値を設定してください。");
        }
        if(Objects.isNull(currency)) {
            throw new IllegalArgumentException("通過の単位を設定してください");
        }
        this.amount = amount;
        this.currency = currency;
    }

    /**
     * 加算する
     * @param other
     * @return
     */
    public Money add(final Money other) {
        if(!other.currency.equals(this.currency)){
            throw new IllegalArgumentException("通過の単位が違います");
        }
        var added = other.amount + this.amount;
        return new Money(added, this.currency);
    }
}
