package DesignPatterns.AdapterPattern;

public class TestAdapter {
    public static void main(String[] args) {
        NoteAdapter note = new NoteAdapter();
        note.addNote("Dziś jest piękny dzień, zajmujemy się wzorcami :)");
        note.addNote("Odebrać dzieciaka z przedszkola!");
        note.addNote("Moja notatka", "Do mamy");

        // wydrukuj wszystkie notatki

        for(String s : note.getAllNotes()){
            System.out.println(s);
        }
    }
}
