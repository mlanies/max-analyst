package defpackage;

/* loaded from: classes2.dex */
public final class k1d implements l1d {
    public final jfd X;
    public final jqe Y;
    public final hfd Z;
    public final int a;
    public final jqe b;
    public final int c;
    public final long o;
    public final int s0;

    public k1d(int i, eqe eqeVar, int i2, long j, eqe eqeVar2, dfd dfdVar, int i3) {
        jfd jfdVar = jfd.b;
        eqeVar2 = (i3 & 32) != 0 ? null : eqeVar2;
        this.a = i;
        this.b = eqeVar;
        this.c = i2;
        this.o = j;
        this.X = jfdVar;
        this.Y = eqeVar2;
        this.Z = dfdVar;
        this.s0 = nha.H;
    }

    @Override // defpackage.l1d
    public final int a() {
        return this.a;
    }

    @Override // defpackage.l1d, defpackage.kfd
    public final jqe b() {
        return this.Y;
    }

    @Override // defpackage.l1d, defpackage.kfd
    public final hfd e() {
        return this.Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1d)) {
            return false;
        }
        k1d k1dVar = (k1d) obj;
        return this.a == k1dVar.a && tpa.f(this.b, k1dVar.b) && this.c == k1dVar.c && this.o == k1dVar.o && this.X == k1dVar.X && tpa.f(this.Y, k1dVar.Y) && tpa.f(this.Z, k1dVar.Z);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.o;
    }

    @Override // defpackage.kfd
    public final jqe getTitle() {
        return this.b;
    }

    @Override // defpackage.l1d, defpackage.kfd
    public final jfd getType() {
        return this.X;
    }

    public final int hashCode() {
        int iHashCode = (this.X.hashCode() + h4f.m(k7d.e(this.c, k7d.f(au1.s(this.a) * 31, 31, this.b), 31), 31, this.o)) * 31;
        jqe jqeVar = this.Y;
        int iHashCode2 = (iHashCode + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31;
        hfd hfdVar = this.Z;
        return iHashCode2 + (hfdVar != null ? hfdVar.hashCode() : 0);
    }

    @Override // defpackage.kfd, defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.s0;
    }

    public final String toString() {
        return "SettingStorageItem(sectionItemType=" + z7b.m(this.a) + ", title=" + this.b + ", sectionId=" + this.c + ", itemId=" + this.o + ", type=" + this.X + ", descriptionRes=" + this.Y + ", endView=" + this.Z + ")";
    }

    @Override // defpackage.kfd
    public final int u() {
        return this.c;
    }
}
