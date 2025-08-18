package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fce extends ffe implements a66 {
    public int X;
    public final /* synthetic */ moa Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fce(moa moaVar, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = moaVar;
        this.Z = str;
        this.s0 = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((fce) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fce(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Integer num;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        moa moaVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            List list = (List) moaVar.Z;
            String str = (String) moaVar.X;
            String str2 = this.Z;
            boolean zF = tpa.f(str2, str);
            int i2 = this.s0;
            if (zF && (num = (Integer) moaVar.Y) != null && num.intValue() == i2 && list != null) {
                return list;
            }
            q1a q1aVarA = ((bde) moaVar.c).a(i2, str2);
            this.X = 1;
            obj = s36.f(q1aVarA, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        moaVar.Z = (List) obj;
        return obj;
    }
}
