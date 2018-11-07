package DesignPatterns.ClassicBuilder;

import DesignPatterns.ClassicBuilder.data.Printer;

public class PrinterDirector {
    private PrinterBuilder printerBuilder;

    public PrinterDirector(PrinterBuilder printerBuilder) {

        this.printerBuilder = printerBuilder;
    }

    public void makePrinter() {
        printerBuilder.buildPaper();
        printerBuilder.buildPrinter();
    }

    public Printer getPrinter() {
        return printerBuilder.getPrinter();
    }
}
