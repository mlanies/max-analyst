package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class d07 implements pi4 {
    public final je7 a;
    public final q0e b;

    public d07(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = je7Var;
        AtomicLong atomicLong = ei4.b;
        long jIncrementAndGet = atomicLong.incrementAndGet();
        long jIncrementAndGet2 = atomicLong.incrementAndGet();
        long jIncrementAndGet3 = atomicLong.incrementAndGet();
        ((x6a) je7Var4.getValue()).getClass();
        ((x6a) je7Var4.getValue()).getClass();
        b54 b54Var = new b54(jIncrementAndGet2, new iqe("25.8.1(6392)"), 0, new eqe(m0c.oneme_settings_app_version), null, 20);
        b54 b54Var2 = new b54(jIncrementAndGet, new iqe(String.valueOf(((hyc) ((q33) je7Var2.getValue())).t())), 0, new eqe(m0c.oneme_settings_user_id), null, 20);
        String str = (String) ((ti4) ((ri4) je7Var3.getValue())).l.get();
        this.b = r0e.a(y53.M(b54Var, b54Var2, new b54(jIncrementAndGet3, new iqe(str == null ? "NULL" : str), 0, new eqe(m0c.oneme_settings_mytracker_id), null, 20)));
    }

    @Override // defpackage.pi4
    public final j0e c() {
        return this.b;
    }

    @Override // defpackage.pi4
    public final void d(b54 b54Var) {
        je7 je7Var = this.a;
        Context context = (Context) je7Var.getValue();
        CharSequence charSequenceB = b54Var.b.b((Context) je7Var.getValue());
        tpa.o(context, charSequenceB != null ? charSequenceB.toString() : null);
    }
}
