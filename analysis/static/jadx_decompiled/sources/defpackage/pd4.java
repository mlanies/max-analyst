package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class pd4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yd4 b;
    public final /* synthetic */ ovd c;

    public /* synthetic */ pd4(yd4 yd4Var, ovd ovdVar, int i) {
        this.a = i;
        this.b = yd4Var;
        this.c = ovdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            case 1:
                yd4 yd4Var = this.b;
                ArrayList arrayList = yd4Var.b;
                ovd ovdVar = this.c;
                if (arrayList.contains(ovdVar)) {
                    k7d.a(ovdVar.a, ovdVar.c.U0, yd4Var.a);
                    break;
                }
                break;
            default:
                yd4 yd4Var2 = this.b;
                ArrayList arrayList2 = yd4Var2.b;
                ovd ovdVar2 = this.c;
                arrayList2.remove(ovdVar2);
                yd4Var2.c.remove(ovdVar2);
                break;
        }
    }
}
