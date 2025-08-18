package one.me.sdk.bottomsheet;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bc7;
import defpackage.br7;
import defpackage.c3;
import defpackage.d6b;
import defpackage.f6b;
import defpackage.fk4;
import defpackage.fka;
import defpackage.fs;
import defpackage.ju0;
import defpackage.nd2;
import defpackage.nec;
import defpackage.oi9;
import defpackage.pla;
import defpackage.q7c;
import defpackage.re;
import defpackage.t9;
import defpackage.ufa;
import defpackage.v3c;
import defpackage.x27;
import defpackage.xh0;
import defpackage.xq0;
import defpackage.yq0;
import defpackage.z5b;
import defpackage.z7b;
import defpackage.z84;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.webapp.rootscreen.WebAppRootScreen;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "nd2", "t9", "bottom-sheet_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public abstract class BaseBottomSheetWidget extends Widget {
    public f6b a;
    public final fs b;
    public final q7c c;
    public final x27 o;
    public static final /* synthetic */ bc7[] Y = {new oi9(BaseBottomSheetWidget.class, "needDim", "getNeedDim()Z"), z7b.g(nec.a, BaseBottomSheetWidget.class, "cardView", "getCardView()Landroid/view/View;", 0)};
    public static final nd2 X = new nd2(7);
    public static final String Z = "need_dim";

    /* JADX WARN: Multi-variable type inference failed */
    public BaseBottomSheetWidget() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.uu3
    public boolean handleBack() {
        s0(true);
        return true;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: isDialog */
    public boolean getW0() {
        return !(this instanceof WebAppRootScreen);
    }

    public FrameLayout m0(LayoutInflater layoutInflater, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(ufa.b);
        frameLayout.setClipToPadding(false);
        frameLayout.setOutlineProvider(new xq0(1, fk4.d().getDisplayMetrics().density * 20.0f));
        w0(frameLayout, layoutInflater, bundle);
        v3c.y(new xh0(this, (Continuation) null, 0), frameLayout);
        return frameLayout;
    }

    public z5b n0() {
        return new t9(this, 1);
    }

    /* renamed from: o0, reason: from getter */
    public x27 getO() {
        return this.o;
    }

    @Override // defpackage.uu3
    public void onAttach(View view) {
        super.onAttach(view);
        f6b f6bVar = this.a;
        if (f6bVar == null || f6bVar.getScrollState() != d6b.a) {
            return;
        }
        pla.a(f6bVar, new re(4, f6bVar, f6bVar));
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        f6b f6bVar = new f6b(layoutInflater.getContext());
        f6bVar.setId(ufa.a);
        FrameLayout frameLayoutM0 = m0(layoutInflater, bundle);
        ViewGroup.LayoutParams layoutParams = frameLayoutM0.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        f6bVar.addView(frameLayoutM0, layoutParams);
        f6bVar.setCallback(n0());
        br7.d(frameLayoutM0, getO(), null);
        v3c.y(new c3(this, null, 2), f6bVar);
        this.a = f6bVar;
        return f6bVar;
    }

    @Override // defpackage.uu3
    public void onDestroyView(View view) {
        f6b f6bVar = this.a;
        if (f6bVar != null) {
            f6bVar.setCallback(null);
        }
        f6b f6bVar2 = this.a;
        if (f6bVar2 != null) {
            ValueAnimator valueAnimator = f6bVar2.s0;
            if (valueAnimator != null) {
                ju0.i(valueAnimator);
            }
            f6bVar2.s0 = null;
        }
        this.a = null;
        super.onDestroyView(view);
    }

    public final View p0() {
        return (View) this.c.T0(this, Y[1]);
    }

    public fka q0() {
        return null;
    }

    public boolean r0() {
        return true;
    }

    public final void s0(boolean z) {
        f6b f6bVar = this.a;
        if (f6bVar == null) {
            t0();
        } else {
            if (f6bVar.getScrollState() == d6b.a) {
                return;
            }
            u0();
            f6bVar.j(z);
        }
    }

    public void t0() {
        u0();
        getRouter().B(this);
    }

    public void u0() {
    }

    public final void v0(boolean z) {
        bc7 bc7Var = Y[0];
        this.b.b(this, Boolean.valueOf(z));
    }

    public abstract void w0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle);

    public BaseBottomSheetWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.b = new fs(Boolean.class, Boolean.TRUE, Z);
        this.c = viewBinding(ufa.b);
        this.o = new x27(5, new yq0(3, 3, false));
    }

    public /* synthetic */ BaseBottomSheetWidget(Bundle bundle, int i, z84 z84Var) {
        this((i & 1) != 0 ? null : bundle);
    }
}
