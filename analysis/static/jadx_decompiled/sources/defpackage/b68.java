package defpackage;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes.dex */
public final class b68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b68(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        b68 b68Var = (b68) n((am8) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        b68Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        b68 b68Var = new b68(continuation, this.Y);
        b68Var.X = obj;
        return b68Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i;
        od2.a0(obj);
        am8 am8Var = (am8) this.X;
        boolean zF = tpa.f(am8Var, wl8.a);
        MediaBarWidget mediaBarWidget = this.Y;
        if (zF) {
            bc7[] bc7VarArr = MediaBarWidget.d1;
            mediaBarWidget.x0().j(true);
            p58 p58VarB0 = mediaBarWidget.B0();
            pnf.o(p58VarB0.w0, y48.a);
        } else if (tpa.f(am8Var, xl8.a)) {
            bc7[] bc7VarArr2 = MediaBarWidget.d1;
            p58 p58VarB02 = mediaBarWidget.B0();
            int iOrdinal = ((n00) p58VarB02.s0.getValue()).ordinal();
            if (iOrdinal == 0) {
                p58VarB02.s0.m(null, n00.b);
                p4d p4dVarR = p58VarB02.r();
                int i2 = m00.$EnumSwitchMapping$0[1];
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i = 3;
                }
                p4dVarR.p(i);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                p58VarB02.t0.n(f48.a);
            }
        } else if (am8Var instanceof yl8) {
            bc7[] bc7VarArr3 = MediaBarWidget.d1;
            p58 p58VarB03 = mediaBarWidget.B0();
            Uri uri = ((yl8) am8Var).a;
            p58VarB03.getClass();
            pnf.o(p58VarB03.w0, new z48(uri));
        } else {
            if (!(am8Var instanceof zl8)) {
                throw new NoWhenBranchMatchedException();
            }
            bc7[] bc7VarArr4 = MediaBarWidget.d1;
            p58 p58VarB04 = mediaBarWidget.B0();
            zl8 zl8Var = (zl8) am8Var;
            er7 er7Var = zl8Var.a;
            p58VarB04.getClass();
            pnf.o(p58VarB04.w0, new a58(er7Var, zl8Var.b, zl8Var.c));
        }
        return e5f.a;
    }
}
