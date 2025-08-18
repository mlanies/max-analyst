package defpackage;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;

/* loaded from: classes.dex */
public final class e91 extends pnf implements um1 {
    public final kr1 X;
    public final os1 Y;
    public final bn1 Z;
    public final boolean b;
    public final long c;
    public final b31 o;
    public final z01 s0;
    public final q0e t0;
    public final q0e u0;

    public e91(boolean z, long j, String str, String str2, b31 b31Var, kr1 kr1Var, os1 os1Var, ida idaVar, bn1 bn1Var, z01 z01Var) {
        this.b = z;
        this.c = j;
        this.o = b31Var;
        this.X = kr1Var;
        this.Y = os1Var;
        this.Z = bn1Var;
        this.s0 = z01Var;
        q0e q0eVarA = r0e.a(new a91(new m31((Long) null, (CharSequence) str, new md0(oag.a(fca.a(str, idaVar), Long.valueOf(j)), str2 != null ? new String(Base64.decode(str2, 0), StandardCharsets.UTF_8) : null), false, 9), z, bn1Var.c(z)));
        this.t0 = q0eVarA;
        this.u0 = q0eVarA;
        os1Var.d(this);
        j47.T(this.a, null, null, new d91(this, null), 3);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallAccepted() {
        q0e q0eVar;
        Object value;
        super.onCallAccepted();
        do {
            q0eVar = this.t0;
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, new b91(true)));
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        q0e q0eVar;
        Object value;
        do {
            q0eVar = this.t0;
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, new b91(false)));
    }

    @Override // defpackage.um1, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        q0e q0eVar;
        Object value;
        do {
            q0eVar = this.t0;
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, new b91(true)));
    }

    @Override // defpackage.um1, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
    }

    public final void q() {
        q0e q0eVar;
        Object value;
        ((wr1) this.X).e();
        MicrophoneManager microphoneManagerC = ((a11) this.s0).c();
        if (microphoneManagerC != null) {
            microphoneManagerC.setMicEnabled(true);
        }
        je1.c.P1().b(":call-active?place=".concat(""), null);
        do {
            q0eVar = this.t0;
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, new b91(true)));
    }
}
