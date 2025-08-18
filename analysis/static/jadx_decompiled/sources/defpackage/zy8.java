package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zy8 {
    public final Set a;
    public final Long b;
    public final boolean c;
    public final bz8 d;
    public final dz8 e;

    public zy8(Set set, Long l, boolean z, bz8 bz8Var, dz8 dz8Var) {
        this.a = set;
        this.b = l;
        this.c = z;
        this.d = bz8Var;
        this.e = dz8Var;
    }

    public final cz5 a() {
        bz8 bz8Var = this.d;
        return new cz5(this.a, this.b, this.c, bz8Var != null ? bz8Var.a : null, this.e.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy8)) {
            return false;
        }
        zy8 zy8Var = (zy8) obj;
        return tpa.f(this.a, zy8Var.a) && tpa.f(this.b, zy8Var.b) && this.c == zy8Var.c && tpa.f(this.d, zy8Var.d) && tpa.f(this.e, zy8Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int iD = ms2.d((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c);
        bz8 bz8Var = this.d;
        return this.e.hashCode() + ((iD + (bz8Var != null ? bz8Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ForwardMessagesData(messageIds=" + this.a + ", fwdAttachId=" + this.b + ", isForwardAttach=" + this.c + ", inputData=" + this.d + ", quoteData=" + this.e + ")";
    }
}
