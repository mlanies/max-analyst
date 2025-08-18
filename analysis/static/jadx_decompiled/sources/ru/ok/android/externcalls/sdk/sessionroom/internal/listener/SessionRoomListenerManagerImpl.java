package ru.ok.android.externcalls.sdk.sessionroom.internal.listener;

import android.os.Handler;
import android.os.Looper;
import defpackage.flc;
import defpackage.nl1;
import defpackage.ol1;
import defpackage.pl1;
import defpackage.ql1;
import defpackage.rl1;
import defpackage.tad;
import defpackage.xad;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u000bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManager;", "Lrl1;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;", "listener", "Le5f;", "sendActualState", "(Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;)V", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "getOwnActiveRoom", "()Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "getOwnProposedRoom", "Lpl1;", "params", "onRoomRemoved", "(Lpl1;)V", "Lql1;", "onRoomUpdated", "(Lql1;)V", "Lol1;", "onCurrentParticipantInvitedToRoom", "(Lol1;)V", "Lnl1;", "onCurrentParticipantActiveRoomChanged", "(Lnl1;)V", "addListener", "removeListener", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SessionRoomListenerManagerImpl implements SessionRoomListenerManager, rl1 {
    private final ParticipantStore store;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArraySet<SessionRoomsManager.OwnRoomsListener> listeners = new CopyOnWriteArraySet<>();

    public SessionRoomListenerManagerImpl(ParticipantStore participantStore) {
        this.store = participantStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCurrentParticipantActiveRoomChanged$lambda$9(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, nl1 nl1Var) {
        Iterator<T> it = sessionRoomListenerManagerImpl.listeners.iterator();
        while (it.hasNext()) {
            ((SessionRoomsManager.OwnRoomsListener) it.next()).onActiveRoomChanged(new SessionRoomsManager.SessionRoomInfo(nl1Var.a, nl1Var.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCurrentParticipantInvitedToRoom$lambda$7(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, ol1 ol1Var) {
        Iterator<T> it = sessionRoomListenerManagerImpl.listeners.iterator();
        while (it.hasNext()) {
            ((SessionRoomsManager.OwnRoomsListener) it.next()).onProposedRoomChanged(new SessionRoomsManager.SessionRoomInfo(ol1Var.b, ol1Var.c));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRoomRemoved$lambda$3(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, pl1 pl1Var) {
        Iterator<T> it = sessionRoomListenerManagerImpl.listeners.iterator();
        while (it.hasNext()) {
            ((SessionRoomsManager.OwnRoomsListener) it.next()).onRoomRemoved(new SessionRoomsManager.SessionRoomInfo(pl1Var.a, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRoomUpdated$lambda$5(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, ql1 ql1Var) {
        Iterator<T> it = sessionRoomListenerManagerImpl.listeners.iterator();
        while (it.hasNext()) {
            ((SessionRoomsManager.OwnRoomsListener) it.next()).onRoomUpdated(new SessionRoomsManager.SessionRoomInfo(ql1Var.a, ql1Var.b));
        }
    }

    private final void sendActualState(SessionRoomsManager.OwnRoomsListener listener) {
        this.mainHandler.post(new flc(this, 10, listener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendActualState$lambda$12(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, SessionRoomsManager.OwnRoomsListener ownRoomsListener) {
        if (sessionRoomListenerManagerImpl.listeners.contains(ownRoomsListener)) {
            tad proposedRoom = sessionRoomListenerManagerImpl.store.getProposedRoom();
            if (proposedRoom != null) {
                ownRoomsListener.onProposedRoomChanged(new SessionRoomsManager.SessionRoomInfo(proposedRoom.a, proposedRoom));
            }
            tad activeRoom = sessionRoomListenerManagerImpl.store.getActiveRoom();
            if (activeRoom != null) {
                ownRoomsListener.onActiveRoomChanged(new SessionRoomsManager.SessionRoomInfo(activeRoom.a, activeRoom));
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManager
    public void addListener(SessionRoomsManager.OwnRoomsListener listener) {
        this.listeners.add(listener);
        sendActualState(listener);
    }

    public final SessionRoomsManager.SessionRoomInfo getOwnActiveRoom() {
        tad activeRoom = this.store.getActiveRoom();
        return activeRoom != null ? new SessionRoomsManager.SessionRoomInfo(activeRoom.a, activeRoom) : new SessionRoomsManager.SessionRoomInfo(xad.a, null);
    }

    public final SessionRoomsManager.SessionRoomInfo getOwnProposedRoom() {
        tad proposedRoom = this.store.getProposedRoom();
        return proposedRoom != null ? new SessionRoomsManager.SessionRoomInfo(proposedRoom.a, proposedRoom) : new SessionRoomsManager.SessionRoomInfo(xad.a, null);
    }

    @Override // defpackage.rl1
    public void onCurrentParticipantActiveRoomChanged(nl1 params) {
        this.mainHandler.post(new flc(this, 12, params));
    }

    @Override // defpackage.rl1
    public void onCurrentParticipantInvitedToRoom(ol1 params) {
        this.mainHandler.post(new flc(this, 14, params));
    }

    @Override // defpackage.rl1
    public void onRoomRemoved(pl1 params) {
        this.mainHandler.post(new flc(this, 13, params));
    }

    @Override // defpackage.rl1
    public void onRoomUpdated(ql1 params) {
        this.mainHandler.post(new flc(this, 11, params));
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManager
    public void removeListener(SessionRoomsManager.OwnRoomsListener listener) {
        this.listeners.remove(listener);
    }
}
