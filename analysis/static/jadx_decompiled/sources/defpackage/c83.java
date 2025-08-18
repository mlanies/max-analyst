package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class c83 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ d83 Y;
    public final /* synthetic */ kz6 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c83(d83 d83Var, kz6 kz6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = d83Var;
        this.Z = kz6Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((c83) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new c83(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        q10 q10Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        y73 w73Var = null;
        kz6 kz6Var = this.Z;
        d83 d83Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            nx3 nx3VarB = ((w9a) d83Var.b).b();
            b83 b83Var = new b83(d83Var, kz6Var, null);
            this.X = 1;
            obj = j47.t0(nx3VarB, b83Var, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        es8 es8Var = (es8) obj;
        e5f e5fVar = e5f.a;
        if (es8Var == null) {
            return e5fVar;
        }
        l20 l20VarA = es8Var.a.a(g20.b);
        if (l20VarA != null && (q10Var = l20VarA.c) != null) {
            p10 p10Var = q10Var.a;
            int i2 = p10Var == null ? -1 : a83.$EnumSwitchMapping$0[p10Var.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                w73Var = new w73(kz6Var.b);
            } else if (i2 == 4 || i2 == 5) {
                w73Var = new x73(kz6Var.b);
            }
            if (w73Var == null) {
                return e5fVar;
            }
            d83Var.a(w73Var);
        }
        return e5fVar;
    }
}
