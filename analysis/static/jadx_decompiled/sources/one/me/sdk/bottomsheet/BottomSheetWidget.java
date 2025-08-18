package one.me.sdk.bottomsheet;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import defpackage.bc7;
import defpackage.fk4;
import defpackage.foc;
import defpackage.fs;
import defpackage.fv3;
import defpackage.k56;
import defpackage.kr0;
import defpackage.nec;
import defpackage.oi9;
import defpackage.rh4;
import defpackage.tu0;
import defpackage.uu3;
import defpackage.yp4;
import defpackage.z84;
import defpackage.znc;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "bottom-sheet_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public abstract class BottomSheetWidget extends BaseBottomSheetWidget {
    public static final /* synthetic */ bc7[] x0;
    public final boolean s0;
    public yp4 t0;
    public View u0;
    public final fs v0;
    public final fv3 w0;

    static {
        oi9 oi9Var = new oi9(BottomSheetWidget.class, "wasKeyboardOpened", "getWasKeyboardOpened()Z");
        nec.a.getClass();
        x0 = new bc7[]{oi9Var};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetWidget() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.uu3
    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        getRouter().a(this.w0);
    }

    @Override // defpackage.uu3
    public final void onContextUnavailable() {
        super.onContextUnavailable();
        getRouter().K(this.w0);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public void onDestroyView(View view) {
        this.t0 = null;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void w0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        float f = 12;
        frameLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(10 * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(15 * fk4.d().getDisplayMetrics().density));
        frameLayout.addView(x0(layoutInflater, frameLayout), new ViewGroup.LayoutParams(-1, -2));
        yp4 yp4Var = new yp4(frameLayout.getContext());
        yp4Var.setTranslationY(rh4.c(6, fk4.d().getDisplayMetrics().density, -r7));
        this.t0 = yp4Var;
        frameLayout.addView(yp4Var);
    }

    public abstract View x0(LayoutInflater layoutInflater, FrameLayout frameLayout);

    /* renamed from: y0, reason: from getter */
    public boolean getS0() {
        return this.s0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z0(Widget widget) {
        uu3 parentController = widget;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        foc focVar = parentController instanceof foc ? (foc) parentController : null;
        znc zncVarC = focVar != null ? focVar.C() : null;
        if (zncVarC == null) {
            return;
        }
        zncVarC.a(new kr0(zncVarC, this));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [jr0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [jr0] */
    public BottomSheetWidget(Bundle bundle) {
        super(bundle);
        this.s0 = true;
        this.v0 = new fs(Boolean.class, Boolean.FALSE, "was_keyboard_opened");
        final int i = 0;
        final int i2 = 1;
        this.w0 = new fv3(getInstanceId(), new k56(this) { // from class: jr0
            public final /* synthetic */ BottomSheetWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                Window window;
                View currentFocus;
                e5f e5fVar = e5f.a;
                View view = null;
                BottomSheetWidget bottomSheetWidget = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = BottomSheetWidget.x0;
                        Activity activity = bottomSheetWidget.getActivity();
                        if (activity != null && (window = activity.getWindow()) != null && (currentFocus = window.getCurrentFocus()) != null) {
                            currentFocus.clearFocus();
                            int i3 = vc7.a;
                            if (vc7.b(vc7.c)) {
                                boolean s0 = bottomSheetWidget.getS0();
                                bc7 bc7Var = BottomSheetWidget.x0[0];
                                bottomSheetWidget.v0.b(bottomSheetWidget, Boolean.valueOf(s0));
                                mr0.I(currentFocus);
                            }
                            view = currentFocus;
                        }
                        bottomSheetWidget.u0 = view;
                        break;
                    default:
                        View view2 = bottomSheetWidget.u0;
                        if (view2 != null) {
                            view2.requestFocus();
                            bc7 bc7Var2 = BottomSheetWidget.x0[0];
                            if (((Boolean) bottomSheetWidget.v0.a(bottomSheetWidget)).booleanValue()) {
                                mr0.V(view2);
                            }
                        }
                        bottomSheetWidget.u0 = null;
                        break;
                }
                return e5fVar;
            }
        }, new k56(this) { // from class: jr0
            public final /* synthetic */ BottomSheetWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                Window window;
                View currentFocus;
                e5f e5fVar = e5f.a;
                View view = null;
                BottomSheetWidget bottomSheetWidget = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = BottomSheetWidget.x0;
                        Activity activity = bottomSheetWidget.getActivity();
                        if (activity != null && (window = activity.getWindow()) != null && (currentFocus = window.getCurrentFocus()) != null) {
                            currentFocus.clearFocus();
                            int i3 = vc7.a;
                            if (vc7.b(vc7.c)) {
                                boolean s0 = bottomSheetWidget.getS0();
                                bc7 bc7Var = BottomSheetWidget.x0[0];
                                bottomSheetWidget.v0.b(bottomSheetWidget, Boolean.valueOf(s0));
                                mr0.I(currentFocus);
                            }
                            view = currentFocus;
                        }
                        bottomSheetWidget.u0 = view;
                        break;
                    default:
                        View view2 = bottomSheetWidget.u0;
                        if (view2 != null) {
                            view2.requestFocus();
                            bc7 bc7Var2 = BottomSheetWidget.x0[0];
                            if (((Boolean) bottomSheetWidget.v0.a(bottomSheetWidget)).booleanValue()) {
                                mr0.V(view2);
                            }
                        }
                        bottomSheetWidget.u0 = null;
                        break;
                }
                return e5fVar;
            }
        });
    }

    public /* synthetic */ BottomSheetWidget(Bundle bundle, int i, z84 z84Var) {
        this((i & 1) != 0 ? null : bundle);
    }
}
