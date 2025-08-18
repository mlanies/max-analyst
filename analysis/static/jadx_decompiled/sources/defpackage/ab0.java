package defpackage;

/* loaded from: classes.dex */
public final class ab0 {
    public final mc0 a;
    public final o90 b;
    public final int c;

    public ab0(mc0 mc0Var, o90 o90Var, int i) {
        this.a = mc0Var;
        this.b = o90Var;
        this.c = i;
    }

    public static nw4 a() {
        nw4 nw4Var = new nw4(2);
        nw4Var.o = -1;
        nw4Var.c = o90.a().k();
        nw4Var.b = mc0.a().a();
        return nw4Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ab0)) {
            return false;
        }
        ab0 ab0Var = (ab0) obj;
        return this.a.equals(ab0Var.a) && this.b.equals(ab0Var.b) && this.c == ab0Var.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.a);
        sb.append(", audioSpec=");
        sb.append(this.b);
        sb.append(", outputFormat=");
        return zr6.j(sb, this.c, "}");
    }
}
