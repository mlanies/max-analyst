package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ja2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ wu4 Y;
    public final /* synthetic */ ka2 Z;
    public final /* synthetic */ e52 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja2(wu4 wu4Var, ka2 ka2Var, e52 e52Var, Continuation continuation) {
        super(2, continuation);
        this.Y = wu4Var;
        this.Z = ka2Var;
        this.s0 = e52Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ja2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ja2(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Long l;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e52 e52Var = this.s0;
        ka2 ka2Var = this.Z;
        wu4 wu4Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            String str = wu4Var.d;
            wu4 wu4Var2 = (wu4) ka2Var.i.getValue();
            if (!tpa.f(str, wu4Var2 != null ? wu4Var2.d : null) && wu4Var.d != null) {
                t12 t12Var = (t12) ka2Var.v.getValue();
                long j = e52Var.a;
                this.X = 1;
                t12Var.getClass();
                hm9.n(t12.class.getName(), "changeChatTitle, chatId = " + j);
                je7 je7Var = t12Var.c;
                ((jz2) ((iy2) je7Var.getValue())).l().c(j, v82.a);
                iy2 iy2Var = (iy2) je7Var.getValue();
                String str2 = wu4Var.d;
                e52 e52VarF = ((jz2) iy2Var).f(j, new q12(str2, 1));
                if (e52VarF != null) {
                    ((av0) t12Var.b.getValue()).c(new vz2(Collections.singletonList(new Long(j)), false, false, null, null, 124));
                    l = new Long(((k4a) ((pk) t12Var.a.getValue())).m(j, e52VarF.b.a, str2, null, null));
                } else {
                    l = new Long(0L);
                }
                if (l == tx3Var) {
                    return tx3Var;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        String str3 = wu4Var.f;
        wu4 wu4Var3 = (wu4) ka2Var.i.getValue();
        if (!tpa.f(str3, wu4Var3 != null ? wu4Var3.f : null)) {
            ((k4a) ((pk) ka2Var.q.getValue())).n(e52Var.a, wu4Var.f, e52Var.b.a);
        }
        return e5f.a;
    }
}
