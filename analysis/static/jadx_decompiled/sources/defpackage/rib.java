package defpackage;

/* loaded from: classes2.dex */
public final class rib extends cjb {
    public final nc2 a;

    public rib(nc2 nc2Var) {
        this.a = nc2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rib) && tpa.f(this.a, ((rib) obj).a);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 16384;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 16384;
    }

    public final String toString() {
        return "ChatLinkItem(model=" + this.a + ")";
    }
}
