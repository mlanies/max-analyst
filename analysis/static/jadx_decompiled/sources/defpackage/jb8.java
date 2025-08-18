package defpackage;

/* loaded from: classes.dex */
public final class jb8 implements sb8 {
    public final boolean X;
    public final String Y;
    public final long Z;
    public final long a;
    public final long b;
    public final o00 c;
    public final yt6 o;
    public final int s0;

    public jb8(long j, long j2, o00 o00Var, yt6 yt6Var, String str, int i) {
        boolean z = yt6Var.e;
        if ((i & 32) != 0 && (str = yt6Var.k) == null) {
            str = "";
        }
        this.a = j;
        this.b = j2;
        this.c = o00Var;
        this.o = yt6Var;
        this.X = z;
        this.Y = str;
        this.Z = yt6Var.k != null ? r2.hashCode() : 0L;
        this.s0 = k8a.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb8)) {
            return false;
        }
        jb8 jb8Var = (jb8) obj;
        return this.a == jb8Var.a && this.b == jb8Var.b && tpa.f(this.c, jb8Var.c) && tpa.f(this.o, jb8Var.o) && this.X == jb8Var.X && tpa.f(this.Y, jb8Var.Y);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.Z;
    }

    public final int hashCode() {
        return this.Y.hashCode() + ms2.d((this.o.hashCode() + ((this.c.hashCode() + h4f.m(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, 31, this.X);
    }

    @Override // defpackage.sb8
    public final long i() {
        return this.b;
    }

    @Override // defpackage.sb8
    public final long j() {
        return this.a;
    }

    @Override // defpackage.ol7
    public final int l() {
        return this.s0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Photo(messageId=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", attachModel=");
        sb.append(this.c);
        sb.append(", imageAttachConfig=");
        sb.append(this.o);
        sb.append(", isGif=");
        sb.append(this.X);
        sb.append(", localId=");
        return zr6.l(sb, this.Y, ")");
    }

    @Override // defpackage.sb8
    public final String x() {
        return this.Y;
    }
}
