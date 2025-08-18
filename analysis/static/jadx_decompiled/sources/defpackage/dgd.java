package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import one.me.settings.SettingsListScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class dgd implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsListScreen b;

    public /* synthetic */ dgd(SettingsListScreen settingsListScreen, int i) {
        this.a = i;
        this.b = settingsListScreen;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        int i = 3;
        int i2 = 1;
        e5f e5fVar = e5f.a;
        SettingsListScreen settingsListScreen = this.b;
        switch (this.a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                bc7[] bc7VarArr = SettingsListScreen.B0;
                fm fmVar = new fm(coordinatorLayout.getContext());
                fmVar.setId(lha.g);
                fmVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                v3c.y(new ep9(3, null, 1), fmVar);
                settingsListScreen.y0 = fmVar;
                fmVar.setLiftOnScroll(true);
                dgd dgdVar = new dgd(settingsListScreen, i2);
                w53 w53Var = new w53(fmVar.getContext());
                w53Var.setId(lha.e);
                dm dmVar = new dm(-1, -2);
                dmVar.a = 19;
                w53Var.setLayoutParams(dmVar);
                w53Var.setTitleEnabled(false);
                dgdVar.invoke(w53Var);
                fmVar.addView(w53Var);
                coordinatorLayout.addView(fmVar);
                RecyclerView recyclerViewO0 = settingsListScreen.o0(24);
                rw3 rw3Var = new rw3(-1, -1);
                rw3Var.b(new AppBarLayout$ScrollingViewBehavior());
                recyclerViewO0.setLayoutParams(rw3Var);
                recyclerViewO0.setPaddingRelative(recyclerViewO0.getPaddingStart(), recyclerViewO0.getPaddingTop(), recyclerViewO0.getPaddingEnd(), tu0.G(12 * fk4.d().getDisplayMetrics().density));
                recyclerViewO0.setClipToPadding(false);
                recyclerViewO0.setItemAnimator(null);
                recyclerViewO0.setClipChildren(false);
                recyclerViewO0.j(new kq(9));
                recyclerViewO0.j(new kq(10));
                coordinatorLayout.addView(recyclerViewO0);
                break;
            case 1:
                w53 w53Var2 = (w53) obj;
                bc7[] bc7VarArr2 = SettingsListScreen.B0;
                dgd dgdVar2 = new dgd(settingsListScreen, 2);
                Toolbar toolbar = new Toolbar(w53Var2.getContext(), null);
                toolbar.setId(lha.h);
                t53 t53Var = new t53(-1, -2);
                t53Var.a = 1;
                toolbar.setLayoutParams(t53Var);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                dgdVar2.invoke(toolbar);
                w53Var2.addView(toolbar);
                w53Var2.addView(new wid(w53Var2.getContext()));
                break;
            case 2:
                Toolbar toolbar2 = (Toolbar) obj;
                bc7[] bc7VarArr3 = SettingsListScreen.B0;
                cla claVar = new cla(toolbar2.getContext(), 6);
                claVar.setId(lha.i);
                claVar.setForm(uka.a);
                claVar.setRightActions(new pka(null, new vka(woc.F, new dgd(settingsListScreen, i))));
                claVar.setLeftActions(new oka(new vka(woc.N1, new dgd(settingsListScreen, 4))));
                toolbar2.addView(claVar);
                break;
            case 3:
                bc7[] bc7VarArr4 = SettingsListScreen.B0;
                add addVarQ0 = settingsListScreen.q0();
                Long lT = addVarQ0.t();
                if (lT != null) {
                    pnf.o(addVarQ0.z0, new wgd(lT.longValue()));
                    break;
                }
                break;
            default:
                ((l67) settingsListScreen.X.getValue()).b();
                cgd.c.P1().b(":invite/qr", null);
                break;
        }
        return e5fVar;
    }
}
