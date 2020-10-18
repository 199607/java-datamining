import com.zhouhao.poi.excel.bean.CreateTable;
import com.zhouhao.poi.excel.bean.XRow;
import com.zhouhao.poi.excel.util.DBUtil;
import com.zhouhao.poi.excel.util.ReadExcel;
import org.junit.Test;

import java.io.File;
import java.util.List;

public class PoiEcelTest {
    @Test
    public void testRead() throws Exception {

//        String excelPAth="d:\\data\\demo.xlsx";
//        String excelPAth="d:\\data\\kuqu.csv";
        String excelPAth="D:\\datamining\\广东.xlsx";
        //获取第一行作为表的注释
        XRow firstRowData = ReadExcel.getFirstRowData(new File(excelPAth));

        //获取数据作为表的内容
        List<XRow> otherData = ReadExcel.getOtherData(new File(excelPAth), firstRowData);

        //创建数据库表
        CreateTable createTable = DBUtil.generateCreateTable(firstRowData);
        //DBUtil.createTable(createTable.getCreateStr());

        //插入数据
        int[] ints = DBUtil.insertRowBatch(createTable.getColumnList(), otherData);
    }
}
