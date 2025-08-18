package defpackage;

import kotlin.coroutines.Continuation;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;

/* loaded from: classes.dex */
public final class rq extends ffe implements a66 {
    public sm2 X;
    public int Y;
    public final /* synthetic */ sm2 Z;
    public final /* synthetic */ AppearanceSettingsMultiThemeScreen s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq(sm2 sm2Var, AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen, Continuation continuation) {
        super(2, continuation);
        this.Z = sm2Var;
        this.s0 = appearanceSettingsMultiThemeScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rq) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rq(this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sm2 sm2Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = AppearanceSettingsMultiThemeScreen.s0;
            kr krVarM0 = this.s0.m0();
            sm2 sm2Var2 = this.Z;
            this.X = sm2Var2;
            this.Y = 1;
            obj = krVarM0.r(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
            sm2Var = sm2Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sm2Var = this.X;
            od2.a0(obj);
        }
        sm2Var.a((qm2) obj);
        return e5f.a;
    }
}
