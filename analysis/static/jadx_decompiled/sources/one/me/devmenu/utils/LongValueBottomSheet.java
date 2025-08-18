package one.me.devmenu.utils;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.awb;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.c7a;
import defpackage.cka;
import defpackage.du4;
import defpackage.dy7;
import defpackage.fk4;
import defpackage.fs;
import defpackage.hob;
import defpackage.i4f;
import defpackage.kpa;
import defpackage.nec;
import defpackage.oec;
import defpackage.pq9;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.tu0;
import defpackage.vu5;
import defpackage.wfa;
import defpackage.z2;
import defpackage.z6a;
import defpackage.z84;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0004\u0010\f¨\u0006\u000e"}, d2 = {"Lone/me/devmenu/utils/LongValueBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "initialValue", "buttonId", "", "", "descriptions", "(JJ[Ljava/lang/String;)V", "xv7", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class LongValueBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] D0;
    public final fs A0;
    public final q7c B0;
    public final q7c C0;
    public final fs y0;
    public final fs z0;

    static {
        hob hobVar = new hob(LongValueBottomSheet.class, "initialValue", "getInitialValue()J", 0);
        oec oecVar = nec.a;
        D0 = new bc7[]{hobVar, zr6.e(oecVar, LongValueBottomSheet.class, "buttonId", "getButtonId()J", 0), zr6.f(LongValueBottomSheet.class, "descriptions", "getDescriptions()[Ljava/lang/String;", 0, oecVar), zr6.f(LongValueBottomSheet.class, "customInput", "getCustomInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0, oecVar), zr6.f(LongValueBottomSheet.class, "customButton", "getCustomButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oecVar)};
    }

    public LongValueBottomSheet(Bundle bundle) {
        super(bundle);
        this.y0 = new fs(Long.class, "arg:value");
        this.z0 = new fs(Long.class, "arg:button_id");
        this.A0 = new fs(String[].class, "arg:descriptions");
        this.B0 = viewBinding(awb.long_bottom_sheet_input);
        this.C0 = viewBinding(awb.long_bottom_sheet_button);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText("Значение рубильника");
        i4f.c.b(textView, du4.b);
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.j(textView).getText().e);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = 12;
        float f2 = 16;
        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        cka ckaVar = new cka(linearLayout.getContext());
        ckaVar.setId(awb.long_bottom_sheet_input);
        bc7[] bc7VarArr = D0;
        bc7 bc7Var = bc7VarArr[0];
        ckaVar.setText(String.valueOf(((Number) this.y0.a(this)).longValue()));
        ckaVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ckaVar.setBackgroundColorAttr(Integer.valueOf(wfa.L));
        ckaVar.setHint("Введите кастомное значение");
        ckaVar.setInputType(2);
        EditText editText = ckaVar.a;
        z2 z2Var = new z2(2, this);
        editText.addTextChangedListener(z2Var);
        editText.addTextChangedListener(z2Var);
        linearLayout.addView(ckaVar);
        bc7 bc7Var2 = bc7VarArr[2];
        for (String str : (String[]) this.A0.a(this)) {
            TextView textView2 = new TextView(linearLayout.getContext());
            textView2.setText(str);
            i4f.m.b(textView2, du4.b);
            textView2.setTextColor(pq9Var.j(textView2).getText().e);
            textView2.setGravity(8388611);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            float f3 = 8;
            layoutParams2.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
            textView2.setLayoutParams(layoutParams2);
            linearLayout.addView(textView2);
        }
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setId(awb.long_bottom_sheet_button);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams3);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText("Установить");
        tu0.K(oneMeButton, 300L, new vu5(this, 9, oneMeButton));
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }

    public /* synthetic */ LongValueBottomSheet(long j, long j2, String[] strArr, int i, z84 z84Var) {
        this(j, j2, (i & 4) != 0 ? new String[0] : strArr);
    }

    public LongValueBottomSheet(long j, long j2, String[] strArr) {
        this(dy7.g(new kpa("arg:value", Long.valueOf(j)), new kpa("arg:button_id", Long.valueOf(j2)), new kpa("arg:descriptions", strArr)));
    }
}
