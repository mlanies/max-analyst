package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes.dex */
public final class r95 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ sx3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r95(sx3 sx3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = sx3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((r95) n((Throwable) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        r95 r95Var = new r95(this.Y, continuation);
        r95Var.X = obj;
        return r95Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        boolean z;
        od2.a0(obj);
        Throwable th = (Throwable) this.X;
        if ((th instanceof TamErrorException) && f46.U(((TamErrorException) th).a.b)) {
            String name = this.Y.getClass().getName();
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.s0, name, "ExternalCallback request failed with " + th + ". Retrying", null);
            }
            z = true;
        } else {
            String name2 = this.Y.getClass().getName();
            ir6 ir6Var2 = hm9.m;
            if (ir6Var2 != null && ir6Var2.c()) {
                ir6Var2.d(us7.s0, name2, "ExternalCallback request failed with " + th + ". Couldn't recover", null);
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
