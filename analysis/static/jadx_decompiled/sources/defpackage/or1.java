package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;

/* loaded from: classes.dex */
public final class or1 implements um1 {
    public final /* synthetic */ je7 X;
    public final /* synthetic */ wr1 a;
    public final /* synthetic */ je7 b;
    public final /* synthetic */ je7 c;
    public final /* synthetic */ je7 o;

    public or1(wr1 wr1Var, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = wr1Var;
        this.b = je7Var;
        this.c = je7Var2;
        this.o = je7Var3;
        this.X = je7Var4;
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallAccepted() {
        Object value;
        d04 d04VarJ;
        super.onCallAccepted();
        ((lkc) this.b.getValue()).c();
        ((a11) ((z01) this.c.getValue())).a(CallsAudioManager.State.CONVERSATION);
        wr1 wr1Var = this.a;
        q0e q0eVar = wr1Var.H;
        do {
            value = q0eVar.getValue();
            d04VarJ = wr1Var.j();
            if (!d04VarJ.f) {
                wr1Var.B(true);
            }
        } while (!q0eVar.c(value, d04.a(d04VarJ, null, System.currentTimeMillis(), null, null, false, false, false, null, null, 1021)));
        if (wr1Var.k().f) {
            Iterator it = wr1Var.G.iterator();
            while (it.hasNext()) {
                ((zl1) it.next()).onCallAccepted();
            }
            hl1 hl1Var = (hl1) this.o.getValue();
            Context context = (Context) this.X.getValue();
            hl1Var.getClass();
            hl1.d(context);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
        wr1.b(this.a, conversationEndInfo.getReason());
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        wr1 wr1Var = this.a;
        i95 i95Var = wr1Var.j().j;
        if (!(i95Var instanceof c95) && !(i95Var instanceof b95) && !(i95Var instanceof d95)) {
            wr1.b(wr1Var, conversationDestroyedInfo.getReason());
        }
        wr1Var.z();
        Iterator it = wr1Var.G.iterator();
        while (it.hasNext()) {
            ((zl1) it.next()).i();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onJoinLinkUpdated(String str) {
        Object value;
        Object value2;
        wr1 wr1Var = this.a;
        j1e j1eVar = wr1Var.j().a;
        if (j1eVar != null) {
            boolean z = j1eVar instanceof ym1;
            q0e q0eVar = wr1Var.H;
            if (z) {
                do {
                    value2 = q0eVar.getValue();
                } while (!q0eVar.c(value2, d04.a(wr1Var.j(), new ym1(str, ((ym1) j1eVar).e), 0L, null, str, false, false, false, null, null, 1014)));
            } else {
                do {
                    value = q0eVar.getValue();
                } while (!q0eVar.c(value, d04.a(wr1Var.j(), null, 0L, null, str, false, false, false, null, null, 1015)));
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMeInWaitingRoomChanged(boolean z) {
        Object value;
        d04 d04VarJ;
        super.onMeInWaitingRoomChanged(z);
        hm9.n("CallEngineTag", "me waiting room changed: isMeInWaitingRoom=" + z);
        wr1 wr1Var = this.a;
        q0e q0eVar = wr1Var.H;
        do {
            value = q0eVar.getValue();
            d04VarJ = wr1Var.j();
        } while (!q0eVar.c(value, z ? d04.a(d04VarJ, null, 0L, null, null, false, false, false, null, h95.b, 511) : d04.a(d04VarJ, null, 0L, null, null, false, false, false, null, f95.b, 511)));
    }

    @Override // defpackage.um1, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        String str;
        boolean zIsFirstConnection = connectedInfo.isFirstConnection();
        wr1 wr1Var = this.a;
        wr1Var.B(zIsFirstConnection);
        if (connectedInfo.isFirstConnection() || (str = wr1Var.j().c) == null) {
            return;
        }
        bt1 bt1VarM = wr1Var.m();
        boolean z = wr1Var.j().h;
        bt1VarM.getClass();
        bt1.c(bt1VarM, "BAD_CONNECTION_ALERT", str, "RECONNECT", null, null, null, z, 56);
    }

    @Override // defpackage.um1, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
        Object value;
        wr1 wr1Var = this.a;
        q0e q0eVar = wr1Var.H;
        do {
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, d04.a(wr1Var.j(), null, 0L, null, null, false, false, false, null, g95.b, 511)));
        if (wr1Var.j().h) {
            return;
        }
        lkc lkcVarU = wr1Var.u();
        lkcVarU.getClass();
        lkcVarU.c = kkc.CONNECTING;
        xh1 xh1VarA = lkcVarU.a();
        if (((Boolean) xh1VarA.f.getValue()).booleanValue()) {
            xh1VarA.a(xh1VarA.b.d, true);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsAdded(List list) {
        wr1.c(this.a);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsChanged(List list) {
        wr1.c(this.a);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsRemoved(List list) {
        wr1.c(this.a);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsUpdated(Collection collection) {
        wr1.c(this.a);
    }
}
