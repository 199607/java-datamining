package com.zhouhao.poi.excel.bean;

import java.util.List;

public class CreateTable {
    private String createStr;
    private List<String> columnList;

    public CreateTable() {
    }

    public String getCreateStr() {
        return createStr;
    }

    public List<String> getColumnList() {
        return columnList;
    }

    public void setCreateStr(String createStr) {
        this.createStr = createStr;
    }

    public void setColumnList(List<String> columnList) {
        this.columnList = columnList;
    }

    @Override
    public String toString() {
        return "CreateTable{" +
                "createStr='" + createStr + '\'' +
                ", columnList=" + columnList +
                '}';
    }
}
