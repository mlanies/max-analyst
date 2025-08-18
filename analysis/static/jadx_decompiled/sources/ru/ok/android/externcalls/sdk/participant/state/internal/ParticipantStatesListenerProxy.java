package ru.ok.android.externcalls.sdk.participant.state.internal;

import android.os.Handler;
import android.os.SystemClock;
import defpackage.nn6;
import defpackage.x53;
import defpackage.z84;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR8\u0010\"\u001a&\u0012\b\u0012\u00060\u001ej\u0002`\u001f\u0012\u0004\u0012\u00020 0\u001dj\u0012\u0012\b\u0012\u00060\u001ej\u0002`\u001f\u0012\u0004\u0012\u00020 `!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesListenerProxy;", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$Listener;", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager;", "manager", "Landroid/os/Handler;", "mainThreadHandler", "<init>", "(Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager;Landroid/os/Handler;)V", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$StateChangedEvent;", "event", "Le5f;", "accumulate", "(Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$StateChangedEvent;)V", "merge", "()Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$StateChangedEvent;", "raise", "onParticipantStateChanged", "(Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager;Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$StateChangedEvent;)V", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$Listener;)V", "removeListener", "release", "()V", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager;", "Landroid/os/Handler;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/HashMap;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$ParticipantStateChange;", "Lkotlin/collections/HashMap;", "accumulator", "Ljava/util/HashMap;", "", "lastRaiseTime", "J", "", "scheduleNextRaise", "Z", "Ljava/lang/Runnable;", "raiseRunnable", "Ljava/lang/Runnable;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ParticipantStatesListenerProxy implements ParticipantStatesManager.Listener {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final long RAISE_INTERVAL = 10;

    @Deprecated
    public static final long RAISE_TIMEOUT = 200;
    private long lastRaiseTime;
    private final Handler mainThreadHandler;
    private final ParticipantStatesManager manager;
    private final CopyOnWriteArrayList<ParticipantStatesManager.Listener> listeners = new CopyOnWriteArrayList<>();
    private final HashMap<ParticipantId, ParticipantStatesManager.ParticipantStateChange> accumulator = new HashMap<>();
    private boolean scheduleNextRaise = true;
    private final Runnable raiseRunnable = new nn6(23, this);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesListenerProxy$Companion;", "", "()V", "RAISE_INTERVAL", "", "RAISE_TIMEOUT", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    public ParticipantStatesListenerProxy(ParticipantStatesManager participantStatesManager, Handler handler) {
        this.manager = participantStatesManager;
        this.mainThreadHandler = handler;
    }

    private final void accumulate(ParticipantStatesManager.StateChangedEvent event) {
        for (ParticipantStatesManager.ParticipantStateChange participantStateChange : event.getChanges()) {
            ParticipantStatesManager.ParticipantStateChange participantStateChange2 = this.accumulator.get(participantStateChange.getParticipantId());
            if (participantStateChange2 == null) {
                this.accumulator.put(participantStateChange.getParticipantId(), participantStateChange);
            } else if (participantStateChange2.isOn() == participantStateChange.isOn()) {
                this.accumulator.put(participantStateChange.getParticipantId(), participantStateChange);
            } else {
                this.accumulator.remove(participantStateChange.getParticipantId());
            }
        }
    }

    private final ParticipantStatesManager.StateChangedEvent merge() {
        ParticipantStatesManager.StateChangedEvent stateChangedEvent = new ParticipantStatesManager.StateChangedEvent(x53.D0(this.accumulator.values()));
        this.accumulator.clear();
        return stateChangedEvent;
    }

    private final void raise(ParticipantStatesManager.StateChangedEvent event) {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((ParticipantStatesManager.Listener) it.next()).onParticipantStateChanged(this.manager, event);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void raiseRunnable$lambda$0(ParticipantStatesListenerProxy participantStatesListenerProxy) {
        ParticipantStatesManager.StateChangedEvent stateChangedEventMerge = participantStatesListenerProxy.merge();
        if (stateChangedEventMerge.getChanges().isEmpty()) {
            return;
        }
        participantStatesListenerProxy.raise(stateChangedEventMerge);
        participantStatesListenerProxy.lastRaiseTime = SystemClock.elapsedRealtime();
        participantStatesListenerProxy.scheduleNextRaise = true;
    }

    public final void addListener(ParticipantStatesManager.Listener listener) {
        if (this.listeners.contains(listener)) {
            return;
        }
        this.listeners.add(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.Listener
    public void onParticipantStateChanged(ParticipantStatesManager manager, ParticipantStatesManager.StateChangedEvent event) {
        if (SystemClock.elapsedRealtime() - this.lastRaiseTime < 200) {
            this.mainThreadHandler.removeCallbacks(this.raiseRunnable);
            this.scheduleNextRaise = true;
        }
        accumulate(event);
        if (this.scheduleNextRaise) {
            this.scheduleNextRaise = false;
            this.mainThreadHandler.postDelayed(this.raiseRunnable, 10L);
        }
    }

    public final void release() {
        this.mainThreadHandler.removeCallbacks(this.raiseRunnable);
    }

    public final void removeListener(ParticipantStatesManager.Listener listener) {
        this.listeners.remove(listener);
    }
}
