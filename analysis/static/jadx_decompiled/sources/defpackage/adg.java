package defpackage;

import org.webrtc.PeerConnection;

/* loaded from: classes2.dex */
public final class adg extends ny1 {
    public final /* synthetic */ int c;
    public final rj3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adg(nsa nsaVar, rj3 rj3Var, int i) {
        super(nsaVar);
        this.c = i;
        switch (i) {
            case 1:
                super(nsaVar);
                this.o = rj3Var;
                break;
            default:
                this.o = rj3Var;
                break;
        }
    }

    @Override // defpackage.ny1
    public final void a(PeerConnection peerConnection) {
        switch (this.c) {
            case 0:
                this.o.accept(peerConnection);
                break;
            default:
                this.o.accept(peerConnection);
                break;
        }
    }
}
