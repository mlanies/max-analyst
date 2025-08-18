package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class f8e extends jdc {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f8e(Object obj, RecyclerView recyclerView, int i) {
        this.a = i;
        this.c = obj;
        this.b = recyclerView;
    }

    @Override // defpackage.jdc
    public void a() {
        switch (this.a) {
            case 0:
                h8e.i((h8e) this.c);
                break;
        }
    }

    @Override // defpackage.jdc
    public void b(int i, int i2) {
        switch (this.a) {
            case 0:
                h8e.i((h8e) this.c);
                break;
        }
    }

    @Override // defpackage.jdc
    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                h8e.i((h8e) this.c);
                break;
            default:
                super.c(i, i2, obj);
                break;
        }
    }

    @Override // defpackage.jdc
    public final void d(int i, int i2) {
        switch (this.a) {
            case 0:
                String name = f8e.class.getName();
                RecyclerView recyclerView = this.b;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, name, ey8.j("onItemRangeInserted start. isComputingLayout:", recyclerView.Z()), null);
                }
                h8e.i((h8e) this.c);
                String name2 = f8e.class.getName();
                RecyclerView recyclerView2 = this.b;
                ir6 ir6Var2 = hm9.m;
                if (ir6Var2 != null && ir6Var2.c()) {
                    ir6Var2.d(us7.X, name2, ey8.j("onItemRangeInserted end. isComputingLayout:", recyclerView2.Z()), null);
                    break;
                }
                break;
            default:
                if (i == 0) {
                    zwe.h0((zwe) this.c, this.b);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.jdc
    public final void e(int i, int i2) {
        switch (this.a) {
            case 0:
                h8e.i((h8e) this.c);
                break;
            default:
                if (i == 0 || i2 == 0) {
                    zwe.h0((zwe) this.c, this.b);
                    break;
                }
        }
    }

    @Override // defpackage.jdc
    public final void f(int i, int i2) {
        switch (this.a) {
            case 0:
                h8e.i((h8e) this.c);
                break;
            default:
                if (i == 0) {
                    zwe.h0((zwe) this.c, this.b);
                    break;
                }
                break;
        }
    }
}
