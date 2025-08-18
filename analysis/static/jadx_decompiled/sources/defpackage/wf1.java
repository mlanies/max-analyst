package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class wf1 {
    public static final wf1 g;
    public final List a;
    public final List b;
    public final List c;
    public final boolean d;
    public final CharSequence e;
    public final boolean f;

    static {
        nz4 nz4Var = nz4.a;
        g = new wf1(nz4Var, nz4Var, nz4Var, true, "", false);
    }

    public wf1(List list, List list2, List list3, boolean z, CharSequence charSequence, boolean z2) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = z;
        this.e = charSequence;
        this.f = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    public static wf1 a(wf1 wf1Var, List list, kl7 kl7Var, List list2, boolean z, CharSequence charSequence, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = wf1Var.a;
        }
        List list3 = list;
        kl7 kl7Var2 = kl7Var;
        if ((i & 2) != 0) {
            kl7Var2 = wf1Var.b;
        }
        kl7 kl7Var3 = kl7Var2;
        if ((i & 4) != 0) {
            list2 = wf1Var.c;
        }
        List list4 = list2;
        if ((i & 8) != 0) {
            z = wf1Var.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            charSequence = wf1Var.e;
        }
        CharSequence charSequence2 = charSequence;
        if ((i & 32) != 0) {
            z2 = wf1Var.f;
        }
        wf1Var.getClass();
        return new wf1(list3, kl7Var3, list4, z3, charSequence2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf1)) {
            return false;
        }
        wf1 wf1Var = (wf1) obj;
        return tpa.f(this.a, wf1Var.a) && tpa.f(this.b, wf1Var.b) && tpa.f(this.c, wf1Var.c) && this.d == wf1Var.d && tpa.f(this.e, wf1Var.e) && this.f == wf1Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + rh4.f(this.e, ms2.d(k7d.g(this.c, k7d.g(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31);
    }

    public final String toString() {
        return "CallOpponentsState(opponents=" + this.a + ", buttons=" + this.b + ", contextMenuButtons=" + this.c + ", isMoreButtonEnabled=" + this.d + ", title=" + ((Object) this.e) + ", canOpenSettings=" + this.f + ")";
    }
}
