package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class jl3 {
    public static final jl3 e = new jl3("", il3.o, "");
    public final String a;
    public final String b;
    public final il3 c;
    public String d = null;

    public jl3(String str, il3 il3Var, String str2) {
        this.a = str;
        this.c = il3Var;
        this.b = str2;
    }

    public final String a() {
        if (!equals(e)) {
            if (this.c != il3.o) {
                String str = this.b;
                boolean zU = oag.u(str);
                String str2 = this.a;
                if (!zU) {
                    return oag.t(str2) ? "" : str2;
                }
                if (this.d == null) {
                    this.d = str2 + " " + str;
                }
                return this.d;
            }
        }
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl3)) {
            return false;
        }
        jl3 jl3Var = (jl3) obj;
        return this.c == jl3Var.c && Objects.equals(this.a, jl3Var.a) && this.b.equals(jl3Var.b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.c) + ((Objects.hashCode(this.b) + (Objects.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = rh4.o(jl3.class.getSimpleName(), "type=");
        sbO.append(this.c);
        sbO.append(",f=");
        sbO.append(oag.u(this.a));
        sbO.append(",l=");
        sbO.append(oag.u(this.b));
        return sbO.toString();
    }
}
