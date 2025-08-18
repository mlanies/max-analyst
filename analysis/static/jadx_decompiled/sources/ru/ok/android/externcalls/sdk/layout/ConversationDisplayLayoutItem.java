package ru.ok.android.externcalls.sdk.layout;

import defpackage.bff;

/* loaded from: classes2.dex */
public final class ConversationDisplayLayoutItem {
    private final bff layout;
    private final ConversationVideoTrackParticipantKey videoTrackParticipantKey;

    public ConversationDisplayLayoutItem(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, bff bffVar) {
        this.videoTrackParticipantKey = conversationVideoTrackParticipantKey;
        this.layout = bffVar;
    }

    public bff getLayout() {
        return this.layout;
    }

    public ConversationVideoTrackParticipantKey getVideoTrackParticipantKey() {
        return this.videoTrackParticipantKey;
    }
}
