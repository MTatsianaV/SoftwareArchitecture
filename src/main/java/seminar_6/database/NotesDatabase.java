package seminar_6.database;

import seminar_6.notes.infrastructure.persistance.Database;

public class NotesDatabase implements Database {

    private NotesTable notesTable = new NotesTable();

    public NotesTable getNotesTable() {
        return notesTable;
    }

}
