package defpackage;

/* loaded from: classes2.dex */
public final class yyf implements kzf {
    public final boolean a;

    public yyf(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yyf) && this.a == ((yyf) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("CloseScreen(isFromBridge="), this.a, ")");
    }
}
