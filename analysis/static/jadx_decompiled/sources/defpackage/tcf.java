package defpackage;

/* loaded from: classes2.dex */
public final class tcf {
    public final ucf a;

    public tcf(ucf ucfVar) {
        this.a = ucfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tcf) && tpa.f(this.a, ((tcf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VfxEmptyBlockColors(halo=" + this.a + ")";
    }
}
