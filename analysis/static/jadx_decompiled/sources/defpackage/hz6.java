package defpackage;

/* loaded from: classes2.dex */
public final class hz6 implements efb {
    public final jqe a;

    public hz6(cqe cqeVar) {
        this.a = cqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hz6) && tpa.f(this.a, ((hz6) obj).a);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 64;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return ((long) 64) == ol7Var.getItemId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 64;
    }

    @Override // defpackage.ol7
    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return rh4.l(new StringBuilder("InactiveTimeDeleteProfileItem(text="), this.a, ")");
    }
}
