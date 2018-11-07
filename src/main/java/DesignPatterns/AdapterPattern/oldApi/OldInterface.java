package DesignPatterns.AdapterPattern.oldApi;

import java.util.List;

public interface OldInterface {
    void addNote(String note);
    void removeNote(String remove);
    List<String> getAllNotes();
}
