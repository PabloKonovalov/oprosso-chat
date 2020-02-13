package com.example.websocketdemo.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ChatMessage {

    /**
     * Тип сообщения
     */
    private MessageType type;

    /**
     * Содержимое сообщения
     */
    private String content;

    /**
     * Отправитель/получатель
     */
    private String sender;
    private String receiver;

    /**
     * Время отправки сообщения
     */
    private LocalDateTime dateTime = LocalDateTime.now();

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE,
        TYPING
    }
}
