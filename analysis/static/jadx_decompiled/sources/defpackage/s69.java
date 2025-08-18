package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.widget.FrameLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class s69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        s69 s69Var = (s69) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        s69Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        s69 s69Var = new s69(continuation, this.Y);
        s69Var.X = obj;
        return s69Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        a05 a05Var = (a05) this.X;
        bc7[] bc7VarArr = MessagesListWidget.X0;
        MessagesListWidget messagesListWidget = this.Y;
        messagesListWidget.q0().removeAllViews();
        asc ascVar = null;
        boolean z = false;
        if (a05Var instanceof xz4) {
            y59 y59Var = new y59(messagesListWidget);
            fq0 fq0Var = new fq0(messagesListWidget.getContext());
            fq0Var.setLinkListener(y59Var);
            fq0Var.setState((xz4) a05Var);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 17);
            int iG = tu0.G(32 * fk4.d().getDisplayMetrics().density);
            layoutParams.setMargins(iG, iG, iG, iG);
            fq0Var.setLayoutParams(layoutParams);
            fq0Var.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 24.0f));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            v3c.y(new o48(gradientDrawable, z ? 1 : 0, 1), fq0Var);
            fq0Var.setBackground(gradientDrawable);
            ascVar = fq0Var;
        } else if (a05Var instanceof yz4) {
            gj4 gj4Var = new gj4(messagesListWidget.getContext());
            qk2 qk2Var = new qk2(4, messagesListWidget);
            gj4Var.b.setText(oda.M);
            gj4Var.c.setText(oda.L);
            z2e z2eVar = ((yz4) a05Var).a;
            if (z2eVar != null) {
                gj4Var.o.a(z2eVar, tu0.G(144 * fk4.d().getDisplayMetrics().density));
            }
            gj4Var.a = qk2Var;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(tu0.G(262 * fk4.d().getDisplayMetrics().density), -2, 17);
            int iG2 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
            layoutParams2.setMargins(iG2, iG2, iG2, iG2);
            gj4Var.setLayoutParams(layoutParams2);
            boolean z2 = tfg.s(gj4Var.getContext()).b;
            ascVar = gj4Var;
            if (z2) {
                ascVar = gj4Var;
                if (Build.VERSION.SDK_INT >= 30) {
                    messagesListWidget.V0 = new c05(gj4Var, messagesListWidget.requireView());
                    ascVar = gj4Var;
                }
            }
        } else if (a05Var instanceof zz4) {
            asc ascVar2 = new asc(messagesListWidget.getContext());
            ascVar2.setState((zz4) a05Var);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2, 17);
            int iG3 = tu0.G(32 * fk4.d().getDisplayMetrics().density);
            layoutParams3.setMargins(iG3, iG3, iG3, iG3);
            ascVar2.setLayoutParams(layoutParams3);
            ascVar = ascVar2;
            if (tfg.s(messagesListWidget.getContext()).b) {
                ascVar = ascVar2;
                if (Build.VERSION.SDK_INT >= 30) {
                    messagesListWidget.V0 = new c05(ascVar2, messagesListWidget.requireView());
                    ascVar = ascVar2;
                }
            }
        } else if (a05Var != null) {
            throw new NoWhenBranchMatchedException();
        }
        if (ascVar != null) {
            pla.a(ascVar, new wdg(7));
            messagesListWidget.q0().addView(ascVar);
        }
        return e5f.a;
    }
}
