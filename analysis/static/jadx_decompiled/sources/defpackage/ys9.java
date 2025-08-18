package defpackage;

/* loaded from: classes2.dex */
public final class ys9 extends gle {
    public final nab c;

    public ys9(nab nabVar) {
        this.c = nabVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ys9) && tpa.f(this.c, ((ys9) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.zje
    public final String toString() {
        return "Response(profile=" + this.c + ")";
    }
}
