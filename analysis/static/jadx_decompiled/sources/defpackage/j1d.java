package defpackage;

/* loaded from: classes2.dex */
public final class j1d implements l1d {
    public final jqe a;
    public final long b;
    public final int c = nha.G;

    public j1d(eqe eqeVar, long j) {
        this.a = eqeVar;
        this.b = j;
    }

    @Override // defpackage.l1d
    public final int a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1d)) {
            return false;
        }
        j1d j1dVar = (j1d) obj;
        return tpa.f(this.a, j1dVar.a) && this.b == j1dVar.b;
    }

    @Override // defpackage.l1d
    public final boolean g() {
        return false;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.b;
    }

    @Override // defpackage.kfd
    public final jqe getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return au1.s(4) + h4f.m(k7d.e(1, this.a.hashCode() * 31, 31), 31, this.b);
    }

    @Override // defpackage.kfd, defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header(title=");
        sb.append(this.a);
        sb.append(", sectionId=1, itemId=");
        ms2.j(this.b, ", sectionItemType=", "SOLO", sb);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.kfd
    public final int u() {
        return 1;
    }
}
