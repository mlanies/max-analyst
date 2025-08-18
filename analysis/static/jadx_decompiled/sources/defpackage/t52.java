package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class t52 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ u52 Y;
    public final /* synthetic */ List Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t52(u52 u52Var, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = u52Var;
        this.Z = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((t52) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new t52(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            e52 e52VarQ = this.Y.q();
            if (e52VarQ == null) {
                return e5fVar;
            }
            ContextScope contextScopeA = j1e.a(this.b);
            List list = this.Z;
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(j47.h(contextScopeA, null, new s52(it.next(), null, this.Y, e52VarQ, list), 3));
            }
            this.X = 1;
            if (pag.c(arrayList, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
