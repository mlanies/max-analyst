package defpackage;

/* loaded from: classes2.dex */
public final class b1d implements d1d {
    public final jqe a;
    public final int b;
    public final long c;
    public final int o = fha.C;

    public b1d(eqe eqeVar, int i, long j) {
        this.a = eqeVar;
        this.b = i;
        this.c = j;
    }

    @Override // defpackage.d1d
    public final int a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1d)) {
            return false;
        }
        b1d b1dVar = (b1d) obj;
        return tpa.f(this.a, b1dVar.a) && this.b == b1dVar.b && this.c == b1dVar.c;
    }

    @Override // defpackage.d1d
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
