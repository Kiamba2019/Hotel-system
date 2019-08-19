/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author Aviator
 */
public class TableModel implements Serializable {

    int tableid;
    String tableName, tableDate;

    public int getTableid() {
        return tableid;
    }

    public void setTableid(int tableid) {
        this.tableid = tableid;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableDate() {
        return tableDate;
    }

    public void setTableDate(String tableDate) {
        this.tableDate = tableDate;
    }

}
