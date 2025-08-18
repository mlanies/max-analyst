package one.me.calls.ui.bottomsheet.record;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.b7a;
import defpackage.b8a;
import defpackage.bc7;
import defpackage.c7a;
import defpackage.du4;
import defpackage.dy7;
import defpackage.e9f;
import defpackage.el1;
import defpackage.fk4;
import defpackage.fka;
import defpackage.fs;
import defpackage.hob;
import defpackage.i4f;
import defpackage.ix3;
import defpackage.je7;
import defpackage.kpa;
import defpackage.la1;
import defpackage.lk3;
import defpackage.m31;
import defpackage.mr0;
import defpackage.nec;
import defpackage.nhd;
import defpackage.pq9;
import defpackage.qp4;
import defpackage.rzd;
import defpackage.suc;
import defpackage.tu0;
import defpackage.v7d;
import defpackage.woc;
import defpackage.xzd;
import defpackage.y7a;
import defpackage.z6a;
import defpackage.z84;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/calls/ui/bottomsheet/record/StartRecordBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class StartRecordBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] A0;
    public final je7 y0;
    public final je7 z0;

    static {
        hob hobVar = new hob(StartRecordBottomSheet.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0);
        nec.a.getClass();
        A0 = new bc7[]{hobVar};
    }

    public StartRecordBottomSheet(String str, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        mr0.G(this);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final fka q0() {
        return qp4.u0.o(getContext()).c;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void u0() {
        mr0.G(this);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(y7a.x1);
        i4f.c.b(textView, du4.b);
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.p(textView).c.getText().e);
        textView.setGravity(17);
        float f = 24;
        textView.setPadding(0, tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(20 * fk4.d().getDisplayMetrics().density));
        textView.setText(b8a.J1);
        EditText editText = new EditText(linearLayout.getContext());
        editText.setId(y7a.u1);
        i4f.l.b(editText, du4.b);
        editText.setHintTextColor(pq9Var.p(editText).c.getText().g);
        editText.setTextColor(pq9Var.p(editText).c.getText().e);
        float f2 = 16;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        editText.setPadding(iG, iG, iG, iG);
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        editText.setInputType(524288);
        m31 m31Var = ((la1) ((xzd) this.z0.getValue()).b.C0.a.getValue()).f;
        editText.setHint(m31Var != null ? m31Var.b : null);
        editText.setClipToOutline(true);
        editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
        editText.setOutlineProvider(new ix3(tu0.G(fk4.d().getDisplayMetrics().density * f2)));
        editText.setBackgroundColor(pq9Var.p(editText).c.b().a.h);
        lk3 lk3Var = new lk3(linearLayout.getContext(), null);
        lk3Var.setId(y7a.v1);
        lk3Var.setPadding(0, tu0.G(f2 * fk4.d().getDisplayMetrics().density), 0, tu0.G(f * fk4.d().getDisplayMetrics().density));
        lk3Var.setName(b8a.F1);
        lk3Var.setMessage(lk3Var.getContext().getString(b8a.E1));
        lk3Var.setCustomTheme(pq9Var.p(lk3Var).c);
        lk3Var.O(0L, "", e9f.c(woc.T1).toString());
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setId(y7a.w1);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setCustomTheme(pq9Var.p(oneMeButton).c);
        oneMeButton.setText(b8a.I1);
        tu0.K(oneMeButton, 300L, new v7d(this, 7, editText));
        linearLayout.addView(textView, -1, -2);
        linearLayout.addView(editText, -1, -2);
        linearLayout.addView(lk3Var, -1, -2);
        linearLayout.addView(oneMeButton, -1, -2);
        return linearLayout;
    }

    public StartRecordBottomSheet(Bundle bundle) {
        super(bundle);
        fs fsVar = new fs(suc.class, new suc("default"), Widget.ARG_SCOPE_ID);
        bc7 bc7Var = A0[0];
        this.y0 = m41getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, el1.class, null);
        this.z0 = createViewModelLazy(xzd.class, new nhd(6, new rzd(1, this)));
    }
}
