package com.zhouhao.poi.excel.bean;

public class XCell {
    private int cellIndex;
    private String value;

    public XCell(int cellIndex, String value) {
        this.cellIndex = cellIndex;
        this.value = value;
    }

    public XCell() {

    }

    public void setCellIndex(int cellIndex) {
        this.cellIndex = cellIndex;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getCellIndex() {
        return cellIndex;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "XCell{" +
                "cellIndex=" + cellIndex +
                ", value='" + value + '\'' +
                '}';
    }
}
