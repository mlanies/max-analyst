package defpackage;

/* loaded from: classes2.dex */
public final class kba {
    public final String a;
    public final hy3 b;

    public kba(String str, hy3 hy3Var) {
        this.a = str;
        this.b = hy3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kba)) {
            return false;
        }
        kba kbaVar = (kba) obj;
        return tpa.f(this.a, kbaVar.a) && tpa.f(this.b, kbaVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FolderCounter(folderId=" + this.a + ", counter=" + this.b + ")";
    }
}
