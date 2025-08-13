package com.maxim.demo.service;
import com.maxim.demo.entity.KBarEntity;
import java.time.LocalDate;
import java.util.Collection;

public interface getStockBar {
    // 分区表的业务查询接口
    Collection<KBarEntity> queryByTimeSpan(LocalDate start_date, LocalDate end_date);
}
