package gurpreetstests;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import gurpreetstests.beans.ReadingIntoBean;
import org.junit.Test;

import java.io.*;


import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by GP on 10/09/17.
 */
public class ReadingIntoBeanTest {
    @Test
    public void beanTest() {
        String fileName = "headertest.csv";
        ClassLoader classLoader = getClass().getClassLoader();

        File file = new File(classLoader.getResource(fileName).getFile());

        try {
            CSVReader csvReader = new CSVReader(new FileReader(file),';');

            CsvToBean<ReadingIntoBean> csv = new CsvToBean<>();


            //Set column mapping strategy
            List beans = csv.parse(setColumMapping(), csvReader);

            assertEquals("true",((ReadingIntoBean) beans.get(0)).getBool1());
            for (Object object : beans) {
                ReadingIntoBean rb = (ReadingIntoBean) object;
                System.out.println(rb);
            }
        }
        catch(Exception ee) {
            System.out.print(ee.toString());
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private static HeaderColumnNameMappingStrategy setColumMapping()
    {
        HeaderColumnNameMappingStrategy <ReadingIntoBean> strategy = new HeaderColumnNameMappingStrategy<>();
        strategy.setType(ReadingIntoBean.class);

        return strategy;
    }

}
