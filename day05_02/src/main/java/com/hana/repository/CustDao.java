package com.hana.repository;

import com.hana.data.CustDto;
import com.hana.frame.Dao;

import java.util.ArrayList;
import java.util.List;

public class CustDao implements Dao<String, CustDto> {
    @Override
    public int insert(CustDto custDto) {
        //System.out.println("Duplicated ID Exception ... ");
        System.out.println("Oracle DB: Inserted ... " + custDto);
        return 0;
    }

    @Override
    public int delete(String s) {
        System.out.println("Oracle DB: Deleted ... " + s);
        return 0;
    }

    @Override
    public int update(CustDto custDto) {
        System.out.println("Oracle DB: Updated ... " + custDto);
        return 0;
    }

    @Override
    public CustDto select(String s) {
        return CustDto.builder().id(s).pwd("pwd01").name("James").build();
    }

    @Override
    public List<CustDto> select() {
        List list = new ArrayList<CustDto>();
        list.add(CustDto.builder().id("id01").pwd("pwd01").name("James").build());
        list.add(CustDto.builder().id("id02").pwd("pwd02").name("Tom").build());
        list.add(CustDto.builder().id("id03").pwd("pwd03").name("Kane").build());
        return list;
    }
}