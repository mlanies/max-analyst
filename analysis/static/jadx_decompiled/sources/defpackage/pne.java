package defpackage;

/* loaded from: classes2.dex */
public final class pne {
    public final long a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final long o;

    public pne(one oneVar) {
        long j = oneVar.a;
        this.a = j;
        this.b = oneVar.b;
        this.c = oneVar.c;
        this.d = oneVar.d;
        this.e = oneVar.e;
        this.f = oneVar.f;
        this.j = oneVar.j;
        this.k = oneVar.k;
        this.g = oneVar.g;
        this.h = oneVar.h;
        this.i = oneVar.i;
        this.l = oneVar.l;
        this.m = oneVar.m;
        this.n = oneVar.n;
        this.o = (j * 31) + r2.hashCode();
    }

    public final boolean a() {
        return this.c > 0 || this.d > 0 || this.e > 0 || this.j > 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaskAttachDownloadData{messageId=");
        sb.append(this.a);
        sb.append(", attachId='");
        sb.append(this.b);
        sb.append("', videoId=");
        sb.append(this.c);
        sb.append(", audioId=");
        sb.append(this.d);
        sb.append(", mp4GifId=");
        sb.append(this.e);
        sb.append(", stickerId=");
        sb.append(this.f);
        sb.append(", url='");
        sb.append(this.g);
        sb.append("', notifyProgress=");
        sb.append(this.h);
        sb.append(", checkAutoLoadConnection=");
        sb.append(this.i);
        sb.append(", fileId=");
        sb.append(this.j);
        sb.append(", fileName='");
        sb.append(this.k);
        sb.append("', invalidateCount=");
        sb.append(this.l);
        sb.append(", useOriginalExtension=");
        sb.append(this.m);
        sb.append(", notCopyVideoToGallery=");
        return au1.j(sb, this.n, "}");
    }
}
