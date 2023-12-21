package seminar_6.notes.presentation.queries.views;
import seminar_6.database.NotesDatabase;
import seminar_6.notes.application.ConcreteNoteEditor;
import seminar_6.notes.application.interfaces.NotesPresenter;
import seminar_6.notes.domain.Note;
import seminar_6.notes.infrastructure.persistance.DatabaseContext;
import seminar_6.notes.presentation.queries.controllers.NotesController;

import java.util.Collection;
public class NotesConsolePresenter implements NotesPresenter {
    @Override
    public void printAll(Collection<Note> notes) {
        for (Note note: notes) {
            System.out.println(note);
        }
    }
}

