package defpackage;

/* loaded from: classes2.dex */
public final class ol2 implements efb {
    public final String a;
    public final jqe b;
    public final a73 c;
    public final int o;

    public ol2(String str, eqe eqeVar, a73 a73Var, int i) {
        this.a = str;
        this.b = eqeVar;
        this.c = a73Var;
        this.o = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol2)) {
            return false;
        }
        ol2 ol2Var = (ol2) obj;
        return tpa.f(this.a, ol2Var.a) && tpa.f(this.b, ol2Var.b) && tpa.f(this.c, ol2Var.c) && this.o == ol2Var.o;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 131072;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return ((long) 131072) == ol7Var.getItemId();
    }

    public final int hashCode() {
        String str = this.a;
        int iF = k7d.f((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        a73 a73Var = this.c;
        return Integer.hashCode(this.o) + ((iF + (a73Var != null ? a73Var.a.hashCode() : 0)) * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 131072;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        if (ol7Var instanceof ol2) {
            return new tfb(((ol2) ol7Var).c);
        }
        return null;
    }

    @Override // defpackage.ol7
    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return "ChatNameItem(text=" + this.a + ", hintText=" + this.b + ", errorText=" + this.c + ", limitCharacters=" + this.o + ")";
    }
}
