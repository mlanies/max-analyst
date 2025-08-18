package one.me.calls.ui.ui.indicator;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bc7;
import defpackage.hob;
import defpackage.je7;
import defpackage.k56;
import defpackage.nec;
import defpackage.o91;
import defpackage.od2;
import defpackage.qm0;
import defpackage.qp4;
import defpackage.s;
import defpackage.s91;
import defpackage.x91;
import defpackage.y91;
import defpackage.z91;
import defpackage.zi1;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/calls/ui/ui/indicator/CallIndicatorWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class CallIndicatorWidget extends Widget {
    public static final /* synthetic */ bc7[] X = {new hob(CallIndicatorWidget.class, "indicatorView", "getIndicatorView()Lone/me/calls/ui/view/indicator/CallIndicatorView;", 0), zr6.e(nec.a, CallIndicatorWidget.class, "fakeIndicatorView", "getFakeIndicatorView()Landroid/view/View;", 0)};
    public final je7 a;
    public final qm0 b;
    public final qm0 c;
    public final je7 o;

    /* JADX WARN: Multi-variable type inference failed */
    public CallIndicatorWidget() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = zi1.a.c();
        final int i = 0;
        this.b = binding(new k56(this) { // from class: v91
            public final /* synthetic */ CallIndicatorWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                CallIndicatorWidget callIndicatorWidget = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = CallIndicatorWidget.X;
                        o91 o91Var = new o91(callIndicatorWidget.getContext(), null);
                        o91Var.setId(y7a.N);
                        o91Var.setLayoutParams(new ViewGroup.LayoutParams(-1, tu0.G(100 * fk4.d().getDisplayMetrics().density)));
                        tu0.K(o91Var, 300L, new c5(9, callIndicatorWidget));
                        br7.d(o91Var, new x27(3, null, 2), null);
                        return o91Var;
                    case 1:
                        bc7[] bc7VarArr2 = CallIndicatorWidget.X;
                        View view = new View(callIndicatorWidget.getContext());
                        view.setId(y7a.P);
                        view.setLayoutParams(new ViewGroup.LayoutParams(-1, rh4.q(15, fk4.d().getDisplayMetrics().density, tu0.G(100 * fk4.d().getDisplayMetrics().density))));
                        view.setBackground(new ColorDrawable(qp4.u0.p(view).c.b().k));
                        return view;
                    default:
                        bc7[] bc7VarArr3 = CallIndicatorWidget.X;
                        n31 n31Var = n31.a;
                        return new s91((jt4) n31Var.getAccessor().c(jt4.class), n31Var.b(), n31Var.d(), new bn1(callIndicatorWidget.getContext()), (oqa) n31Var.getAccessor().c(oqa.class), (kke) zi1.a.getAccessor().c(kke.class));
                }
            }
        });
        final int i2 = 1;
        this.c = binding(new k56(this) { // from class: v91
            public final /* synthetic */ CallIndicatorWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                CallIndicatorWidget callIndicatorWidget = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = CallIndicatorWidget.X;
                        o91 o91Var = new o91(callIndicatorWidget.getContext(), null);
                        o91Var.setId(y7a.N);
                        o91Var.setLayoutParams(new ViewGroup.LayoutParams(-1, tu0.G(100 * fk4.d().getDisplayMetrics().density)));
                        tu0.K(o91Var, 300L, new c5(9, callIndicatorWidget));
                        br7.d(o91Var, new x27(3, null, 2), null);
                        return o91Var;
                    case 1:
                        bc7[] bc7VarArr2 = CallIndicatorWidget.X;
                        View view = new View(callIndicatorWidget.getContext());
                        view.setId(y7a.P);
                        view.setLayoutParams(new ViewGroup.LayoutParams(-1, rh4.q(15, fk4.d().getDisplayMetrics().density, tu0.G(100 * fk4.d().getDisplayMetrics().density))));
                        view.setBackground(new ColorDrawable(qp4.u0.p(view).c.b().k));
                        return view;
                    default:
                        bc7[] bc7VarArr3 = CallIndicatorWidget.X;
                        n31 n31Var = n31.a;
                        return new s91((jt4) n31Var.getAccessor().c(jt4.class), n31Var.b(), n31Var.d(), new bn1(callIndicatorWidget.getContext()), (oqa) n31Var.getAccessor().c(oqa.class), (kke) zi1.a.getAccessor().c(kke.class));
                }
            }
        });
        final int i3 = 2;
        this.o = createViewModelLazy(s91.class, new s(14, new k56(this) { // from class: v91
            public final /* synthetic */ CallIndicatorWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                CallIndicatorWidget callIndicatorWidget = this.b;
                switch (i3) {
                    case 0:
                        bc7[] bc7VarArr = CallIndicatorWidget.X;
                        o91 o91Var = new o91(callIndicatorWidget.getContext(), null);
                        o91Var.setId(y7a.N);
                        o91Var.setLayoutParams(new ViewGroup.LayoutParams(-1, tu0.G(100 * fk4.d().getDisplayMetrics().density)));
                        tu0.K(o91Var, 300L, new c5(9, callIndicatorWidget));
                        br7.d(o91Var, new x27(3, null, 2), null);
                        return o91Var;
                    case 1:
                        bc7[] bc7VarArr2 = CallIndicatorWidget.X;
                        View view = new View(callIndicatorWidget.getContext());
                        view.setId(y7a.P);
                        view.setLayoutParams(new ViewGroup.LayoutParams(-1, rh4.q(15, fk4.d().getDisplayMetrics().density, tu0.G(100 * fk4.d().getDisplayMetrics().density))));
                        view.setBackground(new ColorDrawable(qp4.u0.p(view).c.b().k));
                        return view;
                    default:
                        bc7[] bc7VarArr3 = CallIndicatorWidget.X;
                        n31 n31Var = n31.a;
                        return new s91((jt4) n31Var.getAccessor().c(jt4.class), n31Var.b(), n31Var.d(), new bn1(callIndicatorWidget.getContext()), (oqa) n31Var.getAccessor().c(oqa.class), (kke) zi1.a.getAccessor().c(kke.class));
                }
            }
        }));
    }

    public static final o91 m0(CallIndicatorWidget callIndicatorWidget) {
        callIndicatorWidget.getClass();
        bc7 bc7Var = X[0];
        return (o91) callIndicatorWidget.b.getValue();
    }

    public static final void n0(CallIndicatorWidget callIndicatorWidget, boolean z) {
        int i = z ? qp4.u0.o(callIndicatorWidget.getContext()).c.b().k : 0;
        callIndicatorWidget.getClass();
        bc7 bc7Var = X[1];
        Drawable background = ((View) callIndicatorWidget.c.getValue()).getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            ColorDrawable colorDrawable2 = colorDrawable.getColor() != i ? colorDrawable : null;
            if (colorDrawable2 != null) {
                colorDrawable2.setColor(i);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new x91(this, getContext());
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        je7 je7Var = this.o;
        od2.L(new zn5(((s91) je7Var.getValue()).Y, new y91(this, null), 5), getViewLifecycleScope());
        od2.L(new zn5(((s91) je7Var.getValue()).s0, new z91(this, null), 5), getViewLifecycleScope());
    }
}
