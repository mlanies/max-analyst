package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final /* synthetic */ class i12 implements xff {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i12(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.xff
    public final void run() throws GlUtil$GlException {
        switch (this.a) {
            case 0:
                ((gd6) ((jo7) this.b).a).a((hd6) this.c);
                return;
            case 1:
                fa5 fa5Var = (fa5) this.b;
                fa5Var.y0 = 0;
                fa5Var.X = (ba5) ((gd6) this.c);
                return;
            case 2:
                rk5 rk5Var = (rk5) this.b;
                jee jeeVar = (jee) this.c;
                synchronized (rk5Var) {
                    try {
                        if (rk5Var.p != null) {
                            return;
                        }
                        if (oaf.a(rk5Var.D, jeeVar)) {
                            return;
                        }
                        jee jeeVar2 = rk5Var.D;
                        if (jeeVar2 != null && (jeeVar == null || !jeeVar2.a.equals(jeeVar.a))) {
                            rk5Var.i();
                        }
                        jee jeeVar3 = rk5Var.D;
                        rk5Var.C = (jeeVar3 != null && jeeVar != null && jeeVar3.b == jeeVar.b && jeeVar3.c == jeeVar.c && jeeVar3.d == jeeVar.d) ? false : true;
                        rk5Var.D = jeeVar;
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 3:
                l0f l0fVar = (l0f) this.b;
                l0fVar.getClass();
                Pair pair = (Pair) this.c;
                ((gd6) l0fVar.X).e((va8) l0fVar.o, (hd6) pair.first, ((Long) pair.second).longValue());
                return;
            case 4:
                sg9 sg9Var = ((soe) this.b).X;
                sg9Var.getClass();
                int i = ((hd6) this.c).a;
                mr0.p();
                m1f m1fVar = sg9Var.a;
                SparseArray sparseArray = m1fVar.x0;
                fm9.k(oaf.l(sparseArray, i));
                ug9 ug9Var = (ug9) sparseArray.get(i);
                ug9Var.a.c(ug9Var.b);
                sparseArray.remove(i);
                m1fVar.b();
                return;
            default:
                nx0 nx0Var = (nx0) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                synchronized (nx0Var.Z) {
                    nx0Var.Y = false;
                }
                countDownLatch.countDown();
                return;
        }
    }
}
