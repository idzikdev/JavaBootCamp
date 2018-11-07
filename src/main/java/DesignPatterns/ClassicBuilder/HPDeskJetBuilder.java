package DesignPatterns.ClassicBuilder;

import DesignPatterns.ClassicBuilder.data.Paper;
import DesignPatterns.ClassicBuilder.data.Printer;

public class HPDeskJetBuilder implements PrinterBuilder {

    private Printer printer;

    public HPDeskJetBuilder() {
        printer = new Printer();
    }

    @Override
    public void buildPaper() {
        Paper paper = new Paper();
        paper.setColor("white");
        paper.setCount(200);
        paper.setFormat("A4");

        printer.setPaper(paper);
    }

    @Override
    public void buildPrinter() {
        printer.setModel("HP");
        printer.setPagesPerMinute(5);

    }

    @Override
    public Printer getPrinter() {
        return printer;
    }
}
