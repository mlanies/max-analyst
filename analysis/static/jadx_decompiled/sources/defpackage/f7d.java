package defpackage;

import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnection;

/* loaded from: classes2.dex */
public final /* synthetic */ class f7d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7d b;

    public /* synthetic */ f7d(h7d h7dVar, int i) {
        this.a = i;
        this.b = h7dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xn1 xn1Var;
        int i = this.a;
        h7d h7dVar = this.b;
        switch (i) {
            case 0:
                h7dVar.getClass();
                if (NetworkMonitor.isOnline() && h7dVar.I0.D0 && (xn1Var = h7dVar.y0) != null) {
                    ((py0) xn1Var).A(h7dVar, PeerConnection.IceConnectionState.FAILED);
                    break;
                }
                break;
            default:
                if (h7dVar.I()) {
                    d5f d5fVar = h7dVar.I0;
                    if (d5fVar.B0.C() != PeerConnection.IceConnectionState.CONNECTED) {
                        jb9.d(d5fVar.X, "SERVER_CONNECTION_TIMEOUT", "in");
                    }
                    if (d5fVar.B0 != null) {
                        d5fVar.B0.I(d5fVar.y0);
                        break;
                    }
                }
                break;
        }
    }
}
