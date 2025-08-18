package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class d8e extends jdc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d8e(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.jdc
    public void a() {
        switch (this.a) {
            case 0:
                ty2.a((ty2) this.b);
                break;
        }
    }

    @Override // defpackage.jdc
    public void b(int i, int i2) {
        switch (this.a) {
            case 0:
                String name = d8e.class.getName();
                RecyclerView recyclerView = (RecyclerView) this.c;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, name, ey8.j("onItemRangeInserted start. isComputingLayout:", recyclerView.Z()), null);
                }
                ty2.a((ty2) this.b);
                String name2 = d8e.class.getName();
                RecyclerView recyclerView2 = (RecyclerView) this.c;
                ir6 ir6Var2 = hm9.m;
                if (ir6Var2 != null && ir6Var2.c()) {
                    ir6Var2.d(us7.X, name2, ey8.j("onItemRangeInserted end. isComputingLayout:", recyclerView2.Z()), null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.jdc
    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                ty2.a((ty2) this.b);
                break;
            default:
                super.c(i, i2, obj);
                break;
        }
    }

    @Override // defpackage.jdc
    public final void d(int i, int i2) {
        int i3;
        switch (this.a) {
            case 0:
                ty2.a((ty2) this.b);
                return;
            default:
                if (i2 == 0 || ((NeuroAvatarsScreen) this.b).I0.J(i) == null) {
                    return;
                }
                wp9 wp9VarR0 = ((NeuroAvatarsScreen) this.b).r0();
                qo9 qo9Var = wp9VarR0.o;
                if (qo9Var != null) {
                    int i4 = qo9Var.c;
                    qo9 qo9Var2 = wp9VarR0.o;
                    if (qo9Var2 != null) {
                        long j = qo9Var2.a;
                        Iterator it = ((Map) wp9VarR0.y0.getValue()).keySet().iterator();
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i3 = -1;
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (i6 < 0) {
                                    y53.R();
                                    throw null;
                                }
                                if (((Number) next).intValue() != i4) {
                                    i6++;
                                }
                            } else {
                                i6 = -1;
                            }
                        }
                        Iterator it2 = ((List) wp9VarR0.X.getValue()).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((qo9) it2.next()).a == j) {
                                    i3 = i5;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        Integer numValueOf = Integer.valueOf(i3);
                        wp9VarR0.Y = i6;
                        wp9VarR0.v0.g(new ro9(i6, numValueOf));
                    }
                }
                ((hdc) this.c).B(this);
                return;
        }
    }

    @Override // defpackage.jdc
    public void e(int i, int i2) {
        switch (this.a) {
            case 0:
                ty2.a((ty2) this.b);
                break;
        }
    }

    @Override // defpackage.jdc
    public void f(int i, int i2) {
        switch (this.a) {
            case 0:
                ty2.a((ty2) this.b);
                break;
        }
    }
}
