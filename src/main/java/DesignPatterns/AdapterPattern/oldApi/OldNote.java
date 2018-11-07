package DesignPatterns.AdapterPattern.oldApi;

import java.util.ArrayList;
import java.util.List;

public class OldNote implements OldInterface{

    public List<String> noteList;

    public OldNote(){
        noteList = new ArrayList<>();
    }

    @Override
    public void addNote(String note) {
        noteList.add(note);
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