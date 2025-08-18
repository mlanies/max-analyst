package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class d02 implements f02 {
    public final String X;
    public final String Y;
    public final jqe Z;
    public final int a;
    public final List b;
    public final boolean c;
    public final ow4 o;
    public final int s0;
    public final boolean t0;
    public final long u0;
    public final int v0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [jqe] */
    public d02(int i, List list, boolean z, ow4 ow4Var, String str, String str2, iqe iqeVar, long j, int i2) {
        this(i, list, z, ow4Var, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? ow4Var.b : iqeVar, ow4Var.c, false, j);
    }

    public static d02 k(d02 d02Var, boolean z) {
        return new d02(d02Var.a, d02Var.b, z, d02Var.o, d02Var.X, d02Var.Y, d02Var.Z, d02Var.s0, d02Var.t0, d02Var.u0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d02.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        d02 d02Var = (d02) obj;
        if (this.a != d02Var.a || this.c != d02Var.c || this.o != d02Var.o || !tpa.f(this.X, d02Var.X) || !tpa.f(this.Y, d02Var.Y)) {
            return false;
        }
        if (!tpa.f(this.Z, d02Var.Z)) {
            return false;
        }
        if (this.s0 != d02Var.s0) {
            return false;
        }
        if (this.u0 != d02Var.u0) {
            return false;
        }
        return this.v0 == d02Var.v0;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.u0;
    }

    @Override // defpackage.f02
    public final jqe getName() {
        return this.Z;
    }

    public final int hashCode() {
        int iHashCode = (this.o.hashCode() + ms2.d(this.a * 31, 31, this.c)) * 31;
        String str = this.X;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.Y;
        return h4f.m((k7d.f((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.Z) + this.s0) * 31, 31, this.u0) + this.v0;
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.v0;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        if (!(ol7Var instanceof d02)) {
            return null;
        }
        boolean z = this.c;
        boolean z2 = ((d02) ol7Var).c;
        if (z != z2) {
            return new c02(z2);
        }
        return null;
    }

    @Override // defpackage.f02
    public final boolean r() {
        return this.t0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiGroup(groupIndex=");
        sb.append(this.a);
        sb.append(", emojis=");
        sb.append(this.b);
        sb.append(", selected=");
        sb.append(this.c);
        sb.append(", category=");
        sb.append(this.o);
        sb.append(", iconUrl=");
        sb.append(this.X);
        sb.append(", iconLottieUrl=");
        sb.append(this.Y);
        sb.append(", name=");
        sb.append(this.Z);
        sb.append(", iconRes=");
        sb.append(this.s0);
        sb.append(", clearCategoryAvailable=");
        sb.append(this.t0);
        sb.append(", itemId=");
        return zr6.k(sb, this.u0, ")");
    }

    public d02(int i, List list, boolean z, ow4 ow4Var, String str, String str2, jqe jqeVar, int i2, boolean z2, long j) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.o = ow4Var;
        this.X = str;
        this.Y = str2;
        this.Z = jqeVar;
        this.s0 = i2;
        this.t0 = z2;
        this.u0 = j;
        this.v0 = jca.q;
    }
}
