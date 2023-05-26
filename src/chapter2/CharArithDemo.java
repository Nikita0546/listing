public class CharArithDemo {
    private char ch = 'L';

    public void decrease() {
        this.ch--;
        System.out.println("Значение ch изменилось на " + this.ch);
    }
    public void increase() {
        this.ch++;
        System.out.println("Значение ch изменилось и равно " + this.ch);
    }
    public void set_char(char ch) {
        this.ch = ch;
        System.out.println("Значение ch снова изменилось и равно " + this.ch);
    }
}
