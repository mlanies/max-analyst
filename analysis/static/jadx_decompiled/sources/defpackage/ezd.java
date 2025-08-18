package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class ezd extends ffe implements a66 {
    public final /* synthetic */ jzd X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezd(jzd jzdVar, Continuation continuation) {
        super(2, continuation);
        this.X = jzdVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ezd ezdVar = (ezd) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ezdVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ezd(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        jzd jzdVar = this.X;
        q0e q0eVar = jzdVar.w0;
        kl7 kl7VarL = j1e.l();
        kl7VarL.add(new uy3(zia.s, woc.f2, new eqe(jpc.A)));
        qyc qycVar = (qyc) jzdVar.c;
        qycVar.getClass();
        if (qycVar.n(PmsKey.f18channelsenabled, false)) {
            kl7VarL.add(new uy3(zia.r, yfa.j, new eqe(jpc.S)));
        }
        q0eVar.setValue(j1e.d(kl7VarL));
        return e5f.a;
    }
}
