package ru.ok.android.externcalls.sdk.factory;

import defpackage.gy9;
import defpackage.k56;
import defpackage.m56;
import defpackage.nj3;
import defpackage.oj3;
import defpackage.rj3;
import defpackage.uz1;
import defpackage.yh0;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b&\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004:\u0001+Bc\b\u0004\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "B", "T", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "myId", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Le5f;", "onPrepared", "", "onError", "", "shouldStartWithVideo", "Luz1;", "frameInterceptor", "Lgy9;", "cameraCapturerFactory", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lm56;Lm56;ZLuz1;Lgy9;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getMyId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "getEventListener", "()Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "Lm56;", "getOnPrepared", "()Lm56;", "getOnError", "Z", "getShouldStartWithVideo", "()Z", "Luz1;", "getFrameInterceptor", "()Luz1;", "Lgy9;", "getCameraCapturerFactory", "()Lgy9;", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class BaseCallParams<B extends Builder<T>, T> {
    private final gy9 cameraCapturerFactory;
    private final ConversationEventsListener eventListener;
    private final uz1 frameInterceptor;
    private final ParticipantId myId;
    private final m56 onError;
    private final m56 onPrepared;
    private final boolean shouldStartWithVideo;

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018¢\u0006\u0004\b\u0016\u0010\u0019J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u001aH\u0007¢\u0006\u0004\b\u0016\u0010\u001bJ\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u0016\u0010\u001dJ'\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b \u0010\u0017J!\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018¢\u0006\u0004\b \u0010\u0019J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00028\u0002H&¢\u0006\u0004\b)\u0010*R*\u0010+\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b\b\u0010/R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102\"\u0004\b\f\u00103R$\u00104\u001a\u0004\u0018\u00010\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b\u0010\u00108R0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u00109\u001a\u0004\b:\u0010;\"\u0004\b\u0016\u0010<R0\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001f\u00109\u001a\u0004\b=\u0010;\"\u0004\b \u0010<R\"\u0010&\u001a\u00020%8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b&\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010\"\u001a\u0004\u0018\u00010!8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\"\u0010C\u001a\u0004\bD\u0010E\"\u0004\b#\u0010F¨\u0006G"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "T", "", "<init>", "()V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "callerId", "setMyId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "setEventListener", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lgy9;", "factory", "setCameraCapturerFactory", "(Lgy9;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Le5f;", "onPrepared", "setOnPrepared", "(Lm56;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lrj3;", "(Lrj3;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lkotlin/Function0;", "(Lk56;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Ljava/lang/Runnable;", "(Ljava/lang/Runnable;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "", "onError", "setOnError", "Luz1;", "frameInterceptor", "setFrameInterceptor", "(Luz1;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "", "shouldStartWithVideo", "setStartWithVideo", "(Z)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "build", "()Ljava/lang/Object;", "myId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getMyId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "getEventListener", "()Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;)V", "cameraCapturerFactory", "Lgy9;", "getCameraCapturerFactory", "()Lgy9;", "(Lgy9;)V", "Lm56;", "getOnPrepared", "()Lm56;", "(Lm56;)V", "getOnError", "Z", "getShouldStartWithVideo", "()Z", "setShouldStartWithVideo", "(Z)V", "Luz1;", "getFrameInterceptor", "()Luz1;", "(Luz1;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static abstract class Builder<T> {
        private gy9 cameraCapturerFactory;
        private ConversationEventsListener eventListener;
        private uz1 frameInterceptor;
        private ParticipantId myId;
        private m56 onError;
        private m56 onPrepared;
        private boolean shouldStartWithVideo;

        public abstract T build();

        public final gy9 getCameraCapturerFactory() {
            return this.cameraCapturerFactory;
        }

        public final ConversationEventsListener getEventListener() {
            return this.eventListener;
        }

        public final uz1 getFrameInterceptor() {
            return null;
        }

        public final ParticipantId getMyId() {
            return this.myId;
        }

        public final m56 getOnError() {
            return this.onError;
        }

        public final m56 getOnPrepared() {
            return this.onPrepared;
        }

        public final boolean getShouldStartWithVideo() {
            return this.shouldStartWithVideo;
        }

        /* renamed from: setCameraCapturerFactory, reason: collision with other method in class */
        public final void m107setCameraCapturerFactory(gy9 gy9Var) {
            this.cameraCapturerFactory = gy9Var;
        }

        /* renamed from: setEventListener, reason: collision with other method in class */
        public final void m108setEventListener(ConversationEventsListener conversationEventsListener) {
            this.eventListener = conversationEventsListener;
        }

        /* renamed from: setFrameInterceptor, reason: collision with other method in class */
        public final void m109setFrameInterceptor(uz1 uz1Var) {
        }

        /* renamed from: setMyId, reason: collision with other method in class */
        public final void m110setMyId(ParticipantId participantId) {
            this.myId = participantId;
        }

        /* renamed from: setOnError, reason: collision with other method in class */
        public final void m111setOnError(m56 m56Var) {
            this.onError = m56Var;
        }

        public final Builder<T> setOnPrepared(Runnable onPrepared) {
            setOnPrepared(onPrepared == null ? new nj3(0) : new oj3(0, onPrepared));
            return this;
        }

        public final void setShouldStartWithVideo(boolean z) {
            this.shouldStartWithVideo = z;
        }

        public final Builder<T> setStartWithVideo(boolean shouldStartWithVideo) {
            this.shouldStartWithVideo = shouldStartWithVideo;
            return this;
        }

        public final Builder<T> setCameraCapturerFactory(gy9 factory) {
            this.cameraCapturerFactory = factory;
            return this;
        }

        public final Builder<T> setEventListener(ConversationEventsListener eventListener) {
            this.eventListener = eventListener;
            return this;
        }

        public final Builder<T> setFrameInterceptor(uz1 frameInterceptor) {
            return this;
        }

        public final Builder<T> setMyId(ParticipantId callerId) {
            this.myId = callerId;
            return this;
        }

        public final Builder<T> setOnError(m56 onError) {
            this.onError = onError;
            return this;
        }

        public final Builder<T> setOnError(rj3 onError) {
            this.onError = new BaseCallParams$Builder$setOnError$2$1(onError);
            return this;
        }

        /* renamed from: setOnPrepared, reason: collision with other method in class */
        public final void m112setOnPrepared(m56 m56Var) {
            this.onPrepared = m56Var;
        }

        public final Builder<T> setOnPrepared(m56 onPrepared) {
            this.onPrepared = onPrepared;
            return this;
        }

        public final Builder<T> setOnPrepared(rj3 onPrepared) {
            this.onPrepared = new BaseCallParams$Builder$setOnPrepared$2$1(onPrepared);
            return this;
        }

        public final Builder<T> setOnPrepared(k56 onPrepared) {
            setOnPrepared(new oj3(0, new yh0(0, onPrepared)));
            return this;
        }
    }

    public BaseCallParams(ParticipantId participantId, ConversationEventsListener conversationEventsListener, m56 m56Var, m56 m56Var2, boolean z, uz1 uz1Var, gy9 gy9Var) {
        this.myId = participantId;
        this.eventListener = conversationEventsListener;
        this.onPrepared = m56Var;
        this.onError = m56Var2;
        this.shouldStartWithVideo = z;
        this.cameraCapturerFactory = gy9Var;
    }

    public final gy9 getCameraCapturerFactory() {
        return this.cameraCapturerFactory;
    }

    public final ConversationEventsListener getEventListener() {
        return this.eventListener;
    }

    public final uz1 getFrameInterceptor() {
        return null;
    }

    public final ParticipantId getMyId() {
        return this.myId;
    }

    public final m56 getOnError() {
        return this.onError;
    }

    public final m56 getOnPrepared() {
        return this.onPrepared;
    }

    public final boolean getShouldStartWithVideo() {
        return this.shouldStartWithVideo;
    }
}
