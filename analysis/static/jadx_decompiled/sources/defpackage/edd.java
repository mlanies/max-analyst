package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class edd extends ffe implements a66 {
    public final /* synthetic */ ndd X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edd(ndd nddVar, Continuation continuation) {
        super(2, continuation);
        this.X = nddVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        edd eddVar = (edd) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        eddVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new edd(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        q0e q0eVar;
        Object value;
        od2.a0(obj);
        kl7 kl7VarL = j1e.l();
        bc7[] bc7VarArr = ndd.A0;
        ndd nddVar = this.X;
        nddVar.getClass();
        kl7VarL.add(new b1d(new eqe(gha.r), 0, fha.y));
        kl7VarL.add(new c1d(1, new eqe(gha.p), 0, fha.o, new dfd(ndd.t(nddVar.r().g.getInt("app.media.load.photo", 0), false), null)));
        kl7VarL.add(new c1d(2, new eqe(gha.l), 0, fha.l, new dfd(ndd.t(nddVar.r().g.getInt("app.media.load.gif", 0), false), null)));
        kl7VarL.add(new c1d(2, new eqe(gha.i), 0, fha.k, new dfd(ndd.t(nddVar.r().g.getInt("app.media.load.audio", 0), false), null)));
        kl7VarL.add(new c1d(3, new eqe(gha.o), 0, fha.n, new ffd(nddVar.r().n(), true)));
        kl7VarL.add(new b1d(new eqe(gha.s), 1, fha.z));
        kl7VarL.add(new c1d(1, new eqe(gha.v), 1, fha.p, new dfd(ndd.t(nddVar.r().g.getInt("app.video.auto.play", 1), true), null)));
        je7 je7Var = nddVar.o;
        qyc qycVar = (qyc) ((y7d) ((rj) je7Var.getValue()).b.getValue());
        qycVar.getClass();
        boolean zN = qycVar.n(PmsKey.f20chatanimojienabled, false);
        kl7VarL.add(new c1d(zN ? 2 : 3, new eqe(gha.m), 1, fha.m, new ffd(((jp) nddVar.r()).g.getBoolean("app.media.autoplay.gif", true), true)));
        if (zN) {
            kl7VarL.add(new c1d(3, new eqe(gha.h), 1, fha.j, new ffd(((rj) je7Var.getValue()).a(), true)));
        }
        kl7VarL.add(new b1d(new eqe(gha.t), 2, fha.A));
        kl7VarL.add(new c1d(4, new eqe(gha.w), 2, fha.r, new dfd(new iqe(nddVar.r().q().a.a), null)));
        kl7VarL.add(new c1d(4, new eqe(gha.k), 3, fha.q, cfd.a));
        kl7 kl7VarD = j1e.d(kl7VarL);
        do {
            q0eVar = nddVar.X;
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, kl7VarD));
        return e5f.a;
    }
}
