package defpackage;

import android.text.InputFilter;

/* loaded from: classes2.dex */
public final class bka extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ cka o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bka(cka ckaVar, int i) {
        super(9, (Object) null);
        this.c = i;
        this.o = ckaVar;
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    pq9 pq9Var = qp4.u0;
                    cka ckaVar = this.o;
                    ckaVar.onThemeChanged(pq9Var.j(ckaVar));
                    break;
                }
                break;
            case 1:
                if (!tpa.f(obj, obj2)) {
                    this.o.a.setHint((String) obj2);
                    break;
                }
                break;
            case 2:
                if (!tpa.f(obj, obj2)) {
                    this.o.a.setFilters((InputFilter[]) obj2);
                    break;
                }
                break;
            case 3:
                if (!tpa.f(obj, obj2)) {
                    ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    pq9 pq9Var2 = qp4.u0;
                    cka ckaVar2 = this.o;
                    ckaVar2.onThemeChanged(pq9Var2.j(ckaVar2));
                    break;
                }
                break;
            case 4:
                if (!tpa.f(obj, obj2)) {
                    ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    pq9 pq9Var3 = qp4.u0;
                    cka ckaVar3 = this.o;
                    ckaVar3.onThemeChanged(pq9Var3.j(ckaVar3));
                    break;
                }
                break;
            default:
                if (!tpa.f(obj, obj2)) {
                    aka akaVar = (aka) obj2;
                    if (akaVar != null) {
                        pq9 pq9Var4 = qp4.u0;
                        cka ckaVar4 = this.o;
                        ckaVar4.e(pq9Var4.j(ckaVar4), akaVar);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bka(Object obj, cka ckaVar, int i) {
        super(9, obj);
        this.c = i;
        this.o = ckaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bka(cka ckaVar) {
        super(9, "");
        this.c = 1;
        this.o = ckaVar;
    }
}
