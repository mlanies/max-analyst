package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class is1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ks1 b;

    public /* synthetic */ is1(ks1 ks1Var, int i) {
        this.a = i;
        this.b = ks1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c = 1;
        char c2 = 1;
        switch (this.a) {
            case 0:
                ks1 ks1Var = this.b;
                ks1Var.getClass();
                ks1Var.c = new js1();
                new File(((kk5) ks1Var.A0).b(), "call_history_state").delete();
                break;
            case 1:
                ks1 ks1Var2 = this.b;
                ks1Var2.e();
                if (ks1Var2.Z == 0) {
                    boolean z = ks1Var2.c.b != 0;
                    hm9.n("ks1", "sync: from: " + ks1Var2.c.b + " forward: " + z);
                    k4a k4aVar = (k4a) ks1Var2.w0;
                    ks1Var2.Z = k4a.v(k4aVar, new tdf(((p7b) k4aVar.y()).a.o(), ks1Var2.c.b, z));
                    break;
                }
                break;
            case 2:
                Iterator it = this.b.Y.iterator();
                while (it.hasNext()) {
                    m81 m81Var = (m81) it.next();
                    hm9.n("CallHistoryPageViewModel", "loaded history for type=" + m81Var.b);
                    m81Var.t();
                }
                break;
            case 3:
                ks1 ks1Var3 = this.b;
                ks1Var3.B0.d(ks1Var3);
                break;
            case 4:
                ks1 ks1Var4 = this.b;
                ks1Var4.B0.f(ks1Var4);
                break;
            default:
                ks1 ks1Var5 = this.b;
                if (!ks1Var5.a) {
                    ks1Var5.e();
                    if (ks1Var5.c.a.a != 0 || ks1Var5.c.a.b != 0 || !ks1Var5.c.X) {
                        ArrayList arrayListM = ks1Var5.x0.m(ks1Var5.c.a.a, ks1Var5.c.a.b);
                        hm9.n("ks1", "loadInitial: loaded from db: " + arrayListM.size() + " messages");
                        ks1Var5.b(ks1Var5.o.size(), arrayListM);
                        ks1Var5.a = true;
                        ks1Var5.b = arrayListM.isEmpty();
                        ks1Var5.f();
                        if (ks1Var5.c.o) {
                            ks1Var5.g(new u60((Object) ks1Var5, (boolean) (c == true ? 1 : 0), 5));
                            break;
                        }
                    } else {
                        ks1Var5.g(new is1(ks1Var5, c2 == true ? 1 : 0));
                        break;
                    }
                }
                break;
        }
    }
}
