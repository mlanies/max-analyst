package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class nhc implements hoc {
    public final boolean a;

    public nhc(boolean z) {
        this.a = z;
    }

    @Override // defpackage.hoc
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && nhc.class == obj.getClass() && this.a == ((nhc) obj).a;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a));
    }

    public final String toString() {
        return "RequestAsr{isEnabled=" + this.a + '}';
    }
}
