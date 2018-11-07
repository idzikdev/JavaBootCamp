package DesignPatterns.AdapterPattern;

import DesignPatterns.AdapterPattern.newApi.NewNote;
import DesignPatterns.AdapterPattern.oldApi.OldInterface;

import java.util.ArrayList;
import java.util.List;

public class NoteAdapter implements OldInterface {



    public List<String> noteList;
    public NewNote newNote;


    public NoteAdapter(){
        noteList = new ArrayList<>();
        newNote = new NewNote();
    }

    @Override
    public void addNote(String note) {
        noteList.add(note);
        newNote.addNote(note, null);
    }

    @Override
    public void removeNote(String remove) {
        noteList.remove(remove);
    }

    @Override
    public List<String> getAllNotes() {
        return noteList;
    }

    public void addNote(String note, String toWho){
        noteList.add(note+" "+toWho);
        newNote.addNote(note, toWho);
    }

}
