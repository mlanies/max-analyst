package defpackage;

import org.webrtc.SessionDescription;

/* loaded from: classes2.dex */
public final class jsa extends j1e {
    public final /* synthetic */ int d;
    public final /* synthetic */ SessionDescription e;
    public final /* synthetic */ nsa f;

    public /* synthetic */ jsa(nsa nsaVar, SessionDescription sessionDescription, int i) {
        this.d = i;
        this.f = nsaVar;
        this.e = sessionDescription;
    }

    @Override // defpackage.j1e, org.webrtc.SdpObserver
    public final void onSetFailure(String str) {
        switch (this.d) {
            case 0:
                this.f.o(this.e, true, str);
                break;
            default:
                this.f.o(this.e, false, str);
                break;
        }
    }

    @Override // defpackage.j1e, org.webrtc.SdpObserver
    public final void onSetSuccess() {
        switch (this.d) {
            case 0:
                this.f.n(this.e, true);
                break;
            default:
                this.f.n(this.e, false);
                break;
        }
    }
}
