package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class v23 extends ffe implements a66 {
    public final /* synthetic */ w23 X;
    public final /* synthetic */ long Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v23(w23 w23Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = w23Var;
        this.Y = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        v23 v23Var = (v23) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        v23Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new v23(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        w23 w23Var = this.X;
        String str = w23Var.a;
        je7 je7Var = w23Var.c;
        String str2 = w23Var.a;
        StringBuilder sb = new StringBuilder("cancelAllRunningDraftTasks for chat ");
        long j = this.Y;
        sb.append(j);
        hm9.n(str, sb.toString());
        try {
            List<une> listI = ((eoe) je7Var.getValue()).i(w23.d);
            hm9.n(str2, "cancelAllRunningDraftTasks: all tasks count = " + listI.size());
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (une uneVar : listI) {
                hua huaVar = uneVar.f;
                if (huaVar instanceof dp4) {
                    if (((dp4) huaVar).o == j) {
                        linkedHashSet.add(new Long(uneVar.a));
                    }
                } else if ((huaVar instanceof hp4) && ((hp4) huaVar).o == j) {
                    linkedHashSet.add(new Long(uneVar.a));
                }
            }
            ((eoe) je7Var.getValue()).e(linkedHashSet);
            hm9.n(str2, "cancelAllRunningDraftTasks: removed tasks count = " + linkedHashSet.size());
        } catch (Throwable th) {
            hm9.p(str2, "cancelAllRunningDraftTasks: error!", th);
        }
        return e5f.a;
    }
}
