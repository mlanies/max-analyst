package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class pi8 implements nh8 {
    public final vi8 a;

    public pi8(vi8 vi8Var) {
        this.a = vi8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != pi8.class) {
            return false;
        }
        return oaf.a(this.a, ((pi8) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
