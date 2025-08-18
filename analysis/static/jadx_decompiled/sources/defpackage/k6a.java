package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class k6a implements pi4 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final q0e i;

    public k6a(v4 v4Var) {
        this.a = v4Var.d(Context.class);
        this.b = v4Var.d(xie.class);
        this.c = v4Var.d(q33.class);
        this.d = v4Var.d(u8e.class);
        AtomicLong atomicLong = ei4.b;
        this.e = atomicLong.incrementAndGet();
        this.f = atomicLong.incrementAndGet();
        this.g = atomicLong.incrementAndGet();
        this.h = atomicLong.incrementAndGet();
        this.i = r0e.a(e());
    }

    @Override // defpackage.pi4
    public final j0e c() {
        return this.i;
    }

    @Override // defpackage.pi4
    public final void d(b54 b54Var) {
        long j = b54Var.a;
        if (ei4.a(j, this.e)) {
            String strD = ((xie) this.b.getValue()).d();
            tpa.o((Context) this.a.getValue(), strD);
            hm9.n("PushToken", "Current pushToken: \"" + strD + "\"");
            return;
        }
        if (ei4.a(j, this.f)) {
            try {
                j47.T(zd6.a, null, null, new j6a(this, null), 3);
                return;
            } catch (Throwable th) {
                hm9.l0("PushToken", "Refresh current token failed", th);
                return;
            }
        }
        if (ei4.a(j, this.g)) {
            t33 t33Var = (t33) f();
            t33Var.j("ok_push_disabled", !((t33) f()).G());
            t33Var.m = null;
            this.i.m(null, e());
            return;
        }
        if (ei4.a(j, this.h)) {
            ((hyc) f()).j("server.useTls", !((t33) f()).d("server.useTls", true));
            this.i.m(null, e());
        }
    }

    public final List e() {
        String strConcat;
        iqe iqeVar = new iqe("Скопировать Push token");
        String strD = ((xie) this.b.getValue()).d();
        if (strD == null || (strConcat = "...".concat(w9e.Z0(10, strD))) == null) {
            strConcat = "null";
        }
        return y53.M(new b54(this.e, iqeVar, 0, new iqe(strConcat), null, 20), new b54(this.f, new iqe("Обновить Push token"), 0, new iqe(((xe6) ((u8e) this.d.getValue())).f), null, 20), new b54(this.g, new iqe("Показывать пуши из сокета"), 0, null, new a54(!((t33) f()).G()), 12), new b54(this.h, new iqe("Использовать ssl"), 0, null, new a54(((t33) f()).d("server.useTls", true)), 12));
    }

    public final q33 f() {
        return (q33) this.c.getValue();
    }
}
