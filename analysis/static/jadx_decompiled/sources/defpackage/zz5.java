package defpackage;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;

/* loaded from: classes.dex */
public final class zz5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ForwardPickerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz5(Continuation continuation, ForwardPickerScreen forwardPickerScreen) {
        super(2, continuation);
        this.Y = forwardPickerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        zz5 zz5Var = (zz5) n((nz5) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        zz5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        zz5 zz5Var = new zz5(continuation, this.Y);
        zz5Var.X = obj;
        return zz5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        xx6 xx6Var;
        od2.a0(obj);
        nz5 nz5Var = (nz5) this.X;
        if (nz5Var instanceof jz5) {
            jz5 jz5Var = (jz5) nz5Var;
            Long l = jz5Var.a;
            if (l != null) {
                long jLongValue = l.longValue();
                dz5 dz5Var = dz5.c;
                Boolean boolValueOf = Boolean.valueOf(jz5Var.d);
                dz5Var.P1().d();
                f64 f64VarP1 = dz5Var.P1();
                y7g y7gVar = new y7g(13);
                y7gVar.b = ":chats";
                y7gVar.D(Long.valueOf(jLongValue), "id");
                y7gVar.D("local", "type");
                y7gVar.D(Boolean.TRUE, "from_forward");
                Set set = jz5Var.b;
                if (set != null) {
                    y7gVar.D(x53.n0(set, ",", null, null, null, 62), "forward_msg_ids");
                }
                Long l2 = jz5Var.c;
                if (l2 != null) {
                    y7gVar.D(Long.valueOf(l2.longValue()), "forward_attach_id");
                }
                y7gVar.D(boolValueOf, "is_forward_attach");
                f64VarP1.c(y7gVar.r(), null);
            } else {
                dz5.c.P1().d();
            }
            zy5 zy5Var = jz5Var.e;
            if (zy5Var != null && (xx6Var = (xx6) wy5.a.getAccessor().e()) != null) {
                xx6Var.f(zy5Var.a, zy5Var.b);
            }
        } else {
            boolean z = nz5Var instanceof mz5;
            ForwardPickerScreen forwardPickerScreen = this.Y;
            if (z) {
                forwardPickerScreen.y0 = new pz5(forwardPickerScreen, 5);
            } else if (nz5Var instanceof lz5) {
                bc7[] bc7VarArr = ForwardPickerScreen.I0;
                forwardPickerScreen.C0(true);
            } else {
                if (!(nz5Var instanceof kz5)) {
                    throw new NoWhenBranchMatchedException();
                }
                bc7[] bc7VarArr2 = ForwardPickerScreen.I0;
                forwardPickerScreen.C0(false);
                txa txaVarV0 = forwardPickerScreen.v0();
                txaVarV0.c.d();
                txaVarV0.Y.m(null, wz4.a);
            }
        }
        return e5f.a;
    }
}
