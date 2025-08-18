package defpackage;

/* loaded from: classes.dex */
public final class lgf {
    public final o9g a;
    public final cgf b;
    public jlf g;
    public long i;
    public final l7 c = new l7(10);
    public final due d = new due(1);
    public final due e = new due(1);
    public final uy f = new uy(4, (byte) 0);
    public jlf h = jlf.e;
    public long j = -9223372036854775807L;

    public lgf(o9g o9gVar, cgf cgfVar) {
        this.a = o9gVar;
        this.b = cgfVar;
    }

    public final void a() {
        uy uyVar = this.f;
        uyVar.b = 0;
        uyVar.c = -1;
        uyVar.o = 0;
        this.j = -9223372036854775807L;
        due dueVar = this.e;
        if (dueVar.h() > 0) {
            fm9.f(dueVar.h() > 0);
            while (dueVar.h() > 1) {
                dueVar.e();
            }
            Object objE = dueVar.e();
            objE.getClass();
            dueVar.a(0L, (Long) objE);
        }
        jlf jlfVar = this.g;
        due dueVar2 = this.d;
        if (jlfVar != null) {
            dueVar2.b();
            return;
        }
        if (dueVar2.h() > 0) {
            fm9.f(dueVar2.h() > 0);
            while (dueVar2.h() > 1) {
                dueVar2.e();
            }
            Object objE2 = dueVar2.e();
            objE2.getClass();
            this.g = (jlf) objE2;
        }
    }
}
