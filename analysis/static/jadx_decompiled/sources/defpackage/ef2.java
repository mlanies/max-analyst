package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ef2 implements hf2 {
    public final List a;

    public ef2(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ef2) && tpa.f(this.a, ((ef2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Remove(messageIds=" + this.a + ")";
    }
}
