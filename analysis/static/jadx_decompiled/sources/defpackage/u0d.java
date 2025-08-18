package defpackage;

/* loaded from: classes2.dex */
public final class u0d implements z0d {
    public final jqe a;
    public final int b;
    public final long c;
    public final int o = iha.u;

    public u0d(eqe eqeVar, int i, long j) {
        this.a = eqeVar;
        this.b = i;
        this.c = j;
    }

    @Override // defpackage.z0d
    public final int a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0d)) {
            return false;
        }
        u0d u0dVar = (u0d) obj;
        return tpa.f(this.a, u0dVar.a) && this.b == u0dVar.b && this.c == u0dVar.c;
    }

    @Override // defpackage.z0d
    public final boolean g() {
        return false;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.c;
    }

    @Override // defpackage.kfd
    public final jqe getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return au1.s(4) + h4f.m(k7d.e(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    @Override // defpackage.kfd, defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header(title=");
        sb.append(this.a);
        sb.append(", sectionId=");
        sb.append(this.b);
        sb.append(", itemId=");
        ms2.j(this.c, ", sectionItemType=", "SOLO", sb);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.kfd
    public final int u() {
        return this.b;
    }
}
