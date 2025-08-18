package one.me.settings.privacy.ui.onboarding;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import defpackage.au1;
import defpackage.b7a;
import defpackage.bvc;
import defpackage.c7a;
import defpackage.cla;
import defpackage.dj3;
import defpackage.du4;
import defpackage.fk4;
import defpackage.fp3;
import defpackage.glc;
import defpackage.gpc;
import defpackage.i4f;
import defpackage.kka;
import defpackage.kmd;
import defpackage.kxb;
import defpackage.l2a;
import defpackage.nub;
import defpackage.p1c;
import defpackage.pq9;
import defpackage.qp4;
import defpackage.r1b;
import defpackage.rpc;
import defpackage.ti3;
import defpackage.tu0;
import defpackage.ufd;
import defpackage.uka;
import defpackage.v3c;
import defpackage.wuc;
import defpackage.x27;
import defpackage.y20;
import defpackage.z6a;
import defpackage.z7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.HttpStatus;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/settings/privacy/ui/onboarding/SafeModeOnboardingScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class SafeModeOnboardingScreen extends Widget {
    public static final /* synthetic */ int c = 0;
    public final x27 a;
    public final glc b;

    public SafeModeOnboardingScreen() {
        super(null, 0, 3, null);
        x27 x27Var = x27.c;
        this.a = x27.d;
        this.b = new glc(wuc.SETTINGS_PRIVACY_SAFE_MODE);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.b;
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        requireActivity().getWindow().setStatusBarColor(0);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(viewGroup.getContext());
        constraintLayout.setId(kxb.oneme_settings_privacy_onboarding_root);
        pq9 pq9Var = qp4.u0;
        constraintLayout.setBackgroundColor(pq9Var.j(constraintLayout).b().k);
        constraintLayout.setClipChildren(false);
        constraintLayout.setClipToPadding(false);
        constraintLayout.setClipToOutline(false);
        cla claVar = new cla(constraintLayout.getContext(), 6);
        claVar.setId(kxb.oneme_settings_privacy_onboarding_toolbar);
        claVar.setForm(uka.a);
        claVar.setBackgroundColor(0);
        claVar.setLayoutParams(new ti3(-1, -2));
        claVar.setTranslationZ(1000.0f);
        claVar.setLeftActions(new kka(new rpc(1, this)));
        constraintLayout.addView(claVar);
        ScrollView scrollView = new ScrollView(viewGroup.getContext());
        scrollView.setId(kxb.oneme_settings_privacy_onboarding_scroll_view);
        scrollView.setLayoutParams(new ti3(-1, -2));
        Context context = scrollView.getContext();
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(kxb.oneme_settings_privacy_onboarding_content);
        constraintLayout2.setClipChildren(false);
        constraintLayout2.setClipToPadding(false);
        constraintLayout2.setClipToOutline(false);
        Guideline guideline = new Guideline(context);
        guideline.setId(kxb.oneme_settings_privacy_onboarding_top_guideline);
        ti3 ti3Var = new ti3(0, 0);
        ti3Var.a = tu0.G(60 * fk4.d().getDisplayMetrics().density);
        ti3Var.V = 0;
        guideline.setLayoutParams(ti3Var);
        constraintLayout2.addView(guideline);
        View view = new View(context);
        view.setId(kxb.oneme_settings_privacy_onboarding_lock_background);
        ti3 ti3Var2 = new ti3(0, 0);
        ((ViewGroup.MarginLayoutParams) ti3Var2).topMargin = ((ti3) guideline.getLayoutParams()).a;
        view.setLayoutParams(ti3Var2);
        constraintLayout2.setClipToPadding(false);
        view.setClipToOutline(false);
        kmd kmdVar = new kmd(context);
        kmdVar.c(false);
        view.setBackground(kmdVar);
        constraintLayout2.addView(view);
        ImageView imageView = new ImageView(context);
        imageView.setId(kxb.oneme_settings_privacy_onboarding_lock);
        imageView.setLayoutParams(new ti3(0, 0));
        imageView.setImageResource(nub.oneme_settings_privacy_big_lock);
        constraintLayout2.addView(imageView);
        TextView textView = new TextView(context);
        textView.setId(kxb.oneme_settings_privacy_onboarding_content_title);
        ti3 ti3Var3 = new ti3(-2, -2);
        float f = 32;
        ti3Var3.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        ti3Var3.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f));
        textView.setLayoutParams(ti3Var3);
        textView.setMaxLines(1);
        textView.setTextAlignment(4);
        i4f.c.b(textView, du4.b);
        textView.setTextColor(pq9Var.j(textView).getText().e);
        textView.setText(p1c.oneme_settings_privacy_screen_safe_mode);
        constraintLayout2.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setId(kxb.oneme_settings_privacy_onboarding_content_subtitle);
        ti3 ti3Var4 = new ti3(-2, -2);
        ti3Var4.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        ti3Var4.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f));
        textView2.setLayoutParams(ti3Var4);
        textView2.setMaxLines(2);
        textView2.setTextAlignment(4);
        i4f.n.b(textView2, du4.b);
        textView2.setTextColor(pq9Var.j(textView2).getText().g);
        textView2.setText(p1c.oneme_settings_privacy_onboarding_content_subtitle);
        constraintLayout2.addView(textView2);
        ufd ufdVar = new ufd(context, null);
        ufdVar.setId(kxb.oneme_settings_privacy_onboarding_item_1);
        ufdVar.setStartIcon(gpc.l);
        ufdVar.setTitle(z7.B(ufdVar.getContext(), p1c.oneme_settings_privacy_onboarding_item_1_title));
        ufdVar.setDescription(z7.B(ufdVar.getContext(), p1c.oneme_settings_privacy_onboarding_item_1_subtitle));
        ufdVar.onThemeChanged(pq9Var.b(context).i());
        constraintLayout2.addView(ufdVar);
        ufd ufdVar2 = new ufd(context, null);
        ufdVar2.setId(kxb.oneme_settings_privacy_onboarding_item_2);
        ufdVar2.setStartIcon(gpc.i);
        ufdVar2.setTitle(z7.B(ufdVar2.getContext(), p1c.oneme_settings_privacy_onboarding_item_2_title));
        ufdVar2.setDescription(z7.B(ufdVar2.getContext(), p1c.oneme_settings_privacy_onboarding_item_2_subtitle));
        ufdVar2.onThemeChanged(pq9Var.b(context).i());
        constraintLayout2.addView(ufdVar2);
        ufd ufdVar3 = new ufd(context, null);
        ufdVar3.setId(kxb.oneme_settings_privacy_onboarding_item_3);
        ufdVar3.setStartIcon(gpc.Z);
        ufdVar3.setTitle(z7.B(ufdVar3.getContext(), p1c.oneme_settings_privacy_onboarding_item_3_title));
        ufdVar3.setDescription(z7.B(ufdVar3.getContext(), p1c.oneme_settings_privacy_onboarding_item_3_subtitle));
        ufdVar3.onThemeChanged(pq9Var.b(context).i());
        constraintLayout2.addView(ufdVar3);
        dj3 dj3VarQ = fp3.q(constraintLayout2);
        int id = view.getId();
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 7, 0, 7);
        float f2 = HttpStatus.SC_MULTIPLE_CHOICES;
        dj3VarQ.g(id).d.Z = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        dj3VarQ.g(id).d.a0 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        dj3VarQ.g(id).d.y = "1:1";
        int id2 = imageView.getId();
        dj3VarQ.d(id2, 3, guideline.getId(), 3);
        dj3VarQ.d(id2, 6, view.getId(), 6);
        dj3VarQ.d(id2, 7, view.getId(), 7);
        dj3VarQ.d(id2, 4, view.getId(), 4);
        dj3VarQ.g(id2).d.Z = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
        dj3VarQ.g(id2).d.a0 = tu0.G(212 * fk4.d().getDisplayMetrics().density);
        int id3 = textView.getId();
        dj3VarQ.d(id3, 3, view.getId(), 4);
        dj3VarQ.d(id3, 6, 0, 6);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id3, 4));
        dj3VarQ.d(id3, 7, 0, 7);
        new l2a(dj3VarQ, 7, id3, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        int id4 = textView2.getId();
        dj3VarQ.d(id4, 3, textView.getId(), 4);
        dj3VarQ.d(id4, 6, 0, 6);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id4, 4));
        dj3VarQ.d(id4, 7, 0, 7);
        new l2a(dj3VarQ, 7, id4, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        int id5 = ufdVar.getId();
        dj3VarQ.d(id5, 3, textView2.getId(), 4);
        au1.p(36, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id5, 4));
        dj3VarQ.d(id5, 6, 0, 6);
        float f3 = 12;
        new l2a(dj3VarQ, 6, id5, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        dj3VarQ.d(id5, 7, 0, 7);
        new l2a(dj3VarQ, 7, id5, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        int id6 = ufdVar2.getId();
        dj3VarQ.d(id6, 3, ufdVar.getId(), 4);
        float f4 = 4;
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id6, 4));
        dj3VarQ.d(id6, 6, 0, 6);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id6, 4));
        dj3VarQ.d(id6, 7, 0, 7);
        new l2a(dj3VarQ, 7, id6, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        int id7 = ufdVar3.getId();
        dj3VarQ.d(id7, 3, ufdVar2.getId(), 4);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id7, 4));
        dj3VarQ.d(id7, 6, 0, 6);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id7, 4));
        dj3VarQ.d(id7, 7, 0, 7);
        new l2a(dj3VarQ, 7, id7, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        dj3VarQ.a(constraintLayout2);
        scrollView.addView(constraintLayout2);
        constraintLayout.addView(scrollView);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), null);
        oneMeButton.setId(kxb.oneme_settings_privacy_onboarding_set_pin_code_button);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.c);
        oneMeButton.setText(p1c.oneme_settings_privacy_onboarding_set_pin_code);
        oneMeButton.setLayoutParams(new ti3(0, -2));
        tu0.K(oneMeButton, 300L, new y20(7));
        constraintLayout.addView(oneMeButton);
        dj3 dj3VarQ2 = fp3.q(constraintLayout);
        int id8 = claVar.getId();
        dj3VarQ2.d(id8, 3, 0, 3);
        dj3VarQ2.d(id8, 6, 0, 6);
        dj3VarQ2.d(id8, 7, 0, 7);
        int id9 = scrollView.getId();
        dj3VarQ2.d(id9, 3, 0, 3);
        dj3VarQ2.d(id9, 6, 0, 6);
        dj3VarQ2.d(id9, 7, 0, 7);
        int id10 = oneMeButton.getId();
        dj3VarQ2.d(id10, 6, 0, 6);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ2, 6, id10, 4));
        dj3VarQ2.d(id10, 7, 0, 7);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ2, 7, id10, 4));
        dj3VarQ2.d(id10, 4, 0, 4);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ2, 4, id10, 4));
        dj3VarQ2.g(id10).d.Z = tu0.G(336 * fk4.d().getDisplayMetrics().density);
        dj3VarQ2.a(constraintLayout);
        return constraintLayout;
    }

    @Override // defpackage.uu3
    public final void onDetach(View view) {
        Window window = requireActivity().getWindow();
        qp4.u0.b(view.getContext()).i().b();
        window.setStatusBarColor(0);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        v3c.y(new r1b(view, (Continuation) null, 9), view);
    }
}
