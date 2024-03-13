package org.example.app.dao;

import org.example.app.data.CustDto;
import org.example.app.frame.Dao;

import java.util.List;

public class CustMySQLDao implements Dao<String, CustDto> {
    /**
     * 2024.03.13
     * Hikiman
     *
     * @param custDto : CustDto
     * @return int
     */
    @Override
    public int insert(CustDto custDto) {
        System.out.println("Inserted MySQL " + custDto + " ...");
        return 0;
    }

    @Override
    public int delete(String s) {
        System.out.println("Deleted MySQL ...");
        return 0;
    }

    @Override
    public int update(CustDto custDto) {
        return 0;
    }

    @Override
    public CustDto select(String s) {
        return null;
    }

    @Override
    public List<CustDto> select() {
        return null;
    }
}
