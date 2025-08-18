package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.b;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.profile.ProfileScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final /* synthetic */ class dlb implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileScreen b;

    public /* synthetic */ dlb(ProfileScreen profileScreen, int i) {
        this.a = i;
        this.b = profileScreen;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        int i = 3;
        e5f e5fVar = e5f.a;
        int i2 = 0;
        ProfileScreen profileScreen = this.b;
        int i3 = 1;
        switch (this.a) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) obj;
                bc7[] bc7VarArr = ProfileScreen.D0;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(linearLayout.getContext(), null, 6);
                endlessRecyclerView2.setId(wea.l1);
                endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                endlessRecyclerView2.setItemAnimator(null);
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setOverScrollMode(2);
                b bVar = new b();
                bVar.setMaxRecycledViews(1, 1);
                bVar.setMaxRecycledViews(2, 1);
                bVar.setMaxRecycledViews(128, 1);
                bVar.setMaxRecycledViews(64, 1);
                bVar.setMaxRecycledViews(32768, 1);
                bVar.setMaxRecycledViews(32, 1);
                bVar.setMaxRecycledViews(16, 1);
                bVar.setMaxRecycledViews(8, 1);
                bVar.setMaxRecycledViews(65536, 1);
                bVar.setMaxRecycledViews(4096, 1);
                endlessRecyclerView2.setRecycledViewPool(bVar);
                endlessRecyclerView2.setAdapter(new qlb(((iba) xcb.a.getAccessor().c(iba.class)).a(), profileScreen));
                endlessRecyclerView2.setClipToPadding(false);
                endlessRecyclerView2.setClipChildren(false);
                endlessRecyclerView2.setPager(new j81(profileScreen, 7));
                bi9 bi9Var = k37.a;
                bi9 bi9Var2 = new bi9(3);
                bi9Var2.g(1);
                bi9Var2.g(4);
                bi9Var2.g(2);
                endlessRecyclerView2.j(new q1d(qp4.u0.j(endlessRecyclerView2), new y98(endlessRecyclerView2, 25, bi9Var2), null, 12));
                float f = 12;
                float f2 = 24;
                yh9 yh9VarY = ay7.y(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), 512, tu0.G(fk4.d().getDisplayMetrics().density * f), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, tu0.G(fk4.d().getDisplayMetrics().density * f), 4096, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f));
                int iG = tu0.G(fk4.d().getDisplayMetrics().density * f);
                int iG2 = tu0.G(fk4.d().getDisplayMetrics().density * f);
                int iG3 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
                float f3 = 18;
                int iG4 = tu0.G(fk4.d().getDisplayMetrics().density * f3);
                int iG5 = tu0.G(fk4.d().getDisplayMetrics().density * f3);
                int iG6 = tu0.G(fk4.d().getDisplayMetrics().density * f3);
                int iG7 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
                int iG8 = tu0.G(fk4.d().getDisplayMetrics().density * f3);
                int iG9 = tu0.G(fk4.d().getDisplayMetrics().density * f3);
                int iG10 = tu0.G(fk4.d().getDisplayMetrics().density * f3);
                int iG11 = tu0.G(f3 * fk4.d().getDisplayMetrics().density);
                float f4 = 6;
                float f5 = 10;
                endlessRecyclerView2.j(new nz7(yh9VarY, ay7.y(iG, iG2, iG3, iG4, iG5, iG6, iG7, iG8, iG9, iG10, iG11, 512, 0, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 0, 4096, tu0.G(fk4.d().getDisplayMetrics().density * f4), 0), ay7.y(tu0.G(8 * fk4.d().getDisplayMetrics().density), 0, tu0.G(f4 * fk4.d().getDisplayMetrics().density), 0, 0, 0, 0, 0, 0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f5), 4096, tu0.G(fk4.d().getDisplayMetrics().density * f5), 512, tu0.G(fk4.d().getDisplayMetrics().density * f5), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(f5 * fk4.d().getDisplayMetrics().density)), i3));
                linearLayout.addView(endlessRecyclerView2);
                View w12Var = new w12(linearLayout.getContext());
                w12Var.setId(wea.j1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.rightMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
                layoutParams.leftMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
                layoutParams.bottomMargin = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
                layoutParams.topMargin = tu0.G(3 * fk4.d().getDisplayMetrics().density);
                w12Var.setLayoutParams(layoutParams);
                w12Var.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 16.0f));
                v3c.y(new mo2(3, null, 1), w12Var);
                linearLayout.addView(w12Var);
                break;
            case 1:
                w53 w53Var = (w53) obj;
                bc7[] bc7VarArr2 = ProfileScreen.D0;
                ww9 ww9Var = new ww9(profileScreen, 23);
                Toolbar toolbar = new Toolbar(w53Var.getContext(), null);
                t53 t53Var = new t53(-1, -2);
                t53Var.a = 1;
                toolbar.setLayoutParams(t53Var);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                ww9Var.invoke(toolbar);
                w53Var.addView(toolbar);
                ww9 ww9Var2 = new ww9(profileScreen, 24);
                LinearLayout linearLayout2 = new LinearLayout(w53Var.getContext());
                linearLayout2.setId(wea.f1);
                t53 t53Var2 = new t53(-1, -2);
                t53Var2.a = 2;
                ((FrameLayout.LayoutParams) t53Var2).bottomMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
                linearLayout2.setLayoutParams(t53Var2);
                linearLayout2.setOrientation(1);
                ww9Var2.invoke(linearLayout2);
                w53Var.addView(linearLayout2);
                break;
            case 2:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                bc7[] bc7VarArr3 = ProfileScreen.D0;
                dlb dlbVar = new dlb(profileScreen, i);
                View fmVar = new fm(coordinatorLayout.getContext());
                fmVar.setId(wea.d1);
                fmVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                fmVar.setBackground(null);
                dlbVar.invoke(fmVar);
                coordinatorLayout.addView(fmVar);
                NestedScrollView nestedScrollView = new NestedScrollView(coordinatorLayout.getContext(), null);
                rw3 rw3Var = new rw3(-1, -1);
                rw3Var.b(new AppBarLayout$ScrollingViewBehavior());
                nestedScrollView.setLayoutParams(rw3Var);
                dlb dlbVar2 = new dlb(profileScreen, i2);
                LinearLayout linearLayout3 = new LinearLayout(nestedScrollView.getContext());
                linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout3.setOrientation(1);
                dlbVar2.invoke(linearLayout3);
                nestedScrollView.addView(linearLayout3);
                coordinatorLayout.addView(nestedScrollView);
                break;
            default:
                fm fmVar2 = (fm) obj;
                bc7[] bc7VarArr4 = ProfileScreen.D0;
                dlb dlbVar3 = new dlb(profileScreen, i3);
                w53 w53Var2 = new w53(fmVar2.getContext());
                dm dmVar = new dm(-1, -2);
                dmVar.a = 19;
                w53Var2.setLayoutParams(dmVar);
                w53Var2.setTitleEnabled(false);
                dlbVar3.invoke(w53Var2);
                fmVar2.addView(w53Var2);
                break;
        }
        return e5fVar;
    }
}
