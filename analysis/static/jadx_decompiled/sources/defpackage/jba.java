package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jba extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ nba Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jba(nba nbaVar, Continuation continuation) {
        super(2, continuation);
        this.Y = nbaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jba jbaVar = (jba) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jbaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jba jbaVar = new jba(this.Y, continuation);
        jbaVar.X = obj;
        return jbaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        nba nbaVar = this.Y;
        HashSet hashSetB0 = x53.B0(list);
        vxd vxdVar = nbaVar.h;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        nbaVar.h = null;
        nx3 nx3VarLimitedParallelism = ((w9a) nbaVar.b).a().limitedParallelism(1, "folders-counters");
        ArrayList arrayList = new ArrayList(z53.S(hashSetB0, 10));
        Iterator it = hashSetB0.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            arrayList.add(tpa.f(str, "all.chat.folder") ? new qn5(3, new kba(str, hy3.b)) : new nj7(new ht5(str, nbaVar.c, nbaVar.a, nbaVar.d, nx3VarLimitedParallelism).e, str, 1));
        }
        nbaVar.h = od2.L(new zn5(new ki4((mn5[]) x53.D0(arrayList).toArray(new mn5[0]), 2), new v59(2, nbaVar.e, ti9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 3), 5), nbaVar.g);
        return e5f.a;
    }
}
