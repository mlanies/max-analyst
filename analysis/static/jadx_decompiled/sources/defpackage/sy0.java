package defpackage;

/* loaded from: classes.dex */
public final class sy0 implements kfd {
    public final jfd X;
    public final jqe Y;
    public final hfd Z;
    public final int a;
    public final jqe b;
    public final int c;
    public final long o;
    public final Integer s0;
    public final int t0;
    public final boolean u0;

    public sy0(eqe eqeVar, long j, jfd jfdVar, eqe eqeVar2, hfd hfdVar, Integer num, int i, boolean z, int i2) {
        jfdVar = (i2 & 16) != 0 ? jfd.b : jfdVar;
        eqeVar2 = (i2 & 32) != 0 ? null : eqeVar2;
        hfdVar = (i2 & 64) != 0 ? null : hfdVar;
        i = (i2 & 256) != 0 ? y7a.l0 : i;
        z = (i2 & 512) != 0 ? true : z;
        this.a = 4;
        this.b = eqeVar;
        this.c = 0;
        this.o = j;
        this.X = jfdVar;
        this.Y = eqeVar2;
        this.Z = hfdVar;
        this.s0 = num;
        this.t0 = i;
        this.u0 = z;
    }

    @Override // defpackage.kfd
    public final jqe b() {
        return this.Y;
    }

    @Override // defpackage.kfd
    public final bfd c() {
        return null;
    }

    @Override // defpackage.kfd
    public final jqe d() {
        return null;
    }

    @Override // defpackage.kfd
    public final hfd e() {
        return this.Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy0)) {
            return false;
        }
        sy0 sy0Var = (sy0) obj;
        return this.a == sy0Var.a && tpa.f(this.b, sy0Var.b) && this.c == sy0Var.c && this.o == sy0Var.o && this.X == sy0Var.X && tpa.f(this.Y, sy0Var.Y) && tpa.f(this.Z, sy0Var.Z) && tpa.f(this.s0, sy0Var.s0) && this.t0 == sy0Var.t0 && this.u0 == sy0Var.u0;
    }

    @Override // defpackage.kfd
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

    @Override // defpackage.kfd
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
        return Boolean.hashCode(this.u0) + k7d.e(this.t0, (iHashCode3 + (num != null ? num.hashCode() : 0)) * 31, 31);
    }

    @Override // defpackage.kfd, defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.t0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionItem(sectionItemType=");
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
        sb.append(", viewType=");
        sb.append(this.t0);
        sb.append(", isAvailable=");
        return au1.j(sb, this.u0, ")");
    }

    @Override // defpackage.kfd
    public final int u() {
        return this.c;
    }
}
