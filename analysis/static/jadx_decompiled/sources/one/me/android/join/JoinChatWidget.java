package one.me.android.join;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.c7a;
import defpackage.d97;
import defpackage.du4;
import defpackage.dy7;
import defpackage.eh7;
import defpackage.es3;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fs;
import defpackage.hob;
import defpackage.i3a;
import defpackage.i4f;
import defpackage.je7;
import defpackage.jy2;
import defpackage.kpa;
import defpackage.m56;
import defpackage.n97;
import defpackage.nec;
import defpackage.nj4;
import defpackage.od2;
import defpackage.oec;
import defpackage.rh4;
import defpackage.ru3;
import defpackage.t03;
import defpackage.tu0;
import defpackage.v3c;
import defpackage.v9;
import defpackage.vu5;
import defpackage.xx5;
import defpackage.yp4;
import defpackage.yzb;
import defpackage.z6a;
import defpackage.z7;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.android.deeplink.LinkInterceptorActivity;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B+\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/android/join/JoinChatWidget;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "", "link", "title", "", "isChannel", "(JLjava/lang/String;Ljava/lang/String;Z)V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class JoinChatWidget extends BaseBottomSheetWidget {
    public static final String A0;
    public static final String B0;
    public static final /* synthetic */ bc7[] x0;
    public static final String y0;
    public static final String z0;
    public final fs s0;
    public final fs t0;
    public final fs u0;
    public final je7 v0;
    public final boolean w0;

    static {
        hob hobVar = new hob(JoinChatWidget.class, "id", "getId()J", 0);
        oec oecVar = nec.a;
        x0 = new bc7[]{hobVar, zr6.e(oecVar, JoinChatWidget.class, "link", "getLink()Ljava/lang/String;", 0), zr6.f(JoinChatWidget.class, "title", "getTitle()Ljava/lang/String;", 0, oecVar), zr6.f(JoinChatWidget.class, "isChannel", "isChannel()Z", 0, oecVar)};
        y0 = "join:id";
        z0 = "join:link";
        A0 = "join:title";
        B0 = "join:channel";
    }

    public JoinChatWidget(Bundle bundle) {
        super(bundle);
        this.s0 = new fs(String.class, z0);
        this.t0 = new fs(String.class, null, A0);
        this.u0 = new fs(Boolean.class, B0);
        je7 je7VarCreateViewModelLazy = createViewModelLazy(n97.class, new nj4(13, new es3(29, this)));
        this.v0 = je7VarCreateViewModelLazy;
        this.w0 = true;
        od2.L(new zn5(new t03(tu0.g(((n97) je7VarCreateViewModelLazy.getValue()).X, this.lifecycleOwner.Q(), fg7.o), 19), new d97(this, null), 5), getLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, one.me.sdk.arch.Widget
    /* renamed from: isDialog, reason: from getter */
    public final boolean getA0() {
        return this.w0;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        i3a onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            eh7 viewLifecycleOwner = getViewLifecycleOwner();
            ru3 ru3Var = new ru3(true, (m56) new jy2(22, this));
            if (viewLifecycleOwner != null) {
                onBackPressedDispatcher.a(viewLifecycleOwner, ru3Var);
            } else {
                onBackPressedDispatcher.b(ru3Var);
            }
        }
        getRouter().I();
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void t0() {
        super.t0();
        Activity activityD = getRouter().d();
        LinkInterceptorActivity linkInterceptorActivity = activityD instanceof LinkInterceptorActivity ? (LinkInterceptorActivity) activityD : null;
        if (linkInterceptorActivity != null) {
            linkInterceptorActivity.finish();
        }
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void w0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        String string;
        float f = 12;
        frameLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(10 * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(8 * fk4.d().getDisplayMetrics().density));
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f2 = 16;
        textView.setPaddingRelative(textView.getPaddingStart(), tu0.G(f2 * fk4.d().getDisplayMetrics().density), textView.getPaddingEnd(), tu0.G(fk4.d().getDisplayMetrics().density * f2));
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        bc7[] bc7VarArr = x0;
        int i = 3;
        bc7 bc7Var = bc7VarArr[3];
        fs fsVar = this.u0;
        boolean zBooleanValue = ((Boolean) fsVar.a(this)).booleanValue();
        fs fsVar2 = this.t0;
        if (zBooleanValue) {
            Context context = textView.getContext();
            int i2 = yzb.join_chat_title_channel;
            bc7 bc7Var2 = bc7VarArr[2];
            string = context.getString(i2, (String) fsVar2.a(this));
        } else {
            Context context2 = textView.getContext();
            int i3 = yzb.join_chat_title_chat;
            bc7 bc7Var3 = bc7VarArr[2];
            string = context2.getString(i3, (String) fsVar2.a(this));
        }
        textView.setText(string);
        i4f.c.b(textView, du4.b);
        v3c.y(new v9(i, null, 16), textView);
        linearLayout.addView(textView);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        c7a c7aVar = c7a.c;
        oneMeButton.setSize(c7aVar);
        b7a b7aVar = b7a.o;
        oneMeButton.setMode(b7aVar);
        z6a z6aVar = z6a.c;
        oneMeButton.setAppearance(z6aVar);
        bc7 bc7Var4 = bc7VarArr[3];
        oneMeButton.setText(z7.B(oneMeButton.getContext(), ((Boolean) fsVar.a(this)).booleanValue() ? yzb.join_chat_confirm_channel_button : yzb.join_chat_confirm_chat_button));
        tu0.K(oneMeButton, 300L, new vu5(oneMeButton, 8, this));
        linearLayout.addView(oneMeButton);
        OneMeButton oneMeButton2 = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        oneMeButton2.setSize(c7aVar);
        oneMeButton2.setMode(b7aVar);
        oneMeButton2.setAppearance(z6aVar);
        oneMeButton2.setText(yzb.join_chat_cancel_button);
        tu0.K(oneMeButton2, 300L, new xx5(8, this));
        linearLayout.addView(oneMeButton2);
        frameLayout.addView(linearLayout, -1, -2);
        View yp4Var = new yp4(frameLayout.getContext());
        yp4Var.setTranslationY(rh4.c(6, fk4.d().getDisplayMetrics().density, -r12));
        frameLayout.addView(yp4Var);
    }

    public JoinChatWidget(long j, String str, String str2, boolean z) {
        this(dy7.g(new kpa(y0, Long.valueOf(j)), new kpa(z0, str), new kpa(A0, str2), new kpa(B0, Boolean.valueOf(z))));
    }
}
