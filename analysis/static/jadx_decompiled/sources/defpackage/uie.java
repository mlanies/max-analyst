package defpackage;

import java.util.Collections;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uie extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ xie Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uie(xie xieVar, Continuation continuation) {
        super(2, continuation);
        this.Y = xieVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        uie uieVar = (uie) n((Long) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        uieVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        uie uieVar = new uie(this.Y, continuation);
        uieVar.X = obj;
        return uieVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        Long l = (Long) this.X;
        if (l != null && l.longValue() == -1) {
            this.Y.c().c(null);
        } else {
            this.Y.c().c(l.toString());
            ty3 ty3VarC = this.Y.c();
            String strValueOf = String.valueOf(((int) l.longValue()) & 255);
            ((np) ty3VarC).getClass();
            if (((kye) np.d.getValue()) != null) {
                kye kyeVar = kye.a;
                Map mapSingletonMap = Collections.singletonMap("p", strValueOf);
                if (!kye.b) {
                    try {
                        pje pjeVar = kye.f;
                        (pjeVar != null ? pjeVar : null).b(mapSingletonMap);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return e5f.a;
    }
}
