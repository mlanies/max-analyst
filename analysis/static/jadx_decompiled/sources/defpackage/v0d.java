package defpackage;

/* loaded from: classes2.dex */
public final class v0d implements z0d {
    public final jfd X;
    public final jqe Y;
    public final hfd Z;
    public final int a;
    public final jqe b;
    public final int c;
    public final long o;
    public final Integer s0;
    public final boolean t0;
    public final int u0;

    public v0d(int i, jqe jqeVar, int i2, long j, jfd jfdVar, jqe jqeVar2, hfd hfdVar, Integer num, boolean z, int i3) {
        jfdVar = (i3 & 16) != 0 ? jfd.b : jfdVar;
        jqeVar2 = (i3 & 32) != 0 ? null : jqeVar2;
        hfdVar = (i3 & 64) != 0 ? null : hfdVar;
        num = (i3 & 128) != 0 ? null : num;
        z = (i3 & 256) != 0 ? true : z;
        this.a = i;
        this.b = jqeVar;
        this.c = i2;
        this.o = j;
        this.X = jfdVar;
        this.Y = jqeVar2;
        this.Z = hfdVar;
        this.s0 = num;
        this.t0 = z;
        this.u0 = iha.v;
    }

    @Override // defpackage.z0d
    public final int a() {
        return this.a;
    }

    @Override // defpackage.z0d, defpackage.kfd
    public final jqe b() {
        return this.Y;
    }

    @Override // defpackage.z0d, defpackage.kfd
    public final hfd e() {
        return this.Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0d)) {
            return false;
        }
        v0d v0dVar = (v0d) obj;
        return this.a == v0dVar.a && tpa.f(this.b, v0dVar.b) && this.c == v0dVar.c && this.o == v0dVar.o && this.X == v0dVar.X && tpa.f(this.Y, v0dVar.Y) && tpa.f(this.Z, v0dVar.Z) && tpa.f(this.s0, v0dVar.s0) && this.t0 == v0dVar.t0;
    }

    @Override // defpackage.z0d, defpackage.kfd
    public final Integer f() {
        return this.s0;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.o;
    }

    @Override // defpackage.kfd
    public final jqe getTitle() {
        return this.b;
    }

    @Override // defpackage.z0d, defpackage.kfd
    public final jfd getType() {
        return this.X;
    }

    public final int hashCode() {
        int iHashCode = (this.X.hashCode() + h4f.m(k7d.e(this.c, k7d.f(au1.s(this.a) * 31, 31, this.b), 31), 31, this.o)) * 31;
        jqe jqeVar = this.Y;
        int iHashCode2 = (iHashCode + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31;
        hfd hfdVar = this.Z;
        int iHashCode3 = (iHashCode2 + (hfdVar == null ? 0 : hfdVar.hashCode())) * 31;
        Integer num = this.s0;
        return Boolean.hashCode(this.t0) + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Override // defpackage.kfd, defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.u0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingPrivacyItem(sectionItemType=");
        sb.append(z7b.m(this.a));
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", sectionId=");
        sb.append(this.c);
        sb.append(", itemId=");
        sb.append(this.o);
        sb.append(", type=");
        sb.append(this.X);
        sb.append(", descriptionRes=");
        sb.append(this.Y);
        sb.append(", endView=");
        sb.append(this.Z);
        sb.append(", startIconRes=");
        sb.append(this.s0);
        sb.append(", clickable=");
        return au1.j(sb, this.t0, ")");
    }

    @Override // defpackage.kfd
    public final int u() {
        return this.c;
    }
}
