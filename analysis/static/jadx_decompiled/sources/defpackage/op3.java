package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class op3 implements Serializable {
    public final String a;
    public final np3 b;
    public final String c;

    public op3(String str, np3 np3Var, String str2) {
        this.a = str;
        this.b = np3Var;
        this.c = str2;
    }

    public final String a() {
        np3 np3Var = np3.b;
        String str = this.a;
        np3 np3Var2 = this.b;
        if (np3Var2 == np3Var || np3Var2 == np3.a) {
            String str2 = this.c;
            if (oag.u(str2)) {
                return rh4.j(str, " ", str2);
            }
        }
        return str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{firstName='");
        sb.append(this.a);
        sb.append("', type=");
        sb.append(this.b);
        sb.append("', lastName=");
        return zr6.l(sb, this.c, "}");
    }
}
