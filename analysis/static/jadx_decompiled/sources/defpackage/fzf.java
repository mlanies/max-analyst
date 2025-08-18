package defpackage;

/* loaded from: classes2.dex */
public final class fzf implements kzf {
    public final String a;

    public fzf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fzf) && tpa.f(this.a, ((fzf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("ShowDownloadFileBottomSheet(fileName="), this.a, ")");
    }
}
