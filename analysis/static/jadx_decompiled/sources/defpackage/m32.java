package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public class m32 extends l32 {
    public final Object X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m32(Object obj, lx3 lx3Var, int i, int i2, int i3) {
        super(lx3Var, i, i2);
        this.o = i3;
        this.X = obj;
    }

    @Override // defpackage.l32
    public Object j(iab iabVar, Continuation continuation) {
        switch (this.o) {
            case 0:
                Object objInvoke = ((a66) this.X).invoke(iabVar, continuation);
                if (objInvoke != tx3.a) {
                    break;
                }
                break;
            default:
                z5d z5dVar = new z5d(iabVar);
                Iterator it = ((Iterable) this.X).iterator();
                while (it.hasNext()) {
                    j47.T(iabVar, null, null, new y32((mn5) it.next(), z5dVar, null), 3);
                }
                break;
        }
        return e5f.a;
    }

    @Override // defpackage.l32
    public l32 k(lx3 lx3Var, int i, int i2) {
        switch (this.o) {
            case 0:
                return new m32((a66) this.X, lx3Var, i, i2, 0);
            default:
                return new m32((Iterable) this.X, lx3Var, i, i2, 1);
        }
    }

    @Override // defpackage.l32
    public p8c m(sx3 sx3Var) {
        switch (this.o) {
            case 1:
                k32 k32Var = new k32(this, null);
                vx3 vx3Var = vx3.a;
                fab fabVar = new fab(v3c.x(sx3Var, this.a), c37.a(this.b, 1, 4));
                fabVar.start(vx3Var, fabVar, k32Var);
                return fabVar;
            default:
                return super.m(sx3Var);
        }
    }

    @Override // defpackage.l32
    public String toString() {
        switch (this.o) {
            case 0:
                return "block[" + ((a66) this.X) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }
}
