package defpackage;

import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class e7d implements pi4 {
    public final jqe a;
    public final PmsKey b;
    public final boolean c;
    public final int d;
    public final je7 e;
    public final je7 f;
    public final long g;
    public final q0e h;
    public final w7c i;

    public e7d(iqe iqeVar, PmsKey pmsKey, boolean z, int i) {
        this.a = iqeVar;
        this.b = pmsKey;
        this.c = z;
        this.d = i;
        aj4 aj4Var = aj4.a;
        this.e = aj4Var.getAccessor().d(oyc.class);
        this.f = aj4Var.getAccessor().d(qyc.class);
        this.g = ei4.b.incrementAndGet();
        q0e q0eVarA = r0e.a(e());
        this.h = q0eVarA;
        this.i = new w7c(q0eVarA);
    }

    @Override // defpackage.pi4
    public final j0e c() {
        return this.i;
    }

    @Override // defpackage.pi4
    public final void d(b54 b54Var) {
        if (ei4.a(b54Var.a, this.g)) {
            je7 je7Var = this.e;
            oyc oycVar = (oyc) je7Var.getValue();
            boolean z = this.c;
            PmsKey pmsKey = this.b;
            boolean zN = oycVar.n(pmsKey, z);
            oyc oycVar2 = (oyc) je7Var.getValue();
            oycVar2.getClass();
            oycVar2.j(pmsKey.name(), !zN);
            this.h.m(null, e());
        }
    }

    public final List e() {
        oyc oycVar = (oyc) this.e.getValue();
        PmsKey pmsKey = this.b;
        boolean z = this.c;
        a54 a54Var = new a54(oycVar.n(pmsKey, z));
        qyc qycVar = (qyc) this.f.getValue();
        iqe iqeVar = new iqe(ey8.j("Server: ", qycVar.g.getBoolean(pmsKey.name(), z)));
        return Collections.singletonList(new b54(this.g, this.a, this.d, iqeVar, a54Var));
    }

    public e7d(PmsKey pmsKey) {
        this(new iqe(pmsKey.name()), pmsKey, false, 0);
    }

    public e7d(String str, PmsKey pmsKey, boolean z) {
        this(new iqe(str), pmsKey, z, 0);
    }
}
