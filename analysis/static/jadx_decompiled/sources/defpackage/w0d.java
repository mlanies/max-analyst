package defpackage;

/* loaded from: classes2.dex */
public final class w0d implements y0d {
    public final String X;
    public final boolean Y;
    public final int Z = 0;
    public final long a;
    public final String b;
    public final CharSequence c;
    public final String o;
    public final long s0;
    public final int t0;

    public w0d(long j, String str, String str2, String str3, String str4, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.X = str4;
        this.Y = z;
        this.s0 = j >= 0 ? -j : j;
        this.t0 = gja.r;
    }

    @Override // defpackage.y0d
    public final int a() {
        return this.Z;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.s0;
    }

    @Override // defpackage.ol7
    public final int l() {
        return this.t0;
    }
}
