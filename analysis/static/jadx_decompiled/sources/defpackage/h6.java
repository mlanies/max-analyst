package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.K0 = null;
                actionBarOverlayLayout.x0 = false;
                break;
            case 11:
                ((xof) this.b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.K0 = null;
                actionBarOverlayLayout.x0 = false;
                break;
            case 1:
                sf sfVar = (sf) this.b;
                ArrayList arrayList = new ArrayList(sfVar.X);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((le) arrayList.get(i)).a(sfVar);
                }
                break;
            case 2:
                super.onAnimationEnd(animator);
                ck0 ck0Var = (ck0) this.b;
                y7f y7fVarK = mqd.k(ck0Var);
                Iterator it = ck0Var.z0.iterator();
                while (it.hasNext()) {
                    ((ViewOverlay) y7fVarK.b).remove((uwe) it.next());
                }
                break;
            case 3:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                bottomSheetBehavior.L(5);
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.U.get()).requestLayout();
                    break;
                }
                break;
            case 4:
                qs4 qs4Var = (qs4) this.b;
                qs4Var.q();
                qs4Var.r.start();
                break;
            case 5:
                in5 in5Var = ((jn5) this.b).u0;
                if (in5Var != null) {
                    in5Var.a();
                    break;
                }
                break;
            case 6:
                ((HideBottomViewOnScrollBehavior) this.b).h = null;
                break;
            case 7:
            default:
                super.onAnimationEnd(animator);
                break;
            case 8:
                a18 a18Var = (a18) this.b;
                a18Var.b.setTranslationY(0.0f);
                a18Var.b(0.0f);
                break;
            case 9:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                sideSheetBehavior.y(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    break;
                }
                break;
            case 10:
                ((w1f) this.b).n();
                animator.removeListener(this);
                break;
            case 11:
                ((xof) this.b).c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 7:
                super.onAnimationRepeat(animator);
                oh7 oh7Var = (oh7) this.b;
                oh7Var.Z = (oh7Var.Z + 1) % oh7Var.Y.c.length;
                oh7Var.s0 = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                sf sfVar = (sf) this.b;
                ArrayList arrayList = new ArrayList(sfVar.X);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((le) arrayList.get(i)).b(sfVar);
                }
                break;
            case 11:
                ((xof) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public h6(xof xofVar, View view) {
        this.a = 11;
        this.b = xofVar;
    }
}
