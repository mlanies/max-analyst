package defpackage;

import android.content.Context;
import java.util.Collections;

/* loaded from: classes.dex */
public final class jqd implements pi4 {
    public final /* synthetic */ int a = 1;
    public final long b;
    public final Object c;
    public final Object d;

    public jqd(iqe iqeVar, int i, fyc fycVar) {
        this.c = fycVar;
        long jIncrementAndGet = ei4.b.incrementAndGet();
        this.b = jIncrementAndGet;
        this.d = new w7c(r0e.a(Collections.singletonList(new b54(jIncrementAndGet, iqeVar, i, null, y44.e, 8))));
    }

    @Override // defpackage.pi4
    public final j0e c() {
        switch (this.a) {
            case 0:
                return (w7c) this.d;
            default:
                return (q0e) this.d;
        }
    }

    @Override // defpackage.pi4
    public final void d(b54 b54Var) {
        switch (this.a) {
            case 0:
                if (ei4.a(b54Var.a, this.b)) {
                    ((k56) this.c).invoke();
                    break;
                }
                break;
            default:
                if (ei4.a(b54Var.a, this.b)) {
                    f64 f64Var = (f64) ((je7) this.c).getValue();
                    gi4.b.getClass();
                    f64Var.b(m64.a(gi4.j.a), null);
                    break;
                }
                break;
        }
    }

    public jqd(Context context, je7 je7Var) {
        this.c = je7Var;
        long jIncrementAndGet = ei4.b.incrementAndGet();
        this.b = jIncrementAndGet;
        this.d = r0e.a(Collections.singletonList(new b54(jIncrementAndGet, new iqe(qp4.u0.b(context).g().a), woc.r0, new iqe("Смена темы"), null, 16)));
    }
}
