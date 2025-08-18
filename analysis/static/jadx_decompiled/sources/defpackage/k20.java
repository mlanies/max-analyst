package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class k20 {
    public static final k20 r = new h20().a();
    public final long a;
    public final int b;
    public final long c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final String h;
    public final String i;
    public final byte[] j;
    public final long k;
    public final j20 l;
    public final String m;
    public final uy n;
    public final boolean o;
    public final int p;
    public final int q;

    public k20(h20 h20Var) {
        this.a = h20Var.a;
        this.b = h20Var.q;
        this.c = h20Var.b;
        this.d = h20Var.c;
        this.e = h20Var.d;
        this.f = h20Var.e;
        this.g = h20Var.f;
        this.h = h20Var.g;
        this.i = h20Var.h;
        this.j = h20Var.i;
        this.k = h20Var.j;
        this.l = h20Var.k;
        this.m = h20Var.l;
        this.n = h20Var.m;
        this.o = h20Var.n;
        this.p = h20Var.o;
        this.q = h20Var.p;
    }

    public final h20 a() {
        h20 h20Var = new h20();
        h20Var.a = this.a;
        h20Var.q = this.b;
        h20Var.b = this.c;
        h20Var.c = this.d;
        h20Var.d = this.e;
        h20Var.e = this.f;
        h20Var.f = this.g;
        h20Var.g = this.h;
        h20Var.h = this.i;
        h20Var.i = this.j;
        h20Var.j = this.k;
        h20Var.k = this.l;
        h20Var.l = this.m;
        h20Var.m = this.n;
        h20Var.n = this.o;
        h20Var.o = this.p;
        h20Var.p = this.q;
        return h20Var;
    }

    public final String toString() {
        String string = Arrays.toString(this.j);
        StringBuilder sb = new StringBuilder("Video{videoId=");
        sb.append(this.a);
        sb.append(", videoType=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "VIDEO_MESSAGE" : "VIDEO");
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(", thumbnail='");
        sb.append(this.d);
        sb.append("', width=");
        sb.append(this.e);
        sb.append(", height=");
        sb.append(this.f);
        sb.append(", live=");
        sb.append(this.g);
        sb.append(", externalUrl='");
        sb.append(this.h);
        sb.append("', externalSiteName='");
        sb.append(this.i);
        sb.append("', previewData=");
        sb.append(string);
        sb.append(", startTime=");
        sb.append(this.k);
        sb.append(", convertOptions=");
        sb.append(this.l);
        sb.append(", token='");
        sb.append(this.m);
        sb.append("', videoCollage=");
        sb.append(this.n);
        sb.append(", ignoreAutoplay=");
        sb.append(this.o);
        sb.append(", audioTrackIndex=");
        sb.append(this.p);
        sb.append(", audioGroupIndex=");
        return zr6.j(sb, this.q, "}");
    }
}
