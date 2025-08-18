package defpackage;

import android.content.SharedPreferences;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class d7d implements pi4, SharedPreferences.OnSharedPreferenceChangeListener {
    public final q33 a;
    public final je7 b;
    public final long c;
    public final long d;
    public final q0e e;
    public final w7c f;

    /* JADX WARN: Multi-variable type inference failed */
    public d7d(je7 je7Var, q33 q33Var) {
        this.a = q33Var;
        this.b = je7Var;
        AtomicLong atomicLong = ei4.b;
        this.c = atomicLong.incrementAndGet();
        this.d = atomicLong.incrementAndGet();
        q0e q0eVarA = r0e.a(e());
        this.e = q0eVarA;
        this.f = new w7c(q0eVarA);
        e3 e3Var = q33Var instanceof e3 ? (e3) q33Var : null;
        if (e3Var != null) {
            e3Var.g.registerOnSharedPreferenceChangeListener(this);
        }
    }

    @Override // defpackage.pi4
    public final void b() {
        Object obj = this.a;
        e3 e3Var = obj instanceof e3 ? (e3) obj : null;
        if (e3Var != null) {
            e3Var.g.unregisterOnSharedPreferenceChangeListener(this);
        }
    }

    @Override // defpackage.pi4
    public final j0e c() {
        return this.f;
    }

    @Override // defpackage.pi4
    public final void d(b54 b54Var) {
        long j = b54Var.a;
        boolean zA = ei4.a(j, this.c);
        je7 je7Var = this.b;
        if (zA) {
            f64 f64Var = (f64) je7Var.getValue();
            gi4.b.getClass();
            f64Var.b(m64.a(gi4.h.a), null);
        } else if (ei4.a(j, this.d)) {
            f64 f64Var2 = (f64) je7Var.getValue();
            gi4.b.getClass();
            f64Var2.b(m64.a(gi4.i.a), null);
        }
    }

    public final List e() {
        t33 t33Var = (t33) this.a;
        String strD = t33Var.D();
        if (strD == null) {
            strD = "";
        }
        b54 b54Var = new b54(this.c, new iqe(strD), 0, new iqe("Адрес сервера"), null, 20);
        String strE = t33Var.E();
        return y53.M(b54Var, new b54(this.d, new iqe(strE != null ? strE : ""), 0, new iqe("Порт сервера"), null, 20));
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.e.m(null, e());
    }
}
