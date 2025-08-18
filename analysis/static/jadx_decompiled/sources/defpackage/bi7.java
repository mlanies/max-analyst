package defpackage;

/* loaded from: classes2.dex */
public final class bi7 extends di7 {
    public final long a;
    public final String b;

    public bi7(long j, String str) {
        this.a = j;
        this.b = str;
    }

    @Override // defpackage.di7
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi7)) {
            return false;
        }
        bi7 bi7Var = (bi7) obj;
        return this.a == bi7Var.a && tpa.f(this.b, bi7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorLinkInfo(requestId=");
        sb.append(this.a);
        sb.append(", error=");
        return zr6.l(sb, this.b, ")");
    }
}
