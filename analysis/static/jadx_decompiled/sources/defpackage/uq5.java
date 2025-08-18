package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes.dex */
public final class uq5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xm7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq5(xm7 xm7Var, Continuation continuation) {
        super(2, continuation);
        this.Z = xm7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((uq5) n((iab) obj, (Continuation) obj2)).o(e5f.a);
        return tx3.a;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        uq5 uq5Var = new uq5(this.Z, continuation);
        uq5Var.Y = obj;
        return uq5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        g2a g2aVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        xm7 xm7Var = this.Z;
        try {
            if (i == 0) {
                od2.a0(obj);
                gu1 gu1Var = new gu1(1, (iab) this.Y);
                jd4 jd4Var = ql4.a;
                cx7 immediate = MainDispatcherLoader.dispatcher.getImmediate();
                rq5 rq5Var = new rq5(xm7Var, gu1Var, null);
                this.Y = gu1Var;
                this.X = 1;
                if (j47.t0(immediate, rq5Var, this) == tx3Var) {
                    return tx3Var;
                }
                g2aVar = gu1Var;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        g2aVar = (g2a) this.Y;
                        od2.a0(obj);
                        this.Y = g2aVar;
                        this.X = 3;
                        j47.i(this);
                        return tx3Var;
                    }
                    if (i == 3) {
                        od2.a0(obj);
                        throw new KotlinNothingValueException();
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th = (Throwable) this.Y;
                    od2.a0(obj);
                    throw th;
                }
                g2aVar = (g2a) this.Y;
                od2.a0(obj);
            }
            jd4 jd4Var2 = ql4.a;
            cx7 immediate2 = MainDispatcherLoader.dispatcher.getImmediate();
            sq5 sq5Var = new sq5(xm7Var, g2aVar, null);
            this.Y = g2aVar;
            this.X = 2;
            if (j47.t0(immediate2, sq5Var, this) == tx3Var) {
                return tx3Var;
            }
            this.Y = g2aVar;
            this.X = 3;
            j47.i(this);
            return tx3Var;
        } catch (Throwable th2) {
            jd4 jd4Var3 = ql4.a;
            lx3 lx3VarPlus = MainDispatcherLoader.dispatcher.getImmediate().plus(xq9.a);
            tq5 tq5Var = new tq5(xm7Var, 1, null);
            this.Y = th2;
            this.X = 4;
            if (j47.t0(lx3VarPlus, tq5Var, this) == tx3Var) {
                return tx3Var;
            }
            throw th2;
        }
    }
}
