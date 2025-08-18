package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class v70 implements nk {
    public static final v70 o;
    public final String a;
    public final boolean b;
    public final String c;

    static {
        cjg cjgVar = new cjg();
        cjgVar.b = Boolean.FALSE;
        o = new v70(cjgVar);
    }

    public v70(cjg cjgVar) {
        this.a = (String) cjgVar.a;
        this.b = ((Boolean) cjgVar.b).booleanValue();
        this.c = (String) cjgVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v70)) {
            return false;
        }
        v70 v70Var = (v70) obj;
        return s36.l(this.a, v70Var.a) && this.b == v70Var.b && s36.l(this.c, v70Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), this.c});
    }
}
