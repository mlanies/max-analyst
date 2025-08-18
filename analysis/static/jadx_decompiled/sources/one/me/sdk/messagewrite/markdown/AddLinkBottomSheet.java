package one.me.sdk.messagewrite.markdown;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.ay7;
import defpackage.b;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.c5;
import defpackage.c7a;
import defpackage.cka;
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
import defpackage.lga;
import defpackage.mga;
import defpackage.nec;
import defpackage.od2;
import defpackage.oi9;
import defpackage.q7c;
import defpackage.rh4;
import defpackage.rk7;
import defpackage.s;
import defpackage.suc;
import defpackage.t9;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.u9;
import defpackage.v3c;
import defpackage.v9;
import defpackage.w9;
import defpackage.wfa;
import defpackage.x27;
import defpackage.x5;
import defpackage.yp4;
import defpackage.yq0;
import defpackage.z5b;
import defpackage.z6a;
import defpackage.z7;
import defpackage.z7b;
import defpackage.z84;
import defpackage.zn5;
import defpackage.zz7;
import java.util.regex.Pattern;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/sdk/messagewrite/markdown/AddLinkBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "Lw9;", "addLinkState", "(Ljava/lang/String;Lw9;Lz84;)V", "message-write-widget_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class AddLinkBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ bc7[] x0 = {new oi9(AddLinkBottomSheet.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;"), z7b.g(nec.a, AddLinkBottomSheet.class, "editText", "getEditText()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new hob(AddLinkBottomSheet.class, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final w9 s0;
    public final q7c t0;
    public final q7c u0;
    public final je7 v0;
    public final je7 w0;

    public AddLinkBottomSheet(String str, w9 w9Var, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str)), new kpa("bottom_sheet:add_link:key", w9Var)));
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final z5b n0() {
        return new t9(this, 0);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    /* renamed from: o0 */
    public final x27 getA0() {
        return new x27(0, new yq0(3, 3, false), 1);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ((OneMeButton) this.u0.T0(this, x0[2])).setEnabled(x0().getText().length() > 0);
        od2.L(new zn5(tu0.g(((rk7) this.w0.getValue()).c, getViewLifecycleOwner().Q(), fg7.o), new u9(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void w0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        float f = 12;
        float f2 = 8;
        frameLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(10 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2));
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f3 = 22;
        textView.setPaddingRelative(textView.getPaddingStart(), tu0.G(f3 * fk4.d().getDisplayMetrics().density), textView.getPaddingEnd(), tu0.G(fk4.d().getDisplayMetrics().density * f3));
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setText(z7.B(getContext(), mga.p));
        i4f.d.b(textView, du4.b);
        v3c.y(new v9(3, null, 0), textView);
        linearLayout.addView(textView);
        cka ckaVar = new cka(linearLayout.getContext());
        ckaVar.setId(lga.v);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        ckaVar.setPaddingRelative(ckaVar.getPaddingStart(), tu0.G(fk4.d().getDisplayMetrics().density * f2), ckaVar.getPaddingEnd(), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        int iG = tu0.G(f * fk4.d().getDisplayMetrics().density);
        int marginStart = layoutParams2.getMarginStart();
        int i = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        int marginEnd = layoutParams2.getMarginEnd();
        layoutParams2.setMarginStart(marginStart);
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i;
        layoutParams2.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = iG;
        ckaVar.setLayoutParams(layoutParams2);
        String string = this.s0.c;
        if (string == null) {
            rk7 rk7Var = (rk7) this.w0.getValue();
            CharSequence charSequenceB = tpa.B(ckaVar.getContext());
            rk7Var.getClass();
            if (charSequenceB == null || !((Pattern) rk7Var.Y.getValue()).matcher(charSequenceB).matches()) {
                charSequenceB = null;
            }
            if (charSequenceB == null) {
                charSequenceB = "";
            }
            string = charSequenceB.toString();
        }
        ckaVar.setText(string);
        ckaVar.setBackgroundColorAttr(Integer.valueOf(wfa.M));
        ckaVar.b(new l(4, this));
        ckaVar.a.requestFocus();
        ckaVar.post(new b(7, ckaVar));
        linearLayout.addView(ckaVar);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setId(lga.u);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.c);
        oneMeButton.setText(mga.o);
        tu0.K(oneMeButton, 300L, new c5(6, this));
        linearLayout.addView(oneMeButton);
        frameLayout.addView(linearLayout, -1, -2);
        View yp4Var = new yp4(frameLayout.getContext());
        yp4Var.setTranslationY(rh4.c(6, fk4.d().getDisplayMetrics().density, -r12));
        frameLayout.addView(yp4Var);
    }

    public final cka x0() {
        return (cka) this.t0.T0(this, x0[1]);
    }

    public AddLinkBottomSheet(Bundle bundle) {
        super(bundle);
        fs fsVar = new fs(suc.class, Widget.ARG_SCOPE_ID);
        Parcelable parcelable = (Parcelable) ay7.v(bundle, "bottom_sheet:add_link:key", w9.class);
        if (parcelable != null) {
            this.s0 = (w9) parcelable;
            this.t0 = viewBinding(lga.v);
            this.u0 = viewBinding(lga.u);
            bc7 bc7Var = x0[0];
            this.v0 = m41getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, zz7.class, null);
            this.w0 = createViewModelLazy(rk7.class, new s(3, new x5(4, this)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
