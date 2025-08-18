package defpackage;

/* loaded from: classes2.dex */
public final class n2b implements efb {
    public final jqe a;

    public n2b(eqe eqeVar) {
        this.a = eqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n2b) {
            return tpa.f(this.a, ((n2b) obj).a);
        }
        return false;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 65536;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return ((long) 65536) == ol7Var.getItemId();
    }

    public final int hashCode() {
        return Integer.hashCode(-2147418112) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return -2147418112;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        if (ol7Var instanceof qmd) {
            return new wfb(((qmd) ol7Var).a);
        }
        return null;
    }

    @Override // defpackage.ol7
    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return "PlaceholderItem(text=" + this.a + ", viewType=-2147418112)";
    }
}
