package ru.ok.android.externcalls.sdk.factory;

import defpackage.gy9;
import defpackage.m56;
import defpackage.uz1;
import defpackage.z84;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 Bu\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/JoinCallParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/JoinCallParams$Builder;", "", ApiProtocol.PARAM_CONVERSATION_ID, "", ApiProtocol.PARAM_CHAT_ID, "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "myId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Le5f;", "onPrepared", "", "onError", "", "shouldStartWithVideo", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Luz1;", "frameInterceptor", "Lgy9;", "cameraCapturerFactory", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lm56;Lm56;ZLru/ok/android/externcalls/sdk/events/ConversationEventsListener;Luz1;Lgy9;)V", "Ljava/lang/String;", "getConversationId", "()Ljava/lang/String;", "Ljava/lang/Long;", "getChatId", "()Ljava/lang/Long;", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class JoinCallParams extends BaseCallParams<Builder, JoinCallParams> {
    private final Long chatId;
    private final String conversationId;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\u0002H\u0016J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/JoinCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/JoinCallParams;", "()V", ApiProtocol.PARAM_CHAT_ID, "", "Ljava/lang/Long;", ApiProtocol.PARAM_CONVERSATION_ID, "", "build", "setChatId", "setConversationId", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder extends BaseCallParams.Builder<JoinCallParams> {
        private Long chatId;
        private String conversationId;

        public final Builder setChatId(long chatId) {
            this.chatId = Long.valueOf(chatId);
            return this;
        }

        public final Builder setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        @Override // ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder
        public JoinCallParams build() {
            String str = this.conversationId;
            if (str == null) {
                throw new IllegalArgumentException("Conversation id is required".toString());
            }
            ParticipantId myId = getMyId();
            if (myId == null) {
                throw new IllegalArgumentException("Caller id is required".toString());
            }
            m56 onPrepared = getOnPrepared();
            if (onPrepared == null) {
                throw new IllegalArgumentException("onPrepared callback is required".toString());
            }
            m56 onError = getOnError();
            if (onError == null) {
                throw new IllegalArgumentException("onError callback is required".toString());
            }
            ConversationEventsListener eventListener = getEventListener();
            boolean shouldStartWithVideo = getShouldStartWithVideo();
            getFrameInterceptor();
            return new JoinCallParams(str, this.chatId, myId, onPrepared, onError, shouldStartWithVideo, eventListener, null, getCameraCapturerFactory(), null);
        }
    }

    public /* synthetic */ JoinCallParams(String str, Long l, ParticipantId participantId, m56 m56Var, m56 m56Var2, boolean z, ConversationEventsListener conversationEventsListener, uz1 uz1Var, gy9 gy9Var, z84 z84Var) {
        this(str, l, participantId, m56Var, m56Var2, z, conversationEventsListener, uz1Var, gy9Var);
    }

    public final Long getChatId() {
        return this.chatId;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    private JoinCallParams(String str, Long l, ParticipantId participantId, m56 m56Var, m56 m56Var2, boolean z, ConversationEventsListener conversationEventsListener, uz1 uz1Var, gy9 gy9Var) {
        super(participantId, conversationEventsListener, m56Var, m56Var2, z, uz1Var, gy9Var);
        this.conversationId = str;
        this.chatId = l;
    }
}
