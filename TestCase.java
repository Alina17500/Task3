package ru.vsu.cs.volobueva;

public class TestCase {

    public boolean tests() {
        if (picture.getColor(3,5) != SimpleColor.ORANGE) {
            System.out.println("test 1 is incorrect");
            return false;
        } else if (picture.getColor(-2,-2) != SimpleColor.GRAY) {
            System.out.println("test 2 is incorrect");
            return false;
        } else if (picture.getColor(2,-7) != SimpleColor.GREEN) {
            System.out.println("test 3 is incorrect");
            return false;
        } else if (picture.getColor(-5,-5.5) != SimpleColor.YELLOW) {
            System.out.println("test 4 is incorrect");
            return false;
        } else if (picture.getColor(-9,1) != SimpleColor.YELLOW) {
            System.out.println("test 5 is incorrect");
            return false;
        } else if (picture.getColor(-1,-9) != SimpleColor.YELLOW) {
            System.out.println("test 6 is incorrect");
            return false;
        } else if (picture.getColor(0,3) != SimpleColor.BLUE) {
            System.out.println("test 7 is incorrect");
            return false;
        } else if (picture.getColor(-8,-3) != SimpleColor.BLUE) {
            System.out.println("test 8 is incorrect");
            return false;
        } else if (picture.getColor(-3,1) != SimpleColor.WHITE) {
            System.out.println("test 9 is incorrect");
            return false;
        } else {
            return true;
        }
    }

    private static final Picture picture = new Picture();
}
