package one.me.devmenu.server;

import android.annotation.SuppressLint;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.c7a;
import defpackage.cka;
import defpackage.du4;
import defpackage.elb;
import defpackage.ffa;
import defpackage.fg7;
import defpackage.fi4;
import defpackage.fk4;
import defpackage.hbc;
import defpackage.hob;
import defpackage.i4f;
import defpackage.iba;
import defpackage.ifa;
import defpackage.je7;
import defpackage.jp8;
import defpackage.jv5;
import defpackage.nec;
import defpackage.nfa;
import defpackage.o7d;
import defpackage.od2;
import defpackage.oec;
import defpackage.oo6;
import defpackage.p7d;
import defpackage.q0e;
import defpackage.q7c;
import defpackage.q7d;
import defpackage.qp4;
import defpackage.ti3;
import defpackage.tu0;
import defpackage.wfa;
import defpackage.z2;
import defpackage.z6a;
import defpackage.zn5;
import defpackage.zr6;
import defpackage.zvb;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/devmenu/server/ServerHostBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class ServerHostBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] G0;
    public final jv5 A0;
    public final q7c B0;
    public final q7c C0;
    public final q7c D0;
    public final q7c E0;
    public final q7c F0;
    public final je7 y0;
    public final AutoTransition z0;

    static {
        hob hobVar = new hob(ServerHostBottomSheet.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        oec oecVar = nec.a;
        G0 = new bc7[]{hobVar, zr6.e(oecVar, ServerHostBottomSheet.class, "loaderView", "getLoaderView()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar;", 0), zr6.f(ServerHostBottomSheet.class, "customContainer", "getCustomContainer()Landroid/widget/LinearLayout;", 0, oecVar), zr6.f(ServerHostBottomSheet.class, "customInput", "getCustomInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0, oecVar), zr6.f(ServerHostBottomSheet.class, "customButton", "getCustomButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oecVar)};
    }

    public ServerHostBottomSheet() {
        super(null, 1, null);
        je7 je7VarCreateViewModelLazy = createViewModelLazy(oo6.class, new jp8(25, new hbc(15)));
        this.y0 = je7VarCreateViewModelLazy;
        this.z0 = new AutoTransition();
        this.A0 = new jv5(new o7d((oo6) je7VarCreateViewModelLazy.getValue()), ((iba) fi4.a.getAccessor().c(iba.class)).a(), 7);
        this.B0 = viewBinding(zvb.server_host_recycler);
        this.C0 = viewBinding(zvb.server_host_loader);
        this.D0 = viewBinding(zvb.server_host_container);
        this.E0 = viewBinding(zvb.server_host_input);
        this.F0 = viewBinding(zvb.server_host_custom_btn);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        je7 je7Var = this.y0;
        q0e q0eVar = ((oo6) je7Var.getValue()).s0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(q0eVar, getViewLifecycleOwner().Q(), fg7Var), new p7d(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((oo6) je7Var.getValue()).t0, getViewLifecycleOwner().Q(), fg7Var), new q7d(null, this, view), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText("Адрес сервера");
        i4f.c.b(textView, du4.b);
        textView.setTextColor(qp4.u0.j(textView).getText().e);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = 12;
        float f2 = 16;
        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(zvb.server_host_recycler);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setAdapter(this.A0);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        linearLayout.addView(recyclerView);
        nfa nfaVar = new nfa(linearLayout.getContext());
        nfaVar.setId(zvb.server_host_loader);
        linearLayout.setGravity(17);
        nfaVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        nfaVar.setAppearance(ffa.a);
        nfaVar.setSize(ifa.a);
        nfaVar.setVisibility(8);
        linearLayout.addView(nfaVar);
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setId(zvb.server_host_container);
        linearLayout2.setOrientation(1);
        linearLayout2.setVisibility(8);
        cka ckaVar = new cka(linearLayout2.getContext());
        ckaVar.setId(zvb.server_host_input);
        ckaVar.setLayoutParams(new ti3(-1, -2));
        ckaVar.setBackgroundColorAttr(Integer.valueOf(wfa.L));
        ckaVar.setHint("Введите кастомный адрес");
        EditText editText = ckaVar.a;
        z2 z2Var = new z2(8, this);
        editText.addTextChangedListener(z2Var);
        editText.addTextChangedListener(z2Var);
        linearLayout2.addView(ckaVar);
        OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), null);
        oneMeButton.setId(zvb.server_host_custom_btn);
        ti3 ti3Var = new ti3(-1, -2);
        ((ViewGroup.MarginLayoutParams) ti3Var).topMargin = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(ti3Var);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText("Установить");
        tu0.K(oneMeButton, 300L, new elb(3, this));
        linearLayout2.addView(oneMeButton);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }
}
