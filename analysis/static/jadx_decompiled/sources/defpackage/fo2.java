package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes.dex */
public final class fo2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fo2 fo2Var = (fo2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        fo2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        fo2 fo2Var = new fo2(continuation, this.Y);
        fo2Var.X = obj;
        return fo2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        c58 c58Var = (c58) this.X;
        String name = this.Y.getClass().getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "got mediaBarViewModel.upEvents " + c58Var + " " + this.Y.lifecycleOwner.Q().d + "," + this.Y.getViewLifecycleOwner().Q().d, null);
        }
        if (tpa.f(c58Var, x48.a)) {
            MessageWriteWidget messageWriteWidgetG0 = this.Y.G0();
            if (messageWriteWidgetG0 != null) {
                messageWriteWidgetG0.q0().setText(messageWriteWidgetG0.X.f.k);
            }
        } else if (tpa.f(c58Var, w48.a)) {
            MessageWriteWidget messageWriteWidgetG02 = this.Y.G0();
            if (messageWriteWidgetG02 != null) {
                messageWriteWidgetG02.q0().setText(messageWriteWidgetG02.X.f.k);
            }
            this.Y.E0().setVisibility(8);
            ChatScreen chatScreen = this.Y;
            hc8 hc8Var = chatScreen.U0;
            if (hc8Var != null && !hc8Var.l) {
                chatScreen.y0();
            }
        } else if (tpa.f(c58Var, y48.a)) {
            pnf.o(this.Y.H0().s0, z29.a);
        } else if (c58Var instanceof b58) {
            rq2 rq2VarP0 = this.Y.P0();
            b58 b58Var = (b58) c58Var;
            CharSequence charSequence = b58Var.a;
            List list = b58Var.b;
            boolean z = b58Var.c;
            Long lW = this.Y.F0().w();
            zy8 zy8VarV = this.Y.F0().v();
            rq2VarP0.B(charSequence, list, z, lW, zy8VarV != null ? zy8VarV.a() : null);
        } else if (c58Var instanceof z48) {
            rq2 rq2VarP02 = this.Y.P0();
            Uri uri = ((z48) c58Var).a;
            Long lW2 = this.Y.F0().w();
            zy8 zy8VarV2 = this.Y.F0().v();
            cz5 cz5VarA = zy8VarV2 != null ? zy8VarV2.a() : null;
            e52 e52Var = (e52) rq2VarP02.Y0.a.getValue();
            if (e52Var != null) {
                rq2VarP02.C(j47.S(rq2VarP02.a, ((w9a) rq2VarP02.u()).b(), vx3.b, new xp2(uri, e52Var.a, rq2VarP02, lW2, cz5VarA, null)));
            }
        } else if (c58Var instanceof a58) {
            rq2 rq2VarP03 = this.Y.P0();
            a58 a58Var = (a58) c58Var;
            er7 er7Var = a58Var.a;
            float f = a58Var.b;
            long j = a58Var.c;
            Long lW3 = this.Y.F0().w();
            zy8 zy8VarV3 = this.Y.F0().v();
            rq2VarP03.A(er7Var, f, j, lW3, zy8VarV3 != null ? zy8VarV3.a() : null);
        } else {
            if (!(c58Var instanceof v48)) {
                throw new NoWhenBranchMatchedException();
            }
            v48 v48Var = (v48) c58Var;
            this.Y.P0().t(v48Var.a, this.Y.F0().u(), v48Var.b, v48Var.c);
            xz8.C(this.Y.F0(), null, null, null, 14);
        }
        return e5f.a;
    }
}
