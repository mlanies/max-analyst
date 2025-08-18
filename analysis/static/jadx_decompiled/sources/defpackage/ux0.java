package defpackage;

import java.util.Iterator;
import org.webrtc.EglBase;
import org.webrtc.PeerConnectionFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class ux0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ py0 b;

    public /* synthetic */ ux0(py0 py0Var, int i) {
        this.a = i;
        this.b = py0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                py0 py0Var = this.b;
                if (py0Var.A0) {
                    return;
                }
                Iterator it = py0Var.q1.iterator();
                if (it.hasNext()) {
                    au1.r(it.next());
                    throw null;
                }
                return;
            case 1:
                py0 py0Var2 = this.b;
                py0Var2.s0.post(new ux0(py0Var2, 3));
                return;
            case 2:
                py0 py0Var3 = this.b;
                if (py0Var3.A0) {
                    return;
                }
                int iC = py0Var3.l1.c();
                boolean z = true;
                if (iC != 2 && iC != 1) {
                    z = false;
                }
                ji9 ji9Var = py0Var3.y1;
                if (z == ji9Var.f) {
                    return;
                }
                py0Var3.V0.log("OKRTCCall", "onLocalMediaStreamChanged, media settings video enabled state (" + ji9Var.f + ") != camera video enabled state (" + z + "). Let us update media settings");
                py0Var3.G(z);
                return;
            case 3:
                py0 py0Var4 = this.b;
                a4c a4cVar = py0Var4.V0;
                EglBase eglBase = py0Var4.x0;
                try {
                    a4cVar.log("OKRTCCall", "Releasing " + jb9.c(eglBase));
                    eglBase.release();
                    a4cVar.log("OKRTCCall", jb9.c(eglBase) + " was released");
                    return;
                } catch (Exception e) {
                    a4cVar.reportException("OKRTCCall", "release.egl", e);
                    return;
                }
            default:
                py0 py0Var5 = this.b;
                py0Var5.getClass();
                try {
                    PeerConnectionFactory peerConnectionFactory = py0Var5.k1.d;
                    if (peerConnectionFactory == null) {
                        return;
                    }
                    peerConnectionFactory.clearDumpRequests();
                    return;
                } catch (Throwable th) {
                    py0Var5.V0.logException("OKRTCCall", "Error stopping local audio dump", th);
                    return;
                }
        }
    }

    public /* synthetic */ ux0(py0 py0Var, boolean z) {
        this.a = 0;
        this.b = py0Var;
    }
}
