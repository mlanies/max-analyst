package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import java.util.Map;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final /* synthetic */ class zo9 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    public /* synthetic */ zo9(NeuroAvatarsScreen neuroAvatarsScreen, int i) {
        this.a = i;
        this.b = neuroAvatarsScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        int i = 4;
        int i2 = 2;
        int i3 = 3;
        e5f e5fVar = e5f.a;
        NeuroAvatarsScreen neuroAvatarsScreen = this.b;
        boolean z = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.a) {
            case 0:
                qo9 qo9VarJ = neuroAvatarsScreen.I0.J(((Integer) obj).intValue());
                String str = qo9VarJ != null ? (String) ((Map) neuroAvatarsScreen.r0().y0.getValue()).get(Integer.valueOf(qo9VarJ.c)) : null;
                if (str == null) {
                }
                break;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                jv5 jv5Var = neuroAvatarsScreen.I0;
                if (jv5Var.j() > 0) {
                    qo9 qo9VarJ2 = jv5Var.J(iIntValue);
                    z = (qo9VarJ2 == null || !qo9VarJ2.o) ? 0 : 1;
                }
                break;
            case 2:
                w53 w53Var = (w53) obj;
                bc7[] bc7VarArr = NeuroAvatarsScreen.M0;
                zo9 zo9Var = new zo9(neuroAvatarsScreen, i3);
                Toolbar toolbar = new Toolbar(w53Var.getContext(), null);
                float f = 52;
                t53 t53Var = new t53(-1, tu0.G(fk4.d().getDisplayMetrics().density * f));
                t53Var.a = 1;
                toolbar.setLayoutParams(t53Var);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                zo9Var.invoke(toolbar);
                w53Var.addView(toolbar);
                zo9 zo9Var2 = new zo9(neuroAvatarsScreen, i);
                LinearLayout linearLayout = new LinearLayout(w53Var.getContext());
                linearLayout.setId(hwb.oneme_login_neuro_avatars_collapsible);
                t53 t53Var2 = new t53(-1, -2);
                t53Var2.a = 2;
                float f2 = 24;
                t53Var2.setMargins(0, rh4.c(f, fk4.d().getDisplayMetrics().density, tu0.G(fk4.d().getDisplayMetrics().density * f2)), 0, tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                linearLayout.setLayoutParams(t53Var2);
                linearLayout.setOrientation(1);
                zo9Var2.invoke(linearLayout);
                w53Var.addView(linearLayout);
                break;
            case 3:
                Toolbar toolbar2 = (Toolbar) obj;
                bc7[] bc7VarArr2 = NeuroAvatarsScreen.M0;
                cla claVar = new cla(toolbar2.getContext(), 6);
                claVar.setId(hwb.oneme_login_neuro_avatars_toolbar);
                claVar.setForm(uka.a);
                claVar.setLeftActions(new kka(new zo9(neuroAvatarsScreen, 5)));
                claVar.setTitle(neuroAvatarsScreen.r0().t0.a);
                claVar.setTitleAlpha(0.0f);
                toolbar2.addView(claVar);
                break;
            case 4:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                bc7[] bc7VarArr3 = NeuroAvatarsScreen.M0;
                TextView textView = new TextView(linearLayout2.getContext());
                textView.setId(hwb.oneme_login_neuro_avatars_title);
                i4f.c.b(textView, du4.b);
                textView.setText(neuroAvatarsScreen.r0().t0.a);
                textView.setGravity(1);
                t53 t53Var3 = new t53(-1, -2);
                float f3 = 12;
                t53Var3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), 0, tu0.G(fk4.d().getDisplayMetrics().density * f3), 0);
                textView.setLayoutParams(t53Var3);
                v3c.y(new v9(3, null, 19), textView);
                linearLayout2.addView(textView);
                TextView textView2 = new TextView(linearLayout2.getContext());
                textView2.setId(hwb.oneme_login_neuro_avatars_description);
                i4f.m.b(textView2, du4.b);
                textView2.setText(neuroAvatarsScreen.r0().t0.b);
                textView2.setGravity(1);
                t53 t53Var4 = new t53(-1, -2);
                t53Var4.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density), 0);
                textView2.setLayoutParams(t53Var4);
                v3c.y(new v9(3, null, 18), textView2);
                linearLayout2.addView(textView2);
                break;
            case 5:
                bc7[] bc7VarArr4 = NeuroAvatarsScreen.M0;
                neuroAvatarsScreen.getRouter().C();
                break;
            case 6:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                bc7[] bc7VarArr5 = NeuroAvatarsScreen.M0;
                zo9 zo9Var3 = new zo9(neuroAvatarsScreen, 7);
                View fmVar = new fm(coordinatorLayout.getContext());
                fmVar.setId(hwb.oneme_login_neuro_avatars_appbar);
                fmVar.setLayoutParams(new rw3(-1, -2));
                fmVar.setElevation(0.0f);
                v3c.y(new ep9(3, null, 0), fmVar);
                zo9Var3.invoke(fmVar);
                coordinatorLayout.addView(fmVar);
                RecyclerView recyclerView = new RecyclerView(coordinatorLayout.getContext(), null);
                recyclerView.setId(hwb.oneme_login_neuro_avatars_recycler_view);
                rw3 rw3Var = new rw3(-1, -1);
                rw3Var.b(new AppBarLayout$ScrollingViewBehavior());
                recyclerView.setLayoutParams(rw3Var);
                recyclerView.setClipToPadding(false);
                recyclerView.setItemAnimator(null);
                recyclerView.setOverScrollMode(2);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new GridLayoutManager(4));
                jv5 jv5Var2 = neuroAvatarsScreen.I0;
                recyclerView.setAdapter(jv5Var2);
                recyclerView.m(neuroAvatarsScreen.J0);
                ndc jn3Var = new jn3(recyclerView, jv5Var2, new zo9(neuroAvatarsScreen, objArr == true ? 1 : 0));
                ndc so9Var = new so9(new zo9(neuroAvatarsScreen, i), recyclerView.getContext());
                recyclerView.j(jn3Var);
                recyclerView.j(so9Var);
                recyclerView.j(new sc1(tu0.G(16 * fk4.d().getDisplayMetrics().density), tu0.G(12 * fk4.d().getDisplayMetrics().density), 5));
                recyclerView.addOnLayoutChangeListener(new hp1(recyclerView, i, neuroAvatarsScreen));
                coordinatorLayout.addView(recyclerView);
                zo9 zo9Var4 = new zo9(neuroAvatarsScreen, 8);
                View frameLayout = new FrameLayout(coordinatorLayout.getContext());
                frameLayout.setId(hwb.oneme_login_neuro_avatars_button_background);
                rw3 rw3Var2 = new rw3(-1, -2);
                rw3Var2.c = 80;
                frameLayout.setLayoutParams(rw3Var2);
                frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, qp4.u0.j(frameLayout).e().c.a));
                br7.d(frameLayout, new x27(0, new yq0(3, 1, false), 1), null);
                zo9Var4.invoke(frameLayout);
                v3c.y(new ro2(i3, null, i3), frameLayout);
                coordinatorLayout.addView(frameLayout);
                break;
            case 7:
                fm fmVar2 = (fm) obj;
                bc7[] bc7VarArr6 = NeuroAvatarsScreen.M0;
                zo9 zo9Var5 = new zo9(neuroAvatarsScreen, i2);
                w53 w53Var2 = new w53(fmVar2.getContext());
                dm dmVar = new dm(-1, -2);
                dmVar.a = 19;
                w53Var2.setLayoutParams(dmVar);
                w53Var2.setTitleEnabled(false);
                zo9Var5.invoke(w53Var2);
                fmVar2.addView(w53Var2);
                s5a s5aVar = new s5a(fmVar2.getContext());
                s5aVar.setId(hwb.oneme_login_neuro_avatars_avatar);
                float f4 = 96;
                s5aVar.setLayoutParams(new dm(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f4 * fk4.d().getDisplayMetrics().density)));
                fmVar2.setGravity(1);
                s5aVar.setCloseBadgeClickListener(new ap9(neuroAvatarsScreen, objArr2 == true ? 1 : 0));
                s5aVar.setOnImageLoadedListener(new ap9(neuroAvatarsScreen, i));
                s5a.j(s5aVar, (Drawable) neuroAvatarsScreen.L0.getValue(), null, 30);
                s5aVar.setAvatarShape(j5a.a);
                fmVar2.addView(s5aVar);
                qp9 qp9Var = new qp9(fmVar2.getContext(), null, 0);
                float f5 = 8;
                qp9Var.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f5), 0, tu0.G(f5 * fk4.d().getDisplayMetrics().density), 0);
                qp9Var.setId(hwb.oneme_login_neuro_avatars_tabs_shimmer);
                qp9Var.setElevation(0.0f);
                dm dmVar2 = new dm(-1, -2);
                float f6 = 32;
                ((LinearLayout.LayoutParams) dmVar2).topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f6);
                qp9Var.setLayoutParams(dmVar2);
                qp9Var.setVisibility(8);
                qp9Var.setTabs(3);
                qp9Var.setOverScrollMode(2);
                fmVar2.addView(qp9Var);
                wja wjaVar = new wja(fmVar2.getContext(), null);
                wjaVar.setId(hwb.oneme_login_neuro_avatars_tabs);
                wjaVar.setTabMode(0);
                wjaVar.setElevation(0.0f);
                dm dmVar3 = new dm(-1, -2);
                ((LinearLayout.LayoutParams) dmVar3).topMargin = tu0.G(f6 * fk4.d().getDisplayMetrics().density);
                wjaVar.setLayoutParams(dmVar3);
                wjaVar.setOverScrollMode(2);
                fmVar2.addView(wjaVar);
                break;
            default:
                FrameLayout frameLayout2 = (FrameLayout) obj;
                bc7[] bc7VarArr7 = NeuroAvatarsScreen.M0;
                OneMeButton oneMeButton = new OneMeButton(frameLayout2.getContext(), null);
                oneMeButton.setId(hwb.oneme_login_neuro_avatars_continue_btn);
                oneMeButton.setMode(b7a.a);
                oneMeButton.setSize(c7a.c);
                oneMeButton.setAppearance(z6a.o);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                float f7 = 12;
                layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f7), 0, tu0.G(f7 * fk4.d().getDisplayMetrics().density), tu0.G(16 * fk4.d().getDisplayMetrics().density));
                layoutParams.gravity = 48;
                oneMeButton.setLayoutParams(layoutParams);
                oneMeButton.setText(neuroAvatarsScreen.r0().t0.c);
                frameLayout2.addView(oneMeButton);
                break;
        }
        return e5fVar;
    }
}
