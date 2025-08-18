package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.MediaStream;
import org.webrtc.RtpReceiver;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* loaded from: classes2.dex */
public final class kqa extends ej3 {
    public final ArrayList Y;
    public final ArrayList Z;
    public final ArrayList s0;
    public final HashMap t0;
    public final ConcurrentHashMap u0;
    public final ConcurrentHashMap v0;
    public final ConcurrentHashMap w0;

    public kqa(isa isaVar, a4c a4cVar, esa esaVar, o9g o9gVar) {
        super(isaVar, a4cVar, esaVar, o9gVar);
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.s0 = new ArrayList();
        this.t0 = new HashMap();
        this.u0 = new ConcurrentHashMap();
        this.v0 = new ConcurrentHashMap();
        this.w0 = new ConcurrentHashMap();
    }

    @Override // defpackage.gqa
    public final void a(bg1 bg1Var, VideoFrame videoFrame) {
        adb adbVar = new adb(3);
        adbVar.a = bg1Var;
        adbVar.b = olf.b;
        List list = (List) this.u0.get(adbVar.c());
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((VideoSink) it.next()).onFrame(videoFrame);
            }
        }
    }

    @Override // defpackage.ej3
    public final void d() {
        jb9.e();
        this.u0.clear();
        this.t0.clear();
    }

    @Override // defpackage.ej3
    public final void e(bg1 bg1Var, String str) {
        jb9.e();
        HashMap map = this.t0;
        Set set = (Set) map.get(bg1Var);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.u0.remove((fp1) it.next());
        }
        map.remove(bg1Var);
    }

    @Override // defpackage.ej3
    public final void f() {
        ((Handler) this.c).removeCallbacksAndMessages(null);
        ((isa) this.a).a.i("ParticipantsAgnosticRemoteVideoTracks.closeInternal", new nn6(24, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ej3
    public final void k(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        ((isa) this.a).a("DefaultRemoteVideoTracks.handleVideoTracksOnExecutor", new ed4(this, rtpReceiver, mediaStreamArr, 1));
    }

    @Override // defpackage.ej3
    public final void p(String str, fp1 fp1Var, List list) {
        jb9.e();
        ConcurrentHashMap concurrentHashMap = this.u0;
        HashMap map = this.t0;
        if (list == null) {
            concurrentHashMap.remove(fp1Var);
            Set set = (Set) map.get(fp1Var.b);
            if (set != null) {
                set.remove(fp1Var);
                return;
            }
            return;
        }
        concurrentHashMap.put(fp1Var, list);
        Set hashSet = (Set) map.get(fp1Var.b);
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(fp1Var.b, hashSet);
        }
        hashSet.add(fp1Var);
    }
}
