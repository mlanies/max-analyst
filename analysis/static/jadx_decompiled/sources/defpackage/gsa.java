package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.StatsObserver;
import org.webrtc.VideoEncoderObserver;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

/* loaded from: classes2.dex */
public final /* synthetic */ class gsa implements rj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gsa(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.rj3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                nsa nsaVar = (nsa) this.b;
                nsaVar.getClass();
                PeerConnection.IceGatheringState iceGatheringState = PeerConnection.IceGatheringState.GATHERING;
                PeerConnection.IceGatheringState iceGatheringState2 = (PeerConnection.IceGatheringState) this.c;
                if (iceGatheringState2 == iceGatheringState) {
                    nsaVar.U0 = SystemClock.elapsedRealtime();
                }
                if (iceGatheringState2 == PeerConnection.IceGatheringState.COMPLETE) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(nsaVar.toString());
                    sb.append(": iceGatheringState=");
                    ArrayList arrayList = nsaVar.f1;
                    sb.append(arrayList.size());
                    sb.append(" ");
                    sb.append(arrayList);
                    nsaVar.K0.log("PCRTCClient", sb.toString());
                    if (nsaVar.h1) {
                        boolean z = false;
                        nsaVar.h1 = false;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            IceCandidate iceCandidate = (IceCandidate) it.next();
                            if (iceCandidate.sdp.contains("typ srflx") || iceCandidate.sdp.contains("typ prflx") || iceCandidate.sdp.contains("typ relay")) {
                                z = true;
                            }
                        }
                        if (!z) {
                            nsaVar.J0.log(e0e.app_event, "rtc.no.stun.candidates", (String) null);
                            break;
                        }
                    }
                }
                break;
            case 1:
                PeerConnection peerConnection = (PeerConnection) obj;
                nsa nsaVar2 = (nsa) this.b;
                nsaVar2.getClass();
                if (((pkf) this.c).c != 0) {
                    nsaVar2.k(peerConnection, false);
                    break;
                } else {
                    nsaVar2.u(peerConnection, false);
                    break;
                }
            case 2:
                nsa nsaVar3 = (nsa) this.b;
                nsaVar3.getClass();
                if (!((PeerConnection) obj).getStats((StatsObserver) this.c, (MediaStreamTrack) null)) {
                    nsaVar3.K0.log("PCRTCClient", nsaVar3.toString() + ": failed to get stats");
                    break;
                }
                break;
            case 3:
                nsa nsaVar4 = (nsa) this.b;
                nsaVar4.getClass();
                StringBuilder sb2 = new StringBuilder("❄ -> removed ice candidates: ");
                IceCandidate[] iceCandidateArr = (IceCandidate[]) this.c;
                sb2.append(Arrays.toString(iceCandidateArr));
                nsaVar4.K0.log("PCRTCClient", sb2.toString());
                nsaVar4.C0.post(new do9(nsaVar4, 9, iceCandidateArr));
                break;
            case 4:
                ((PeerConnection) obj).setConfiguration(((nsa) this.b).g((List) this.c));
                break;
            case 5:
                ar0 ar0Var = (ar0) this.b;
                ar0Var.getClass();
                boolean zIsHardwareAccelerated = ((VideoEncoderObserver.EncoderInfo) this.c).isHardwareAccelerated();
                nsa nsaVar5 = (nsa) ar0Var.b;
                if (!zIsHardwareAccelerated) {
                    nsaVar5.g1.m(Float.valueOf(nsaVar5.s1), Float.valueOf(nsaVar5.t1));
                    break;
                } else {
                    nsaVar5.g1.m(null, null);
                    break;
                }
            default:
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4((WaitingRoomParticipants) this.b, (sqd) this.c, (cq1) obj);
                break;
        }
    }
}
