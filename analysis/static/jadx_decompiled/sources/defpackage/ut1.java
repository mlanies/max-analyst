package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class ut1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fu1 b;
    public final /* synthetic */ List c;

    public /* synthetic */ ut1(fu1 fu1Var, ArrayList arrayList, int i) {
        this.a = i;
        this.b = fu1Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bkb bkbVar;
        switch (this.a) {
            case 0:
                fu1 fu1Var = this.b;
                List<t90> list = this.c;
                fu1Var.getClass();
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (t90 t90Var : list) {
                    if (fu1Var.a.C(t90Var.a)) {
                        ((LinkedHashMap) fu1Var.a.a).remove(t90Var.a);
                        arrayList.add(t90Var.a);
                        if (t90Var.b == h8b.class) {
                            z = true;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                TextUtils.join(", ", arrayList);
                fu1Var.toString();
                if (z) {
                    fu1Var.Z.h.e = null;
                }
                fu1Var.q();
                if (fu1Var.a.s().isEmpty()) {
                    fu1Var.Z.l.c = false;
                } else {
                    fu1Var.L();
                }
                if (!fu1Var.a.n().isEmpty()) {
                    fu1Var.K();
                    fu1Var.D();
                    if (fu1Var.S0 == 9) {
                        fu1Var.B();
                        return;
                    }
                    return;
                }
                fu1Var.Z.q();
                fu1Var.D();
                fu1Var.Z.y(false);
                fu1Var.w0 = fu1Var.z();
                fu1Var.toString();
                switch (au1.s(fu1Var.S0)) {
                    case 3:
                        c54.p(null, fu1Var.u0 == null);
                        fu1Var.F(3);
                        return;
                    case 4:
                    default:
                        fu1Var.toString();
                        return;
                    case 5:
                    case 6:
                    case 7:
                        if (fu1Var.s0.a() || ((bkbVar = (bkb) fu1Var.R0.b) != null && !((AtomicBoolean) bkbVar.b).get())) {
                            z = true;
                        }
                        fu1Var.R0.K();
                        fu1Var.F(5);
                        if (z) {
                            c54.p(null, fu1Var.x0.isEmpty());
                            fu1Var.s();
                            return;
                        }
                        return;
                    case 8:
                    case 9:
                        fu1Var.F(5);
                        fu1Var.r();
                        return;
                }
            default:
                List list2 = this.c;
                fu1 fu1Var2 = this.b;
                st1 st1Var = fu1Var2.Z;
                try {
                    fu1Var2.H((ArrayList) list2);
                    return;
                } finally {
                    st1Var.q();
                }
        }
    }
}
