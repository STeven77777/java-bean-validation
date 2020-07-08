package edit.what.ever.service;

import edit.what.ever.model.WhatEverModel;
import org.apache.struts.edit.service.EditServiceInMemory;

public class EditWhatEverServiceInMemory implements EditWhatEverService{

    private  static WhatEverModel room;

    static {
        room = new WhatEverModel();
        room.setRoomId("001");
        room.setRoomName("P001");
        room.setRoomStatus("Empty");
        room.setRoomType("A");
        room.setPhoneNumber("000-999-2222");
        room.setUsed(false);
    }
    @Override
    public WhatEverModel getRoom() {
        return EditWhatEverServiceInMemory.room;
    }

    @Override
    public void saveRoom(WhatEverModel room) {
        EditWhatEverServiceInMemory.room.setRoomId(room.getRoomId());
        EditWhatEverServiceInMemory.room.setRoomName(room.getRoomName());
        EditWhatEverServiceInMemory.room.setRoomType(room.getRoomType());
        EditWhatEverServiceInMemory.room.setRoomStatus(room.getRoomStatus());
        EditWhatEverServiceInMemory.room.setUsed(room.isUsed());
        EditWhatEverServiceInMemory.room.setPhoneNumber(room.getPhoneNumber());

    }
}
