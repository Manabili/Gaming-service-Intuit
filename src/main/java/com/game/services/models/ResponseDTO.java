package com.game.services.models;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
public class ResponseDTO {
    private String userName;
    private String userEmail;
    private int gameScore;
    private Timestamp timeStamp;
}