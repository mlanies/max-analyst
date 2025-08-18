package defpackage;

import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;

/* loaded from: classes2.dex */
public final /* synthetic */ class oj3 implements rj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oj3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rj3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                return;
            case 1:
                fd4 fd4Var = (fd4) this.b;
                synchronized (fd4Var.Y) {
                    try {
                        for (String str : fd4Var.s0.keySet()) {
                            fd4Var.u(str, (fp1) fd4Var.s0.get(str), null);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                ((PeerConnection) obj).removeIceCandidates((IceCandidate[]) this.b);
                return;
            case 3:
                ((PeerConnection) obj).getStats(new yt8(14, (o1e) this.b));
                return;
            case 4:
                ((m56) this.b).invoke((bg1) obj);
                return;
            default:
                ((nqd) ((sqd) this.b)).a((bg1) obj);
                return;
        }
    }
}
