package baitapoop;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public Date convertStringToDate(String date) throws ParseException {
        SimpleDateFormat formatter =new SimpleDateFormat("dd/MM/yyyy");
        return formatter.parse(date);
    }

    public String convertDateToString(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        return formatter.format(date);
    }
}
