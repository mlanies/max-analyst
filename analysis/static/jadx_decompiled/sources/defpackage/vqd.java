package defpackage;

/* loaded from: classes2.dex */
public final class vqd implements x38 {
    public final long a;
    public final String b;
    public final yt6 c;
    public final boolean d;

    public vqd(long j, String str, yt6 yt6Var, boolean z) {
        this.a = j;
        this.b = str;
        this.c = yt6Var;
        this.d = z;
    }

    @Override // defpackage.x38
    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqd)) {
            return false;
        }
        vqd vqdVar = (vqd) obj;
        return this.a == vqdVar.a && tpa.f(this.b, vqdVar.b) && tpa.f(this.c, vqdVar.c) && this.d == vqdVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + rh4.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleImageAttach(messageId=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", imageAttach=");
        sb.append(this.c);
        sb.append(", isMediaOrderedFirst=");
        return au1.j(sb, this.d, ")");
    }
}
