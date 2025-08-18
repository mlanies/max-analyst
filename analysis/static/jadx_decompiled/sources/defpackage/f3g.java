package defpackage;

import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class f3g extends ffe implements a66 {
    public int X;
    public final /* synthetic */ g3g Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3g(g3g g3gVar, Continuation continuation) {
        super(2, continuation);
        this.Y = g3gVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((f3g) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new f3g(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objI;
        Object objC;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        int i2 = 2;
        g3g g3gVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            mtf mtfVar = (mtf) g3gVar.c.getValue();
            this.X = 1;
            mtfVar.getClass();
            xlc xlcVarA = xlc.a(1, "SELECT * FROM webapp_biometry WHERE user_id = ?");
            xlcVarA.j(1, g3gVar.b);
            objI = ote.i(mtfVar.a, new CancellationSignal(), new jtf(mtfVar, xlcVarA, 0), this);
            if (objI == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                objC = obj;
                g3gVar.X.m(null, x53.t0(Collections.singletonList(new t2g()), (List) objC));
                return e5fVar;
            }
            od2.a0(obj);
            objI = obj;
        }
        List list = (List) objI;
        if (list.isEmpty()) {
            return e5fVar;
        }
        ContextScope contextScopeA = j1e.a(this.b);
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        int i3 = 0;
        for (Object obj2 : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                y53.R();
                throw null;
            }
            arrayList.add(j47.h(contextScopeA, null, new e3g(i3, obj2, null, this.Y, list), 3));
            i3 = i4;
            i2 = 2;
        }
        this.X = i2;
        objC = pag.c(arrayList, this);
        if (objC == tx3Var) {
            return tx3Var;
        }
        g3gVar.X.m(null, x53.t0(Collections.singletonList(new t2g()), (List) objC));
        return e5fVar;
    }
}
