package defpackage;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class b5a extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AtomicBoolean Y;
    public final /* synthetic */ Handler Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5a(AtomicBoolean atomicBoolean, Handler handler, Continuation continuation) {
        super(2, continuation);
        this.Y = atomicBoolean;
        this.Z = handler;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((b5a) n((gk) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        b5a b5aVar = new b5a(this.Y, this.Z, continuation);
        b5aVar.X = obj;
        return b5aVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        gk gkVar = (gk) this.X;
        boolean z = this.Y.get();
        e5f e5fVar = e5f.a;
        if (!z) {
            return e5fVar;
        }
        wva wvaVarG = z7.G();
        gkVar.initCause((Throwable) wvaVarG.c);
        hm9.l0("ANR", "detect " + gkVar, gkVar);
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.Y, "ANR-ThreadDump", wvaVarG.toString(), null);
        }
        bcf.a.c().a(null, gkVar);
        if (this.Y.compareAndSet(true, false)) {
            this.Z.postAtFrontOfQueue(new nn6(22, this.Y));
        }
        return e5fVar;
    }
}
