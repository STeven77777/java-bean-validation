package edit.what.ever.action;

import com.opensymphony.xwork2.ActionSupport;
import edit.what.ever.model.WhatEverModel;
import edit.what.ever.service.EditWhatEverService;
import edit.what.ever.service.EditWhatEverServiceInMemory;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EditWhatEverAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private EditWhatEverService editService = new EditWhatEverServiceInMemory();


    public List<String> getRoomStatus() {
        return Arrays.asList(roomStatus);
    }

    private String[] roomStatus = {"Empty", "Hired", "UnUsed"};




    @Valid
    private WhatEverModel room;

    public WhatEverModel getRoom() {
        return room;
    }

    public void setRoom(WhatEverModel room) {
        this.room = room;
    }

    public String input() throws Exception {
        setRoom(editService.getRoom());
        return INPUT;
    }

    public String execute() throws Exception {
        editService.saveRoom(getRoom());
        return SUCCESS;
    }
}
