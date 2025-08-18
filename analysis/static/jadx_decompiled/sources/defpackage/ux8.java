package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class ux8 implements Serializable {
    public final int a;
    public final int b;

    public ux8(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static ux8 a(gy8 gy8Var) {
        int iN = lz7.N(gy8Var);
        if (iN == 0) {
            return null;
        }
        int iV0 = 0;
        int iV02 = 0;
        for (int i = 0; i < iN; i++) {
            String strZ0 = gy8Var.z0();
            strZ0.getClass();
            if (strZ0.equals("views")) {
                iV0 = gy8Var.v0();
            } else if (strZ0.equals("forwards")) {
                iV02 = gy8Var.v0();
            } else {
                gy8Var.z();
            }
        }
        return new ux8(iV0, iV02);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{views=");
        sb.append(this.a);
        sb.append(", forwards=");
        return zr6.j(sb, this.b, "}");
    }
}
