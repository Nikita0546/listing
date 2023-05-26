public class DivisionDemo {
    public static void main(String[] args) {
        int iresult, iremain;
        double dresult, dremain;

        iresult = 10/3;
        iremain = 10%3;

        System.out.println("Частное деление от 10/3 = " + iresult);
        System.out.println(iremain + " - остаток от деления iresult");

        dresult = 10.0 / 3.0;
        dremain = 10.0 % 3.0;

        System.out.println("Частное деление от 10.0 / 3.0 = " + dresult);
        System.out.println(dremain + " - остаток от деления dresult");
    }
}
