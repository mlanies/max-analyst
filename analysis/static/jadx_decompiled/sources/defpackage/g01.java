package defpackage;

/* loaded from: classes.dex */
public final class g01 implements h01 {
    public final jqe a;
    public final jqe b;
    public final int c;

    public g01(eqe eqeVar) {
        int i = z7a.c;
        this.a = eqeVar;
        this.b = null;
        this.c = y7a.e;
    }

    @Override // defpackage.h01
    public final int a() {
        return 4;
    }

    @Override // defpackage.h01, defpackage.kfd
    public final jqe b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g01)) {
            return false;
        }
        g01 g01Var = (g01) obj;
        if (!tpa.f(this.a, g01Var.a)) {
            return false;
        }
        long j = z7a.a;
        return j == j && tpa.f(this.b, g01Var.b);
    }

    @Override // defpackage.h01
    public final boolean g() {
        return false;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return z7a.a;
    }

    @Override // defpackage.kfd
    public final jqe getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int iG = ey8.g(4, h4f.m(k7d.e(0, this.a.hashCode() * 31, 31), 31, z7a.a), 31);
        jqe jqeVar = this.b;
        return iG + (jqeVar != null ? jqeVar.hashCode() : 0);
    }

    @Override // defpackage.kfd, defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderBottom(title=");
        sb.append(this.a);
        sb.append(", sectionId=0, itemId=");
        ms2.j(z7a.a, ", sectionItemType=", "SOLO", sb);
        sb.append(", descriptionRes=");
        return rh4.l(sb, this.b, ")");
    }

    @Override // defpackage.kfd
    public final int u() {
        return 0;
    }
}
