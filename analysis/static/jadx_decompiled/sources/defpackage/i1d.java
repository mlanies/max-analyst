package defpackage;

/* loaded from: classes2.dex */
public final class i1d implements l1d {
    public final jqe a;
    public final long b;
    public final jqe c;
    public final int o = nha.F;

    public i1d(eqe eqeVar, long j, iqe iqeVar) {
        this.a = eqeVar;
        this.b = j;
        this.c = iqeVar;
    }

    @Override // defpackage.l1d
    public final int a() {
        return 3;
    }

    @Override // defpackage.l1d, defpackage.kfd
    public final jqe b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1d)) {
            return false;
        }
        i1d i1dVar = (i1d) obj;
        return tpa.f(this.a, i1dVar.a) && this.b == i1dVar.b && tpa.f(this.c, i1dVar.c);
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
        int iG = ey8.g(3, h4f.m(k7d.e(1, this.a.hashCode() * 31, 31), 31, this.b), 31);
        jqe jqeVar = this.c;
        return iG + (jqeVar == null ? 0 : jqeVar.hashCode());
    }

    @Override // defpackage.kfd, defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClearCacheButton(title=");
        sb.append(this.a);
        sb.append(", sectionId=1, itemId=");
        ms2.j(this.b, ", sectionItemType=", "LAST", sb);
        sb.append(", descriptionRes=");
        return rh4.l(sb, this.c, ")");
    }

    @Override // defpackage.kfd
    public final int u() {
        return 1;
    }
}
