package com.maxim.demo.entity;
import com.alibaba.fastjson2.annotation.JSONField;
import lombok.Data;
import java.time.LocalDate;

@Data
public class KBarEntity {
    // ordinal 指定顺序, 从1开始, alternateNames用于指定别名(别的名称的也反序列化放入name字段)
    @JSONField(ordinal = 1, name = "trade_date", alternateNames = {"TradeDate"}, format = "yyyy.MM.dd")
    private LocalDate tradeDate;
    @JSONField(ordinal = 2, name = "ts_code", alternateNames = {"SecurityID"})
    private String symbol;
    @JSONField(ordinal = 3, name = "open", alternateNames = {"Open"})
    private double open;
    @JSONField(ordinal = 4, name = "high", alternateNames = {"High"})
    private double high;
    @JSONField(ordinal = 5, name = "low", alternateNames = {"Low"})
    private double low;
    @JSONField(ordinal = 6, name = "close", alternateNames = {"Close"})
    private double close;
    @JSONField(ordinal = 7, name = "pre_close", alternateNames = {"PreClose"})
    private double preClose;
    @JSONField(ordinal = 8, name = "pct_chg", alternateNames = {"Change"})
    private double change;
    @JSONField(ordinal = 9, name = "volume", alternateNames = {"Volume"})
    private double volume;
    @JSONField(ordinal = 10, name = "amount", alternateNames = {"Amount"})
    private double amount;
    @JSONField(ordinal = 11, name = "adj_factor", alternateNames = {"AdjustFactor"})
    private double adjustFactor;
    @JSONField(ordinal = 12, name = "create_time", alternateNames = {"create_timestamp"})
    private LocalDate createTime;
    @JSONField(ordinal = 13, name = "ts_code_body")
    private String symbolBody;
    @JSONField(ordinal = 14, name = "ts_code_exchange")
    private String symbolExchange;
}
