package defpackage;

import kotlin.coroutines.Continuation;
import one.me.appearancesettings.singletheme.AppearanceSettingsScreen;

/* loaded from: classes.dex */
public final class nr extends ffe implements a66 {
    public y52 X;
    public int Y;
    public final /* synthetic */ y52 Z;
    public final /* synthetic */ AppearanceSettingsScreen s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr(y52 y52Var, AppearanceSettingsScreen appearanceSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.Z = y52Var;
        this.s0 = appearanceSettingsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((nr) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new nr(this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        y52 y52Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = AppearanceSettingsScreen.Z;
            zr zrVarM0 = this.s0.m0();
            y52 y52Var2 = this.Z;
            this.X = y52Var2;
            this.Y = 1;
            obj = zrVarM0.r(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
            y52Var = y52Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y52Var = this.X;
            od2.a0(obj);
        }
        y52Var.a((pm2) obj);
        return e5f.a;
    }
}
