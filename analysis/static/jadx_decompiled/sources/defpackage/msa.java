package defpackage;

import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* loaded from: classes2.dex */
public interface msa {
    void a(nsa nsaVar, SessionDescription sessionDescription);

    void b(nsa nsaVar);

    void c(nsa nsaVar);

    void d();

    void e(String str);

    void f();

    void g(nsa nsaVar, String str);

    void h(nsa nsaVar, IceCandidate[] iceCandidateArr);

    void k(nsa nsaVar, PeerConnection.SignalingState signalingState);

    void l(nsa nsaVar, IceCandidate iceCandidate);

    void m(nsa nsaVar, SessionDescription sessionDescription);

    void n(nsa nsaVar, PeerConnection.IceConnectionState iceConnectionState);

    default void o(nsa nsaVar, long j) {
    }

    void q(nsa nsaVar);
}
