# 	Raymond Rowland
# 	CMSC 345 Software Engineering Principles and Techniques
# 	Project 3
# 	September 17, 2025
#
# 	Makefile for Project 3
# 	Builds and runs the test suite for the Reservation class.

.PHONY: run clean build

run: ./Classes/TestUtils.class ./Classes/TestData.class
	java -cp ./Classes:w6.jar TestReservation.java

build: ./Classes/TestData.class ./Classes/TestUtils.class
	echo "Build complete."

./Classes/TestData.class: TestData.java
	javac TestData.java -d ./Classes

./Classes/TestUtils.class: TestUtils.java
	javac TestUtils.java -d ./Classes

clean:
	rm -f ./Classes/*.class
