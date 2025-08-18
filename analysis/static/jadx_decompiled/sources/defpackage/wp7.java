package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wp7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xp7 Y;
    public final /* synthetic */ String Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp7(xp7 xp7Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = xp7Var;
        this.Z = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wp7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wp7(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        String str = this.Z;
        xp7 xp7Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            b86 b86Var = (b86) xp7Var.g.get(str);
            if (b86Var == null) {
                return e5fVar;
            }
            hq7 hq7Var = xp7Var.c;
            this.X = 1;
            if (((fz6) hq7Var).d(b86Var, 40, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        xp7Var.a.c(new yp7(str));
        return e5fVar;
    }
}
