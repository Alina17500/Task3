package ru.vsu.cs.volobueva;

public class Tests {

    public static boolean tests(Picture picture) {
        return testingSituation1(picture);
    }

    static boolean testingSituation1(Picture picture) {
        if (picture.getColor(2,3) == SimpleColor.ORANGE || picture.getColor(2,3) == SimpleColor.BLUE) {
            return testingSituation2(picture);
        } else {
            System.out.println("Test 1 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static boolean testingSituation2(Picture picture) {
        if (picture.getColor(-2,-2) == SimpleColor.GRAY) {
            return testingSituation3(picture);
        } else {
            System.out.println("Test 2 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static boolean testingSituation3(Picture picture) {
        if (picture.getColor(2,-7) == SimpleColor.GREEN) {
            return testingSituation4(picture);
        } else {
            System.out.println("Test 3 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static boolean testingSituation4(Picture picture) {
        if (picture.getColor(-5,-5.5) == SimpleColor.YELLOW) {
            return testingSituation5(picture);
        } else {
            System.out.println("Test 4 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static boolean testingSituation5(Picture picture) {
        if (picture.getColor(-9,1) == SimpleColor.YELLOW) {
            return testingSituation6(picture);
        } else {
            System.out.println("Test 5 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static boolean testingSituation6(Picture picture) {
        if (picture.getColor(-1,-9) == SimpleColor.YELLOW) {
            return testingSituation7(picture);
        } else {
            System.out.println("Test 6 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static boolean testingSituation7(Picture picture) {
        if (picture.getColor(0,3) == SimpleColor.BLUE) {
            return testingSituation8(picture);
        } else {
            System.out.println("Test 7 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static boolean testingSituation8(Picture picture) {
        if (picture.getColor(-8,-3) == SimpleColor.BLUE) {
            return testingSituation9(picture);
        } else {
            System.out.println("Test 8 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static boolean testingSituation9(Picture picture) {
        if (picture.getColor(-3,1) == SimpleColor.WHITE || picture.getColor(-3,1) == SimpleColor.BLUE) {
            return testingSituation10(picture);
        } else {
            System.out.println("Test 9 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static boolean testingSituation10(Picture picture) {
        if (picture.getColor(-3,1) == SimpleColor.WHITE) {
            return true;
        } else {
            System.out.println("Test 10 is incorrect. The dot is in a different color field.");
            return false;
        }
    }
}
