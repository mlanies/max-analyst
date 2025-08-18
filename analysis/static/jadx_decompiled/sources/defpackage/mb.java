package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class mb implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sx3 b;
    public final /* synthetic */ lx3 c;
    public final /* synthetic */ Object o;

    public /* synthetic */ mb(ContextScope contextScope, lx3 lx3Var, Object obj, int i) {
        this.a = i;
        this.b = contextScope;
        this.c = lx3Var;
        this.o = obj;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                lb lbVar = new lb(obj, null, (pb) this.o);
                return j47.g(this.b, this.c, vx3.a, lbVar);
            default:
                sp8 sp8Var = new sp8(obj, null, (tya) this.o);
                return j47.g(this.b, this.c, vx3.a, sp8Var);
        }
    }
}
