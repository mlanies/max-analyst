package defpackage;

/* loaded from: classes2.dex */
public final class trf implements ooc {
    public final md9 a;

    public trf(md9 md9Var) {
        this.a = md9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof trf) && tpa.f(this.a, ((trf) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "WatchTogetherUpdateNotification(updates=" + this.a + ")";
    }
}
