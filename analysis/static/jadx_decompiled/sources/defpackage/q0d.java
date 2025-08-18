package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class q0d {
    public final sp3 a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final List f;
    public final long g;
    public final int h;
    public final boolean i;
    public final long j;
    public final List k;
    public final List l;
    public final String m;
    public final List n;

    public q0d(p0d p0dVar) {
        this.a = p0dVar.a;
        this.b = p0dVar.b;
        this.c = p0dVar.c;
        this.d = p0dVar.d;
        this.e = p0dVar.e;
        this.f = p0dVar.f;
        this.g = p0dVar.g;
        this.i = p0dVar.i;
        this.h = p0dVar.h;
        this.j = p0dVar.j;
        this.k = p0dVar.k;
        this.l = p0dVar.l;
        this.m = p0dVar.m;
        this.n = p0dVar.n;
    }

    public final String toString() {
        int iO = s5c.o(this.d);
        int iO2 = s5c.o(this.e);
        int iO3 = s5c.o(this.k);
        int iO4 = s5c.o(this.l);
        int iO5 = s5c.o(this.n);
        StringBuilder sb = new StringBuilder("Section{type=");
        sb.append(this.a);
        sb.append(", id='");
        sb.append(this.b);
        sb.append("', title='");
        sb.append(this.c);
        sb.append("', stickers=");
        sb.append(iO);
        sb.append(", stickerSets=");
        sb.append(iO2);
        sb.append(", marker=");
        sb.append(this.g);
        sb.append(", totalCount=");
        sb.append(this.h);
        sb.append(", collapsed=");
        sb.append(this.i);
        sb.append(", updateTime=");
        sb.append(this.j);
        sb.append(", recentEmojiList=");
        sb.append(iO3);
        sb.append(", recentsList=");
        sb.append(iO4);
        sb.append(", animojiSets=");
        sb.append(iO5);
        sb.append(", mode='");
        return zr6.l(sb, this.m, "'}");
    }
}
