package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ytd extends ffe implements a66 {
    public k56 X;
    public int Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ k56 s0;
    public final /* synthetic */ bud t0;
    public final /* synthetic */ m56 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytd(ArrayList arrayList, ig3 ig3Var, bud budVar, utd utdVar, Continuation continuation) {
        super(2, continuation);
        this.Z = arrayList;
        this.s0 = ig3Var;
        this.t0 = budVar;
        this.u0 = utdVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ytd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ytd((ArrayList) this.Z, (ig3) this.s0, this.t0, (utd) this.u0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        k56 k56Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            int i2 = 0;
            for (Object obj2 : this.Z) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    y53.R();
                    throw null;
                }
                j47.T(this.t0.a, null, null, new xtd(i2, (utd) this.u0, (l17) obj2, null), 3);
                i2 = i3;
            }
            k56 k56Var2 = this.s0;
            if (k56Var2 != null) {
                long size = r11.size() * 100;
                this.X = k56Var2;
                this.Y = 1;
                if (j47.x(size, this) == tx3Var) {
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
