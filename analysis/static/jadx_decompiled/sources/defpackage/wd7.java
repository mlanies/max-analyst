package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class wd7 {
    public final long a;
    public final String b;
    public final String c;
    public final int d;
    public final long e;
    public final String f;
    public final long g;
    public final String h;
    public final int i;
    public final List j;
    public final String k;

    public wd7(vd7 vd7Var) {
        this.a = vd7Var.a;
        this.b = vd7Var.b;
        this.c = vd7Var.c;
        this.d = vd7Var.d;
        this.e = vd7Var.e;
        this.f = vd7Var.f;
        this.g = vd7Var.g;
        this.h = vd7Var.h;
        this.i = vd7Var.i;
        this.j = vd7Var.j;
        this.k = vd7Var.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wd7.class != obj.getClass()) {
            return false;
        }
        wd7 wd7Var = (wd7) obj;
        if (this.a != wd7Var.a || this.d != wd7Var.d || this.e != wd7Var.e || this.g != wd7Var.g || this.i != wd7Var.i) {
            return false;
        }
        String str = wd7Var.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = wd7Var.c;
        String str4 = this.c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = wd7Var.f;
        String str6 = this.f;
        if (str6 == null ? str5 != null : !str6.equals(str5)) {
            return false;
        }
        String str7 = wd7Var.h;
        String str8 = this.h;
        if (str8 == null ? str7 != null : !str8.equals(str7)) {
            return false;
        }
        List list = wd7Var.j;
        List list2 = this.j;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        String str9 = wd7Var.k;
        String str10 = this.k;
        return str10 != null ? str10.equals(str9) : str9 == null;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d) * 31;
        long j2 = this.e;
        int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str3 = this.f;
        int iHashCode3 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j3 = this.g;
        int i3 = (iHashCode3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str4 = this.h;
        int iHashCode4 = (((i3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.i) * 31;
        List list = this.j;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str5 = this.k;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }
}
