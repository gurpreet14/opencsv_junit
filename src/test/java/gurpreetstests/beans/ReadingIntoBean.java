package gurpreetstests.beans;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

/**
 * Created by GP on 10/09/17.
 */
public class ReadingIntoBean {



    @CsvBindByName(column = "string1")
    @CsvBindByPosition(position = 1)
    private String string1;

    @CsvBindByName(column = "bool1")
    @CsvBindByPosition(position = 2)
    private String bool1;

    @CsvBindByName(column = "boolPrimitive")
    @CsvBindByPosition(position = 3)
    private String boolPrimitive;

    @CsvBindByName(column = "byte1")
    @CsvBindByPosition(position = 4)
    private String byte1;

    @CsvBindByName(column = "double1")
    @CsvBindByPosition(position = 5)
    private String double1;

    @CsvBindByName(column = "float1")
    @CsvBindByPosition(position = 6)
    private String float1;

    @CsvBindByName(column = "integer1")
    @CsvBindByPosition(position = 7)
    private String integer1;

    @CsvBindByName(column = "long1")
    @CsvBindByPosition(position = 8)
    private String long1;

    @CsvBindByName(column = "short1")
    @CsvBindByPosition(position = 9)
    private String short1;


    // Getters and setters go here.

     private String getString1() {
        return string1;
    }

    public String getBool1() {
        return bool1;
    }

    private String getboolPrimitive() {
        return boolPrimitive;
    }

    private String getbyte1() {
        return byte1;
    }

    private String getDouble1() {
        return double1;
    }

    private String getInteger1() {
        return integer1;
    }

    private String getLong1() {
        return long1;
    }

    private String getShort1() {
        return short1;
    }

    private String getFloat1() {
        return float1;
    }



    private void setString1(String s) {
         this.string1=s;
    }

    private void setBool1(String s) {
        this.bool1=s;
    }

    private void setboolPrimitive(String s) {
        this.boolPrimitive=s;
    }

    private void setbyte1(String s) {
        this.byte1=s;
    }

    private void setDouble1(String d) {
        this.double1=d;
    }

    private void setInteger1(String i) {
        this.integer1=i;
    }

    private void setLong1(String l) {
        this.long1=l;
    }

    private void setShort1(String s) {
        this.short1=s;
    }

    private void setFloat1(String f) {
        this.float1 =f;
    }

    @Override
    public String toString()
    {
        return "ReadingIntoBeanObject [string1=" + string1 + ", bool1=" + bool1 + ", integer1 ="+integer1+"," +
                " float1=" + float1 + ", double1=" + double1 + ", long1 = "+long1+", short1 = "+short1+
                "]";
    }

}
