package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public class pb8 {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    static {
        int i2 = oaf.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
        n = Integer.toString(6, 36);
    }

    public pb8(ob8 ob8Var) {
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
        if (!(obj instanceof pb8)) {
            return false;
        }
        pb8 pb8Var = (pb8) obj;
        return this.a.equals(pb8Var.a) && oaf.a(this.b, pb8Var.b) && oaf.a(this.c, pb8Var.c) && this.d == pb8Var.d && this.e == pb8Var.e && oaf.a(this.f, pb8Var.f) && oaf.a(this.g, pb8Var.g);
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
