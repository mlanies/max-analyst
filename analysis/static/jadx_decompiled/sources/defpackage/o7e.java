package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o7e extends ffe implements a66 {
    public int X;
    public final /* synthetic */ a8e Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7e(a8e a8eVar, Continuation continuation) {
        super(2, continuation);
        this.Y = a8eVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((o7e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new o7e(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        a8e a8eVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            x9c x9cVar = (x9c) a8eVar.Y.getValue();
            this.X = 1;
            obj = x9cVar.a(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        e5f e5fVar = e5f.a;
        if (!zBooleanValue) {
            return e5fVar;
        }
        pnf.o(a8eVar.A0, new ued(woc.w, new eqe(hja.C)));
        return e5fVar;
    }
}
