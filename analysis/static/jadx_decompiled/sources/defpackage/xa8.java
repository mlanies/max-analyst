package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class xa8 {
    public static final String b;
    public final Uri a;

    static {
        int i = oaf.a;
        b = Integer.toString(0, 36);
    }

    public xa8(o9g o9gVar) {
        this.a = (Uri) o9gVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xa8) {
            return this.a.equals(((xa8) obj).a) && oaf.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
