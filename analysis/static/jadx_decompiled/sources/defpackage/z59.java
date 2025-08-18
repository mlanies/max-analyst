package defpackage;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class z59 extends ffe implements a66 {
    public final /* synthetic */ long X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ MotionEvent Z;
    public final /* synthetic */ MessagesListWidget s0;
    public final /* synthetic */ int t0;
    public final /* synthetic */ lk7 u0;
    public final /* synthetic */ View v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z59(long j, String str, MotionEvent motionEvent, MessagesListWidget messagesListWidget, int i, lk7 lk7Var, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.X = j;
        this.Y = str;
        this.Z = motionEvent;
        this.s0 = messagesListWidget;
        this.t0 = i;
        this.u0 = lk7Var;
        this.v0 = viewGroup;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        z59 z59Var = (z59) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        z59Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new z59(this.X, this.Y, this.Z, this.s0, this.t0, this.u0, (ViewGroup) this.v0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        List listM;
        od2.a0(obj);
        kpa kpaVar = new kpa("messages:context_menu:message_id", new Long(this.X));
        String str = this.Y;
        Bundle bundleG = dy7.g(kpaVar, new kpa("messages:context_menu:link_url", str));
        qt3 qt3VarD0 = dy7.c(1).d0();
        MotionEvent motionEvent = this.Z;
        qt3 qt3VarU = qt3VarD0.L(motionEvent.getRawX(), motionEvent.getRawY()).S(bundleG).U(new iqe(str));
        bc7[] bc7VarArr = MessagesListWidget.X0;
        MessagesListWidget messagesListWidget = this.s0;
        messagesListWidget.x0().getClass();
        int iS = au1.s(this.t0);
        if (iS == 0) {
            listM = y53.M(new tt3(this.u0 == lk7.X ? cpc.h : cpc.f, new eqe(dpc.h), Integer.valueOf(woc.D0), (Integer) null, 20), new tt3(cpc.b, new eqe(dpc.e), Integer.valueOf(woc.t), (Integer) null, 20));
        } else if (iS == 1) {
            listM = y53.M(new tt3(cpc.f, new eqe(dpc.j), Integer.valueOf(woc.c0), (Integer) null, 20), new tt3(cpc.b, new eqe(dpc.g), Integer.valueOf(woc.t), (Integer) null, 20));
        } else {
            if (iS != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listM = y53.M(new tt3(cpc.f, new eqe(dpc.i), Integer.valueOf(woc.D0), (Integer) null, 20), new tt3(cpc.b, new eqe(dpc.f), Integer.valueOf(woc.t), (Integer) null, 20));
        }
        qt3VarU.I(listM).build().q(messagesListWidget);
        pag.F(this.v0, ni6.LONG_PRESS);
        return e5f.a;
    }
}
