package seminar_6;

import seminar_6.database.NotesDatabase;
import seminar_6.notes.application.ConcreteNoteEditor;
import seminar_6.notes.application.interfaces.NoteEditor;
import seminar_6.notes.application.interfaces.NotesPresenter;
import seminar_6.notes.domain.Note;
import seminar_6.notes.infrastructure.persistance.DatabaseContext;
import seminar_6.notes.presentation.queries.controllers.NotesController;
import seminar_6.notes.presentation.queries.views.NotesConsolePresenter;
import seminar_6.notes.presentation.queries.views.Presenter;

import java.util.Date;

public class Program {
    public static <NotesEditor> void main(String[] args) {
        NotesPresenter presenter = new NotesConsolePresenter();
        DatabaseContext databaseContext = new DatabaseContext(new NotesDatabase());
        NotesEditor notesEditor = (NotesEditor) new ConcreteNoteEditor(presenter, databaseContext);
        NotesController notesController = new NotesController((NoteEditor) notesEditor);
        Note note = new Note(111, 2, "Title", "Content", new Date());;
        notesController.routeAddNote(note);
        notesController.routeGetAll();
        notesController.routeRemoveNote(note);
        notesController.routeGetAll();
    }
}