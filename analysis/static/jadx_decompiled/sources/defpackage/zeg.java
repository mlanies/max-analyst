package defpackage;

import android.app.PendingIntent;

/* loaded from: classes.dex */
public final class zeg extends hkc {
    public final PendingIntent a;
    public final boolean b;

    public zeg(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.a = pendingIntent;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hkc) {
            hkc hkcVar = (hkc) obj;
            if (this.a.equals(((zeg) hkcVar).a) && this.b == ((zeg) hkcVar).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return au1.j(au1.m("ReviewInfo{pendingIntent=", this.a.toString(), ", isNoOp="), this.b, "}");
    }
}
