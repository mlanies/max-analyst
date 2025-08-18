package defpackage;

/* loaded from: classes2.dex */
public final class yz4 implements a05 {
    public final z2e a;

    public yz4(z2e z2eVar) {
        this.a = z2eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yz4) && tpa.f(this.a, ((yz4) obj).a);
    }

    public final int hashCode() {
        z2e z2eVar = this.a;
        if (z2eVar == null) {
            return 0;
        }
        return z2eVar.hashCode();
    }

    public final String toString() {
        return "EmptyDialog(sticker=" + this.a + ")";
    }
}
