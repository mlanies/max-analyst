package defpackage;

/* loaded from: classes.dex */
public final class g42 extends h42 {
    public final Throwable a;

    public g42(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g42) {
            if (tpa.f(this.a, ((g42) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.h42
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
