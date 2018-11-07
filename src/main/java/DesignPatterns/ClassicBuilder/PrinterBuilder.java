package DesignPatterns.ClassicBuilder;

import DesignPatterns.ClassicBuilder.data.Printer;

public interface PrinterBuilder {
    public void buildPaper();
    public void buildPrinter();
    public Printer getPrinter();
}
