package defpackage;

import java.util.Collections;
import java.util.regex.Matcher;
import org.json.HTTP;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* loaded from: classes2.dex */
public final /* synthetic */ class asa implements rj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nsa b;
    public final /* synthetic */ SessionDescription c;

    public /* synthetic */ asa(nsa nsaVar, SessionDescription sessionDescription, int i) {
        this.a = i;
        this.b = nsaVar;
        this.c = sessionDescription;
    }

    @Override // defpackage.rj3
    public final void accept(Object obj) throws NumberFormatException {
        String strGroup;
        switch (this.a) {
            case 0:
                PeerConnection peerConnection = (PeerConnection) obj;
                nsa nsaVar = this.b;
                nsaVar.getClass();
                SessionDescription sessionDescription = this.c;
                String strV = sessionDescription.description;
                a4c a4cVar = nsaVar.K0;
                s5c.x(strV, a4cVar);
                if (nsaVar.H0 != 2) {
                    strV = nsaVar.d(strV, true);
                }
                boolean z = nsaVar.Y;
                d4c d4cVar = nsaVar.J0;
                if (z) {
                    strV = s5c.V(s5c.e(strV, "dred", "100", d4cVar, a4cVar), Collections.singletonList("opus"), d4cVar, a4cVar);
                }
                Integer num = nsaVar.Z;
                if (num != null) {
                    strV = s5c.e(strV, "minptime", String.valueOf(num.intValue()), d4cVar, a4cVar);
                }
                Integer num2 = nsaVar.s0;
                if (num2 != null) {
                    strV = s5c.e(strV, "maxptime", String.valueOf(num2.intValue()), d4cVar, a4cVar);
                }
                if (nsaVar.o) {
                    strV = s5c.V(strV, Collections.singletonList("red"), d4cVar, a4cVar);
                }
                String strJ = rh4.j(strV, strV.endsWith("\n") ? "" : HTTP.CRLF, "a=animoji:2\r\n");
                if (!nsaVar.X) {
                    strJ = s5c.e(strJ, "usedtx", String.valueOf(1), d4cVar, a4cVar);
                }
                SessionDescription sessionDescription2 = new SessionDescription(sessionDescription.type, strJ);
                a4cVar.log("PCRTCClient", nsaVar.toString() + ": set local sdp from " + sessionDescription2.type);
                peerConnection.setLocalDescription(new jsa(nsaVar, sessionDescription2, 0), sessionDescription2);
                break;
            default:
                nsa nsaVar2 = this.b;
                SessionDescription sessionDescription3 = this.c;
                PeerConnection peerConnection2 = (PeerConnection) obj;
                nsaVar2.getClass();
                String str = sessionDescription3.description;
                s5c.x(str, nsaVar2.K0);
                if (!nsaVar2.r1 && nsaVar2.g1 != null) {
                    if (nsa.w1.matcher(str).find()) {
                        nsaVar2.K0.log("PCRTCClient", nsaVar2.toString() + ": remote sdp supports h264 decoding");
                    } else {
                        nsaVar2.K0.log("PCRTCClient", nsaVar2.toString() + ": remote does not support h264 decoding");
                        nsaVar2.g1.m(Float.valueOf(nsaVar2.s1), Float.valueOf(nsaVar2.t1));
                    }
                }
                SessionDescription sessionDescription4 = new SessionDescription(sessionDescription3.type, nsaVar2.d(str, false));
                if (nsaVar2.t0.c == null) {
                    Matcher matcher = nsa.x1.matcher(sessionDescription3.description);
                    int i = 1;
                    if (matcher.find() && (strGroup = matcher.group(1)) != null) {
                        i = Integer.parseInt(strGroup);
                    }
                    nsaVar2.L0.getClass();
                    int iMin = Math.min(i, 2);
                    nsaVar2.K0.log("PCRTCClient", nsaVar2.toString() + ": set animoji protocol version: " + iMin + "(local: 2, remote: " + i + ")");
                    kj kjVar = nsaVar2.t0;
                    if (kjVar.c != null) {
                        Throwable th = new Throwable("Resetting animoji protocol version");
                        a4c a4cVar2 = (a4c) kjVar.a.b;
                        String message = th.getMessage();
                        if (message == null) {
                            message = "animoji error";
                        }
                        a4cVar2.logException("AniSend", message, th);
                    }
                    kjVar.c = Integer.valueOf(iMin);
                    rw4 rw4Var = kjVar.g;
                    if (rw4Var != null) {
                        rw4Var.a();
                    }
                }
                nsaVar2.K0.log("PCRTCClient", nsaVar2.toString() + ": set remote sdp from " + sessionDescription3.type);
                peerConnection2.setRemoteDescription(new jsa(nsaVar2, sessionDescription4, 1), sessionDescription4);
                break;
        }
    }
}
