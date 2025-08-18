package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final /* synthetic */ class tc1 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallLinkInfoScreen b;

    public /* synthetic */ tc1(CallLinkInfoScreen callLinkInfoScreen, int i) {
        this.a = i;
        this.b = callLinkInfoScreen;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        e5f e5fVar = e5f.a;
        int i = 1;
        Continuation continuation = null;
        CallLinkInfoScreen callLinkInfoScreen = this.b;
        switch (this.a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                b46 b46Var = CallLinkInfoScreen.B0;
                fm fmVar = new fm(coordinatorLayout.getContext());
                fmVar.setId(r7a.n);
                fmVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                fmVar.setBackground(null);
                fmVar.setStateListAnimator(null);
                tc1 tc1Var = new tc1(callLinkInfoScreen, i);
                w53 w53Var = new w53(fmVar.getContext());
                dm dmVar = new dm(-1, -2);
                dmVar.a = 19;
                w53Var.setLayoutParams(dmVar);
                w53Var.setTitleEnabled(false);
                tc1Var.invoke(w53Var);
                fmVar.addView(w53Var);
                coordinatorLayout.addView(fmVar);
                RecyclerView recyclerView = new RecyclerView(coordinatorLayout.getContext(), null);
                recyclerView.setId(r7a.l);
                rw3 rw3Var = new rw3(-1, -1);
                rw3Var.b(new AppBarLayout$ScrollingViewBehavior());
                recyclerView.setLayoutParams(rw3Var);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter(callLinkInfoScreen.z0);
                recyclerView.setItemAnimator(null);
                recyclerView.j(new q1d(qp4.u0.j(recyclerView), new ync(15, callLinkInfoScreen), null, 12));
                recyclerView.j(new sc1(0));
                coordinatorLayout.addView(recyclerView);
                OneMeButton oneMeButton = new OneMeButton(coordinatorLayout.getContext(), null);
                oneMeButton.setId(r7a.o);
                oneMeButton.setSize(c7a.c);
                oneMeButton.setAppearance(z6a.a);
                rw3 rw3Var2 = new rw3(-1, -2);
                rw3Var2.c = 81;
                float f = 12;
                rw3Var2.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
                rw3Var2.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
                ((ViewGroup.MarginLayoutParams) rw3Var2).bottomMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
                ((ViewGroup.MarginLayoutParams) rw3Var2).topMargin = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                oneMeButton.setLayoutParams(rw3Var2);
                coordinatorLayout.addView(oneMeButton);
                v3c.y(new c3(callLinkInfoScreen, continuation, 3), coordinatorLayout);
                break;
            default:
                w53 w53Var2 = (w53) obj;
                b46 b46Var2 = CallLinkInfoScreen.B0;
                k8 k8Var = new k8(callLinkInfoScreen, 25);
                Toolbar toolbar = new Toolbar(w53Var2.getContext(), null);
                t53 t53Var = new t53(-1, -2);
                t53Var.a = 1;
                toolbar.setLayoutParams(t53Var);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                k8Var.invoke(toolbar);
                w53Var2.addView(toolbar);
                k8 k8Var2 = new k8(callLinkInfoScreen, 26);
                LinearLayout linearLayout = new LinearLayout(w53Var2.getContext());
                linearLayout.setId(r7a.p);
                t53 t53Var2 = new t53(-1, -2);
                t53Var2.a = 2;
                ((FrameLayout.LayoutParams) t53Var2).bottomMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
                linearLayout.setLayoutParams(t53Var2);
                linearLayout.setOrientation(1);
                k8Var2.invoke(linearLayout);
                w53Var2.addView(linearLayout);
                break;
        }
        return e5fVar;
    }
}
