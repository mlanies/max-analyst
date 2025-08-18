package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* loaded from: classes.dex */
public final class cra implements oqa, um1 {
    public final je7 X;
    public final je7 Y;
    public final khe Z = new khe(new zj7(24, this));
    public final jr1 a;
    public final so1 b;
    public final ld1 c;
    public final je7 o;
    public final AtomicReference s0;
    public final kld t0;
    public vxd u0;
    public vxd v0;
    public final w7c w0;

    public cra(je7 je7Var, je7 je7Var2, jr1 jr1Var, so1 so1Var, ld1 ld1Var, je7 je7Var3, je7 je7Var4) {
        this.a = jr1Var;
        this.b = so1Var;
        this.c = ld1Var;
        this.o = je7Var;
        this.X = je7Var4;
        this.Y = je7Var2;
        AtomicReference atomicReference = new AtomicReference(new pqa(fqa.c));
        this.s0 = atomicReference;
        kld kldVarA = lld.a(1, 1, 2);
        this.t0 = kldVarA;
        ((os1) je7Var3.getValue()).d(this);
        this.w0 = od2.X(new uqa(od2.x(new uqa(new m58(new t03(od2.d0(kldVarA, new y03(3, (Continuation) null, 6)), 11), 20), this, 1)), this, 2), jr1Var, wld.b, atomicReference.get());
    }

    public final void b() {
        Conversation conversationA = ((fw3) this.o.getValue()).a();
        ParticipantStatesManager participantStatesManager = conversationA != null ? conversationA.getParticipantStatesManager() : null;
        if (participantStatesManager != null) {
            participantStatesManager.removeHandListener((ParticipantStatesManager.Listener) this.Z.getValue());
        }
        vxd vxdVar = this.u0;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        this.u0 = null;
        vxd vxdVar2 = this.v0;
        if (vxdVar2 != null) {
            vxdVar2.cancel((CancellationException) null);
        }
        this.v0 = null;
        if (this.s0.get() != null) {
            e(new pqa(c()));
        }
    }

    public final fqa c() {
        return ((pqa) this.s0.get()).a;
    }

    public final void d() {
        this.t0.g(((fw3) this.o.getValue()).a());
    }

    public final void e(pqa pqaVar) {
        AtomicReference atomicReference = this.s0;
        Object obj = atomicReference.get();
        while (!atomicReference.compareAndSet(obj, pqaVar) && atomicReference.get() == obj) {
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
        b();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallParticipantsNetworkStatusChanged(List list) {
        d();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        b();
    }

    @Override // defpackage.um1, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        if (connectedInfo.isFirstConnection()) {
            d();
        }
    }

    @Override // defpackage.um1, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsAdded(List list) {
        d();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsChanged(List list) {
        d();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsRemoved(List list) {
        d();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsUpdated(Collection collection) {
        d();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onRolesChanged(ConversationParticipant conversationParticipant) {
        d();
    }
}
