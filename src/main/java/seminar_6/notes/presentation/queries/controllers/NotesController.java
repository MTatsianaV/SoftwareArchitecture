package seminar_6.notes.presentation.queries.controllers;

import seminar_6.notes.application.interfaces.NoteEditor;
import seminar_6.notes.domain.Note;

public class NotesController extends Controller {


    private final NoteEditor notesEditor;

    public NotesController(NoteEditor notesEditor){
        this.notesEditor = notesEditor;
    }

    public void routeAddNote(Note note) {
        this.notesEditor.add(note);
    }

    public void routeRemoveNote(Note note) {
        this.notesEditor.remove(note);
    }

    public void routeGetAll(){
        notesEditor.printAll();
    }


}
