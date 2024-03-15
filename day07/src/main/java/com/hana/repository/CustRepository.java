package com.hana.repository;

import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIdException;
import com.hana.exception.NotFoundException;
import com.hana.frame.ConnectionPool;
import com.hana.frame.Repository;
import com.hana.frame.SQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustRepository implements Repository<String, CustDto> {

    @Override
    public CustDto insert(CustDto custDto, Connection con) throws DuplicatedIdException, Exception {
        // 4. PreparedStatement
        PreparedStatement pstmt = null;
        try{
            pstmt = con.prepareStatement(SQL.insertCust);
            pstmt.setString(1, custDto.getId());
            pstmt.setString(2, custDto.getPwd());
            pstmt.setString(3, custDto.getName());
            pstmt.executeUpdate();
        } catch(SQLIntegrityConstraintViolationException e) {
            throw new DuplicatedIdException("Err0001");
        } catch (SQLException e) {
            throw new Exception("Exx0001");
        } finally {
            // 5. Close
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return custDto;
    }

    @Override
    public CustDto update(CustDto custDto, Connection con) throws NotFoundException, Exception {
        String insertSql = "UPDATE db_cust SET name = ? WHERE id = ?";
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(insertSql);
            pstmt.setString(1,"unknown");
            pstmt.setString(2, custDto.getId());

            int result = pstmt.executeUpdate();
            if (result == 0) {
                throw new NotFoundException("Err0002");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQL Error");
        }finally {
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return custDto;
    }

    @Override
    public Boolean delete(String s, Connection con) throws NotFoundException, Exception {
        // 4. PreparedStatement
        PreparedStatement pstmt = null;
        try{
            pstmt = con.prepareStatement(SQL.deleteCust);
            pstmt.setString(1, s);
            int result = pstmt.executeUpdate();
            if (result == 0){
                throw new NotFoundException("Err0002");
            }
        } catch (SQLException e) {
            throw new Exception("Exx0001");
        } finally {
            // 5. Close
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return true;
    }

    @Override
    public List<CustDto> select(Connection con) throws Exception {
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        List<CustDto> result = new ArrayList<>();
        try{
            pstmt = con.prepareStatement(SQL.selectAllCust);
            rset = pstmt.executeQuery();
            while(rset.next()){
                String custId = rset.getString("id");
                String custPwd = rset.getString("pwd");
                String custName = rset.getString("name");
                result.add(new CustDto(custId, custPwd, custName));
            }
            if (result.isEmpty()){
                throw new NotFoundException("Err0003");
            }
        } catch (SQLException e) {
            throw new Exception("Exx0001");
        } finally {
            // 5. Close
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return result;
    }

    @Override
    public CustDto select(String s, Connection con) throws NotFoundException, Exception {
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        CustDto result = null;
        try{
            pstmt = con.prepareStatement(SQL.selectCust);
            pstmt.setString(1, s);
            rset = pstmt.executeQuery();
            while(rset.next()){
                String custId = rset.getString("id");
                String custPwd = rset.getString("pwd");
                String custName = rset.getString("name");
                result = new CustDto(custId, custPwd, custName);
            }
            if (result == null) {
                throw new NotFoundException("Err0003");
            }
        } catch (SQLException e) {
            throw new Exception("Exx0001");
        } finally {
            // 5. Close
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return result;
    }
}
