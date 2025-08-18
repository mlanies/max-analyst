package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wtd extends ffe implements a66 {
    public k56 X;
    public int Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ k56 s0;
    public final /* synthetic */ m56 t0;
    public final /* synthetic */ long u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtd(ArrayList arrayList, k56 k56Var, m56 m56Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = arrayList;
        this.s0 = k56Var;
        this.t0 = m56Var;
        this.u0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wtd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wtd((ArrayList) this.Z, this.s0, this.t0, this.u0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        k56 k56Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            Iterator it = this.Z.iterator();
            while (it.hasNext()) {
                this.t0.invoke((l17) it.next());
            }
            k56 k56Var2 = this.s0;
            if (k56Var2 != null) {
                this.X = k56Var2;
                this.Y = 1;
                if (j47.x(this.u0, this) == tx3Var) {
                    return tx3Var;
                }
                k56Var = k56Var2;
            }
            return e5f.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k56Var = this.X;
        od2.a0(obj);
        k56Var.invoke();
        return e5f.a;
    }
}
