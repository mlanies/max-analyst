package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class gt7 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ht7 Z;
    public final /* synthetic */ kt7 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt7(ht7 ht7Var, kt7 kt7Var, Continuation continuation) {
        super(2, continuation);
        this.Z = ht7Var;
        this.s0 = kt7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gt7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        gt7 gt7Var = new gt7(this.Z, this.s0, continuation);
        gt7Var.Y = obj;
        return gt7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        String name;
        ir6 ir6Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        try {
            if (i == 0) {
                od2.a0(obj);
                sx3 sx3Var2 = (sx3) this.Y;
                try {
                    pl plVar = this.Z.c;
                    if (plVar == null) {
                        plVar = null;
                    }
                    cu7 cu7Var = (cu7) plVar.j.getValue();
                    ht7 ht7Var = this.Z;
                    long j = ht7Var.a;
                    kt7 kt7Var = this.s0;
                    long j2 = ht7Var.X;
                    this.Y = sx3Var2;
                    this.X = 1;
                    Object objR = cu7Var.r(j, kt7Var, j2, this);
                    this = objR;
                    if (objR == tx3Var) {
                        return tx3Var;
                    }
                } catch (Throwable unused) {
                    sx3Var = sx3Var2;
                    name = sx3Var.getClass().getName();
                    ir6Var = hm9.m;
                    if (ir6Var != null && ir6Var.c()) {
                        ir6Var.d(us7.s0, name, "beans.loginLogic.onLogin fail", null);
                    }
                    return e5f.a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sx3Var = (sx3) this.Y;
                try {
                    od2.a0(obj);
                    this = this;
                } catch (Throwable unused2) {
                    name = sx3Var.getClass().getName();
                    ir6Var = hm9.m;
                    if (ir6Var != null) {
                        ir6Var.d(us7.s0, name, "beans.loginLogic.onLogin fail", null);
                    }
                    return e5f.a;
                }
            }
        } catch (TamErrorException e) {
            this.Z.g(e.a);
        }
        return e5f.a;
    }
}
