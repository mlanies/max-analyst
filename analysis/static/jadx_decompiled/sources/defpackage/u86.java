package defpackage;

import android.net.Uri;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class u86 extends v86 {
    public final boolean b;
    public final zp7 c;
    public final jic d;
    public final awa e;
    public final ref f;
    public final Uri g;
    public int h;
    public final boolean i;
    public final long j;
    public final int k;
    public final Uri l;
    public final long m;

    public u86(boolean z, zp7 zp7Var, jic jicVar, awa awaVar, ref refVar, Uri uri, int i, boolean z2, long j, int i2, Uri uri2) {
        super(10);
        this.b = z;
        this.c = zp7Var;
        this.d = jicVar;
        this.e = awaVar;
        this.f = refVar;
        this.g = uri;
        this.h = i;
        this.i = z2;
        this.j = j;
        this.k = i2;
        this.l = uri2;
        Long l = zp7Var.Z;
        this.m = l != null ? l.longValue() : 0L;
    }

    public static u86 b(u86 u86Var, awa awaVar, ref refVar, Uri uri, int i, boolean z, int i2, Uri uri2, int i3) {
        boolean z2 = u86Var.b;
        zp7 zp7Var = u86Var.c;
        jic jicVar = u86Var.d;
        awa awaVar2 = (i3 & 8) != 0 ? u86Var.e : awaVar;
        ref refVar2 = (i3 & 16) != 0 ? u86Var.f : refVar;
        Uri uri3 = (i3 & 32) != 0 ? u86Var.g : uri;
        int i4 = (i3 & 64) != 0 ? u86Var.h : i;
        boolean z3 = (i3 & 128) != 0 ? u86Var.i : z;
        long j = u86Var.j;
        int i5 = (i3 & 512) != 0 ? u86Var.k : i2;
        Uri uri4 = (i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? u86Var.l : uri2;
        u86Var.getClass();
        return new u86(z2, zp7Var, jicVar, awaVar2, refVar2, uri3, i4, z3, j, i5, uri4);
    }

    @Override // defpackage.v86
    public final Long a() {
        return Long.valueOf(this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u86)) {
            return false;
        }
        u86 u86Var = (u86) obj;
        return this.b == u86Var.b && tpa.f(this.c, u86Var.c) && tpa.f(this.d, u86Var.d) && tpa.f(this.e, u86Var.e) && tpa.f(this.f, u86Var.f) && tpa.f(this.g, u86Var.g) && this.h == u86Var.h && this.i == u86Var.i && this.j == u86Var.j && this.k == u86Var.k && tpa.f(this.l, u86Var.l);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31)) * 31;
        awa awaVar = this.e;
        int iHashCode2 = (iHashCode + (awaVar == null ? 0 : awaVar.hashCode())) * 31;
        ref refVar = this.f;
        int iHashCode3 = (iHashCode2 + (refVar == null ? 0 : refVar.hashCode())) * 31;
        Uri uri = this.g;
        return this.l.hashCode() + k7d.e(this.k, h4f.m(ms2.d(k7d.e(this.h, (iHashCode3 + (uri != null ? uri.hashCode() : 0)) * 31, 31), 31, this.i), 31, this.j), 31);
    }

    public final String toString() {
        return "Media(multiSelect=" + this.b + ", origin=" + this.c + ", resizeOptions=" + this.d + ", photoEditorOptions=" + this.e + ", videoConvertOptions=" + this.f + ", overlay=" + this.g + ", selectionNumber=" + this.h + ", enabled=" + this.i + ", id=" + this.j + ", rotation=" + this.k + ", thumbnailUri=" + this.l + ")";
    }
}
