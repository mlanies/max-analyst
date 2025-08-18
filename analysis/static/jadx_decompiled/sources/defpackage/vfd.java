package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class vfd implements kfd {
    public final jqe X;
    public final Integer Y;
    public final hfd Z;
    public final long a;
    public final int b;
    public final jqe c;
    public final jfd o;
    public final bfd s0;
    public final jqe t0;
    public final int u0;
    public final wed v0;

    public vfd(long j, int i, jqe jqeVar, jfd jfdVar, jqe jqeVar2, Integer num, hfd hfdVar, bfd bfdVar, jqe jqeVar3, int i2, wed wedVar) {
        this.a = j;
        this.b = i;
        this.c = jqeVar;
        this.o = jfdVar;
        this.X = jqeVar2;
        this.Y = num;
        this.Z = hfdVar;
        this.s0 = bfdVar;
        this.t0 = jqeVar3;
        this.u0 = i2;
        this.v0 = wedVar;
    }

    public static vfd k(vfd vfdVar, cqe cqeVar, dfd dfdVar, int i) {
        long j = vfdVar.a;
        int i2 = vfdVar.b;
        jqe jqeVar = (i & 4) != 0 ? vfdVar.c : cqeVar;
        jfd jfdVar = vfdVar.o;
        jqe jqeVar2 = vfdVar.X;
        Integer num = vfdVar.Y;
        hfd hfdVar = (i & 64) != 0 ? vfdVar.Z : dfdVar;
        bfd bfdVar = vfdVar.s0;
        jqe jqeVar3 = vfdVar.t0;
        int i3 = vfdVar.u0;
        wed wedVar = vfdVar.v0;
        vfdVar.getClass();
        return new vfd(j, i2, jqeVar, jfdVar, jqeVar2, num, hfdVar, bfdVar, jqeVar3, i3, wedVar);
    }

    @Override // defpackage.kfd
    public final jqe b() {
        return this.X;
    }

    @Override // defpackage.kfd
    public final bfd c() {
        return this.s0;
    }

    @Override // defpackage.kfd
    public final jqe d() {
        return this.t0;
    }

    @Override // defpackage.kfd
    public final hfd e() {
        return this.Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfd)) {
            return false;
        }
        vfd vfdVar = (vfd) obj;
        return this.a == vfdVar.a && this.b == vfdVar.b && tpa.f(this.c, vfdVar.c) && this.o == vfdVar.o && tpa.f(this.X, vfdVar.X) && tpa.f(this.Y, vfdVar.Y) && tpa.f(this.Z, vfdVar.Z) && tpa.f(this.s0, vfdVar.s0) && tpa.f(this.t0, vfdVar.t0) && this.u0 == vfdVar.u0 && tpa.f(this.v0, vfdVar.v0);
    }

    @Override // defpackage.kfd
    public final Integer f() {
        return this.Y;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.kfd
    public final jqe getTitle() {
        return this.c;
    }

    @Override // defpackage.kfd
    public final jfd getType() {
        return this.o;
    }

    public final int hashCode() {
        int iHashCode = (this.o.hashCode() + k7d.f(k7d.e(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c)) * 31;
        jqe jqeVar = this.X;
        int iHashCode2 = (iHashCode + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31;
        Integer num = this.Y;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        hfd hfdVar = this.Z;
        int iHashCode4 = (iHashCode3 + (hfdVar == null ? 0 : hfdVar.hashCode())) * 31;
        bfd bfdVar = this.s0;
        int iHashCode5 = (iHashCode4 + (bfdVar == null ? 0 : bfdVar.hashCode())) * 31;
        jqe jqeVar2 = this.t0;
        int iE = k7d.e(this.u0, (iHashCode5 + (jqeVar2 == null ? 0 : jqeVar2.hashCode())) * 31, 31);
        wed wedVar = this.v0;
        return iE + (wedVar != null ? wedVar.hashCode() : 0);
    }

    @Override // defpackage.kfd
    public final int q() {
        return this.u0;
    }

    @Override // defpackage.kfd
    public final wed s() {
        return this.v0;
    }

    public final String toString() {
        return "SettingsItemModel(itemId=" + this.a + ", sectionId=" + this.b + ", title=" + this.c + ", type=" + this.o + ", descriptionRes=" + this.X + ", startIconRes=" + this.Y + ", endView=" + this.Z + ", counterType=" + this.s0 + ", upperText=" + this.t0 + ", startIconPadding=" + this.u0 + ", avatarParams=" + this.v0 + ")";
    }

    @Override // defpackage.kfd
    public final int u() {
        return this.b;
    }

    public /* synthetic */ vfd(long j, int i, jqe jqeVar, jfd jfdVar, jqe jqeVar2, Integer num, hfd hfdVar, zed zedVar, jqe jqeVar3, int i2, wed wedVar, int i3) {
        this(j, i, jqeVar, (i3 & 8) != 0 ? jfd.b : jfdVar, (i3 & 16) != 0 ? null : jqeVar2, (i3 & 32) != 0 ? null : num, (i3 & 64) != 0 ? null : hfdVar, (i3 & 128) != 0 ? null : zedVar, (i3 & 256) != 0 ? null : jqeVar3, (i3 & 512) != 0 ? tu0.G(8 * fk4.d().getDisplayMetrics().density) : i2, (i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : wedVar);
    }
}
