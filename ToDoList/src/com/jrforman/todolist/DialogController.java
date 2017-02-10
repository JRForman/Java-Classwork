package com.jrforman.todolist;

import com.jrforman.todolist.datamodel.ToDoData;
import com.jrforman.todolist.datamodel.ToDoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

/**
 * Created by jason on 8/24/2016.
 */
public class DialogController {

    @FXML
    private TextField shortDescriptionField;

    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker datePicker;

    public ToDoItem processResults(){
        String shotDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = datePicker.getValue();

        ToDoItem newItem = new ToDoItem(shotDescription, details, deadlineValue);
        ToDoData.getInstance().addToDoItem(newItem);
        return newItem;
    }

}
