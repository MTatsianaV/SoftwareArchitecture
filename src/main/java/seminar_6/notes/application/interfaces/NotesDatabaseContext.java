package seminar_6.notes.application.interfaces;

import seminar_6.notes.domain.Note;

import java.util.Collection;

public interface NotesDatabaseContext {

    Collection<Note> getAll();
    boolean saveChanges();

}
