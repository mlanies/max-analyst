package defpackage;

/* loaded from: classes.dex */
public final class f01 implements h01 {
    public final jqe a;
    public final int b;
    public final int c;

    public f01(int i, eqe eqeVar) {
        int i2 = z7a.c;
        this.a = eqeVar;
        this.b = i;
        this.c = y7a.f;
    }

    @Override // defpackage.h01
    public final int a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f01)) {
            return false;
        }
        f01 f01Var = (f01) obj;
        if (!tpa.f(this.a, f01Var.a) || this.b != f01Var.b) {
            return false;
        }
        long j = z7a.b;
        return j == j;
    }

    @Override // defpackage.h01
    public final boolean g() {
        return false;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return z7a.b;
    }

    @Override // defpackage.kfd
    public final jqe getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return au1.s(4) + h4f.m(k7d.e(this.b, this.a.hashCode() * 31, 31), 31, z7a.b);
    }

    @Override // defpackage.kfd, defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header(title=");
        sb.append(this.a);
        sb.append(", sectionId=");
        sb.append(this.b);
        sb.append(", itemId=");
        ms2.j(z7a.b, ", sectionItemType=", "SOLO", sb);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.kfd
    public final int u() {
        return this.b;
    }
}
