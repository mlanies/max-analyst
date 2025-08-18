package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import defpackage.eg1;
import defpackage.fg1;
import defpackage.k56;
import defpackage.kpa;
import defpackage.mz7;
import defpackage.nl1;
import defpackage.ol1;
import defpackage.pl1;
import defpackage.ql1;
import defpackage.rl1;
import defpackage.tpa;
import defpackage.uy0;
import defpackage.vy0;
import defpackage.wy0;
import defpackage.xad;
import defpackage.xy0;
import defpackage.yad;
import defpackage.yy0;
import defpackage.zad;
import defpackage.zy0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantStatesHandler;", "Lrl1;", "Lzy0;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "participantStatesManager", "Lkotlin/Function0;", "", "isMeCreatorOrAdmin", "<init>", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;Lk56;)V", "", "Lfg1;", "participants", "Le5f;", "dismissAssistanceRequestIfAdminAppearedInRoom", "(Ljava/util/Collection;)V", "dismissAssistanceRequestIfNecessary", "()V", "lowerMyHandAndDismissAssistanceRequestIfNecessary", "Lnl1;", "params", "onCurrentParticipantActiveRoomChanged", "(Lnl1;)V", "Luy0;", "onActiveParticipantsAdded", "(Luy0;)V", "Lyy0;", "onActiveParticipantUpdated", "(Lyy0;)V", "Lvy0;", "onActiveParticipantsChanged", "(Lvy0;)V", "Lwy0;", "onActiveParticipantsDeAnonimized", "(Lwy0;)V", "Lxy0;", "onActiveParticipantsRemoved", "(Lxy0;)V", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "Lk56;", "Lzad;", "roomId", "Lzad;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SessionRoomParticipantStatesHandler implements rl1, zy0 {
    private final k56 isMeCreatorOrAdmin;
    private final ParticipantStatesManagerImpl participantStatesManager;
    private zad roomId = xad.a;

    public SessionRoomParticipantStatesHandler(ParticipantStatesManagerImpl participantStatesManagerImpl, k56 k56Var) {
        this.participantStatesManager = participantStatesManagerImpl;
        this.isMeCreatorOrAdmin = k56Var;
    }

    private final void dismissAssistanceRequestIfAdminAppearedInRoom(Collection<fg1> participants) {
        if (this.roomId instanceof xad) {
            return;
        }
        Iterator<fg1> it = participants.iterator();
        while (it.hasNext()) {
            List list = it.next().e;
            if (list.contains(eg1.b) || list.contains(eg1.a)) {
                dismissAssistanceRequestIfNecessary();
                return;
            }
        }
    }

    private final void dismissAssistanceRequestIfNecessary() {
        if (this.participantStatesManager.isAssistanceRequested()) {
            this.participantStatesManager.setAssistanceRequested(false);
        }
    }

    private final void lowerMyHandAndDismissAssistanceRequestIfNecessary() {
        ParticipantStatesManagerImpl participantStatesManagerImpl = this.participantStatesManager;
        ParticipantStatesManagerImpl.State state = ParticipantStatesManagerImpl.State.HAND_RAISED;
        ParticipantStatesManagerImpl.Companion companion = ParticipantStatesManagerImpl.INSTANCE;
        ParticipantStatesManagerImpl.updateMyStates$default(participantStatesManagerImpl, mz7.a0(new kpa(state, companion.getSTATE_OFF()), new kpa(ParticipantStatesManagerImpl.State.ASSISTANCE_REQUESTED, companion.getSTATE_OFF())), null, null, 6, null);
    }

    @Override // defpackage.zy0
    public void onActiveParticipantUpdated(yy0 params) {
        dismissAssistanceRequestIfAdminAppearedInRoom(params.b);
    }

    @Override // defpackage.zy0
    public void onActiveParticipantsAdded(uy0 params) {
        dismissAssistanceRequestIfAdminAppearedInRoom(params.a);
    }

    @Override // defpackage.zy0
    public void onActiveParticipantsChanged(vy0 params) {
        dismissAssistanceRequestIfAdminAppearedInRoom(params.a);
    }

    @Override // defpackage.zy0
    public void onActiveParticipantsDeAnonimized(wy0 params) {
        dismissAssistanceRequestIfAdminAppearedInRoom(params.a);
    }

    @Override // defpackage.zy0
    public void onActiveParticipantsRemoved(xy0 params) {
    }

    @Override // defpackage.rl1
    public void onCurrentParticipantActiveRoomChanged(nl1 params) {
        zad zadVar = this.roomId;
        zad zadVar2 = params.a;
        if (tpa.f(zadVar, zadVar2)) {
            return;
        }
        lowerMyHandAndDismissAssistanceRequestIfNecessary();
        if (((Boolean) this.isMeCreatorOrAdmin.invoke()).booleanValue() && (zadVar2 instanceof yad)) {
            ParticipantStatesManagerImpl.resetStates$default(this.participantStatesManager, ParticipantStatesManagerImpl.State.ASSISTANCE_REQUESTED, (yad) zadVar2, null, null, 12, null);
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
