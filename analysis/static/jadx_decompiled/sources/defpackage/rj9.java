package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class rj9 implements qj3, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sj9 b;

    public /* synthetic */ rj9(sj9 sj9Var, int i) {
        this.a = i;
        this.b = sj9Var;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        sj9 sj9Var = this.b;
        switch (this.a) {
            case 0:
                sj9Var.Z1();
                break;
            case 1:
            default:
                sj9Var.getClass();
                hm9.o("sj9", "Can't load locations");
                xk9 xk9Var = (xk9) ((kk9) sj9Var.b);
                xk9Var.A(false);
                xk9Var.B(Collections.emptyList());
                break;
            case 2:
                List list = (List) obj;
                sj9Var.getClass();
                hm9.m("sj9", "Loaded %d", Integer.valueOf(list.size()));
                xk9 xk9Var2 = (xk9) ((kk9) sj9Var.b);
                xk9Var2.A(false);
                xk9Var2.B(list);
                if (!sj9Var.w0) {
                    sj9Var.w0 = true;
                    sj9Var.Z.A();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        au1.r(obj);
        this.b.getClass();
        throw null;
    }
}
