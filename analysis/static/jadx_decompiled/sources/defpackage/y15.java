package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class y15 extends jdc {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public y15(dxc dxcVar, RecyclerView recyclerView, hdc hdcVar) {
        this.a = 1;
        this.b = dxcVar;
        this.c = recyclerView;
        this.d = hdcVar;
    }

    @Override // defpackage.jdc
    public void a() {
        switch (this.a) {
            case 0:
                h();
                break;
        }
    }

    @Override // defpackage.jdc
    public void b(int i, int i2) {
        switch (this.a) {
            case 0:
                String name = y15.class.getName();
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.d;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, name, ey8.j("onItemRangeInserted start. isComputingLayout:", endlessRecyclerView2.Z()), null);
                }
                h();
                String name2 = y15.class.getName();
                EndlessRecyclerView2 endlessRecyclerView22 = (EndlessRecyclerView2) this.d;
                ir6 ir6Var2 = hm9.m;
                if (ir6Var2 != null && ir6Var2.c()) {
                    ir6Var2.d(us7.X, name2, ey8.j("onItemRangeInserted end. isComputingLayout:", endlessRecyclerView22.Z()), null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.jdc
    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                h();
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
                h();
                break;
            default:
                dxc dxcVar = (dxc) this.b;
                if (i2 == dxcVar.X && dxc.h0(dxcVar, (RecyclerView) this.c, i)) {
                    String str = ((dxc) this.b).Y;
                    RecyclerView recyclerView = (RecyclerView) this.c;
                    ir6 ir6Var = hm9.m;
                    if (ir6Var != null && ir6Var.c()) {
                        ir6Var.d(us7.X, str, ey8.j("onItemRangeInserted start. isComputingLayout:", recyclerView.Z()), null);
                    }
                    dxc.i0((dxc) this.b, (hdc) this.d);
                    String str2 = ((dxc) this.b).Y;
                    RecyclerView recyclerView2 = (RecyclerView) this.c;
                    ir6 ir6Var2 = hm9.m;
                    if (ir6Var2 != null && ir6Var2.c()) {
                        ir6Var2.d(us7.X, str2, ey8.j("onItemRangeInserted end. isComputingLayout:", recyclerView2.Z()), null);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.jdc
    public final void e(int i, int i2) {
        switch (this.a) {
            case 0:
                h();
                break;
            default:
                dxc dxcVar = (dxc) this.b;
                int i3 = dxcVar.X;
                hdc hdcVar = (hdc) this.d;
                RecyclerView recyclerView = (RecyclerView) this.c;
                if (1 != i3 || !dxc.h0(dxcVar, recyclerView, i)) {
                    if (1 == dxcVar.X && dxc.h0(dxcVar, recyclerView, i2)) {
                        dxc.i0(dxcVar, hdcVar);
                        break;
                    }
                } else {
                    dxc.i0(dxcVar, hdcVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.jdc
    public final void f(int i, int i2) {
        switch (this.a) {
            case 0:
                h();
                break;
            default:
                dxc dxcVar = (dxc) this.b;
                if (i2 == dxcVar.X && dxc.h0(dxcVar, (RecyclerView) this.c, i)) {
                    dxc.i0(dxcVar, (hdc) this.d);
                    break;
                }
                break;
        }
    }

    public void h() {
        kp.x((EndlessRecyclerView2) this.d, (i76) this.c);
    }

    public y15(EndlessRecyclerView2 endlessRecyclerView2) {
        this.a = 0;
        this.d = endlessRecyclerView2;
        this.b = new AtomicBoolean(true);
        this.c = new i76(this, 3, endlessRecyclerView2);
    }
}
