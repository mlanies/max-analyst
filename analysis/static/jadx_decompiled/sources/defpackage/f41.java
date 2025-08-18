package defpackage;

/* loaded from: classes.dex */
public final class f41 implements g41 {
    public final long a;
    public final boolean b;
    public final boolean c;

    public f41(long j, boolean z, boolean z2) {
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.g41
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.g41
    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f41)) {
            return false;
        }
        f41 f41Var = (f41) obj;
        return this.a == f41Var.a && this.b == f41Var.b && this.c == f41Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ms2.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(userId=");
        sb.append(this.a);
        sb.append(", isVideoEnabled=");
        sb.append(this.b);
        sb.append(", isAudioEnabled=");
        return au1.j(sb, this.c, ")");
    }
}
