package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h27 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ q27 Y;
    public final /* synthetic */ je7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h27(q27 q27Var, je7 je7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = q27Var;
        this.Z = je7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        h27 h27Var = (h27) n((tt7) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        h27Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        h27 h27Var = new h27(this.Y, this.Z, continuation);
        h27Var.X = obj;
        return h27Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        tt7 tt7Var = (tt7) this.X;
        q27 q27Var = this.Y;
        int i = ((eaa) q27Var.w0.getValue()).b;
        String strM0 = eae.m0(6, "*");
        String str = (String) q27Var.y0.getValue();
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String str2 = "'+" + i + strM0 + w9e.Z0(4, sb.toString()) + "'";
        boolean z = tt7Var instanceof ot7;
        je7 je7Var = this.Z;
        if (z) {
            ((ty3) je7Var.getValue()).a(null, new wt7(wg0.i("Phone: ", str2), ((ot7) tt7Var).b));
        } else if (tt7Var instanceof pt7) {
            ((ty3) je7Var.getValue()).a(null, new wt7(str2, 0));
        } else if (tt7Var instanceof qt7) {
            ((ty3) je7Var.getValue()).a(null, new wt7(str2, 1));
        } else if (tt7Var != null && !(tt7Var instanceof st7)) {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
