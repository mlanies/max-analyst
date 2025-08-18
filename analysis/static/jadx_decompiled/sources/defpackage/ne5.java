package defpackage;

/* loaded from: classes2.dex */
public enum ne5 {
    MESSAGE("Message"),
    CHAT_MESSAGE("ChatMessage"),
    CHANNEL_MESSAGE("ChatMessage-channel"),
    CHAT_SYSTEM_MESSAGE("ChatSystemMessage"),
    CHAT_REPLY("ChatReply"),
    GROUP_CHAT("GroupChat"),
    SCHEDULED("Scheduled"),
    UNKNOWN("Unknown");

    public static final ne5[] b = values();
    public final String a;

    ne5(String str) {
        this.a = str;
    }
}
