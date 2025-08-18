package defpackage;

import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zse extends ffe implements a66 {
    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        zse zseVar = (zse) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        zseVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zse(2, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wva wvaVarG = z7.G();
        hm9.l("ThreadsDeveloperTools", "Threads count: " + ((Map) wvaVarG.b), (Throwable) wvaVarG.c);
        return e5f.a;
    }
}
