package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ml3 {
    public final l20 a;
    public final String b;
    public final List c;

    public ml3(l20 l20Var, String str, ArrayList arrayList) {
        this.a = l20Var;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml3)) {
            return false;
        }
        ml3 ml3Var = (ml3) obj;
        if (Objects.equals(this.b, ml3Var.b)) {
            l20 l20Var = this.a;
            l20 l20Var2 = ml3Var.a;
            if (Objects.equals(l20Var, l20Var2) && Objects.equals(this.c, l20Var2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartMessage{media='");
        sb.append(this.a);
        sb.append("'text='");
        sb.append(this.b);
        sb.append("'elements='");
        return au1.i(sb, this.c, "'}");
    }
}
