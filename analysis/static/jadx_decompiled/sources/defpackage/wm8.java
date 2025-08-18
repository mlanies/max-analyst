package defpackage;

import android.net.Uri;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class wm8 extends xm8 {
    public final int X;
    public final Long Y;
    public final String Z;
    public final long a;
    public final long b;
    public final long c;
    public final Uri o;
    public final boolean s0;
    public final Uri t0;
    public final boolean u0;

    public wm8(long j, long j2, long j3, Uri uri, int i, Long l, String str, boolean z, Uri uri2, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = uri;
        this.X = i;
        this.Y = l;
        this.Z = str;
        this.s0 = z;
        this.t0 = uri2;
        this.u0 = z2;
        Parcelable.Creator<ih2> creator = ih2.CREATOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm8)) {
            return false;
        }
        wm8 wm8Var = (wm8) obj;
        return this.a == wm8Var.a && this.b == wm8Var.b && this.c == wm8Var.c && tpa.f(this.o, wm8Var.o) && this.X == wm8Var.X && tpa.f(this.Y, wm8Var.Y) && tpa.f(this.Z, wm8Var.Z) && this.s0 == wm8Var.s0 && tpa.f(this.t0, wm8Var.t0) && this.u0 == wm8Var.u0;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iM = h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Uri uri = this.o;
        int iG = ey8.g(this.X, (iM + (uri == null ? 0 : uri.hashCode())) * 31, 31);
        Long l = this.Y;
        int iD = ms2.d(rh4.d((iG + (l == null ? 0 : l.hashCode())) * 31, 31, this.Z), 31, this.s0);
        Uri uri2 = this.t0;
        return Boolean.hashCode(this.u0) + ((iD + (uri2 != null ? uri2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.xm8
    public final long i() {
        return this.c;
    }

    @Override // defpackage.xm8
    public final long j() {
        return this.b;
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoVideo(itemId=");
        sb.append(this.a);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", attachId=");
        sb.append(this.c);
        sb.append(", previewUri=");
        sb.append(this.o);
        sb.append(", type=");
        int i = this.X;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "GIF" : "VIDEO" : "PHOTO");
        sb.append(", duration=");
        sb.append(this.Y);
        sb.append(", attachLocalId=");
        sb.append(this.Z);
        sb.append(", isInCollage=");
        sb.append(this.s0);
        sb.append(", lowResUri=");
        sb.append(this.t0);
        sb.append(", isAutoloadDisabled=");
        return au1.j(sb, this.u0, ")");
    }
}
