package DesignPatterns.ClassicBuilder;

import DesignPatterns.ClassicBuilder.data.Printer;

public class TestBuilder {
    public static void main(String[] args) {
        PrinterBuilder hp = new HPDeskJetBuilder();
        PrinterDirector director1 = new PrinterDirector(hp);
        director1.makePrinter();
        Printer hpPrinter = director1.getPrinter();
        System.out.println(hpPrinter.getPaper().getColor());


        PrinterBuilder brother = new Brother();
        PrinterDirector director2 = new PrinterDirector(brother);
        director2.makePrinter();
        Printer brotherPrinter = director2.getPrinter();
        System.out.println(brotherPrinter.getPaper().getColor());
    }
}
