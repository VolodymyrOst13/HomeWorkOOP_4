package task2;

public class DOCHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("DOC file is open");
    }

    @Override
    void create() {
        System.out.println("DOC file is created");
    }

    @Override
    void change() {
        System.out.println("DOC file is changed");
    }

    @Override
    void save() {
        System.out.println("DOC file is saved");
    }
}
