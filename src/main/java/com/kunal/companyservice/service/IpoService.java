package com.kunal.companyservice.service;


import com.kunal.companyservice.dto.IpoDto;

import java.util.List;

public interface IpoService
{
    public List<IpoDto> findAll();
    public IpoDto findById(String id);
    public IpoDto save(IpoDto ipoDto);
    public IpoDto update(IpoDto ipoDto);
    public void deleteById(String id);
}