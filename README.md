OpenCSV is a very simple csv (comma-separated values) parser library for Java.

Since its a library, its execution is shown in two ways.
1. Example file which is AddressExample.java
2. jUnit tests

In order to compile and run with gradle, please follow the following steps:

1. Navigate to the root of this project.
2. Type gradle build in either the terminal or in the terminal of IntelliJ
This will run all the tests.
3. Type gradle run to run the Example file, output is printed on the terminal.
4. To run and see the output messages of tests, type gradle test -i on the terminal.

In order to compile and run with sbt, please follow the following steps:

1. Navigate to the root of this project.
2. Type sbt in either the terminal or in the terminal of IntelliJ.
This will open the sbt shell.
3. Type compile to compile all the files.
4. Type run to run the Example file, output is printed on the terminal.
5. To run and see the output messages of tests, type test in the shell.
6. To exit this shell, type exit

Tests are located in src/test/java/gurpreetstests

Original tests of this application can be found in the first commit.
This application was originally build by the owner using maven, hence it also contains a pom.xml file.