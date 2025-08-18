package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class r81 extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ u81 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r81(u81 u81Var, Continuation continuation) {
        super(2, continuation);
        this.Y = u81Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        r81 r81Var = (r81) n(bool, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        r81Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        r81 r81Var = new r81(this.Y, continuation);
        r81Var.X = ((Boolean) obj).booleanValue();
        return r81Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        List list;
        Object value;
        od2.a0(obj);
        if (this.X) {
            list = nz4.a;
        } else {
            v25 v25Var = v81.Y;
            ArrayList arrayList = new ArrayList(z53.S(v25Var, 10));
            u1 u1Var = new u1(0, v25Var);
            while (u1Var.hasNext()) {
                v81 v81Var = (v81) u1Var.next();
                arrayList.add(new w81(v81Var.ordinal(), v81Var.a, v81Var));
            }
            list = arrayList;
        }
        u81 u81Var = this.Y;
        q0e q0eVar = u81Var.t0;
        do {
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, ls1.a((ls1) value, list, ((Boolean) u81Var.Y.getValue()).booleanValue(), false, 4)));
        return e5f.a;
    }
}
