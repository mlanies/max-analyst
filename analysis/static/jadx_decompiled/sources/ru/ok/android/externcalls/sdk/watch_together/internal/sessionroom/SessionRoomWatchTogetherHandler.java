package ru.ok.android.externcalls.sdk.watch_together.internal.sessionroom;

import defpackage.cd9;
import defpackage.nl1;
import defpackage.ol1;
import defpackage.pl1;
import defpackage.ql1;
import defpackage.rl1;
import defpackage.tpa;
import defpackage.xad;
import defpackage.zad;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieState;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/sessionroom/SessionRoomWatchTogetherHandler;", "Lrl1;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "watchTogetherManager", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;)V", "Le5f;", "stopWatchTogetherForMe", "()V", "Lnl1;", "params", "onCurrentParticipantActiveRoomChanged", "(Lnl1;)V", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "Lzad;", "roomId", "Lzad;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SessionRoomWatchTogetherHandler implements rl1 {
    private zad roomId = xad.a;
    private final ParticipantStore store;
    private final WatchTogetherPlayer watchTogetherManager;

    public SessionRoomWatchTogetherHandler(ParticipantStore participantStore, WatchTogetherPlayer watchTogetherPlayer) {
        this.store = participantStore;
        this.watchTogetherManager = watchTogetherPlayer;
    }

    private final void stopWatchTogetherForMe() {
        for (Map.Entry<cd9, MovieState> entry : this.watchTogetherManager.getMovieStates().getStates().entrySet()) {
            cd9 key = entry.getKey();
            ParticipantId participantId = entry.getValue().getParticipantId();
            ConversationParticipant me2 = this.store.getMe();
            if (tpa.f(participantId, me2 != null ? me2.getExternalId() : null)) {
                WatchTogetherPlayer.stop$default(this.watchTogetherManager, key, null, null, 6, null);
            }
        }
    }

    @Override // defpackage.rl1
    public void onCurrentParticipantActiveRoomChanged(nl1 params) {
        zad zadVar = this.roomId;
        zad zadVar2 = params.a;
        if (!tpa.f(zadVar, zadVar2)) {
            stopWatchTogetherForMe();
        }
        this.roomId = zadVar2;
    }

    @Override // defpackage.rl1
    public /* bridge */ /* synthetic */ void onCurrentParticipantInvitedToRoom(ol1 ol1Var) {
    }

    @Override // defpackage.rl1
    public /* bridge */ /* synthetic */ void onRoomRemoved(pl1 pl1Var) {
    }

    @Override // defpackage.rl1
    public /* bridge */ /* synthetic */ void onRoomUpdated(ql1 ql1Var) {
    }
}
