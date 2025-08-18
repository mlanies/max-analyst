package defpackage;

import org.webrtc.MediaConstraints;
import org.webrtc.PeerConnection;

/* loaded from: classes2.dex */
public final /* synthetic */ class xra implements rj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nsa b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xra(nsa nsaVar, boolean z, int i) {
        this.a = i;
        this.b = nsaVar;
        this.c = z;
    }

    @Override // defpackage.rj3
    public final void accept(Object obj) {
        PeerConnection peerConnection = (PeerConnection) obj;
        switch (this.a) {
            case 0:
                nsa nsaVar = this.b;
                MediaConstraints mediaConstraints = nsaVar.Y0;
                if (this.c) {
                    mediaConstraints = new MediaConstraints();
                    mediaConstraints.optional.addAll(nsaVar.Y0.optional);
                    mediaConstraints.mandatory.addAll(nsaVar.Y0.mandatory);
                    mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("IceRestart", "true"));
                }
                peerConnection.createOffer(new ksa(nsaVar, 0), mediaConstraints);
                break;
            default:
                nsa nsaVar2 = this.b;
                boolean z = this.c;
                nsaVar2.u(peerConnection, z);
                nsaVar2.k(peerConnection, z);
                break;
        }
    }
}
