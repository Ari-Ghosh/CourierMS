package com.example.courierms.bo.custom.impl;

import com.example.courierms.bo.custom.BillDetailsBO;
import com.example.courierms.dao.DAOFactory;
import com.example.courierms.dao.custom.BillDetailsDAO;

import java.sql.SQLException;

public class BillDetailsBOImpl implements BillDetailsBO {
    BillDetailsDAO billDetailsDAO= (BillDetailsDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BILL);
    @Override
    public int getDailyBillCount(String id) throws ClassNotFoundException, SQLException {
        return billDetailsDAO.getDailyBillCount(id);
    }

    @Override
    public double getDailyIncome(String date) throws ClassNotFoundException, SQLException {
        return billDetailsDAO.getDailyIncome(date);
    }

    @Override
    public double getYearlyIncome(String date) throws ClassNotFoundException, SQLException {
        return billDetailsDAO.getYearlyIncome(date);
    }

    @Override
    public int getMonthlyBillCount() throws ClassNotFoundException, SQLException {
        return billDetailsDAO.getMonthlyBillCount();
    }


    @Override
    public double getMonthlyIncome() throws ClassNotFoundException, SQLException {
        return billDetailsDAO.getMonthlyIncome();
    }
}
