package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class z2e implements ol7 {
    public static final z2e z0 = new z2e(0, 0, 0, null, null, null, 0, 0, false, false, 0, 8190);
    public final String X;
    public final String Y;
    public final int Z;
    public final long a;
    public final long b;
    public final long c;
    public final String o;
    public final int s0;
    public final int t0;
    public final boolean u0;
    public final boolean v0;
    public final boolean w0;
    public final long x0;
    public final int y0;

    public z2e(long j, long j2, long j3, String str, String str2, String str3, int i, int i2, int i3, boolean z, boolean z2, boolean z3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = str;
        this.X = str2;
        this.Y = str3;
        this.Z = i;
        this.s0 = i2;
        this.t0 = i3;
        this.u0 = z;
        this.v0 = z2;
        this.w0 = z3;
        this.x0 = j4;
        this.y0 = (str3 == null || str3.length() == 0) ? (str2 == null || str2.length() == 0) ? tga.h : tga.i : tga.j;
    }

    public static z2e k(z2e z2eVar, boolean z, boolean z2, int i) {
        return new z2e(z2eVar.a, z2eVar.b, z2eVar.c, z2eVar.o, z2eVar.X, z2eVar.Y, z2eVar.Z, z2eVar.s0, z2eVar.t0, z2eVar.u0, (i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? z2eVar.v0 : z, (i & 2048) != 0 ? z2eVar.w0 : z2, z2eVar.x0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2e)) {
            return false;
        }
        z2e z2eVar = (z2e) obj;
        return this.a == z2eVar.a && this.b == z2eVar.b && this.c == z2eVar.c && tpa.f(this.o, z2eVar.o) && tpa.f(this.X, z2eVar.X) && tpa.f(this.Y, z2eVar.Y) && this.Z == z2eVar.Z && this.s0 == z2eVar.s0 && this.t0 == z2eVar.t0 && this.u0 == z2eVar.u0 && this.v0 == z2eVar.v0 && this.w0 == z2eVar.w0 && this.x0 == z2eVar.x0;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.x0;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return this.x0 == ol7Var.getItemId();
    }

    public final int hashCode() {
        int iM = h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.o;
        int iHashCode = (iM + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.X;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.Y;
        return Long.hashCode(this.x0) + ms2.d(ms2.d(ms2.d(k7d.e(this.t0, k7d.e(this.s0, k7d.e(this.Z, (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31), 31), 31, this.u0), 31, this.v0), 31, this.w0);
    }

    @Override // defpackage.ol7
    public final int l() {
        return this.y0;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        if (!(ol7Var instanceof z2e)) {
            return null;
        }
        boolean z = this.w0;
        boolean z2 = ((z2e) ol7Var).w0;
        if (z != z2) {
            return new y2e(z2);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerModel(id=");
        sb.append(this.a);
        sb.append(", setId=");
        sb.append(this.b);
        sb.append(", originalSetId=");
        sb.append(this.c);
        sb.append(", previewUrl=");
        sb.append(this.o);
        sb.append(", lottieUrl=");
        sb.append(this.X);
        sb.append(", videoUrl=");
        sb.append(this.Y);
        sb.append(", markerType=");
        sb.append(this.Z);
        sb.append(", width=");
        sb.append(this.s0);
        sb.append(", height=");
        sb.append(this.t0);
        sb.append(", external=");
        sb.append(this.u0);
        sb.append(", favorite=");
        sb.append(this.v0);
        sb.append(", selected=");
        sb.append(this.w0);
        sb.append(", itemId=");
        return zr6.k(sb, this.x0, ")");
    }

    public /* synthetic */ z2e(long j, long j2, long j3, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, long j4, int i3) {
        this(j, (i3 & 2) != 0 ? 0L : j2, (i3 & 4) != 0 ? 0L : j3, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : str3, 0, (i3 & 128) != 0 ? 0 : i, (i3 & 256) != 0 ? 0 : i2, false, (i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? false : z, (i3 & 2048) != 0 ? false : z2, (i3 & 4096) != 0 ? j : j4);
    }
}
