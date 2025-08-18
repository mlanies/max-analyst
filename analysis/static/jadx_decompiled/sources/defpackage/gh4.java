package defpackage;

/* loaded from: classes2.dex */
public final class gh4 implements efb {
    public final jqe a;

    public gh4(eqe eqeVar) {
        this.a = eqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gh4) && tpa.f(this.a, ((gh4) obj).a);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 128;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return ((long) 128) == ol7Var.getItemId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 128;
    }

    @Override // defpackage.ol7
    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return rh4.l(new StringBuilder("DeleteProfileItem(text="), this.a, ")");
    }
}
