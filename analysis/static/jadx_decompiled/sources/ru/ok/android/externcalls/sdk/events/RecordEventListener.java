package ru.ok.android.externcalls.sdk.events;

import ru.ok.android.externcalls.sdk.ConversationParticipant;

/* loaded from: classes2.dex */
public interface RecordEventListener {
    default void onRecordDataChanged() {
    }

    default void onRecordError(String str) {
    }

    default void onRecordStarted() {
    }

    default void onRecordStopped(ConversationParticipant conversationParticipant) {
    }
}
