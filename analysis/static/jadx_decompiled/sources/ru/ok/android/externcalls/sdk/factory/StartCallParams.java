package ru.ok.android.externcalls.sdk.factory;

import defpackage.dwe;
import defpackage.gy9;
import defpackage.m56;
import defpackage.rl;
import defpackage.uz1;
import defpackage.z84;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u00011B£\u0001\b\u0002\u0012\u000e\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u0004\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\u001f\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b\u000f\u00100¨\u00062"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/StartCallParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "opponentId", "", ApiProtocol.PARAM_PAYLOAD, "Ldwe;", "tokenProvider", "Lrl;", "tokenInfoProvider", "", ApiProtocol.PARAM_CHAT_ID, "", "isWatchTogetherEnabledForAll", "myId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Le5f;", "onPrepared", "", "onError", "Luz1;", "frameInterceptor", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Lgy9;", "cameraCapturerFactory", "shouldStartWithVideo", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Ljava/lang/String;Ldwe;Lrl;Ljava/lang/Long;ZLru/ok/android/externcalls/sdk/id/ParticipantId;Lm56;Lm56;Luz1;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lgy9;Z)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getOpponentId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Ljava/lang/String;", "getPayload", "()Ljava/lang/String;", "Ldwe;", "getTokenProvider", "()Ldwe;", "Lrl;", "getTokenInfoProvider", "()Lrl;", "Ljava/lang/Long;", "getChatId", "()Ljava/lang/Long;", "Z", "()Z", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class StartCallParams extends BaseCallParams<Builder, StartCallParams> {
    private final Long chatId;
    private final boolean isWatchTogetherEnabledForAll;
    private final ParticipantId opponentId;
    private final String payload;
    private final rl tokenInfoProvider;
    private final dwe tokenProvider;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00002\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0016\u0010$\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010&¨\u0006'"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/StartCallParams;", "<init>", "()V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "opponentId", "setOpponentId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "", ApiProtocol.PARAM_PAYLOAD, "setPayload", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "Ldwe;", "tokenProvider", "setTokenProvider", "(Ldwe;)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "Lrl;", "tokenInfoProvider", "setTokenInfoProvider", "(Lrl;)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "", "isEnabled", "setWatchTogetherEnabledForAll", "(Z)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "", ApiProtocol.PARAM_CHAT_ID, "setChatId", "(J)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "build", "()Lru/ok/android/externcalls/sdk/factory/StartCallParams;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Ljava/lang/String;", "Ldwe;", "Lrl;", "isWatchTogetherEnabledForAll", "Z", "Ljava/lang/Long;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder extends BaseCallParams.Builder<StartCallParams> {
        private Long chatId;
        private boolean isWatchTogetherEnabledForAll;
        private ParticipantId opponentId;
        private String payload;
        private rl tokenInfoProvider;
        private dwe tokenProvider;

        public final Builder setChatId(long chatId) {
            this.chatId = Long.valueOf(chatId);
            return this;
        }

        public final Builder setOpponentId(ParticipantId opponentId) {
            this.opponentId = opponentId;
            return this;
        }

        public final Builder setPayload(String payload) {
            this.payload = payload;
            return this;
        }

        public final Builder setTokenInfoProvider(rl tokenInfoProvider) {
            this.tokenInfoProvider = tokenInfoProvider;
            return this;
        }

        public final Builder setTokenProvider(dwe tokenProvider) {
            this.tokenProvider = tokenProvider;
            return this;
        }

        public final Builder setWatchTogetherEnabledForAll(boolean isEnabled) {
            this.isWatchTogetherEnabledForAll = isEnabled;
            return this;
        }

        @Override // ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder
        public StartCallParams build() {
            if (this.chatId == null && this.opponentId == null) {
                throw new IllegalArgumentException("target should exist: userId, callId or groupId");
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
            boolean shouldStartWithVideo = getShouldStartWithVideo();
            ConversationEventsListener eventListener = getEventListener();
            ParticipantId participantId = this.opponentId;
            Long l = this.chatId;
            String str = this.payload;
            getFrameInterceptor();
            return new StartCallParams(participantId, str, this.tokenProvider, this.tokenInfoProvider, l, this.isWatchTogetherEnabledForAll, myId, onPrepared, onError, null, eventListener, getCameraCapturerFactory(), shouldStartWithVideo, null);
        }
    }

    public /* synthetic */ StartCallParams(ParticipantId participantId, String str, dwe dweVar, rl rlVar, Long l, boolean z, ParticipantId participantId2, m56 m56Var, m56 m56Var2, uz1 uz1Var, ConversationEventsListener conversationEventsListener, gy9 gy9Var, boolean z2, z84 z84Var) {
        this(participantId, str, dweVar, rlVar, l, z, participantId2, m56Var, m56Var2, uz1Var, conversationEventsListener, gy9Var, z2);
    }

    public final Long getChatId() {
        return this.chatId;
    }

    public final ParticipantId getOpponentId() {
        return this.opponentId;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final rl getTokenInfoProvider() {
        return this.tokenInfoProvider;
    }

    public final dwe getTokenProvider() {
        return this.tokenProvider;
    }

    /* renamed from: isWatchTogetherEnabledForAll, reason: from getter */
    public final boolean getIsWatchTogetherEnabledForAll() {
        return this.isWatchTogetherEnabledForAll;
    }

    private StartCallParams(ParticipantId participantId, String str, dwe dweVar, rl rlVar, Long l, boolean z, ParticipantId participantId2, m56 m56Var, m56 m56Var2, uz1 uz1Var, ConversationEventsListener conversationEventsListener, gy9 gy9Var, boolean z2) {
        super(participantId2, conversationEventsListener, m56Var, m56Var2, z2, uz1Var, gy9Var);
        this.opponentId = participantId;
        this.payload = str;
        this.tokenProvider = dweVar;
        this.tokenInfoProvider = rlVar;
        this.chatId = l;
        this.isWatchTogetherEnabledForAll = z;
    }
}
