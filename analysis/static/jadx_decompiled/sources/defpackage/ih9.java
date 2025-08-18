package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import kotlin.coroutines.Continuation;
import one.me.android.media.service.OneMeMediaSessionService;

/* loaded from: classes2.dex */
public final class ih9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ uh9 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih9(uh9 uh9Var, Continuation continuation) {
        super(2, continuation);
        this.Y = uh9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ih9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ih9(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            long j = uh9.I;
            this.X = 1;
            if (j47.y(j, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        int i2 = uh9.K;
        uh9 uh9Var = this.Y;
        a98 a98Var = uh9Var.m;
        if (a98Var == null || !a98Var.c.isConnected()) {
            hm9.n("uh9", "connect");
            uh9Var.k(true);
            Context context = uh9Var.a;
            obd obdVar = new obd(context, new ComponentName(context, (Class<?>) OneMeMediaSessionService.class));
            Bundle bundle = Bundle.EMPTY;
            Looper looperW = oaf.w();
            jh9 jh9Var = new jh9();
            i98 i98Var = new i98(looperW);
            Object obj2 = null;
            oaf.W(new Handler(looperW), new w88(i98Var, new a98(context, obdVar, bundle, jh9Var, looperW, i98Var, obdVar.a.e() ? new imc(new v24(context)) : null), 0));
            i98Var.d(new v05(uh9Var, i98Var, obj2, 21), ot3.a(context));
        } else {
            hm9.n("uh9", "connect request rejected, already connected");
            uh9.i(uh9Var);
            uh9Var.u();
        }
        return e5f.a;
    }
}
