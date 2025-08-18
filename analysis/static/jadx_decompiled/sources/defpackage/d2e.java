package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class d2e implements Serializable {
    public final long X;
    public final String Y;
    public final String Z;
    public final long a;
    public final int b;
    public final int c;
    public final String o;
    public final String s0;
    public final List t0;
    public final int u0;
    public final long v0;
    public final String w0;
    public final boolean x0;
    public final int y0;
    public final String z0;

    public d2e(e20 e20Var) {
        this.a = e20Var.a;
        this.b = e20Var.b;
        this.c = e20Var.c;
        this.o = e20Var.d;
        this.X = e20Var.e;
        this.Y = e20Var.f;
        this.Z = e20Var.g;
        this.s0 = e20Var.h;
        this.t0 = e20Var.i;
        this.u0 = e20Var.j;
        this.v0 = e20Var.k;
        this.w0 = e20Var.l;
        this.x0 = e20Var.m;
        this.y0 = e20Var.n;
        this.z0 = e20Var.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d2e.class != obj.getClass()) {
            return false;
        }
        d2e d2eVar = (d2e) obj;
        if (this.a != d2eVar.a || this.b != d2eVar.b || this.c != d2eVar.c || this.X != d2eVar.X || this.v0 != d2eVar.v0 || this.x0 != d2eVar.x0) {
            return false;
        }
        String str = d2eVar.o;
        String str2 = this.o;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = d2eVar.Y;
        String str4 = this.Y;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = d2eVar.Z;
        String str6 = this.Z;
        if (str6 == null ? str5 != null : !str6.equals(str5)) {
            return false;
        }
        String str7 = d2eVar.s0;
        String str8 = this.s0;
        if (str8 == null ? str7 != null : !str8.equals(str7)) {
            return false;
        }
        List list = d2eVar.t0;
        List list2 = this.t0;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        if (this.u0 != d2eVar.u0) {
            return false;
        }
        String str9 = d2eVar.w0;
        String str10 = this.w0;
        if (str10 == null ? str9 == null : str10.equals(str9)) {
            return Objects.equals(this.z0, d2eVar.z0) && this.y0 == d2eVar.y0;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.o;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.X;
        int i2 = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.Y;
        int iHashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.Z;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.s0;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List list = this.t0;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        int i3 = this.u0;
        int iS = (iHashCode5 + (i3 != 0 ? au1.s(i3) : 0)) * 961;
        long j3 = this.v0;
        int i4 = (iS + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str5 = this.w0;
        int iHashCode6 = (((i4 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.x0 ? 1 : 0)) * 961;
        int i5 = this.y0;
        int iS2 = (iHashCode6 + (i5 != 0 ? au1.s(i5) : 0)) * 31;
        String str6 = this.z0;
        return iS2 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Sticker{id=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", url='");
        sb.append(this.o);
        sb.append("', updateTime=");
        sb.append(this.X);
        sb.append(", mp4Url='");
        sb.append(this.Y);
        sb.append("', firstUrl='");
        sb.append(this.Z);
        sb.append("', previewUrl='");
        sb.append(this.s0);
        sb.append("', tags=");
        sb.append(this.t0);
        sb.append(", stickerType=");
        sb.append(k7d.s(this.u0));
        sb.append(", external=false, setId=");
        sb.append(this.v0);
        sb.append(", lottieUrl='");
        sb.append(this.w0);
        sb.append("', audio=");
        sb.append(this.x0);
        sb.append(", photoAttach=null, stickerAuthorType=");
        sb.append(k7d.q(this.y0));
        sb.append(", videoUrl='");
        return zr6.l(sb, this.z0, "'}");
    }
}
