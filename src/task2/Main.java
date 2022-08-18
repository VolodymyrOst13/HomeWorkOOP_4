package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AbstractHandler doc = new DOCHandler();
        AbstractHandler txt = new TXTHandler();
        AbstractHandler xml = new XMLHandler();

        doc.open();
        doc.change();

        txt.create();
        txt.save();

        xml.change();
        xml.create();

    }
}
