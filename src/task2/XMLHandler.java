package task2;

public class XMLHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("XML file is opened");
    }

    @Override
    void create() {
        System.out.println("XML file is created");
    }

    @Override
    void change() {
        System.out.println("XML file is changeg");
    }

    @Override
    void save() {
        System.out.println("XML file is saved");
    }
}
