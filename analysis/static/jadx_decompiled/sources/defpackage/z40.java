package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class z40 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ je7 Y;
    public final /* synthetic */ c50 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z40(je7 je7Var, c50 c50Var, Continuation continuation) {
        super(2, continuation);
        this.Y = je7Var;
        this.Z = c50Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((z40) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new z40(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            je7 je7Var = this.Y;
            w7c w7cVar = ((uh9) ((ch9) je7Var.getValue())).H;
            c50 c50Var = this.Z;
            xw xwVar = new xw(1, c50Var);
            this.X = 1;
            Object objD = w7cVar.a.d(new y40(xwVar, c50Var, je7Var, 0), this);
            if (objD != tx3Var) {
                objD = e5fVar;
            }
            if (objD == tx3Var) {
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
