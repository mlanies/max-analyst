package defpackage;

/* loaded from: classes.dex */
public final class pr3 implements ol7 {
    public final int a;
    public final Integer b;
    public final int c = z8a.o;

    public pr3(int i, int i2, int i3, Integer num) {
        this.a = i3;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr3)) {
            return false;
        }
        pr3 pr3Var = (pr3) obj;
        pr3Var.getClass();
        int i = woc.a;
        int i2 = a9a.a;
        return this.a == pr3Var.a && tpa.f(this.b, pr3Var.b);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 0L;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return ol7Var instanceof pr3;
    }

    public final int hashCode() {
        int iE = k7d.e(this.a, k7d.e(a9a.r, Integer.hashCode(woc.J0) * 31, 31), 31);
        Integer num = this.b;
        return iE + (num == null ? 0 : num.hashCode());
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.c;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        pr3 pr3Var = ol7Var instanceof pr3 ? (pr3) ol7Var : null;
        if (pr3Var == null) {
            return null;
        }
        Integer num = this.b;
        Integer num2 = pr3Var.b;
        if (tpa.f(num2, num)) {
            return null;
        }
        return new or3(num2);
    }

    public final String toString() {
        return "ContactsEmptySearchResultItem(iconRes=" + woc.J0 + ", titleRes=" + a9a.r + ", descriptionRes=" + this.a + ", buttonTitleRes=" + this.b + ")";
    }
}
