package DesignPatterns.ClassicBuilder;

import DesignPatterns.ClassicBuilder.data.Paper;
import DesignPatterns.ClassicBuilder.data.Printer;

public class Brother implements PrinterBuilder {

    private Printer printer;

    public Brother() {
        printer = new Printer();
    }

    @Override
    public void buildPaper() {
        Paper paper = new Paper();
        paper.setColor("green");
        paper.setCount(250);
        paper.setFormat("A5");
        printer.setPaper(paper);
    }

    @Override
    public void buildPrinter() {
        printer.setModel("Brother g4");
        printer.setPagesPerMinute(15);
    }

    @Override
    public Printer getPrinter() {
        return printer;
    }
}
