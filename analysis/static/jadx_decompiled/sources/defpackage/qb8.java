package defpackage;

/* loaded from: classes.dex */
public final class qb8 implements sb8 {
    public final String X;
    public final long Y;
    public final int Z;
    public final long a;
    public final long b;
    public final o00 c;
    public final wcf o;

    public qb8(long j, long j2, o00 o00Var, wcf wcfVar, String str) {
        this.a = j;
        this.b = j2;
        this.c = o00Var;
        this.o = wcfVar;
        this.X = str;
        this.Y = wcfVar.g != null ? r1.hashCode() : 0L;
        this.Z = k8a.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb8)) {
            return false;
        }
        qb8 qb8Var = (qb8) obj;
        return this.a == qb8Var.a && this.b == qb8Var.b && tpa.f(this.c, qb8Var.c) && tpa.f(this.o, qb8Var.o) && tpa.f(this.X, qb8Var.X);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.Y;
    }

    public final int hashCode() {
        int iM = h4f.m(Long.hashCode(this.a) * 31, 31, this.b);
        o00 o00Var = this.c;
        return this.X.hashCode() + ((this.o.hashCode() + ((iM + (o00Var == null ? 0 : o00Var.hashCode())) * 31)) * 31);
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
    /* renamed from: l */
    public final int getI0() {
        return this.Z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Video(messageId=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", attachModel=");
        sb.append(this.c);
        sb.append(", videoAttachConfig=");
        sb.append(this.o);
        sb.append(", localId=");
        return zr6.l(sb, this.X, ")");
    }

    @Override // defpackage.sb8
    public final String x() {
        return this.X;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qb8(long j, long j2, o00 o00Var, wcf wcfVar) {
        String str = wcfVar.g;
        this(j, j2, o00Var, wcfVar, str == null ? "" : str);
    }
}
