package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class tcb extends vcb {
    public final List b;

    public tcb(kl7 kl7Var) {
        this.b = kl7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tcb) && tpa.f(this.b, ((tcb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShowContextMenu(actions=" + this.b + ")";
    }
}
