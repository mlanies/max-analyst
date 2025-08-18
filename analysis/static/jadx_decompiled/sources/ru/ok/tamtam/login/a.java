package ru.ok.tamtam.login;

import defpackage.a66;
import defpackage.e5f;
import defpackage.ffe;
import defpackage.kld;
import defpackage.od2;
import defpackage.sx3;
import defpackage.tx3;
import defpackage.ut7;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a extends ffe implements a66 {
    public int X;
    public final /* synthetic */ LoginEventsByBus Y;
    public final /* synthetic */ ut7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LoginEventsByBus loginEventsByBus, ut7 ut7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = loginEventsByBus;
        this.Z = ut7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((a) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new a(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kldVar = this.Y.a;
            this.X = 1;
            if (kldVar.a(this.Z, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
