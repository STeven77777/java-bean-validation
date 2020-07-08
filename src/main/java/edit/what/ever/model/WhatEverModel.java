package edit.what.ever.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Arrays;

public class WhatEverModel {
    @NotBlank(message="roomId.required")
    private String roomId;

    @NotBlank(message="roomName.required")
    private String roomName;

    @NotBlank(message = "roomStatus.required")
    private String roomStatus;

    @NotBlank(message = "roomType.required")
    private String roomType;

    private boolean used;

    @Pattern(regexp="\\d{3}-\\d{3}-\\d{4}", message="phoneNumber.required")
    private String phoneNumber;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "WhatEverModel{" +
                "roomId='" + roomId + '\'' +
                ", roomName='" + roomName + '\'' +
                ", roomStatus='" + roomStatus + '\'' +
                ", roomType='" + roomType + '\'' +
                ", used=" + used +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
