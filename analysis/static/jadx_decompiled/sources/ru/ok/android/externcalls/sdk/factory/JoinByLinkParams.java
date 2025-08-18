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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001'B\u0089\u0001\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b&\u0010\u001f¨\u0006("}, d2 = {"Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", "", "link", "Ldwe;", "tokenProvider", "Lrl;", "tokenInfoProvider", ApiProtocol.PARAM_PAYLOAD, "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "myId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Le5f;", "onPrepared", "", "onError", "", "shouldStartWithVideo", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Luz1;", "frameInterceptor", "Lgy9;", "cameraCapturerFactory", "<init>", "(Ljava/lang/String;Ldwe;Lrl;Ljava/lang/String;Lru/ok/android/externcalls/sdk/id/ParticipantId;Lm56;Lm56;ZLru/ok/android/externcalls/sdk/events/ConversationEventsListener;Luz1;Lgy9;)V", "Ljava/lang/String;", "getLink", "()Ljava/lang/String;", "Ldwe;", "getTokenProvider", "()Ldwe;", "Lrl;", "getTokenInfoProvider", "()Lrl;", "getPayload", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class JoinByLinkParams extends BaseCallParams<Builder, JoinByLinkParams> {
    private final String link;
    private final String payload;
    private final rl tokenInfoProvider;
    private final dwe tokenProvider;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams;", "<init>", "()V", "Ldwe;", "tokenProvider", "setTokenProvider", "(Ldwe;)Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", "Lrl;", "tokenInfoProvider", "setTokenInfoProvider", "(Lrl;)Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", "", "link", "setLink", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams$Builder;", ApiProtocol.PARAM_PAYLOAD, "setPayload", "build", "()Lru/ok/android/externcalls/sdk/factory/JoinByLinkParams;", "Ljava/lang/String;", "Ldwe;", "Lrl;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder extends BaseCallParams.Builder<JoinByLinkParams> {
        private String link;
        private String payload;
        private rl tokenInfoProvider;
        private dwe tokenProvider;

        public final Builder setLink(String link) {
            this.link = link;
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

        @Override // ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder
        public JoinByLinkParams build() {
            String str = this.link;
            if (str == null) {
                throw new IllegalArgumentException("Link is required".toString());
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
            return new JoinByLinkParams(str, this.tokenProvider, this.tokenInfoProvider, this.payload, myId, onPrepared, onError, shouldStartWithVideo, eventListener, null, getCameraCapturerFactory(), null);
        }
    }

    public /* synthetic */ JoinByLinkParams(String str, dwe dweVar, rl rlVar, String str2, ParticipantId participantId, m56 m56Var, m56 m56Var2, boolean z, ConversationEventsListener conversationEventsListener, uz1 uz1Var, gy9 gy9Var, z84 z84Var) {
        this(str, dweVar, rlVar, str2, participantId, m56Var, m56Var2, z, conversationEventsListener, uz1Var, gy9Var);
    }

    public final String getLink() {
        return this.link;
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

    private JoinByLinkParams(String str, dwe dweVar, rl rlVar, String str2, ParticipantId participantId, m56 m56Var, m56 m56Var2, boolean z, ConversationEventsListener conversationEventsListener, uz1 uz1Var, gy9 gy9Var) {
        super(participantId, conversationEventsListener, m56Var, m56Var2, z, uz1Var, gy9Var);
        this.link = str;
        this.tokenProvider = dweVar;
        this.tokenInfoProvider = rlVar;
        this.payload = str2;
    }
}
