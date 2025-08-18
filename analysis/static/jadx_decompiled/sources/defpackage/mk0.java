package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class mk0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public mk0(String str, int i, int i2, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk0)) {
            return false;
        }
        mk0 mk0Var = (mk0) obj;
        return this.c == mk0Var.c && this.d == mk0Var.d && f46.B(this.a, mk0Var.a) && f46.B(this.b, mk0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
