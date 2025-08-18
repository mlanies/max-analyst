package defpackage;

import org.webrtc.SessionDescription;

/* loaded from: classes2.dex */
public final class ksa extends j1e {
    public final /* synthetic */ int d;
    public final /* synthetic */ nsa e;

    public /* synthetic */ ksa(nsa nsaVar, int i) {
        this.d = i;
        this.e = nsaVar;
    }

    @Override // defpackage.j1e, org.webrtc.SdpObserver
    public final void onCreateFailure(String str) {
        switch (this.d) {
            case 0:
                this.e.h(str);
                break;
            default:
                this.e.h(str);
                break;
        }
    }

    @Override // defpackage.j1e, org.webrtc.SdpObserver
    public final void onCreateSuccess(SessionDescription sessionDescription) {
        switch (this.d) {
            case 0:
                this.e.m(sessionDescription);
                break;
            default:
                this.e.m(sessionDescription);
                break;
        }
    }
}
