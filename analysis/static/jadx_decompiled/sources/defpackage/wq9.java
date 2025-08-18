package defpackage;

import org.webrtc.PeerConnectionFactory;

/* loaded from: classes2.dex */
public final class wq9 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final PeerConnectionFactory.EnhancerKind e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final Runnable m;
    public final int n;

    public wq9(boolean z, boolean z2, boolean z3, boolean z4, PeerConnectionFactory.EnhancerKind enhancerKind, String str, int i, int i2, int i3, int i4, int i5, boolean z5, yh0 yh0Var, int i6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = enhancerKind;
        this.f = str;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = z5;
        this.m = yh0Var;
        this.n = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq9)) {
            return false;
        }
        wq9 wq9Var = (wq9) obj;
        wq9Var.getClass();
        return this.a == wq9Var.a && this.b == wq9Var.b && this.c == wq9Var.c && this.d == wq9Var.d && this.e == wq9Var.e && tpa.f(this.f, wq9Var.f) && this.g == wq9Var.g && this.h == wq9Var.h && this.i == wq9Var.i && this.j == wq9Var.j && this.k == wq9Var.k && this.l == wq9Var.l && tpa.f(this.m, wq9Var.m) && this.n == wq9Var.n;
    }

    public final int hashCode() {
        int iD = ms2.d(ms2.d(ms2.d(ms2.d(Boolean.hashCode(false) * 31, 31, this.a), 31, this.b), 31, this.c), 31, this.d);
        PeerConnectionFactory.EnhancerKind enhancerKind = this.e;
        int iHashCode = (iD + (enhancerKind == null ? 0 : enhancerKind.hashCode())) * 31;
        String str = this.f;
        int iD2 = ms2.d(s36.c(this.k, s36.c(this.j, s36.c(this.i, s36.c(this.h, s36.c(this.g, (iHashCode + (str == null ? 0 : str.hashCode())) * 31))))), 31, this.l);
        Runnable runnable = this.m;
        int iHashCode2 = (iD2 + (runnable == null ? 0 : runnable.hashCode())) * 31;
        int i = this.n;
        return iHashCode2 + (i != 0 ? au1.s(i) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoiseSuppressorActiveState(noiseSuppressorStuttering=false, serversideBasic=");
        sb.append(this.a);
        sb.append(", serversideAnn=");
        sb.append(this.b);
        sb.append(", clientsidePlatform=");
        sb.append(this.c);
        sb.append(", clientsideAnn=");
        sb.append(this.d);
        sb.append(", enhancerKind=");
        sb.append(this.e);
        sb.append(", filePath=");
        sb.append(this.f);
        sb.append(", inputSampleRate=");
        sb.append(this.g);
        sb.append(", outputSampleRate=");
        sb.append(this.h);
        sb.append(", fallbackTimeLimitMillis=");
        sb.append(this.i);
        sb.append(", fallbackStutterCountMillis=");
        sb.append(this.j);
        sb.append(", fallbackTimeframeMillis=");
        sb.append(this.k);
        sb.append(", logTimings=");
        sb.append(this.l);
        sb.append(", onNoiseSuppressorDisabledDueToStutter=");
        sb.append(this.m);
        sb.append(", kind=");
        int i = this.n;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "PIPELINE" : "BASELINE" : "NONE");
        sb.append(")");
        return sb.toString();
    }
}
