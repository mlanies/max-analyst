package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class lg6 {
    public final List a;

    public lg6(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lg6) && tpa.f(this.a, ((lg6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GridModeState(opponentsPages=" + this.a + ")";
    }
}
