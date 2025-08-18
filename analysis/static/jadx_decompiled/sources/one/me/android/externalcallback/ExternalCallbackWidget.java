package one.me.android.externalcallback;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.c3;
import defpackage.dy7;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.j47;
import defpackage.je7;
import defpackage.kke;
import defpackage.kpa;
import defpackage.nj4;
import defpackage.od2;
import defpackage.qqe;
import defpackage.s95;
import defpackage.sz6;
import defpackage.t95;
import defpackage.tu0;
import defpackage.u95;
import defpackage.v3c;
import defpackage.vxd;
import defpackage.w9a;
import defpackage.yoc;
import defpackage.zf3;
import defpackage.zn5;
import java.util.ArrayList;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/android/externalcallback/ExternalCallbackWidget;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "uriAsParam", "(Ljava/lang/String;)V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class ExternalCallbackWidget extends BottomSheetWidget {
    public static final /* synthetic */ int B0 = 0;
    public final boolean A0;
    public final je7 y0;
    public final je7 z0;

    public ExternalCallbackWidget(Bundle bundle) {
        super(bundle);
        this.y0 = createViewModelLazy(t95.class, new nj4(2, new zf3(27)));
        this.z0 = tu0.r(3, new zf3(28));
        this.A0 = true;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, one.me.sdk.arch.Widget
    /* renamed from: isDialog, reason: from getter */
    public final boolean getIsDialog() {
        return this.A0;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public final void onAttach(View view) {
        super.onAttach(view);
        t95 t95Var = (t95) this.y0.getValue();
        String string = getArgs().getString("external_callback_param_arg");
        if (string == null) {
            string = "";
        }
        vxd vxdVar = t95Var.X;
        if (vxdVar == null || !vxdVar.isActive()) {
            t95Var.X = j47.T(t95Var.a, ((w9a) ((kke) t95Var.c.getValue())).b(), null, new s95(t95Var, string, null), 2);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        od2.L(new zn5(tu0.g(((t95) this.y0.getValue()).o, getViewLifecycleOwner().Q(), fg7.o), new u95(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(layoutParams);
        float f = 70;
        frameLayout2.setPadding(frameLayout2.getPaddingLeft(), tu0.G(fk4.d().getDisplayMetrics().density * f), frameLayout2.getPaddingRight(), tu0.G(f * fk4.d().getDisplayMetrics().density));
        TextView textView = new TextView(frameLayout2.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        textView.setGravity(17);
        sz6 sz6Var = (sz6) this.z0.getValue();
        ArrayList arrayList = qqe.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, sz6Var, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(tu0.G(12 * fk4.d().getDisplayMetrics().density));
        textView.setText(yoc.y0);
        v3c.y(new c3(this, null, 11), textView);
        frameLayout2.addView(textView);
        return frameLayout2;
    }

    public ExternalCallbackWidget(String str) {
        this(dy7.g(new kpa("external_callback_param_arg", str)));
    }
}
