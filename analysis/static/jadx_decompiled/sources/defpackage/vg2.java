package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes.dex */
public final class vg2 extends ffe implements e66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Throwable Y;
    public /* synthetic */ long Z;
    public final /* synthetic */ Object s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg2(Object obj, Continuation continuation, int i) {
        super(4, continuation);
        this.X = i;
        this.s0 = obj;
    }

    @Override // defpackage.e66
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        Throwable th = (Throwable) obj2;
        Number number = (Number) obj3;
        switch (this.X) {
            case 0:
                long jLongValue = number.longValue();
                vg2 vg2Var = new vg2((yg2) this.s0, (Continuation) obj4, 0);
                vg2Var.Y = th;
                vg2Var.Z = jLongValue;
                return vg2Var.o(e5f.a);
            default:
                long jLongValue2 = number.longValue();
                vg2 vg2Var2 = new vg2((rff) this.s0, (Continuation) obj4, 1);
                vg2Var2.Y = th;
                vg2Var2.Z = jLongValue2;
                return vg2Var2.o(e5f.a);
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        boolean z;
        boolean z2;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                Throwable th = this.Y;
                long j = this.Z;
                boolean z3 = th instanceof TamErrorException;
                yg2 yg2Var = (yg2) this.s0;
                if (z3 && f46.U(((TamErrorException) th).a.b) && j <= 2) {
                    hm9.p((String) yg2Var.e, "request failed with " + th + ". Retrying", null);
                    z = true;
                } else {
                    hm9.p((String) yg2Var.e, "request failed with " + th + ". Couldn't recover", null);
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                od2.a0(obj);
                Throwable th2 = this.Y;
                long j2 = this.Z;
                boolean z4 = th2 instanceof TamErrorException;
                rff rffVar = (rff) this.s0;
                if (z4 && f46.U(((TamErrorException) th2).a.b) && j2 <= 2) {
                    hm9.p(rffVar.f, "Fetch video. Request failed with " + th2 + ". Retrying", null);
                    z2 = true;
                } else {
                    hm9.p(rffVar.f, "Fetch video. Request failed with " + th2 + ". Couldn't recover", null);
                    z2 = false;
                }
                return Boolean.valueOf(z2);
        }
    }
}
