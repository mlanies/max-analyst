package ru.ok.tamtam.logout;

import defpackage.a66;
import defpackage.e5f;
import defpackage.ffe;
import defpackage.kld;
import defpackage.nu7;
import defpackage.od2;
import defpackage.sx3;
import defpackage.tx3;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b extends ffe implements a66 {
    public int X;
    public final /* synthetic */ LogoutEventsByBus Y;
    public final /* synthetic */ nu7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LogoutEventsByBus logoutEventsByBus, nu7 nu7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = logoutEventsByBus;
        this.Z = nu7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((b) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new b(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kldVar = this.Y.b;
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
