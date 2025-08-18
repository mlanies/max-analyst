package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ice extends ffe implements a66 {
    public final /* synthetic */ moa X;
    public final /* synthetic */ Set Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ice(moa moaVar, LinkedHashSet linkedHashSet, Continuation continuation) {
        super(2, continuation);
        this.X = moaVar;
        this.Y = linkedHashSet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ice) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ice(this.X, (LinkedHashSet) this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        moa moaVar = this.X;
        boolean z = ((j92) moaVar.a) == j92.b;
        Set set = this.Y;
        List listB = z ? ((bde) moaVar.c).b((LinkedHashSet) set) : ((ns3) moaVar.o).b((LinkedHashSet) set);
        ArrayList arrayList = new ArrayList(z53.S(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new fde((ybe) it.next(), !z));
        }
        return arrayList;
    }
}
