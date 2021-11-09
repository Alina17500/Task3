package ru.vsu.cs.volobueva;

public class TestCase {

    public boolean tests() {
        return testingSituation1();
    }

    static boolean testingSituation1() {
        if (picture.getColor(2,3) == SimpleColor.ORANGE || picture.getColor(2,3) == SimpleColor.BLUE) {
            return testingSituation2();
        } else {
            System.out.println("Test 1 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static boolean testingSituation2() {
        if (picture.getColor(-2,-2) == SimpleColor.GRAY) {
            return testingSituation3();
        } else {
            System.out.println("Test 2 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static boolean testingSituation3() {
        if (picture.getColor(2,-7) == SimpleColor.GREEN) {
            return testingSituation4();
        } else {
            System.out.println("Test 3 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static boolean testingSituation4() {
        if (picture.getColor(-5,-5.5) == SimpleColor.YELLOW) {
            return testingSituation5();
        } else {
            System.out.println("Test 4 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static boolean testingSituation5() {
        if (picture.getColor(-9,1) == SimpleColor.YELLOW) {
            return testingSituation6();
        } else {
            System.out.println("Test 5 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static boolean testingSituation6() {
        if (picture.getColor(-1,-9) == SimpleColor.YELLOW) {
            return testingSituation7();
        } else {
            System.out.println("Test 6 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static boolean testingSituation7() {
        if (picture.getColor(0,3) == SimpleColor.BLUE) {
            return testingSituation8();
        } else {
            System.out.println("Test 7 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static boolean testingSituation8() {
        if (picture.getColor(-8,-3) == SimpleColor.BLUE) {
            return testingSituation9();
        } else {
            System.out.println("Test 8 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static boolean testingSituation9() {
        if (picture.getColor(-3,1) == SimpleColor.WHITE || picture.getColor(-3,1) == SimpleColor.BLUE) {
            return testingSituation10();
        } else {
            System.out.println("Test 9 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static boolean testingSituation10() {
        if (picture.getColor(-3,1) == SimpleColor.WHITE) {
            return true;
        } else {
            System.out.println("Test 10 is incorrect. The dot is in a different color field.");
            return false;
        }
    }

    static final Picture picture = new Picture(new Circle(-3,-3,4), new HorizontalParabola(2,3,-1),
            new HorizontalParabola(-3,-3,-0.25), new HorizontalParabola(-6,-6,1));
}
