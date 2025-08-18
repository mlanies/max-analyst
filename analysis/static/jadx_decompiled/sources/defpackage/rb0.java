package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class rb0 {
    public final xf4 a;
    public final List b;
    public final String c;
    public final int d;
    public final int e;
    public final eu4 f;

    public rb0(xf4 xf4Var, List list, String str, int i, int i2, eu4 eu4Var) {
        this.a = xf4Var;
        this.b = list;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = eu4Var;
    }

    public static xe5 a(xf4 xf4Var) {
        xe5 xe5Var = new xe5();
        if (xf4Var == null) {
            throw new NullPointerException("Null surface");
        }
        xe5Var.a = xf4Var;
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            throw new NullPointerException("Null sharedSurfaces");
        }
        xe5Var.b = listEmptyList;
        xe5Var.c = null;
        xe5Var.o = -1;
        xe5Var.X = -1;
        xe5Var.Y = eu4.d;
        return xe5Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rb0)) {
            return false;
        }
        rb0 rb0Var = (rb0) obj;
        if (this.a.equals(rb0Var.a) && this.b.equals(rb0Var.b)) {
            String str = rb0Var.c;
            String str2 = this.c;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.d == rb0Var.d && this.e == rb0Var.e && this.f.equals(rb0Var.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return this.f.hashCode() ^ ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.a + ", sharedSurfaces=" + this.b + ", physicalCameraId=" + this.c + ", mirrorMode=" + this.d + ", surfaceGroupId=" + this.e + ", dynamicRange=" + this.f + "}";
    }
}
