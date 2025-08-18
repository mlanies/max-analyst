package defpackage;

import java.util.Iterator;
import java.util.List;
import org.webrtc.AudioTrack;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.VideoTrack;

/* loaded from: classes2.dex */
public final /* synthetic */ class fsa implements rj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nsa b;

    public /* synthetic */ fsa(nsa nsaVar, int i) {
        this.a = i;
        this.b = nsaVar;
    }

    @Override // defpackage.rj3
    public final void accept(Object obj) {
        a4c a4cVar;
        RtpTransceiver next;
        AudioTrack audioTrack;
        VideoTrack videoTrack;
        switch (this.a) {
            case 0:
                PeerConnection peerConnection = (PeerConnection) obj;
                nsa nsaVar = this.b;
                nsaVar.u(peerConnection, false);
                nsaVar.k(peerConnection, false);
                break;
            default:
                PeerConnection peerConnection2 = (PeerConnection) obj;
                nsa nsaVar2 = this.b;
                nsaVar2.getClass();
                List<RtpTransceiver> transceivers = peerConnection2.getTransceivers();
                RtpTransceiver rtpTransceiver = null;
                nsaVar2.c1 = null;
                nsaVar2.e1 = null;
                Iterator<RtpTransceiver> it = transceivers.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    a4cVar = nsaVar2.K0;
                    if (zHasNext) {
                        next = it.next();
                        if (next.getMid() != null && next.getMid().contains("s") && next.getMediaType() == MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO) {
                            a4cVar.log("PCRTCClient", "audioShareTransceiver found");
                        }
                    } else {
                        next = null;
                    }
                }
                d dVar = nsaVar2.E0;
                if (next != null) {
                    try {
                        next.setDirection(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY);
                    } catch (Exception e) {
                        a4cVar.log("PCRTCClient", "audioShareTransceiver setDirection failed with error: " + e.getMessage());
                    }
                    kq7 kq7Var = (kq7) dVar.a().b;
                    if (kq7Var != null && (audioTrack = (AudioTrack) ((MediaStreamTrack) kq7Var.j.X)) != null) {
                        RtpSender sender = next.getSender();
                        nsaVar2.c1 = sender;
                        nsaVar2.B0.c(sender, "audio-share");
                        sender.setTrack(audioTrack, false);
                        a4cVar.log("PCRTCClient", "audioShareTransceiver setTrack, trackId = " + audioTrack.id());
                    }
                }
                Iterator<RtpTransceiver> it2 = transceivers.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        RtpTransceiver next2 = it2.next();
                        if (next2.getMid() != null && next2.getMid().contains("s") && next2.getMediaType() == MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO) {
                            a4cVar.log("PCRTCClient", "shareScreenTransceiver found");
                            rtpTransceiver = next2;
                        }
                    }
                }
                if (rtpTransceiver != null) {
                    try {
                        rtpTransceiver.setDirection(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY);
                    } catch (Exception e2) {
                        a4cVar.log("PCRTCClient", "shareScreenTransceiver setDirection failed with error: " + e2.getMessage());
                    }
                    kq7 kq7Var2 = (kq7) dVar.a().b;
                    if (kq7Var2 != null && (videoTrack = (VideoTrack) ((MediaStreamTrack) kq7Var2.z.X)) != null) {
                        RtpSender sender2 = rtpTransceiver.getSender();
                        nsaVar2.B0.d(sender2, "screen-share", 30000, 2048000, null, false);
                        nsaVar2.e1 = sender2;
                        sender2.setTrack(videoTrack, false);
                        RtpSender rtpSender = nsaVar2.e1;
                        if (nsaVar2.r1 && rtpSender != null) {
                            rtpSender.setVideoEncoderObserver(new ar0((Object) nsaVar2, false));
                        }
                        a4cVar.log("PCRTCClient", "shareScreenTransceiver setTrack, trackId = " + videoTrack.id());
                        try {
                            nsaVar2.l(peerConnection2, false, true, nsaVar2.e1);
                        } catch (IllegalStateException e3) {
                            a4cVar.log("PCRTCClient", "IllegalStateException, " + nsaVar2 + " ex=" + e3);
                        } catch (Exception e4) {
                            a4cVar.log("PCRTCClient", "Exception, " + nsaVar2 + " ex=" + e4);
                        }
                    }
                }
                nsaVar2.v(peerConnection2);
                peerConnection2.createAnswer(new ksa(nsaVar2, 1), nsaVar2.Y0);
                break;
        }
    }
}
