package com.maxim.demo.controller;

import com.maxim.demo.dto.QuaryArg;
import com.maxim.demo.entity.KBarEntity;
import com.maxim.demo.service.getStockBarImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class StockBarController {
    @Autowired
    getStockBarImpl getStockBarimpl;

    @PostMapping("/queryStockBar")
    public Collection<KBarEntity> queryStockBar(QuaryArg quaryArg)
    {
        return getStockBarimpl.queryByTimeSpan(
                quaryArg.getStart_date(),
                quaryArg.getEnd_date()
        );
    }
}
