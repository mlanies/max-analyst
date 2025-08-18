package defpackage;

/* loaded from: classes.dex */
public final class ib1 implements kb1 {
    public final String a;

    public ib1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ib1) && tpa.f(this.a, ((ib1) obj).a);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 9223372036854775805L;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return 9223372036854775805L == ol7Var.getItemId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 3;
    }

    public final String toString() {
        return zr6.l(new StringBuilder("CallShareLinkPreviewState(link="), this.a, ")");
    }
}
