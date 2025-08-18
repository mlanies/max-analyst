package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Collections;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class tyf implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebAppRootScreen b;

    public /* synthetic */ tyf(WebAppRootScreen webAppRootScreen, int i) {
        this.a = i;
        this.b = webAppRootScreen;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        WebAppRootScreen webAppRootScreen = this.b;
        e5f e5fVar = e5f.a;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = WebAppRootScreen.G0;
                dy7.c(1).Y((View) obj).I(Collections.singletonList(new tt3(1, new eqe(x1c.web_app_root_dots_menu_refresh), Integer.valueOf(gpc.a0), (Integer) null, 20))).build().q(webAppRootScreen);
                break;
            case 1:
                LinearLayout linearLayout = (LinearLayout) obj;
                bc7[] bc7VarArr2 = WebAppRootScreen.G0;
                cla claVar = new cla(linearLayout.getContext(), 6);
                claVar.setId(kla.i);
                claVar.setForm(uka.a);
                WebAppRootScreen webAppRootScreen2 = this.b;
                claVar.setRightActions(new rka(new tyf(webAppRootScreen2, 0)));
                linearLayout.addView(claVar);
                FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
                frameLayout.setId(kla.a);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                Context context = frameLayout.getContext();
                fxc fxcVar = new fxc(context, null, R.attr.webViewStyle, 8);
                fxcVar.setId(kla.j);
                fxcVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                fxcVar.getSettings().setJavaScriptEnabled(true);
                fxcVar.getSettings().setDomStorageEnabled(true);
                fxcVar.getSettings().setSupportMultipleWindows(true);
                fxcVar.setWebViewClient(new jla(webAppRootScreen2.z0(), new s23(context)));
                fxcVar.setWebChromeClient(new gla(webAppRootScreen2.z0()));
                fxcVar.addJavascriptInterface(new u3g(webAppRootScreen2.z0()), "WebViewHandler");
                nfa nfaVar = new nfa(frameLayout.getContext());
                nfaVar.setId(kla.d);
                nfaVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                nfaVar.setAppearance(cfa.a);
                Context context2 = frameLayout.getContext();
                LinearLayout linearLayout2 = new LinearLayout(context2);
                linearLayout2.setId(kla.b);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 17);
                float f = 20;
                layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
                layoutParams.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
                linearLayout2.setLayoutParams(layoutParams);
                linearLayout2.setOrientation(1);
                Drawable drawableB = kt3.b(linearLayout2.getContext(), woc.v0);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawableB);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 1;
                imageView.setLayoutParams(layoutParams2);
                TextView textView = new TextView(context2);
                textView.setText(x1c.web_app_root_error_title);
                textView.setSingleLine();
                i4f.d.b(textView, du4.b);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 1;
                layoutParams3.topMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
                textView.setLayoutParams(layoutParams3);
                TextView textView2 = new TextView(context2);
                textView2.setText(x1c.web_app_root_error_subtitle);
                textView2.setSingleLine();
                i4f.n.b(textView2, du4.b);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams4.topMargin = tu0.G(2 * fk4.d().getDisplayMetrics().density);
                layoutParams4.bottomMargin = tu0.G(24 * fk4.d().getDisplayMetrics().density);
                layoutParams4.gravity = 1;
                textView2.setLayoutParams(layoutParams4);
                OneMeButton oneMeButton = new OneMeButton(context2, null);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 1;
                oneMeButton.setLayoutParams(layoutParams5);
                oneMeButton.setText(x1c.web_app_root_error_retry_button);
                oneMeButton.setMode(b7a.b);
                oneMeButton.setAppearance(z6a.o);
                tu0.K(oneMeButton, 300L, new elb(17, webAppRootScreen2));
                v3c.y(new jf1(textView, textView2, drawableB, null, 7), linearLayout2);
                linearLayout2.addView(imageView);
                linearLayout2.addView(textView);
                linearLayout2.addView(textView2);
                linearLayout2.addView(oneMeButton);
                frameLayout.addView(fxcVar);
                i24.s(new zn5(webAppRootScreen2.z0().L0, new uyf(webAppRootScreen2, fxcVar, frameLayout, linearLayout2, nfaVar, null), 5), webAppRootScreen2.getViewLifecycleScope());
                linearLayout.addView(frameLayout);
                break;
            case 2:
                bc7[] bc7VarArr3 = WebAppRootScreen.G0;
                c8d c8dVar = webAppRootScreen.z0().D0;
                c8dVar.getClass();
                j47.T((sx3) c8dVar.a, null, null, new da7(c8dVar, null), 3);
                break;
            default:
                bc7[] bc7VarArr4 = WebAppRootScreen.G0;
                zzf zzfVarZ0 = webAppRootScreen.z0();
                zzfVarZ0.getClass();
                pnf.n(zzfVarZ0, null, null, new pzf(zzfVarZ0, null), 3);
                break;
        }
        return e5fVar;
    }
}
