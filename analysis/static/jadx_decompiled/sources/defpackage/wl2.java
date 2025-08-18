package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wl2 extends ffe implements a66 {
    public on5 X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ cm2 s0;
    public final /* synthetic */ Set t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl2(cm2 cm2Var, Set set, Continuation continuation) {
        super(2, continuation);
        this.s0 = cm2Var;
        this.t0 = set;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wl2) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        wl2 wl2Var = new wl2(this.s0, this.t0, continuation);
        wl2Var.Z = obj;
        return wl2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [on5] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        on5 on5Var;
        on5 on5Var2;
        tx3 tx3Var = tx3.a;
        ?? r1 = this.Y;
        try {
            if (r1 == 0) {
                od2.a0(obj);
                on5Var = (on5) this.Z;
                cm2 cm2Var = this.s0;
                Set set = this.t0;
                le5 le5Var = (le5) cm2Var.c.getValue();
                List listD0 = x53.D0(set);
                this.Z = on5Var;
                this.X = on5Var;
                this.Y = 1;
                obj = le5Var.b(listD0, this);
                if (obj == tx3Var) {
                    return tx3Var;
                }
                on5Var2 = on5Var;
            } else {
                if (r1 != 1) {
                    if (r1 == 2) {
                        od2.a0(obj);
                    } else {
                        if (r1 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od2.a0(obj);
                    }
                    return e5f.a;
                }
                on5Var = this.X;
                on5Var2 = (on5) this.Z;
                try {
                    od2.a0(obj);
                } catch (Throwable unused) {
                    r1 = on5Var2;
                    nz4 nz4Var = nz4.a;
                    this.Z = null;
                    this.X = null;
                    this.Y = 3;
                    if (r1.a(nz4Var, this) == tx3Var) {
                        return tx3Var;
                    }
                    return e5f.a;
                }
            }
            this.Z = on5Var2;
            this.X = null;
            this.Y = 2;
            if (on5Var.a(obj, this) == tx3Var) {
                return tx3Var;
            }
            return e5f.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
