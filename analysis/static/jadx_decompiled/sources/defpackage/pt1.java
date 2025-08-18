package defpackage;

import android.util.ArrayMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class pt1 extends iv1 {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public /* synthetic */ pt1() {
    }

    @Override // defpackage.iv1
    public void a(int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    iv1 iv1Var = (iv1) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(iv1Var)).execute(new l40(i, 4, iv1Var));
                    } catch (RejectedExecutionException unused) {
                    }
                }
                break;
        }
    }

    @Override // defpackage.iv1
    public final void b(int i, pv1 pv1Var) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    iv1 iv1Var = (iv1) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(iv1Var)).execute(new si1(iv1Var, i, pv1Var, 2));
                    } catch (RejectedExecutionException unused) {
                    }
                }
                break;
            default:
                ((lq1) this.b).b(null);
                ((yw1) this.c).s(this);
                break;
        }
    }

    @Override // defpackage.iv1
    public void c(int i, dp3 dp3Var) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    iv1 iv1Var = (iv1) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(iv1Var)).execute(new si1(iv1Var, i, dp3Var, 1));
                    } catch (RejectedExecutionException unused) {
                    }
                }
                break;
        }
    }

    public pt1(lq1 lq1Var, yw1 yw1Var) {
        this.b = lq1Var;
        this.c = yw1Var;
    }
}
