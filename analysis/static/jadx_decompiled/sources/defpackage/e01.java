package defpackage;

/* loaded from: classes.dex */
public final class e01 implements h01 {
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

    public e01(int i, eqe eqeVar, int i2, long j, eqe eqeVar2, ffd ffdVar, Integer num, int i3) {
        jfd jfdVar = jfd.b;
        eqeVar2 = (i3 & 32) != 0 ? null : eqeVar2;
        this.a = i;
        this.b = eqeVar;
        this.c = i2;
        this.o = j;
        this.X = jfdVar;
        this.Y = eqeVar2;
        this.Z = ffdVar;
        this.s0 = num;
        this.t0 = true;
        this.u0 = y7a.g;
    }

    @Override // defpackage.h01
    public final int a() {
        return this.a;
    }

    @Override // defpackage.h01, defpackage.kfd
    public final jqe b() {
        return this.Y;
    }

    @Override // defpackage.h01, defpackage.kfd
    public final hfd e() {
        return this.Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e01)) {
            return false;
        }
        e01 e01Var = (e01) obj;
        return this.a == e01Var.a && tpa.f(this.b, e01Var.b) && this.c == e01Var.c && this.o == e01Var.o && this.X == e01Var.X && tpa.f(this.Y, e01Var.Y) && tpa.f(this.Z, e01Var.Z) && tpa.f(this.s0, e01Var.s0) && this.t0 == e01Var.t0;
    }

    @Override // defpackage.h01, defpackage.kfd
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

    @Override // defpackage.h01, defpackage.kfd
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
        StringBuilder sb = new StringBuilder("CallAdminSettingsItem(sectionItemType=");
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
