package defpackage;

/* loaded from: classes2.dex */
public final class qmd implements efb {
    public final i24 a;

    public qmd(i24 i24Var) {
        this.a = i24Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qmd) {
            return tpa.f(this.a, ((qmd) obj).a);
        }
        return false;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 16;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return ((long) 16) == ol7Var.getItemId();
    }

    public final int hashCode() {
        i24 i24Var = this.a;
        return Integer.hashCode(-2147483632) + ((i24Var == null ? 0 : i24Var.hashCode()) * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return -2147483632;
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
        return "ShortLinkInputItem(state=" + this.a + ", viewType=-2147483632)";
    }
}
