package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.List;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;

/* loaded from: classes.dex */
public abstract class ej3 implements gqa {
    public Object X;
    public final Object a;
    public final Object b;
    public final Object c;
    public Object o;

    public ej3(isa isaVar, a4c a4cVar, esa esaVar, o9g o9gVar) {
        this.a = isaVar;
        this.b = a4cVar;
        this.o = esaVar;
        this.c = new Handler(Looper.getMainLooper());
        this.X = o9gVar;
    }

    public abstract void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack);

    public abstract void c(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack);

    public abstract void d();

    public abstract void e(bg1 bg1Var, String str);

    public abstract void f();

    public abstract MediaSource g();

    public abstract MediaStreamTrack h(String str, MediaSource mediaSource);

    public abstract Object i();

    public String j() {
        return getClass().getSimpleName();
    }

    public abstract void k(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr);

    public void l() {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.X;
        a4c a4cVar = (a4c) this.c;
        if (mediaStreamTrack != null) {
            a4cVar.log(j(), this + ": An attempt to create track, while got one, ignore");
            return;
        }
        if (((MediaSource) this.o) != null) {
            a4cVar.log(j(), this + ": An attempt to create source, while got one, ignore");
            return;
        }
        MediaSource mediaSourceG = g();
        this.o = mediaSourceG;
        MediaStreamTrack mediaStreamTrackH = h((String) this.a, mediaSourceG);
        this.X = mediaStreamTrackH;
        b((MediaStream) this.b, mediaStreamTrackH);
    }

    public void m() {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.X;
        if (mediaStreamTrack != null) {
            c((MediaStream) this.b, mediaStreamTrack);
        }
        MediaStreamTrack mediaStreamTrack2 = (MediaStreamTrack) this.X;
        a4c a4cVar = (a4c) this.c;
        if (mediaStreamTrack2 != null) {
            mediaStreamTrack2.dispose();
            a4cVar.log(j(), this + ": " + jb9.c(mediaStreamTrack2) + " was disposed");
        }
        this.X = null;
        MediaSource mediaSource = (MediaSource) this.o;
        if (mediaSource != null) {
            mediaSource.dispose();
            a4cVar.log(j(), this + ": " + jb9.c(mediaSource) + " was disposed");
        }
        this.o = null;
    }

    public void n(qi3 qi3Var) {
        synchronized (this.c) {
            if (((LinkedHashSet) this.X).remove(qi3Var) && ((LinkedHashSet) this.X).isEmpty()) {
                s();
            }
        }
    }

    public void o(boolean z) {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.X;
        if (mediaStreamTrack != null) {
            mediaStreamTrack.setEnabled(z);
        }
    }

    public abstract void p(String str, fp1 fp1Var, List list);

    public void q(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.o;
            if (obj2 == null || !obj2.equals(obj)) {
                this.o = obj;
                ((k40) ((bkb) ((wne) this.a)).c).execute(new wt1(x53.D0((LinkedHashSet) this.X), 12, this));
            }
        }
    }

    public abstract void r();

    public abstract void s();

    public void t(RtpSender rtpSender) {
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) this.X;
        if (rtpSender == null || mediaStreamTrack == null || rtpSender.track() == mediaStreamTrack) {
            return;
        }
        ((a4c) this.c).log(j(), this + ": bind " + jb9.c(mediaStreamTrack) + " with " + jb9.c(rtpSender));
        rtpSender.setTrack(mediaStreamTrack, false);
    }

    public ej3(String str, MediaStream mediaStream, a4c a4cVar) {
        this.a = str;
        this.b = mediaStream;
        this.c = a4cVar;
    }

    public ej3(Context context, bkb bkbVar) {
        this.a = bkbVar;
        this.b = context.getApplicationContext();
        this.c = new Object();
        this.X = new LinkedHashSet();
    }
}
