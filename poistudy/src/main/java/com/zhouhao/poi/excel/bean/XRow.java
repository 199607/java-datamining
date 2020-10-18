package com.zhouhao.poi.excel.bean;

import java.util.List;

public class XRow {
    private int rowIndex;
    private List<XCell> rowValue;

    public XRow() {
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public List<XCell> getRowValue() {
        return rowValue;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public void setRowValue(List<XCell> rowValue) {
        this.rowValue = rowValue;
    }

    @Override
    public String toString() {
        return "XRow{" +
                "rowIndex=" + rowIndex +
                ", rowValue=" + rowValue +
                '}';
    }
}
