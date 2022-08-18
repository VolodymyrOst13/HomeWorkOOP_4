package task2;

public class TXTHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("TXT file is open");
    }

    @Override
    void create() {
        System.out.println("TXT file is created");
    }

    @Override
    void change() {
        System.out.println("TXT file is changed");
    }

    @Override
    void save() {
        System.out.println("TXT file is saved");
    }
}
