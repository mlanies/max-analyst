package one.me.devmenu.server;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.c7a;
import defpackage.cka;
import defpackage.du4;
import defpackage.fk4;
import defpackage.hbc;
import defpackage.hob;
import defpackage.i4f;
import defpackage.je7;
import defpackage.jp8;
import defpackage.l6b;
import defpackage.nec;
import defpackage.q33;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.t33;
import defpackage.ti3;
import defpackage.tu0;
import defpackage.v7d;
import defpackage.wfa;
import defpackage.z2;
import defpackage.z6a;
import defpackage.zr6;
import defpackage.zvb;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/devmenu/server/ServerPortBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class ServerPortBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] B0 = {new hob(ServerPortBottomSheet.class, "customInput", "getCustomInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), zr6.e(nec.a, ServerPortBottomSheet.class, "customButton", "getCustomButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final q7c A0;
    public final je7 y0;
    public final q7c z0;

    public ServerPortBottomSheet() {
        super(null, 1, null);
        this.y0 = createViewModelLazy(l6b.class, new jp8(26, new hbc(16)));
        this.z0 = viewBinding(zvb.server_port_input);
        this.A0 = viewBinding(zvb.server_port_custom_btn);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText("Порт сервера");
        i4f.c.b(textView, du4.b);
        textView.setTextColor(qp4.u0.j(textView).getText().e);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = 12;
        float f2 = 16;
        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        cka ckaVar = new cka(linearLayout.getContext());
        ckaVar.setId(zvb.server_port_input);
        ckaVar.setText(((t33) ((q33) ((l6b) this.y0.getValue()).b.getValue())).E());
        ckaVar.setLayoutParams(new ti3(-1, -2));
        ckaVar.setBackgroundColorAttr(Integer.valueOf(wfa.L));
        ckaVar.setHint("Введите кастомный порт");
        ckaVar.setInputType(2);
        EditText editText = ckaVar.a;
        z2 z2Var = new z2(9, this);
        editText.addTextChangedListener(z2Var);
        editText.addTextChangedListener(z2Var);
        linearLayout.addView(ckaVar);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setId(zvb.server_port_custom_btn);
        ti3 ti3Var = new ti3(-1, -2);
        ((ViewGroup.MarginLayoutParams) ti3Var).topMargin = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(ti3Var);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText("Установить");
        tu0.K(oneMeButton, 300L, new v7d(this, 0, oneMeButton));
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }
}
