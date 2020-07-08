package edit.what.ever.model;

public class RoomType {
        private String roomTypeId;
        private String roomTypeName;

    public String getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName;
    }

    public RoomType() {
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "roomTypeId='" + roomTypeId + '\'' +
                ", roomTypeName='" + roomTypeName + '\'' +
                '}';
    }
}
