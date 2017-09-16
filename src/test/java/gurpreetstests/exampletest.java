package gurpreetstests;
import com.opencsv.CSVReader;
import org.junit.Test;
import java.io.*;
import static org.junit.Assert.*;

/**
 * Created by GP on 08/09/17.
 */
public class exampletest {


    @Test
    public void customSeperatorTest() {
        //Get file from resources folder
        String fileName = "testinputcase55.csv";
        assertTrue(fileName.contains(".csv"));
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        System.out.println("Converting csv file seperated by ; into a string array");

        //        check if file name has the correct extension


        try {
            CSVReader reader = new CSVReader(new FileReader(file), ';');


            BufferedReader breader = new BufferedReader(new FileReader(file));
            String line;
            String expectedLine = "";
            while ((line =breader.readLine()) != null)
            {
                expectedLine = expectedLine+line;
            }


            String [] nextLine;

            while ((nextLine = reader.readNext()) != null) {
                String expected[]=new String[expectedLine.length()];
                expected = expectedLine.split(";");
                assertArrayEquals(expected,nextLine);
                System.out.println("This is a new line:");
                for (String s: nextLine) {
                    //Do your stuff here
                    assertNotNull(s);
                    System.out.print(s+" ");
                }

            }
        }
        catch (Exception e){
            System.out.println("exception caught: "+e.toString());
        }

    }


}
