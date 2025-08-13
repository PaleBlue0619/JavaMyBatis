package com.maxim.demo.dao;
import com.maxim.demo.entity.KBarEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.time.LocalDate;
import java.util.Collection;

@Mapper
public interface queryStockBar{
    // 查询指定时间段内的K线数据接口
    Collection<KBarEntity> queryByTimeSpan(@Param("start_date") LocalDate start_date,
                                           @Param("end_date") LocalDate end_date);
}

