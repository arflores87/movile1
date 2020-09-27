package activity.notepad;

import appiumControl.Button;
import appiumControl.TextBox;
import io.appium.java_client.pagefactory.Widget;
import org.openqa.selenium.By;

public class NoteManagerActivity {
    public TextBox Title;
    public TextBox Note;
    public Button saveButton;
    public  Button deleteButton;



    public NoteManagerActivity() {
        Title= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        Note= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        saveButton= new Button(By.xpath("//android.widget.TextView[@content-desc=\"Save\"]"));
        deleteButton= new Button(By.xpath("//android.widget.TextView[@content-desc=\"Delete\"]"));
   }


}
