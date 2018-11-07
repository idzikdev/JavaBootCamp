package DesignPatterns.AdapterPattern.newApi;

import java.util.List;

public interface NewInterface {
    void addNote(String note, String toWho);
    void removeNote(String remove);
    List<String> getAllNotes();
}
