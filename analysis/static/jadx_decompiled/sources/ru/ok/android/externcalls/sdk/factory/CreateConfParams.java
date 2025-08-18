package ru.ok.android.externcalls.sdk.factory;

import defpackage.dwe;
import defpackage.gy9;
import defpackage.m56;
import defpackage.nz4;
import defpackage.rl;
import defpackage.uz1;
import defpackage.z84;
import java.util.Collection;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001.B£\u0001\b\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\n\u0010\u0011\u001a\u00060\u0004j\u0002`\u0005\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00140\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fR!\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b\u000e\u0010-R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b\u000f\u0010-¨\u0006/"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/CreateConfParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "initialIds", "Ldwe;", "tokenProvider", "Lrl;", "tokenInfoProvider", "", ApiProtocol.PARAM_PAYLOAD, "", "isAnonForbidden", "isWatchTogetherEnabledForAll", "shouldStartWithVideo", "myId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Le5f;", "onPrepared", "", "onError", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Luz1;", "frameInterceptor", "Lgy9;", "cameraCapturerFactory", "<init>", "(Ljava/util/Collection;Ldwe;Lrl;Ljava/lang/String;ZZZLru/ok/android/externcalls/sdk/id/ParticipantId;Lm56;Lm56;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Luz1;Lgy9;)V", "Ljava/util/Collection;", "getInitialIds", "()Ljava/util/Collection;", "Ldwe;", "getTokenProvider", "()Ldwe;", "Lrl;", "getTokenInfoProvider", "()Lrl;", "Ljava/lang/String;", "getPayload", "()Ljava/lang/String;", "Z", "()Z", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CreateConfParams extends BaseCallParams<Builder, CreateConfParams> {
    private final Collection<ParticipantId> initialIds;
    private final boolean isAnonForbidden;
    private final boolean isWatchTogetherEnabledForAll;
    private final String payload;
    private final rl tokenInfoProvider;
    private final dwe tokenProvider;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00002\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u000eJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010 R \u0010\b\u001a\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010#R\u0016\u0010\u001b\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010#¨\u0006$"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/CreateConfParams;", "<init>", "()V", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "initialIds", "setInitialIds", "(Ljava/util/Collection;)Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "", "isAnonForbidden", "setAnonForbidden", "(Z)Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "", ApiProtocol.PARAM_PAYLOAD, "setPayload", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "Ldwe;", "tokenProvider", "setTokenProvider", "(Ldwe;)Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "Lrl;", "tokenInfoProvider", "setTokenInfoProvider", "(Lrl;)Lru/ok/android/externcalls/sdk/factory/CreateConfParams$Builder;", "isWatchTogetherEnabledForAll", "setWatchTogetherEnabledForAll", "build", "()Lru/ok/android/externcalls/sdk/factory/CreateConfParams;", "Ldwe;", "Lrl;", "Ljava/util/Collection;", "Ljava/lang/String;", "Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder extends BaseCallParams.Builder<CreateConfParams> {
        private boolean isAnonForbidden;
        private String payload;
        private rl tokenInfoProvider;
        private dwe tokenProvider;
        private Collection<ParticipantId> initialIds = nz4.a;
        private boolean isWatchTogetherEnabledForAll = true;

        public final Builder setAnonForbidden(boolean isAnonForbidden) {
            this.isAnonForbidden = isAnonForbidden;
            return this;
        }

        public final Builder setInitialIds(Collection<ParticipantId> initialIds) {
            this.initialIds = initialIds;
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

        public final Builder setWatchTogetherEnabledForAll(boolean isWatchTogetherEnabledForAll) {
            this.isWatchTogetherEnabledForAll = isWatchTogetherEnabledForAll;
            return this;
        }

        @Override // ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder
        public CreateConfParams build() {
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
            dwe dweVar = this.tokenProvider;
            rl rlVar = this.tokenInfoProvider;
            boolean z = this.isAnonForbidden;
            return new CreateConfParams(this.initialIds, dweVar, rlVar, this.payload, z, this.isWatchTogetherEnabledForAll, shouldStartWithVideo, myId, onPrepared, onError, eventListener, null, getCameraCapturerFactory(), null);
        }
    }

    public /* synthetic */ CreateConfParams(Collection collection, dwe dweVar, rl rlVar, String str, boolean z, boolean z2, boolean z3, ParticipantId participantId, m56 m56Var, m56 m56Var2, ConversationEventsListener conversationEventsListener, uz1 uz1Var, gy9 gy9Var, z84 z84Var) {
        this(collection, dweVar, rlVar, str, z, z2, z3, participantId, m56Var, m56Var2, conversationEventsListener, uz1Var, gy9Var);
    }

    public final Collection<ParticipantId> getInitialIds() {
        return this.initialIds;
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

    /* renamed from: isAnonForbidden, reason: from getter */
    public final boolean getIsAnonForbidden() {
        return this.isAnonForbidden;
    }

    /* renamed from: isWatchTogetherEnabledForAll, reason: from getter */
    public final boolean getIsWatchTogetherEnabledForAll() {
        return this.isWatchTogetherEnabledForAll;
    }

    private CreateConfParams(Collection<ParticipantId> collection, dwe dweVar, rl rlVar, String str, boolean z, boolean z2, boolean z3, ParticipantId participantId, m56 m56Var, m56 m56Var2, ConversationEventsListener conversationEventsListener, uz1 uz1Var, gy9 gy9Var) {
        super(participantId, conversationEventsListener, m56Var, m56Var2, z3, uz1Var, gy9Var);
        this.initialIds = collection;
        this.tokenProvider = dweVar;
        this.tokenInfoProvider = rlVar;
        this.payload = str;
        this.isAnonForbidden = z;
        this.isWatchTogetherEnabledForAll = z2;
    }
}
