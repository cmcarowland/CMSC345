/*
	Raymond Rowland
	CMSC 345 Software Engineering Principles and Techniques
	Project 3
	September 17, 2025

    TestUtils.java

    Utility class for date parsing/formatting and room price retrieval.
*/

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;

public class TestUtils {

    static String datePattern = "MMM dd, yyyy";
    static SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);

    static Map<String, Integer> roomTypes = new HashMap<>() {{
        put("RoomWBath", 200);
        put("RoomWView", 175);
        put("NormalRoom", 120);
    }};


    static public Date parseDate(String dateString) {
        try {
            return dateFormat.parse(dateString);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    static public String formatDate(Date date) {
        return dateFormat.format(date);
    }

    static public Integer getRoomPrice(String roomType) {
        return roomTypes.get(roomType);
    }
}