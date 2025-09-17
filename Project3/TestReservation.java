/*
	Raymond Rowland
	CMSC 345 Software Engineering Principles and Techniques
	Project 3
	September 17, 2025

	TestReservation.java

	Automated tests for the Reservation class.
	Reads test cases from a CSV file and verifies Reservation behavior.
*/

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestReservation
{
    // Flag enum: each value is a power of 2 for bitwise operations
    public enum TestFlags {
        CONSTRUCTION(1),
        UUID(1 << 1),
        GET(1 << 2),
        SET(1 << 3),
        CALCULATE_RESERVATION_NUMBER_OF_DAYS(1 << 4),
        CALCULATE_RESERVATION_BILL_AMOUNT(1 << 5);

        public final int value;

        TestFlags(int value) {
            this.value = value;
        }
    }

    /**
     * The main entry point for the test runner application.
     *
     * Reads test cases from a CSV file ("testcases.csv"), processes each line as a test case,
     * and executes the corresponding tests using the TestData and executeTests methods.
     * The set of tests to execute can be controlled by passing an integer bitmask as the first
     * command-line argument; if no argument is provided, all tests are executed.
     * Prints the results of each test case to the standard output.
     *
     */
    static public void main(String[] args) 
    {
        int testsToExecute = args.length > 0 ? Integer.parseInt(args[0]) : -1;
        String file = "testcases.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Each line is a test case, split by comma if needed
                TestData testData = new TestData(line);
                executeTests(testData, testsToExecute);
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Creates a new Reservation object using the provided test data.
     *
     * @param testData The TestData object containing customer ID, room type, start date, and end date.
     * @return A Reservation instance initialized with values from the test data.
     */
    static private Reservation CreateReservationFromTestData(TestData testData) {
        return new Reservation(testData.getCustId(), testData.getRoomType(), testData.getStartDateString(), testData.getEndDateString());
    }

    /**
     * Executes selected unit tests on the Reservation class using the provided test data.
     *
     * This method prints test information, constructs Reservation objects from the given
     * TestData, and runs test methods based on the specified bitmask in testsToExecute.
     * Supported tests include:
     * - Construction and field validation
     * - UUID uniqueness
     * - Getter and setter methods for guest ID, room type, and reservation dates
     * - Calculation of reservation duration and bill amount
     *
     * @param testData The TestData object containing input values and expected results for testing.
     * @param testsToExecute Bitmask indicating which tests to run.
     */
    static public void executeTests(TestData testData, int testsToExecute) {
        System.out.println("Testing Reservation " + testData.getCustId());
        System.out.printf("Arguments: %d, %s, %s, %s\n", testData.getCustId(), testData.getRoomType(), testData.getStartDateString(), testData.getEndDateString());
        System.out.println("------------------------------------------------------------");
        if((testsToExecute & TestFlags.CONSTRUCTION.value) != 0)
        {
            Reservation reservation = testConstruction(testData);
        }

        if((testsToExecute & TestFlags.UUID.value) != 0)
        {
            Reservation reservation = CreateReservationFromTestData(testData);
            testUUID(reservation);
        }

        if((testsToExecute & TestFlags.GET.value) != 0)
        {
            Reservation reservation = CreateReservationFromTestData(testData);
            testReservationDate(reservation);
        
            reservation = CreateReservationFromTestData(testData);
            testGuestID(reservation, testData.getCustId());
        
            reservation = CreateReservationFromTestData(testData);
            testRoomType(reservation, testData.getRoomType());
        
            reservation = CreateReservationFromTestData(testData);
            testReservationStartDate(reservation, testData.getStartDateString());

            reservation = CreateReservationFromTestData(testData);
            testReservationEndDate(reservation, testData.getEndDateString());
        }


        if((testsToExecute & TestFlags.SET.value) != 0)
        {
            Reservation reservation = CreateReservationFromTestData(testData);
            testSetReservationStartDate(reservation, testData.getStartDateString());
        
            reservation = CreateReservationFromTestData(testData);
            testSetReservationEndDate(reservation, testData.getEndDateString());
    
            reservation = CreateReservationFromTestData(testData);
            testSetGuestID(reservation, testData.getCustId());
     

            reservation = CreateReservationFromTestData(testData);
            testSetRoom(reservation, testData.getRoomType());
        }


        if((testsToExecute & TestFlags.CALCULATE_RESERVATION_NUMBER_OF_DAYS.value) != 0)
        {
            Reservation reservation = CreateReservationFromTestData(testData);
            testCalculateReservationNumberOfDays(reservation, testData.getStayDuration());
        }

        if((testsToExecute & TestFlags.CALCULATE_RESERVATION_BILL_AMOUNT.value) != 0)
        {
            Reservation reservation = CreateReservationFromTestData(testData);
            testCalculateReservationBillAmount(reservation, testData.getExpectedTotal());
        }
    }

    /**
     * Calculates the number of days between the start and end dates of a reservation.
     * Returns the difference in days as a long value.
     * If an exception occurs during date parsing, prints the stack trace and returns 0.
     *
     * @param reservation the Reservation object containing start and end date strings
     * @return the number of days between the reservation's start and end dates
     */
    static public long calculateReservationNumberOfDays(Reservation reservation) {
        long numberOfDays = 0;
        try {
            Date startDate = TestUtils.parseDate(reservation.getReservationStartDate());
            Date endDate = TestUtils.parseDate(reservation.getReservationEndDate());
            //                                                         864000000
            numberOfDays = (endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return numberOfDays;
    }

    /**
     * Compares two Date objects to determine if they represent the same calendar day.
     * Returns 1 if the year, month, and day are equal; otherwise, returns 0.
     *
     * @param d1 the first date to compare
     * @param d2 the second date to compare
     * @return 1 if both dates are on the same day, 0 otherwise
     */
    static public int areDatesSimilar(Date d1, Date d2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(d1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(d2);
        return (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) &&
                cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH)) ? 1 : 0;

    }

    /**
     * Tests the construction of a Reservation object with the given test data.
     * Asserts that the Reservation fields match the expected values from the test data.
     *
     * @param testData the TestData object containing expected values for the reservation
     * @return the constructed Reservation object
     */
    static public Reservation testConstruction(TestData testData) {
        System.out.println("---> Construction Tests");
        Reservation reservation = new Reservation(testData.getCustId(), testData.getRoomType(), testData.getStartDateString(), testData.getEndDateString());
            Assert.assertEqualsInt(reservation.getGuestID(), testData.getCustId());
            Assert.assertEqualsString(reservation.getRoomType(), testData.getRoomType());
            try {
                Assert.assertEqualsDate(TestUtils.parseDate(reservation.getReservationStartDate()), testData.getStartDate());
                Assert.assertEqualsDate(TestUtils.parseDate(reservation.getReservationEndDate()), testData.getEndDate());
            } catch (Exception e) {
                e.printStackTrace();
            }

        return reservation;
    }
    
    // public UUID getReservationID() ;
    /**
     * Tests that two Reservation objects have different UUIDs.
     * Creates a new Reservation and asserts its UUID is not equal to the given reservation's UUID.
     *
     * @param reservation the Reservation object to compare against a newly created Reservation
     */
    static public void testUUID(Reservation reservation) {
        System.out.println("---> GET UUID Tests");
        Reservation r2 = new Reservation(1, "RoomWBath", "Jan 02, 2025", "Jan 05, 2025");
        Assert.assertNotEqualsUUID(r2.getReservationID(), reservation.getReservationID());
    }

    // public Date getReservationDate() ;
    /**
     * Tests whether the reservation date of the given Reservation object is similar to the current date.
     * Prints the test header and asserts that the dates are similar.
     * Catches and prints any exceptions that occur during the test.
     *
     * @param reservation the Reservation object whose reservation date is to be tested
     */
    static public void testReservationDate(Reservation reservation) {
        System.out.println("---> GET Reservation Date Tests");
            try {
                Date d = new Date();
                Assert.assertEqualsInt(1, areDatesSimilar(reservation.getReservationDate(), d));
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    
    // public int getGuestID()  ;
    /**
     * Tests whether the guest ID of the given reservation matches the expected original ID.
     *
     * @param reservation the Reservation object to test
     * @param oriID the expected original guest ID
     */
    static public void testGuestID(Reservation reservation, int oriID) {
        System.out.println("---> GET Guest ID Tests");
        Assert.assertEqualsInt(reservation.getGuestID(), oriID);
    }
    
    // public String getRoomType() ;
    /**
     * Tests whether the room type of the given reservation matches the expected value.
     *
     * @param reservation the Reservation object to test
     * @param oriRoom the expected room type as a String
     */
    static public void testRoomType(Reservation reservation, String oriRoom) {
        System.out.println("---> GET Room Type Tests");
        Assert.assertEqualsString(reservation.getRoomType(), oriRoom);
    }

    // public String getReservationStartDate() ;
    /**
     * Tests whether the reservation's start date matches the expected original start date.
     *
     * @param reservation   the Reservation object to be tested
     * @param oriStartDate  the expected original start date as a String
     */
    static public void testReservationStartDate(Reservation reservation, String oriStartDate) {
        System.out.println("---> GET Reservation Start Date Tests");
        Assert.assertEqualsString(reservation.getReservationStartDate(), oriStartDate);
    }

    // public void setReservationStartDate(String var1) ;
    /**
     * Tests the functionality of setting and retrieving the reservation start date.
     * Verifies that the initial start date matches the expected value, then updates
     * the start date to the previous day and checks if the update is successful.
     *
     * @param reservation   the Reservation object to test
     * @param oriStartDate  the original start date as a string
     */
    static public void testSetReservationStartDate(Reservation reservation, String oriStartDate) {
        System.out.println("---> SET Reservation Start Date Tests");
        Assert.assertEqualsString(reservation.getReservationStartDate(), oriStartDate);
        try {
            Date d = TestUtils.parseDate(oriStartDate);
            Calendar c = Calendar.getInstance();
            c.setTime(d);
            c.add(Calendar.DATE, -1);
                reservation.setReservationStartDate(TestUtils.formatDate(c.getTime()));
                Assert.assertEqualsString(reservation.getReservationStartDate(), TestUtils.formatDate(c.getTime()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // public String getReservationEndDate() ;
    /**
     * Tests whether the reservation's end date matches the expected original end date.
     *
     * @param reservation the Reservation object to be tested
     * @param oriEndDate the expected end date string to compare against
     */
    static public void testReservationEndDate(Reservation reservation, String oriEndDate) {
        System.out.println("---> GET Reservation End Date Tests");
        Assert.assertEqualsString(reservation.getReservationEndDate(), oriEndDate);
    }

    // public void setReservationEndDate(String var1) ;
    /**
     * Tests the functionality of setting and updating the reservation end date.
     * Verifies that the initial end date matches the expected value, then updates
     * the end date by adding two days and checks if the change is correctly applied.
     *
     * @param reservation  the Reservation object to test
     * @param oriEndDate   the original end date string to verify and update
     */
    static public void testSetReservationEndDate(Reservation reservation, String oriEndDate) {
        System.out.println("---> SET Reservation End Date Tests");
        Assert.assertEqualsString(reservation.getReservationEndDate(), oriEndDate);
        try {
            Date d = TestUtils.parseDate(oriEndDate);
            Calendar c = Calendar.getInstance();
            c.setTime(d);
            c.add(Calendar.DATE, 2);
                reservation.setReservationEndDate(TestUtils.formatDate(c.getTime()));
                Assert.assertEqualsString(reservation.getReservationEndDate(), TestUtils.formatDate(c.getTime()));
                Assert.assertNotEqualsString(reservation.getReservationEndDate(), oriEndDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // public void setGuestID(int var1) ;
    /**
     * Tests the setGuestID method of the Reservation class by updating the guest ID
     * to a new value and asserting that the change is reflected correctly.
     *
     * @param reservation the Reservation object to be tested
     * @param oriID the original guest ID before modification
     */
    static public void testSetGuestID(Reservation reservation, int oriID) {
        System.out.println("---> SET Guest ID Tests (" + oriID + ")");
        int newGuestID = reservation.getGuestID() + 1;
        reservation.setGuestID(newGuestID);
        Assert.assertEqualsInt(reservation.getGuestID(), newGuestID);
        Assert.assertNotEqualsInt(reservation.getGuestID(), oriID);
    }

    // public void setRoom(String var1) ;
    /**
     * Tests the setRoom method of the Reservation class.
     * Verifies that the room type can be changed from its original value to a new value,
     * and asserts that the change is reflected correctly.
     *
     * @param reservation the Reservation object to test
     * @param oriRoom the original room type to compare against
     */
    static public void testSetRoom(Reservation reservation, String oriRoom) {
        System.out.println("---> SET Room Type Tests (" + oriRoom + ")");
        Assert.assertEqualsString(reservation.getRoomType(), oriRoom);
        String newRoomType = "NormalRoom";
        if(reservation.getRoomType().equals(newRoomType)) {
            newRoomType = "RoomWBath";
        }
        reservation.setRoom(newRoomType);
        Assert.assertEqualsString(reservation.getRoomType(), newRoomType);
        Assert.assertNotEqualsString(reservation.getRoomType(), oriRoom);
    }

    // public long calculateReservationNumberOfDays() throws Exception ;
    /**
     * Tests the calculateReservationNumberOfDays method of a Reservation object.
     * Compares the calculated number of days with the expected value and asserts equality.
     *
     * @param reservation   the Reservation instance to test
     * @param expectedDays  the expected number of reservation days
     */
    static public void testCalculateReservationNumberOfDays(Reservation reservation, long expectedDays) {
        System.out.println("---> Calculate Reservation Number of Days Tests");
        try {
            Assert.assertEqualsLong(reservation.calculateReservationNumberOfDays(), expectedDays);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // public double calculateReservationBillAmount() throws Exception ;
    /**
     * Tests the calculateReservationBillAmount method of a Reservation object by comparing
     * its result to the expected total value. Prints the test header and catches any exceptions
     * thrown during the assertion.
     *
     * @param reservation    the Reservation object to test
     * @param expectedTotal  the expected total bill amount for the reservation
     */
    static public void testCalculateReservationBillAmount(Reservation reservation, double expectedTotal) {
        System.out.println("---> Calculate Reservation Bill Amount Tests");
        try {           
            Assert.assertEqualsDouble(reservation.calculateReservationBillAmount(), expectedTotal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
