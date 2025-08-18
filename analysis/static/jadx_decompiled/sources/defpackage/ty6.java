package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ty6 extends ffe implements a66 {
    public fz6 X;
    public int Y;
    public int Z;
    public final /* synthetic */ fz6 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty6(fz6 fz6Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = fz6Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ty6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ty6(this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        fz6 fz6Var;
        int i;
        tx3 tx3Var = tx3.a;
        int i2 = this.Z;
        try {
            if (i2 == 0) {
                od2.a0(obj);
                fz6Var = this.s0;
                String str = fz6.E0;
                if (!((eua) fz6Var.X.getValue()).c()) {
                    throw new IllegalStateException("storage permissions not granted".toString());
                }
                w76 w76Var = w76.a;
                this.X = fz6Var;
                this.Z = 1;
                obj = fz6.a(w76Var, fz6Var, this);
                if (obj == tx3Var) {
                    return tx3Var;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.Y;
                    od2.a0(obj);
                    return new ojc(new Integer(i + ((Number) obj).intValue()));
                }
                fz6Var = this.X;
                od2.a0(obj);
            }
            int iIntValue = ((Number) obj).intValue();
            y76 y76Var = y76.a;
            this.X = null;
            this.Y = iIntValue;
            this.Z = 2;
            Object objA = fz6.a(y76Var, fz6Var, this);
            if (objA == tx3Var) {
                return tx3Var;
            }
            obj = objA;
            i = iIntValue;
            return new ojc(new Integer(i + ((Number) obj).intValue()));
        } catch (Throwable th) {
            return new mjc(th);
        }
    }
}
