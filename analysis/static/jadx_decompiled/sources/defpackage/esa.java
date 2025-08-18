package defpackage;

import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpReceiver;

/* loaded from: classes2.dex */
public final /* synthetic */ class esa implements RtpReceiver.Observer {
    public final /* synthetic */ nsa a;

    public /* synthetic */ esa(nsa nsaVar) {
        this.a = nsaVar;
    }

    @Override // org.webrtc.RtpReceiver.Observer
    public void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType) {
        nsa nsaVar = this.a;
        nsaVar.C0.post(new csa(nsaVar, 5));
    }
}
