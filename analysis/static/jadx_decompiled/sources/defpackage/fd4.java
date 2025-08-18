package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.MediaStream;
import org.webrtc.RtpReceiver;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;

/* loaded from: classes2.dex */
public final class fd4 extends ej3 {
    public static final olf[] u0 = {olf.a, olf.b};
    public final ConcurrentHashMap Y;
    public final HashMap Z;
    public final ConcurrentHashMap s0;
    public final ConcurrentHashMap t0;

    public fd4(isa isaVar, a4c a4cVar, esa esaVar, o9g o9gVar) {
        super(isaVar, a4cVar, esaVar, o9gVar);
        this.Y = new ConcurrentHashMap();
        this.Z = new HashMap();
        this.s0 = new ConcurrentHashMap();
        this.t0 = new ConcurrentHashMap();
    }

    @Override // defpackage.gqa
    public final void a(bg1 bg1Var, VideoFrame videoFrame) {
        adb adbVar = new adb(3);
        adbVar.a = bg1Var;
        adbVar.b = olf.b;
        List list = (List) this.Y.get(adbVar.c());
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((blf) it.next()).a(videoFrame);
        }
    }

    @Override // defpackage.ej3
    public final void d() {
        ((isa) this.a).a("DefaultRemoteVideoTracks.clearRemoteVideoRenderers", new oj3(1, this));
    }

    @Override // defpackage.ej3
    public final void e(bg1 bg1Var, String str) {
        olf[] olfVarArr = u0;
        for (int i = 0; i < 2; i++) {
            olf olfVar = olfVarArr[i];
            adb adbVar = new adb(3);
            adbVar.b = olfVar;
            adbVar.a = bg1Var;
            p(str, adbVar.c(), null);
        }
    }

    @Override // defpackage.ej3
    public final void f() {
        ((Handler) this.c).removeCallbacksAndMessages(null);
        synchronized (this.Y) {
            try {
                Iterator it = this.Y.values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((blf) it2.next()).a = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        isa isaVar = (isa) this.a;
        isaVar.a.i("DefaultRemoteVideoTracks.closeOnExecutor", new dd4(0, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ej3
    public final void k(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        ((isa) this.a).a("DefaultRemoteVideoTracks.handleVideoTracksOnExecutor", new ed4(this, rtpReceiver, mediaStreamArr, 0));
    }

    @Override // defpackage.ej3
    public final void p(final String str, final fp1 fp1Var, final List list) {
        ((isa) this.a).a("DefaultRemoteVideoTracks.setRemoteVideoRenderersOnExecutor", new rj3() { // from class: cd4
            @Override // defpackage.rj3
            public final void accept(Object obj) {
                this.a.u(str, fp1Var, list);
            }
        });
    }

    public final void u(String str, fp1 fp1Var, List list) {
        synchronized (this.Y) {
            try {
                VideoTrack videoTrack = (VideoTrack) this.Z.get(str);
                if (videoTrack == null) {
                    ((a4c) this.b).log("DefaultRemoteVideoTracks", "no " + fp1Var + " track");
                    return;
                }
                List<blf> list2 = (List) this.Y.get(fp1Var);
                if (list2 == null) {
                    ((a4c) this.b).log("DefaultRemoteVideoTracks", "no renderers for " + fp1Var + " track");
                } else {
                    for (blf blfVar : list2) {
                        blfVar.a = null;
                        try {
                            videoTrack.removeSink(blfVar);
                        } catch (Exception unused) {
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        VideoSink videoSink = (VideoSink) it.next();
                        blf blfVar2 = new blf();
                        blfVar2.a = videoSink;
                        arrayList.add(blfVar2);
                        if (fp1Var.a == olf.a && !videoTrack.isDisposed()) {
                            videoTrack.addSink(blfVar2);
                        }
                    }
                }
                fp1 fp1Var2 = (fp1) this.s0.get(str);
                if (fp1Var2 != null) {
                    this.s0.remove(str);
                    this.t0.remove(fp1Var2);
                }
                this.s0.put(str, fp1Var);
                this.t0.put(fp1Var, str);
                this.Y.put(fp1Var, Collections.unmodifiableList(arrayList));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
