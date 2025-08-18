package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class sg9 implements id6 {
    public final /* synthetic */ m1f a;

    public /* synthetic */ sg9(m1f m1fVar) {
        this.a = m1fVar;
    }

    @Override // defpackage.id6
    public void a(jd6 jd6Var, hd6 hd6Var, long j) {
        m1f m1fVar = this.a;
        fm9.l(m1fVar.z0);
        fm9.k(!m1fVar.D0);
        d54.a();
        m1fVar.w0.add(new tg9(hd6Var, j));
        m1fVar.x0.put(hd6Var.a, new ug9(jd6Var, j));
        if (m1fVar.B0) {
            m1fVar.b();
            return;
        }
        rf4 rf4Var = m1fVar.z0;
        rf4Var.getClass();
        rf4Var.c(3, m1fVar.s0, new t26(m1fVar.b, hd6Var.c, hd6Var.d, 1.0f, 0L));
        m1fVar.B0 = true;
    }
}
