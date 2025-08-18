package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class rx4 implements b66, qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sx4 b;

    public /* synthetic */ rx4(sx4 sx4Var, int i) {
        this.a = i;
        this.b = sx4Var;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        List list = (List) obj;
        sx4 sx4Var = this.b;
        sx4Var.d = list;
        sx4Var.a.e(list);
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 0:
                gx4 gx4Var = (gx4) obj;
                sx4 sx4Var = this.b;
                sx4Var.getClass();
                return new e0a(qy9.j(gx4Var.a), new rx4(sx4Var, 2), 1).v().h(new q64(9, gx4Var));
            default:
                lw4 lw4Var = (lw4) obj;
                sx4 sx4Var2 = this.b;
                sx4Var2.getClass();
                hb3 hb3VarJ = qy9.j(lw4Var.d);
                tx4 tx4Var = sx4Var2.c;
                Objects.requireNonNull(tx4Var);
                return new e0a(hb3VarJ, new q64(10, tx4Var), 3).v().h(new d74(sx4Var2, 10, lw4Var));
        }
    }
}
