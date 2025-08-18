package defpackage;

import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.VideoTrack;

/* loaded from: classes2.dex */
public final class isa implements PeerConnection.Observer {
    public final /* synthetic */ nsa a;

    public /* synthetic */ isa(nsa nsaVar) {
        this.a = nsaVar;
    }

    public void a(String str, rj3 rj3Var) {
        nsa nsaVar = this.a;
        nsaVar.getClass();
        nsaVar.i(str, new adg(nsaVar, rj3Var, 0));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddStream(MediaStream mediaStream) {
        String string;
        nsa nsaVar = this.a;
        a4c a4cVar = nsaVar.K0;
        StringBuilder sb = new StringBuilder("handlePeerConnectionAddStream, ");
        sb.append(nsaVar);
        sb.append(", stream =");
        sb.append(jb9.c(mediaStream));
        sb.append(", video tracks=");
        List<VideoTrack> list = mediaStream.videoTracks;
        if (list == null || list.isEmpty()) {
            string = "[Ø]";
        } else {
            StringBuilder sb2 = new StringBuilder("[");
            boolean z = true;
            for (VideoTrack videoTrack : list) {
                if (!z) {
                    sb2.append(", ");
                }
                if (videoTrack != null) {
                    sb2.append(videoTrack.getClass().getSimpleName());
                    sb2.append('@');
                    sb2.append(System.identityHashCode(videoTrack));
                } else {
                    sb2.append((char) 216);
                }
                z = false;
            }
            sb2.append(']');
            string = sb2.toString();
        }
        sb.append(string);
        a4cVar.log("PCRTCClient", sb.toString());
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        String string;
        nsa nsaVar = this.a;
        a4c a4cVar = nsaVar.K0;
        StringBuilder sb = new StringBuilder("handlePeerConnectionAddTrack, ");
        sb.append(nsaVar);
        sb.append(", receiver=");
        sb.append(rtpReceiver);
        sb.append(", streams=");
        boolean z = jb9.a;
        if (mediaStreamArr == null || mediaStreamArr.length == 0) {
            string = "[Ø]";
        } else {
            StringBuilder sb2 = new StringBuilder("[");
            int length = mediaStreamArr.length;
            boolean z2 = true;
            int i = 0;
            while (i < length) {
                MediaStream mediaStream = mediaStreamArr[i];
                if (!z2) {
                    sb2.append(", ");
                }
                if (mediaStream != null) {
                    sb2.append(mediaStream.getClass().getSimpleName());
                    sb2.append('@');
                    sb2.append(System.identityHashCode(mediaStream));
                } else {
                    sb2.append((char) 216);
                }
                i++;
                z2 = false;
            }
            sb2.append(']');
            string = sb2.toString();
        }
        sb.append(string);
        a4cVar.log("PCRTCClient", sb.toString());
        rtpReceiver.SetObserver(new esa(nsaVar));
        nsaVar.p1.k(rtpReceiver, mediaStreamArr);
        nsaVar.C0.post(new do9(nsaVar, 7, mediaStreamArr));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onDataChannel(DataChannel dataChannel) {
        nsa nsaVar = this.a;
        nsaVar.getClass();
        boolean zEquals = "animoji".equals(dataChannel.label());
        a4c a4cVar = nsaVar.K0;
        if (zEquals && nsaVar.v1 == 2) {
            e24 e24Var = new e24(dataChannel, a4cVar);
            ni niVar = nsaVar.v0;
            if (niVar != null) {
                e24 e24Var2 = niVar.c;
                if (e24Var2 != null) {
                    e24Var2.c(niVar);
                }
                niVar.c = e24Var;
                kad kadVar = niVar.b;
                ((AtomicInteger) kadVar.X).set(0);
                ((AtomicInteger) kadVar.Y).set(0);
                e24Var.a(niVar);
            }
            kj kjVar = nsaVar.t0;
            if (kjVar != null) {
                kjVar.d(e24Var);
            }
        }
        a4cVar.log("handlePeerConnectionDataChannel", "created channel: " + dataChannel.label() + "/" + dataChannel.id());
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidate(IceCandidate iceCandidate) {
        nsa nsaVar = this.a;
        nsaVar.getClass();
        nsaVar.K0.log("PCRTCClient", "handlePeerConnectionIceCandidate, " + nsaVar);
        nsaVar.i("onIceCandidate", new adg(nsaVar, new bsa(nsaVar, iceCandidate, 1), 1));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
        nsa nsaVar = this.a;
        nsaVar.getClass();
        nsaVar.K0.log("PCRTCClient", "handlePeerConnectionIceCandidatesRemoved, " + nsaVar);
        nsaVar.i("onIceCandidatesRemoved", new adg(nsaVar, new gsa(nsaVar, 3, iceCandidateArr), 1));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        nsa nsaVar = this.a;
        nsaVar.getClass();
        nsaVar.K0.log("PCRTCClient", "handlePeerConnectionIceConnectionChange, " + nsaVar + " state=" + iceConnectionState);
        PeerConnection.IceConnectionState iceConnectionState2 = PeerConnection.IceConnectionState.CONNECTED;
        yr6 yr6Var = nsaVar.N0;
        if (iceConnectionState == iceConnectionState2) {
            yr6Var.a(true);
        } else if (iceConnectionState == PeerConnection.IceConnectionState.CLOSED) {
            yr6Var.a(false);
        }
        if (iceConnectionState == iceConnectionState2 && nsaVar.u0) {
            nhc nhcVar = new nhc(true);
            koc kocVar = nsaVar.O0;
            if (kocVar != null) {
                kocVar.d(new ioc(new ioc(nhcVar)));
            }
        }
        nsaVar.C0.post(new do9(nsaVar, 6, iceConnectionState));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceConnectionReceivingChange(boolean z) {
        this.a.getClass();
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
        nsa nsaVar = this.a;
        nsaVar.getClass();
        nsaVar.K0.log("PCRTCClient", "handlePeerConnectionIceGatheringChange, " + nsaVar + ", state=" + iceGatheringState);
        if (iceGatheringState == PeerConnection.IceGatheringState.GATHERING) {
            yr6 yr6Var = nsaVar.N0;
            yr6Var.getClass();
            yr6Var.e = SystemClock.elapsedRealtime();
        }
        nsaVar.i("onIceGatheringChange", new adg(nsaVar, new gsa(nsaVar, 0, iceGatheringState), 1));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRemoveStream(MediaStream mediaStream) {
        nsa nsaVar = this.a;
        nsaVar.K0.log("PCRTCClient", "handlePeerConnectionRemoveStream, " + nsaVar + ", stream=" + jb9.c(mediaStream));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onRenegotiationNeeded() {
        nsa nsaVar = this.a;
        nsaVar.getClass();
        nsaVar.K0.log("PCRTCClient", "handlePeerConnectionRenegotiationNeeded, " + nsaVar);
        nsaVar.C0.post(new csa(nsaVar, 4));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public void onSignalingChange(PeerConnection.SignalingState signalingState) {
        nsa nsaVar = this.a;
        nsaVar.getClass();
        nsaVar.K0.log("PCRTCClient", "handlePeerConnectionSignalingChange, " + nsaVar + ", state=" + signalingState);
        nsaVar.C0.post(new do9(nsaVar, 5, signalingState));
    }
}
