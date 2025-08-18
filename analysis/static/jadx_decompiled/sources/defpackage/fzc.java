package defpackage;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fzc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hzc Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzc(hzc hzcVar, Continuation continuation) {
        super(2, continuation);
        this.Y = hzcVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fzc fzcVar = (fzc) n((bzc) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        fzcVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        fzc fzcVar = new fzc(this.Y, continuation);
        fzcVar.X = obj;
        return fzcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        fl2 fl2Var;
        od2.a0(obj);
        bzc bzcVar = (bzc) this.X;
        boolean z = bzcVar instanceof azc;
        hzc hzcVar = this.Y;
        if (z) {
            fl2 fl2Var2 = hzcVar.o;
            jl2 jl2Var = ((azc) bzcVar).a;
            il2 il2Var = (il2) fl2Var2.a;
            il2Var.getClass();
            if (jl2Var.a == il2Var.i) {
                il2Var.h = true;
                il2Var.k = jl2Var.X;
                il2Var.c = jl2Var.b;
                il2Var.j = jl2Var.o;
                ArrayList arrayList = il2Var.f;
                arrayList.addAll(jl2Var.c);
                if (il2Var.k > 0) {
                    if (il2Var.d == 0) {
                        il2Var.d = 1;
                        if (1 + 1 <= arrayList.size() && il2Var.g != null) {
                        }
                    }
                    fl2 fl2Var3 = il2Var.g;
                    if (fl2Var3 != null) {
                        fl2Var3.d(il2Var.d, il2Var.k);
                    }
                    fl2 fl2Var4 = il2Var.g;
                    if (fl2Var4 != null) {
                        fl2Var4.e((nx8) arrayList.get(il2Var.d - 1));
                    }
                }
                if (il2Var.k == 0 && (fl2Var = il2Var.g) != null) {
                    fl2Var.f();
                }
            }
        } else {
            if (!(bzcVar instanceof zyc)) {
                throw new NoWhenBranchMatchedException();
            }
            fl2 fl2Var5 = hzcVar.o;
            oi0 oi0Var = ((zyc) bzcVar).a;
            il2 il2Var2 = (il2) fl2Var5.a;
            if (oi0Var.a == il2Var2.i) {
                il2Var2.a();
                fl2 fl2Var6 = il2Var2.g;
                if (fl2Var6 != null) {
                    fl2Var6.f();
                }
            }
        }
        return e5f.a;
    }
}
