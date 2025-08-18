package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vp7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ xp7 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp7(xp7 xp7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = xp7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        vp7 vp7Var = (vp7) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        vp7Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        vp7 vp7Var = new vp7(this.Y, continuation);
        vp7Var.X = obj;
        return vp7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        xp7 xp7Var = this.Y;
        xp7Var.getClass();
        hm9.n("xp7", "albums loaded");
        int iZ = mz7.Z(z53.S(list, 10));
        if (iZ < 16) {
            iZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iZ);
        for (Object obj2 : list) {
            linkedHashMap.put(((b86) obj2).a.b(), obj2);
        }
        xp7Var.g = linkedHashMap;
        su suVar = new su(6);
        av0 av0Var = xp7Var.a;
        av0Var.c(suVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            av0Var.c(new yp7(((b86) it.next()).a.b()));
        }
        x77 x77Var = ((fz6) xp7Var.c).y0;
        if (x77Var != null && x77Var.isCompleted()) {
            r1f r1fVar = new r1f(l6d.d0(new r1f(new at(2, list), new jy2(27, xp7Var)), n71.t0), new g27(6));
            xs xsVar = new xs(0);
            l6d.h0(r1fVar, xsVar);
            p4d p4dVar = xp7Var.f;
            p4dVar.getClass();
            hm9.n("p4d", "refreshSelectedMedias()");
            CopyOnWriteArraySet copyOnWriteArraySet = p4dVar.a;
            List listP = nd7.p(copyOnWriteArraySet, new bqc(4, xsVar));
            hm9.n("p4d", "refreshSelectedMedias(), itemsForRemoveCount = " + listP.size());
            copyOnWriteArraySet.removeAll(listP);
            if (!listP.isEmpty()) {
                p4dVar.n();
            }
        }
        return e5f.a;
    }
}
