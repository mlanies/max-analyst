package defpackage;

import java.util.List;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class bs7 extends ol implements lme {
    public final List X;
    public final boolean Y;
    public final String Z;
    public final boolean o;

    public bs7(long j, List list, boolean z, boolean z2) {
        super(j);
        this.o = z;
        this.X = list;
        this.Y = z2;
        this.Z = bs7.class.getName();
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) throws Throwable {
        j47.f0(hz4.a, new as7(this, null));
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) throws Throwable {
        j47.f0(hz4.a, new zr7(this, null));
    }

    @Override // defpackage.ol
    public final dle i() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        se5 se5Var = (se5) ((qe5) plVar.V.getValue());
        se5Var.getClass();
        if (!se5Var.n(PmsKey.f3analyticsenabled, true)) {
            return null;
        }
        return (cs7) j47.f0(hz4.a, new yr7(this, null));
    }
}
