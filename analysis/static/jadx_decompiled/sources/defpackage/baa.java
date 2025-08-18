package defpackage;

import android.content.res.ColorStateList;

/* loaded from: classes.dex */
public final class baa extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ caa o;

    /* JADX WARN: Illegal instructions before constructor call */
    public baa(caa caaVar, int i) {
        this.c = i;
        switch (i) {
            case 2:
                x9a x9aVar = x9a.a;
                this.o = caaVar;
                super(9, x9aVar);
                break;
            case 3:
                Boolean bool = Boolean.FALSE;
                this.o = caaVar;
                super(9, bool);
                break;
            case 4:
                Boolean bool2 = Boolean.TRUE;
                this.o = caaVar;
                super(9, bool2);
                break;
            default:
                du4 du4Var = du4.b;
                this.o = caaVar;
                super(9, du4Var);
                break;
        }
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    caa caaVar = this.o;
                    if (!caaVar.D0) {
                        caaVar.a(caaVar.getTextFont());
                        break;
                    }
                }
                break;
            case 1:
                if (!tpa.f(obj, obj2)) {
                    caa caaVar2 = this.o;
                    if (!caaVar2.D0) {
                        caaVar2.a(caaVar2.getTextFont());
                        break;
                    }
                }
                break;
            case 2:
                if (!tpa.f(obj, obj2)) {
                    pq9 pq9Var = qp4.u0;
                    caa caaVar3 = this.o;
                    caaVar3.f(pq9Var.j(caaVar3));
                    break;
                }
                break;
            case 3:
                if (!tpa.f(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    caa caaVar4 = this.o;
                    if (!zBooleanValue) {
                        caaVar4.C0.setStroke(tu0.G(0 * fk4.d().getDisplayMetrics().density), (ColorStateList) null);
                        break;
                    } else {
                        caaVar4.C0.setStroke(tu0.F(fk4.d().getDisplayMetrics().density * 1.5d), qp4.u0.j(caaVar4).i().a.a.a);
                        break;
                    }
                }
                break;
            default:
                if (!tpa.f(obj, obj2)) {
                    boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    caa caaVar5 = this.o;
                    caaVar5.setBackground(zBooleanValue2 ? caaVar5.C0 : null);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baa(Object obj, caa caaVar) {
        super(9, obj);
        this.c = 1;
        this.o = caaVar;
    }
}
