package defpackage;

/* loaded from: classes2.dex */
public final class ql5 implements efb {
    public final String a;
    public final a73 b;

    public ql5(String str, a73 a73Var) {
        this.a = str;
        this.b = a73Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql5)) {
            return false;
        }
        ql5 ql5Var = (ql5) obj;
        return tpa.f(this.a, ql5Var.a) && tpa.f(this.b, ql5Var.b);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 1;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return ((long) 1) == ol7Var.getItemId();
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        a73 a73Var = this.b;
        return iHashCode + (a73Var != null ? a73Var.a.hashCode() : 0);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 1;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        if (ol7Var instanceof ql5) {
            return new ufb(((ql5) ol7Var).b);
        }
        return null;
    }

    @Override // defpackage.ol7
    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return "FirstNameItem(text=" + this.a + ", errorText=" + this.b + ")";
    }
}
