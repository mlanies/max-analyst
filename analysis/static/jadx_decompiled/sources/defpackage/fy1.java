package defpackage;

/* loaded from: classes2.dex */
public final class fy1 implements efb {
    public final jqe a;

    public fy1(jqe jqeVar) {
        this.a = jqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fy1) && tpa.f(this.a, ((fy1) obj).a);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 256;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return ((long) 256) == ol7Var.getItemId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 256;
    }

    @Override // defpackage.ol7
    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return rh4.l(new StringBuilder("CancelDeleteProfileItem(text="), this.a, ")");
    }
}
