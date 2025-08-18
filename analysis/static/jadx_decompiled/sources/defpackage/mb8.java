package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class mb8 {
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    public mb8(ob8 ob8Var) {
        this.a = (Uri) ob8Var.a;
        this.b = ob8Var.b;
        this.c = (String) ob8Var.c;
        this.d = ob8Var.d;
        this.e = ob8Var.e;
        this.f = (String) ob8Var.f;
        this.g = (String) ob8Var.g;
    }

    public final ob8 a() {
        ob8 ob8Var = new ob8();
        ob8Var.a = this.a;
        ob8Var.b = this.b;
        ob8Var.c = this.c;
        ob8Var.d = this.d;
        ob8Var.e = this.e;
        ob8Var.f = this.f;
        ob8Var.g = this.g;
        return ob8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb8)) {
            return false;
        }
        mb8 mb8Var = (mb8) obj;
        return this.a.equals(mb8Var.a) && maf.a(this.b, mb8Var.b) && maf.a(this.c, mb8Var.c) && this.d == mb8Var.d && this.e == mb8Var.e && maf.a(this.f, mb8Var.f) && maf.a(this.g, mb8Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
