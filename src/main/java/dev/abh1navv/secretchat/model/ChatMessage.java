package dev.abh1navv.secretchat.model;

public record ChatMessage(MessageType type, String content, String sender) {
    public enum MessageType {
        CHAT, LEAVE, JOIN;
    }
}

