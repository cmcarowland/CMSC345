/*
	Raymond Rowland
	CMSC 345 Software Engineering Principles and Techniques
	Project 3
	September 17, 2025

	TestData.java

	Parses test data from a CSV string and provides access to individual fields.
*/

import java.util.Date;

public class TestData
{
    int custId = -1;
    String roomType = "";
    long stayDuration = 0;
    double expectedTotal = 0.0;
    Date startDate = null;
    Date endDate = null;

    public TestData(String testDataCSV) {
        String[] values = testDataCSV.split("!");
        this.custId = Integer.parseInt(values[0].trim());
        this.roomType = values[1].trim();
        try {
            this.startDate = TestUtils.parseDate(values[2].trim());
            this.endDate = TestUtils.parseDate(values[3].trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        this.stayDuration = Long.parseLong(values[4].trim());
        this.expectedTotal = Double.parseDouble(values[5].trim());
    }

    public int getCustId() { return custId; }
    public String getRoomType() { return roomType; }
    public long getStayDuration() { return stayDuration; }
    public double getExpectedTotal() { return expectedTotal; }
    public Date getStartDate() { return startDate; }
    public Date getEndDate() { return endDate; }
    public String getStartDateString() { return TestUtils.formatDate(startDate); }
    public String getEndDateString() { return TestUtils.formatDate(endDate); }
}