package one.me.calls.ui.bottomsheet.ratecall;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a5c;
import defpackage.ah1;
import defpackage.b5c;
import defpackage.b7a;
import defpackage.b8a;
import defpackage.bc7;
import defpackage.bh1;
import defpackage.c5;
import defpackage.c7a;
import defpackage.ch1;
import defpackage.dh1;
import defpackage.du4;
import defpackage.dy7;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fs;
import defpackage.hob;
import defpackage.i4f;
import defpackage.je7;
import defpackage.kpa;
import defpackage.l;
import defpackage.lh1;
import defpackage.md1;
import defpackage.n04;
import defpackage.nec;
import defpackage.nz4;
import defpackage.od2;
import defpackage.oec;
import defpackage.q7c;
import defpackage.s;
import defpackage.tu0;
import defpackage.u4c;
import defpackage.v3c;
import defpackage.v9;
import defpackage.w4c;
import defpackage.w7c;
import defpackage.y7a;
import defpackage.z6a;
import defpackage.z7;
import defpackage.zg1;
import defpackage.zn5;
import defpackage.zr6;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/calls/ui/bottomsheet/ratecall/CallRateBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lu4c;", "La5c;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "callId", "", "isVideoCall", "", "sdkReasons", "(Ljava/lang/String;ZLjava/util/List;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class CallRateBottomSheet extends BottomSheetWidget implements u4c, a5c {
    public static final /* synthetic */ bc7[] I0;
    public final fs A0;
    public final AutoTransition B0;
    public final je7 C0;
    public final q7c D0;
    public final q7c E0;
    public final q7c F0;
    public final q7c G0;
    public final q7c H0;
    public final fs y0;
    public final fs z0;

    static {
        hob hobVar = new hob(CallRateBottomSheet.class, "callId", "getCallId()Ljava/lang/String;", 0);
        oec oecVar = nec.a;
        I0 = new bc7[]{hobVar, zr6.e(oecVar, CallRateBottomSheet.class, "isVideoCall", "isVideoCall()Z", 0), zr6.f(CallRateBottomSheet.class, "sdkReasons", "getSdkReasons()Ljava/util/List;", 0, oecVar), zr6.f(CallRateBottomSheet.class, "title", "getTitle()Landroid/widget/TextView;", 0, oecVar), zr6.f(CallRateBottomSheet.class, "rateCallButtonGroup", "getRateCallButtonGroup()Lone/me/calls/ui/bottomsheet/ratecall/view/RateCallButtonGroup;", 0, oecVar), zr6.f(CallRateBottomSheet.class, "reasonsChipGroup", "getReasonsChipGroup()Lone/me/calls/ui/bottomsheet/ratecall/view/RateCallReasonsChipGroup;", 0, oecVar), zr6.f(CallRateBottomSheet.class, "sendButton", "getSendButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oecVar), zr6.f(CallRateBottomSheet.class, "customReasonEditText", "getCustomReasonEditText()Lone/me/calls/ui/bottomsheet/ratecall/view/CustomReasonInputView;", 0, oecVar)};
    }

    public CallRateBottomSheet(Bundle bundle) {
        super(bundle);
        this.y0 = new fs(String.class, "ratecall:call_id");
        this.z0 = new fs(Boolean.class, "ratecall:is_video_call");
        this.A0 = new fs(List.class, "ratecall:sdk_reasons");
        this.B0 = new AutoTransition();
        this.C0 = createViewModelLazy(lh1.class, new s(19, new md1(1, this)));
        this.D0 = viewBinding(y7a.B0);
        this.E0 = viewBinding(y7a.u0);
        this.F0 = viewBinding(y7a.v0);
        this.G0 = viewBinding(y7a.A0);
        this.H0 = viewBinding(y7a.w0);
    }

    public final b5c A0() {
        return (b5c) this.F0.T0(this, I0[5]);
    }

    public final lh1 B0() {
        return (lh1) this.C0.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        w7c w7cVar = B0().t0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new zg1(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(B0().v0, getViewLifecycleOwner().Q(), fg7Var), new ah1(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(B0().x0, getViewLifecycleOwner().Q(), fg7Var), new bh1(null, view, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(B0().y0, getViewLifecycleOwner().Q(), fg7Var), new ch1(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(B0().z0, getViewLifecycleOwner().Q(), fg7Var), new dh1(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void u0() {
        B0().s(null, true);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        TextView textView = new TextView(context);
        textView.setId(y7a.B0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = 24;
        layoutParams.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        i4f.b.b(textView, du4.b);
        v3c.y(new v9(3, null, 1), textView);
        w4c w4cVar = new w4c(context, null);
        w4cVar.b = 3;
        w4cVar.setOrientation(0);
        w4cVar.setGravity(17);
        w4cVar.c = nz4.a;
        w4cVar.setId(y7a.u0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        w4cVar.setLayoutParams(layoutParams2);
        w4cVar.setGravity(17);
        w4cVar.setListener(this);
        b5c b5cVar = new b5c(context, null);
        b5cVar.setId(y7a.v0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        b5cVar.setLayoutParams(layoutParams3);
        b5cVar.setListener(this);
        OneMeButton oneMeButton = new OneMeButton(context, null);
        oneMeButton.setId(y7a.A0);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setText(b8a.D0);
        tu0.K(oneMeButton, 300L, new c5(10, this));
        n04 n04Var = new n04(context);
        n04Var.setId(y7a.w0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        float f2 = 84;
        n04Var.setMinimumHeight(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        layoutParams4.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        n04Var.setLayoutParams(layoutParams4);
        n04Var.setHint(z7.B(n04Var.getContext(), b8a.l0));
        n04Var.setMaxCount(50);
        n04Var.setMinimumHeight(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        n04Var.setTextChangeListener(new l(19, this));
        n04Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        float f3 = 12;
        linearLayout.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density), 0);
        linearLayout.addView(textView);
        linearLayout.addView(w4cVar);
        linearLayout.addView(b5cVar);
        linearLayout.addView(n04Var);
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }

    public CallRateBottomSheet(String str, boolean z, List<String> list) {
        this(dy7.g(new kpa("ratecall:call_id", str), new kpa("ratecall:is_video_call", Boolean.valueOf(z)), new kpa("ratecall:sdk_reasons", list)));
    }
}
