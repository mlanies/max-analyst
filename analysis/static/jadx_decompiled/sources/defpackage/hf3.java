package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hf3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ of3 Y;
    public final /* synthetic */ je7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf3(of3 of3Var, je7 je7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = of3Var;
        this.Z = je7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        hf3 hf3Var = (hf3) n((ttd) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        hf3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        hf3 hf3Var = new hf3(this.Y, this.Z, continuation);
        hf3Var.X = obj;
        return hf3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object njcVar;
        od2.a0(obj);
        ttd ttdVar = (ttd) this.X;
        if (ttdVar instanceof rtd) {
            try {
                String str = this.Y.X;
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                String string = sb.toString();
                int length2 = string.length() - 3;
                if (length2 < 3) {
                    length2 = 3;
                }
                njcVar = "+" + w9e.M0(string, 3, length2, eae.m0(length2 - 3, "*")).toString();
            } catch (Throwable th) {
                njcVar = new njc(th);
            }
            Object obj2 = this.Y.X;
            if (njcVar instanceof njc) {
                njcVar = obj2;
            }
            String str2 = (String) njcVar;
            rtd rtdVar = (rtd) ttdVar;
            tt7 tt7Var = rtdVar.a;
            if (tt7Var instanceof ot7) {
                ((ty3) this.Z.getValue()).a(null, new wt7(k7d.j("Code: '", this.Y.C0, "', Phone: '", str2, "'"), rtdVar.a.b));
            } else if (tt7Var instanceof pt7) {
                ((ty3) this.Z.getValue()).a(null, new wt7(str2, 0));
            } else if (tt7Var instanceof qt7) {
                ((ty3) this.Z.getValue()).a(null, new wt7(str2, 1));
            } else if (!(tt7Var instanceof st7)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.Y.C0 = null;
        return e5f.a;
    }
}
