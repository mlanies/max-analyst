package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class lb8 {
    public static final lb8 d = new lb8(new nw4(8));
    public static final String e;
    public static final String f;
    public static final String g;
    public final Uri a;
    public final String b;
    public final Bundle c;

    static {
        int i = oaf.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
    }

    public lb8(nw4 nw4Var) {
        this.a = (Uri) nw4Var.b;
        this.b = (String) nw4Var.c;
        this.c = (Bundle) nw4Var.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb8)) {
            return false;
        }
        lb8 lb8Var = (lb8) obj;
        if (oaf.a(this.a, lb8Var.a) && oaf.a(this.b, lb8Var.b)) {
            if ((this.c == null) == (lb8Var.c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.c != null ? 1 : 0);
    }
}
