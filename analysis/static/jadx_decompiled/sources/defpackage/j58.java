package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class j58 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ p58 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j58(p58 p58Var, Continuation continuation) {
        super(2, continuation);
        this.Y = p58Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((j58) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new j58(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        boolean z;
        int i;
        tx3 tx3Var = tx3.a;
        int i2 = this.X;
        if (i2 == 0) {
            od2.a0(obj);
            p58 p58Var = this.Y;
            CharSequence charSequence = p58.q(p58Var).f.k;
            je7 je7Var = p58Var.o;
            ((xp7) je7Var.getValue()).f.k = null;
            q0e q0eVar = p58Var.s0;
            int iOrdinal = ((n00) q0eVar.getValue()).ordinal();
            if (iOrdinal == 0) {
                z = false;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                z = true;
            }
            p4d p4dVar = ((xp7) je7Var.getValue()).f;
            n00 n00Var = (n00) q0eVar.getValue();
            n00Var.getClass();
            int i3 = m00.$EnumSwitchMapping$0[n00Var.ordinal()];
            if (i3 != 1) {
                i = 2;
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i = 3;
            }
            p4dVar.p(i);
            pnf.o(p58Var.w0, new b58(charSequence, ((xp7) je7Var.getValue()).f.d(), z));
            a48 a48Var = new a48(true);
            this.X = 1;
            if (p58Var.t0.o(a48Var, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
