package defpackage;

import android.text.InputFilter;

/* loaded from: classes2.dex */
public final class wh4 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ xh4 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wh4(Integer num, xh4 xh4Var, int i) {
        super(9, num);
        this.c = i;
        this.o = xh4Var;
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    xh4 xh4Var = this.o;
                    xh4Var.t0.setFilters(xh4Var.getMaxCount() != Integer.MAX_VALUE ? new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(xh4Var.getMaxCount())} : new InputFilter[0]);
                    break;
                }
                break;
            case 1:
                if (!tpa.f(obj, obj2)) {
                    pq9 pq9Var = qp4.u0;
                    xh4 xh4Var2 = this.o;
                    xh4Var2.onThemeChanged(pq9Var.j(xh4Var2));
                    break;
                }
                break;
            case 2:
                if (!tpa.f(obj, obj2)) {
                    pq9 pq9Var2 = qp4.u0;
                    xh4 xh4Var3 = this.o;
                    xh4Var3.onThemeChanged(pq9Var2.j(xh4Var3));
                    break;
                }
                break;
            case 3:
                if (!tpa.f(obj, obj2)) {
                    pq9 pq9Var3 = qp4.u0;
                    xh4 xh4Var4 = this.o;
                    xh4Var4.onThemeChanged(pq9Var3.j(xh4Var4));
                    break;
                }
                break;
            default:
                if (!tpa.f(obj, obj2)) {
                    pq9 pq9Var4 = qp4.u0;
                    xh4 xh4Var5 = this.o;
                    xh4Var5.onThemeChanged(pq9Var4.j(xh4Var5));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh4(xh4 xh4Var, int i) {
        super(9, (Object) Integer.MAX_VALUE);
        this.c = i;
        switch (i) {
            case 1:
                this.o = xh4Var;
                super(9, (Object) null);
                break;
            default:
                this.o = xh4Var;
                break;
        }
    }
}
