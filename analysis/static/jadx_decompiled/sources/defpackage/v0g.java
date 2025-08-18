package defpackage;

/* loaded from: classes2.dex */
public final class v0g {
    public static final u0g Companion = new u0g();
    public final boolean a;

    public /* synthetic */ v0g(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            ju0.I(i, 1, t0g.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0g) && this.a == ((v0g) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("WebAppSetupClosingBehaviorRequest(needConfirmation="), this.a, ")");
    }
}
