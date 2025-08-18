package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import one.me.profileedit.ProfileEditScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class zfb implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditScreen b;

    public /* synthetic */ zfb(ProfileEditScreen profileEditScreen, int i) {
        this.a = i;
        this.b = profileEditScreen;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        int i = 2;
        int i2 = 0;
        e5f e5fVar = e5f.a;
        ProfileEditScreen profileEditScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ProfileEditScreen.y0;
                i3a onBackPressedDispatcher = profileEditScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                    break;
                }
                break;
            case 1:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                bc7[] bc7VarArr2 = ProfileEditScreen.y0;
                fm fmVar = new fm(coordinatorLayout.getContext());
                fmVar.setId(sea.U);
                fmVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                fmVar.setBackground(null);
                fmVar.setLiftOnScroll(true);
                fmVar.setStateListAnimator(null);
                zfb zfbVar = new zfb(profileEditScreen, i);
                w53 w53Var = new w53(fmVar.getContext());
                w53Var.setId(View.generateViewId());
                dm dmVar = new dm(-1, -2);
                dmVar.a = 19;
                w53Var.setLayoutParams(dmVar);
                w53Var.setTitleEnabled(false);
                zfbVar.invoke(w53Var);
                fmVar.addView(w53Var);
                coordinatorLayout.addView(fmVar);
                RecyclerView recyclerView = new RecyclerView(coordinatorLayout.getContext(), null);
                recyclerView.setId(sea.r0);
                rw3 rw3Var = new rw3(-1, -1);
                rw3Var.b(new AppBarLayout$ScrollingViewBehavior());
                recyclerView.setLayoutParams(rw3Var);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setClipToPadding(false);
                recyclerView.setClipChildren(false);
                recyclerView.setAdapter(profileEditScreen.X);
                recyclerView.setItemAnimator(null);
                int[] iArr = {2048, 128, 1, 2, 512, 131072};
                bi9 bi9Var = k37.a;
                bi9 bi9Var2 = new bi9(6);
                for (int i3 = 0; i3 < 6; i3++) {
                    bi9Var2.g(iArr[i3]);
                }
                recyclerView.j(new q1d(qp4.u0.j(recyclerView), new y98(profileEditScreen, 22, bi9Var2), null, 12));
                recyclerView.j(new nz7(0));
                coordinatorLayout.addView(recyclerView);
                break;
            case 2:
                w53 w53Var2 = (w53) obj;
                bc7[] bc7VarArr3 = ProfileEditScreen.y0;
                zfb zfbVar2 = new zfb(profileEditScreen, 3);
                Toolbar toolbar = new Toolbar(w53Var2.getContext(), null);
                toolbar.setId(View.generateViewId());
                t53 t53Var = new t53(-1, -2);
                t53Var.a = 1;
                toolbar.setLayoutParams(t53Var);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                zfbVar2.invoke(toolbar);
                w53Var2.addView(toolbar);
                zfb zfbVar3 = new zfb(profileEditScreen, 4);
                LinearLayout linearLayout = new LinearLayout(w53Var2.getContext());
                linearLayout.setId(sea.b0);
                t53 t53Var2 = new t53(-1, -2);
                t53Var2.a = 2;
                ((FrameLayout.LayoutParams) t53Var2).bottomMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
                linearLayout.setLayoutParams(t53Var2);
                linearLayout.setOrientation(1);
                zfbVar3.invoke(linearLayout);
                w53Var2.addView(linearLayout);
                break;
            case 3:
                Toolbar toolbar2 = (Toolbar) obj;
                bc7[] bc7VarArr4 = ProfileEditScreen.y0;
                cla claVar = new cla(toolbar2.getContext(), 6);
                claVar.setId(sea.q0);
                claVar.setForm(uka.a);
                claVar.setLeftActions(new kka(new zfb(profileEditScreen, i2)));
                claVar.setRightActions(nka.a);
                toolbar2.addView(claVar);
                break;
            case 4:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                bc7[] bc7VarArr5 = ProfileEditScreen.y0;
                s5a s5aVar = new s5a(linearLayout2.getContext());
                s5aVar.setId(sea.V);
                float f = 96;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                layoutParams.gravity = 1;
                layoutParams.topMargin = tu0.G(6 * fk4.d().getDisplayMetrics().density);
                s5aVar.setLayoutParams(layoutParams);
                s5aVar.setAddBadgeVisibility(false);
                tu0.K(s5aVar, 300L, new agb(profileEditScreen, i2));
                linearLayout2.addView(s5aVar);
                break;
            default:
                bc7[] bc7VarArr6 = ProfileEditScreen.y0;
                profileEditScreen.n0().u();
                break;
        }
        return e5fVar;
    }
}
