package com.kunal.companyservice.feignclient;

import com.kunal.companyservice.dto.CompanyDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("stock-exchange-service")
public interface StockExchangeClient
{
    @PostMapping("/stockExchanges/{stockExchangeName}/companies")
    public void addCompanyToStockExchange(@PathVariable String stockExchangeName, @RequestBody CompanyDto companyDto);
}