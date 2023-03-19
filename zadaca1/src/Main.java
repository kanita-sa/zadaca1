public class Main {
    public static void main(String[] args) {
        //Zadatak 4
        /*
        int numberInInt = 764;
        String numberInString= "754";
        int charInInt = 'K';
        String charInString = "Hello";
            All the variables and declarations in this block is working
        */

        /*
        double decimalInDouble = 2345.32;
        double charInDouble = 's';
        double stringInDouble = "Hello, how are you";
        double booleanInDouble = true;
            in double, decimal and char value can be set, however, declaring string and boolean to double does not work
        */

        //Zadatak 5
        String nameAndSurname = "Kanita Šabanović";
        char firstLetter = 'K';
        int yearOfBirth = 1996;
        double numberHundredBillion = 100000000000L;
        int numberFortyThousand = 42001;
        System.out.println(nameAndSurname + " " + firstLetter + " " + yearOfBirth + " " + numberHundredBillion + " "
                + numberFortyThousand + "\n");


        //Zadatak 6
        System.out.println("" + (char)75+(char)97+(char)110+(char)105+(char)116+(char)97 + "\n");


        //Zadatak 7
        String theUltimateQuestion = "Answer to the Ultimate Question of Life, the Universe, and Everything is the number ";
        int theNumber = 42;
        boolean isTrue = true;
        System.out.println(theUltimateQuestion + theNumber + ": " + isTrue + "\n");


        //Zadatak 8
        String firstPartOfTheText = "This is a number ";
        String secondPartOfTheText = " and it is about to double";
        int theNumberInText = 123;
        String bonusMessage = "The original number has been doubled: ";
        System.out.println(firstPartOfTheText + theNumberInText + secondPartOfTheText);
        System.out.println(bonusMessage + "X times");
        theNumberInText = theNumberInText*2;
        System.out.println(firstPartOfTheText + theNumberInText + secondPartOfTheText);
        theNumberInText = theNumberInText*2;
        System.out.println(firstPartOfTheText + theNumberInText + secondPartOfTheText);
        theNumberInText = theNumberInText*2;
        System.out.println(firstPartOfTheText + theNumberInText + secondPartOfTheText);
        System.out.println(bonusMessage + "XXXX times");
        theNumberInText = theNumberInText*2;
        System.out.println(firstPartOfTheText + theNumberInText + secondPartOfTheText);
        System.out.println(bonusMessage + "XXXXX times (Total of: 5 times)");
        theNumberInText = theNumberInText*2;
        System.out.println(firstPartOfTheText + theNumberInText + secondPartOfTheText);
        theNumberInText = theNumberInText*2;
        System.out.println(firstPartOfTheText + theNumberInText + secondPartOfTheText);
        theNumberInText = theNumberInText*2;
        System.out.println(firstPartOfTheText + theNumberInText + secondPartOfTheText);
        System.out.println(bonusMessage + "XXXXXXXX times");
        
    }
}