package DesignPatterns.AdapterPattern.newApi;

import java.util.ArrayList;
import java.util.List;

public class NewNote implements NewInterface {

    public List<String> noteList;

    public NewNote(){
        noteList = new ArrayList<>();
    }

    @Override
    public void addNote(String note, String toWho) {
        noteList.add(note + " || " + toWho);
    }

    @Override
    public void removeNote(String remove) {
        noteList.remove(remove);
    }

    @Override
    public List<String> getAllNotes() {
        return noteList;
    }
}
