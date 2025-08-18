package defpackage;

import java.util.List;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class hl7 extends hdc {
    public final iv o;

    public hl7(ema emaVar) {
        gl7 gl7Var = new gl7(this);
        y8 y8Var = new y8(this);
        synchronized (fp3.a) {
            try {
                if (fp3.b == null) {
                    fp3.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        iv ivVar = new iv(y8Var, new qz7(fp3.b, 4, emaVar));
        this.o = ivVar;
        ivVar.d.add(gl7Var);
    }

    public final Object C(int i) {
        return this.o.f.get(i);
    }

    public void D(List list, List list2) {
    }

    public void E(List list) {
        this.o.b(list, null);
    }

    public void F(List list, Runnable runnable) {
        this.o.b(list, runnable);
    }

    @Override // defpackage.hdc
    public int j() {
        return this.o.f.size();
    }

    public hl7(qz7 qz7Var) {
        gl7 gl7Var = new gl7(this);
        iv ivVar = new iv(new y8(this), qz7Var);
        this.o = ivVar;
        ivVar.d.add(gl7Var);
    }
}
