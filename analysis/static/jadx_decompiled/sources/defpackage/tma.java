package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class tma {
    public static final tma b = new tma(null);
    public final Object a;

    public tma(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        tma tmaVar;
        return (obj instanceof tma) && ((tmaVar = (tma) obj) == this || (tmaVar != null && Objects.equals(this.a, tmaVar.a)));
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        Object obj = this.a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
