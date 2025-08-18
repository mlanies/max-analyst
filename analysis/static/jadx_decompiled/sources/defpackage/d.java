package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.EglBase;
import org.webrtc.MediaStreamTrack;
import org.webrtc.VideoSink;

/* loaded from: classes2.dex */
public final class d implements mq7, ii9 {
    public volatile VideoSink A0;
    public final aq7 B0;
    public final dnc C0;
    public final vte D0;
    public final ync E0;
    public final u5e F0;
    public ece H0;
    public final ji9 X;
    public final Context Y;
    public final String Z;
    public final EglBase.Context a;
    public final xx0 b;
    public final qld c;
    public final i50 o;
    public final String s0;
    public final String t0;
    public final Integer u0;
    public final a4c v0;
    public final boolean w0;
    public final ag1 x0;
    public volatile kq7 z0;
    public final CopyOnWriteArraySet y0 = new CopyOnWriteArraySet();
    public jx1 G0 = null;

    public d(nld nldVar) {
        a4c a4cVar = nldVar.e;
        this.v0 = a4cVar;
        this.c = nldVar.a;
        this.o = nldVar.b;
        this.u0 = nldVar.j;
        this.Y = nldVar.d;
        this.X = nldVar.c;
        this.a = nldVar.l;
        this.w0 = nldVar.k;
        this.x0 = nldVar.f;
        this.b = nldVar.g;
        this.B0 = nldVar.m;
        this.C0 = nldVar.o;
        if (TextUtils.isEmpty(nldVar.i)) {
            this.s0 = "ARDAMSv0";
            this.t0 = "ARDAMSa0";
            this.Z = "ARDAMS";
        } else {
            this.s0 = zr6.l(new StringBuilder(), nldVar.i, "v0");
            this.t0 = zr6.l(new StringBuilder(), nldVar.i, "a0");
            this.Z = nldVar.i;
        }
        a4cVar.log("SlmsSource", "local media stream id = " + this.Z + " local video track id = " + this.s0 + " local audio track id = " + this.t0);
        this.D0 = nldVar.n;
        this.E0 = nldVar.p;
        this.F0 = nldVar.h;
    }

    public final ar0 a() {
        boolean z = this.z0 == null;
        if (z) {
            jq7 jq7Var = new jq7();
            jq7Var.o = false;
            jq7Var.s = null;
            jq7Var.t = false;
            jq7Var.a = this.c.d;
            jq7Var.c = this.c.a;
            jq7Var.b = this.o;
            jq7Var.e = this.Z;
            jq7Var.f = this.s0;
            jq7Var.g = this.t0;
            jq7Var.d = this.Y.getApplicationContext();
            jq7Var.h = this.v0;
            jq7Var.i = this.a;
            jq7Var.k = true;
            jq7Var.j = this.b;
            jq7Var.p = this.w0;
            ag1 ag1Var = this.x0;
            jq7Var.l = ag1Var.s;
            aq7 aq7Var = this.B0;
            jq7Var.q = aq7Var;
            jq7Var.m = this.C0;
            jq7Var.s = this.u0;
            yf1 yf1Var = ag1Var.B;
            jq7Var.t = yf1Var.a;
            jq7Var.o = yf1Var.k;
            jq7Var.n = this.D0;
            jq7Var.r = this.F0;
            if (jq7Var.a == null || aq7Var == null || jq7Var.b == null || TextUtils.isEmpty(jq7Var.e) || TextUtils.isEmpty(jq7Var.f) || TextUtils.isEmpty(jq7Var.g) || jq7Var.h == null || jq7Var.j == null || jq7Var.i == null || jq7Var.m == null || jq7Var.n == null || jq7Var.r == null) {
                throw new IllegalStateException();
            }
            this.z0 = new kq7(jq7Var);
            this.z0.x = this.H0;
            this.z0.c.add(this);
            if (this.G0 != null) {
                this.z0.l(this.G0);
            }
            VideoSink videoSink = this.A0;
            if (videoSink != null) {
                this.z0.k(videoSink);
            }
            this.z0.d(this.X);
            ync yncVar = this.E0;
            if (yncVar != null) {
                kq7 kq7Var = this.z0;
                kq7Var.getClass();
                ((aab) yncVar.b).b = new iq7(kq7Var);
            }
        }
        return new ar0(this.z0, z);
    }

    @Override // defpackage.mq7
    public final void b(kq7 kq7Var) {
        this.v0.log("SlmsSource", "onLocalMediaStreamChanged");
        Iterator it = this.y0.iterator();
        while (it.hasNext()) {
            ((mq7) it.next()).b(kq7Var);
        }
    }

    public final int c() {
        kq7 kq7Var = this.z0;
        if (kq7Var == null) {
            return 0;
        }
        tv1 tv1Var = kq7Var.r;
        if (tv1Var != null && tv1Var.k) {
            MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) kq7Var.y.X;
            if (mediaStreamTrack != null ? mediaStreamTrack.enabled() : false) {
                return tv1Var.i ? 1 : 2;
            }
        }
        zuc zucVar = kq7Var.t;
        if (zucVar == null || !zucVar.d) {
            return 0;
        }
        MediaStreamTrack mediaStreamTrack2 = (MediaStreamTrack) kq7Var.z.X;
        return mediaStreamTrack2 != null ? mediaStreamTrack2.enabled() : false ? 3 : 0;
    }

    @Override // defpackage.ii9
    public final void i(ji9 ji9Var) {
        this.v0.log("SlmsSource", "onMediaSettingsChanged, " + ji9Var);
        this.c.a.execute(new c(this, 1, ji9Var));
    }
}
