package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q7e extends ffe implements a66 {
    public int X;
    public final /* synthetic */ a8e Y;
    public final /* synthetic */ Set Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7e(a8e a8eVar, Set set, Continuation continuation) {
        super(2, continuation);
        this.Y = a8eVar;
        this.Z = set;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((q7e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new q7e(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        Set set = this.Z;
        a8e a8eVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            if (a8eVar.b == a5e.c) {
                x9c x9cVar = (x9c) a8eVar.Y.getValue();
                List listD0 = x53.D0(set);
                this.X = 1;
                if (x9cVar.c(listD0, this) == tx3Var) {
                    return tx3Var;
                }
            } else {
                db3 db3VarD = ((md5) a8eVar.Z.getValue()).d(x53.D0(set));
                this.X = 2;
                if (s36.e(db3VarD, this) == tx3Var) {
                    return tx3Var;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        int i2 = hja.F;
        int size = set.size();
        bc7[] bc7VarArr = a8e.C0;
        String strS = a8eVar.s(size);
        pnf.o(a8eVar.A0, new ued(woc.w, new iqe(a8eVar.o.getString(i2, strS))));
        return e5f.a;
    }
}
