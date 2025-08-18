package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class h82 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v82 b;

    public /* synthetic */ h82(v82 v82Var, int i) {
        this.a = i;
        this.b = v82Var;
    }

    @Override // defpackage.qj3
    public final void accept(Object obj) {
        u82 u82Var = (u82) obj;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(u82Var.c());
                arrayList.remove(this.b);
                List list = u82Var.B;
                if (list != null) {
                    list.clear();
                }
                if (u82Var.B == null) {
                    u82Var.B = new ArrayList();
                }
                u82Var.B.addAll(arrayList);
                break;
            default:
                u82Var.a(this.b);
                break;
        }
    }
}
