package testClean;

import activity.notepad.MainActivity;
import activity.notepad.DeleteDialog;
import activity.notepad.NoteManagerActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class NoteManagerTest {
    DeleteDialog deleteDialog= new DeleteDialog();
    MainActivity mainActivity= new MainActivity();
    NoteManagerActivity noteManagerActivity= new NoteManagerActivity();
    @Test
    public void verifyCreateNote() throws MalformedURLException {
        String nameTitle="pruebas";
        String nameTitleUpdate="modificacion pruebas";
        String nameTitleNew="pruebas2";

        mainActivity.addNoteButton.click();
        noteManagerActivity.Title.type(nameTitle);
        noteManagerActivity.Note.type("prueba1");
        noteManagerActivity.saveButton.click();
        mainActivity.addUpdate.click();
        noteManagerActivity.Title.type(nameTitleUpdate);
        noteManagerActivity.Note.type("Texto modificado");
        noteManagerActivity.saveButton.click();
        mainActivity.addUpdate.click();
        noteManagerActivity.deleteButton.click();
        deleteDialog.deleteButton.click();
        mainActivity.addNoteButton.click();
        noteManagerActivity.Title.type(nameTitleNew);
        noteManagerActivity.Note.type("Nuevo");
        noteManagerActivity.saveButton.click();
        // Verificacion

        Assert.assertTrue("ERROR, el contacto no esta creado",mainActivity.isDisplayedTitle(nameTitleNew));
   }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
