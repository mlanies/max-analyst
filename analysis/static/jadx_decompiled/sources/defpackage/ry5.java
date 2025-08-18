package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ry5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ sy5 Y;
    public final /* synthetic */ cz5 Z;
    public final /* synthetic */ List s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry5(sy5 sy5Var, cz5 cz5Var, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = sy5Var;
        this.Z = cz5Var;
        this.s0 = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ry5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ry5(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        cz5 cz5Var = this.Z;
        sy5 sy5Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            xb6 xb6Var = (xb6) sy5Var.b.getValue();
            this.X = 1;
            obj = xb6Var.b(cz5Var, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        List listT0 = (List) obj;
        boolean zIsEmpty = listT0.isEmpty();
        e5f e5fVar = e5f.a;
        if (zIsEmpty) {
            return e5fVar;
        }
        CharSequence charSequence = cz5Var.d;
        if (charSequence != null && !w9e.C0(charSequence)) {
            listT0 = x53.t0(Collections.singletonList(new k9d(new i9d(0L, charSequence.toString(), true, ((dc6) sy5Var.c.getValue()).a(null, charSequence)))), listT0);
        }
        Iterator it = this.s0.iterator();
        while (it.hasNext()) {
            h8d h8dVar = new h8d(((Number) it.next()).longValue(), new LinkedList(listT0), 2);
            h8dVar.e = true;
            ((s8g) sy5Var.a.getValue()).a(new h9d(h8dVar));
        }
        return e5fVar;
    }
}
