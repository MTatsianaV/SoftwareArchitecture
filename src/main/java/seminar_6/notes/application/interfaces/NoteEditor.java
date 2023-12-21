package seminar_6.notes.application.interfaces;

import seminar_6.notes.domain.Note;

import java.util.Collection;
import java.util.Optional;

public interface NoteEditor {
    boolean add(Note note);

    boolean edit(Note item);

    boolean remove(Note note);
    void printAll();

    Optional<Note> getById(Integer integer);

    Collection<Note> getAll();
}
