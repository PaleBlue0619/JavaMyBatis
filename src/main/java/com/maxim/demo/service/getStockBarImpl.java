package com.maxim.demo.service;
import com.maxim.demo.dao.queryStockBar;
import com.maxim.demo.entity.KBarEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.Collection;

@Service
public class getStockBarImpl implements getStockBar{
    @Autowired
    queryStockBar querystockbar;

    @Override
    public Collection<KBarEntity> queryByTimeSpan(LocalDate start_date,
                                                  LocalDate end_date) {
        return querystockbar.queryByTimeSpan(start_date, end_date);
    }
}
