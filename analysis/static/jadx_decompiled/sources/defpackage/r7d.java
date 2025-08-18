package defpackage;

import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class r7d implements pi4 {
    public final PmsKey a;
    public final int b = 0;
    public final String[] c;
    public final iqe d;
    public final je7 e;
    public final je7 f;
    public final long g;
    public final q0e h;
    public final w7c i;

    public r7d(PmsKey pmsKey, String[] strArr) {
        this.a = pmsKey;
        this.c = strArr;
        this.d = new iqe(pmsKey.name());
        aj4 aj4Var = aj4.a;
        this.e = aj4Var.getAccessor().d(oyc.class);
        this.f = aj4Var.getAccessor().d(qyc.class);
        this.g = ei4.b.incrementAndGet();
        q0e q0eVarA = r0e.a(e());
        this.h = q0eVarA;
        this.i = new w7c(q0eVarA);
    }

    @Override // defpackage.pi4
    public final void a(b54 b54Var, Long l) {
        if (ei4.a(b54Var.a, this.g)) {
            ((oyc) this.e.getValue()).l(this.a.name(), l);
            this.h.m(null, e());
        }
    }

    @Override // defpackage.pi4
    public final j0e c() {
        return this.i;
    }

    public final List e() {
        z44 z44Var = z44.e;
        qyc qycVar = (qyc) this.f.getValue();
        iqe iqeVar = new iqe(ey8.h(qycVar.g.getLong(this.a.name(), 0L), "Server="));
        return Collections.singletonList(new b54(this.g, this.d, this.b, iqeVar, z44Var));
    }
}
