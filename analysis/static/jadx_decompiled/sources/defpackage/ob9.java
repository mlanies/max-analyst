package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ob9 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xs Z;
    public final /* synthetic */ int s0 = 100;
    public final /* synthetic */ xb9 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob9(xs xsVar, xb9 xb9Var, Continuation continuation) {
        super(2, continuation);
        this.Z = xsVar;
        this.t0 = xb9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ob9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ob9 ob9Var = new ob9(this.Z, this.t0, continuation);
        ob9Var.Y = obj;
        return ob9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        long[] jArr;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        try {
            if (i != 0) {
                if (i == 1) {
                    jArr = (long[]) this.Y;
                    od2.a0(obj);
                    return Collections.singletonList(new kpa(jArr, obj));
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return (List) obj;
            }
            od2.a0(obj);
            sx3 sx3Var = (sx3) this.Y;
            xs xsVar = this.Z;
            int i2 = xsVar.c;
            xb9 xb9Var = this.t0;
            int i3 = this.s0;
            if (i2 <= i3) {
                long[] jArrE0 = x53.E0(xsVar);
                this.Y = jArrE0;
                this.X = 1;
                xb9Var.getClass();
                Object objK = j1e.k(new wb9(xb9Var, null, jArrE0), this);
                if (objK == tx3Var) {
                    return tx3Var;
                }
                obj = objK;
                jArr = jArrE0;
                return Collections.singletonList(new kpa(jArr, obj));
            }
            ArrayList arrayListI0 = x53.I0(xsVar, i3, i3);
            ContextScope contextScopeA = j1e.a(this.b);
            ArrayList arrayList = new ArrayList(z53.S(arrayListI0, 10));
            Iterator it = arrayListI0.iterator();
            while (it.hasNext()) {
                arrayList.add(j47.h(contextScopeA, null, new nb9(it.next(), null, sx3Var, xb9Var), 3));
            }
            this.X = 2;
            obj = pag.c(arrayList, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
            return (List) obj;
        } catch (Throwable th) {
            hm9.p("MissedContactsController", "fail", th);
            return null;
        }
    }
}
