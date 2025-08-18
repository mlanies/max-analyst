package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s7b implements Serializable {
    public static final s7b c = new s7b(5, 0);
    public final int a;
    public final int b;

    public s7b(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static s7b a(gy8 gy8Var) {
        String strZ0;
        int iN = lz7.N(gy8Var);
        if (iN == 0) {
            return null;
        }
        int i = 0;
        int iV0 = 0;
        for (int i2 = 0; i2 < iN; i2++) {
            String strZ02 = gy8Var.z0();
            strZ02.getClass();
            if (strZ02.equals("on")) {
                strZ0 = gy8Var.z0();
                strZ0.getClass();
                switch (strZ0) {
                    case "ON":
                        i = 5;
                        continue;
                    case "MOB":
                        i = 3;
                        continue;
                    case "MSG":
                        i = 4;
                        continue;
                    case "WEB":
                        i = 2;
                        continue;
                    case "UNKNOWN":
                        hm9.k0("PresenceType", null, "unknown! %s", Arrays.copyOf(new Object[]{strZ0}, 1));
                        break;
                    default:
                        hm9.k0("PresenceType", null, "not contains enum value %s", Arrays.copyOf(new Object[]{strZ0}, 1));
                        break;
                }
                i = 1;
            } else if (strZ02.equals("seen")) {
                iV0 = gy8Var.v0();
            } else {
                gy8Var.z();
            }
        }
        return new s7b(i != 0 ? i : 1, iV0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{on=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "ON" : "MSG" : "MOB" : "WEB" : "UNKNOWN");
        sb.append(", seen=");
        return zr6.j(sb, this.b, "}");
    }
}
