package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import androidx.mediarouter.app.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class sn implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.a) {
            case 0:
                bo boVar = (bo) this.b;
                if (!boVar.getInternalPopup().a()) {
                    boVar.t0.n(boVar.getTextDirection(), boVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = boVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                yn ynVar = (yn) this.b;
                bo boVar2 = ynVar.P0;
                ynVar.getClass();
                if (!boVar2.isAttachedToWindow() || !boVar2.getGlobalVisibleRect(ynVar.N0)) {
                    ynVar.dismiss();
                    break;
                } else {
                    ynVar.s();
                    ynVar.f();
                    break;
                }
                break;
            case 2:
                zz1 zz1Var = (zz1) this.b;
                if (zz1Var.a()) {
                    ArrayList arrayList = zz1Var.t0;
                    if (arrayList.size() > 0 && !((yz1) arrayList.get(0)).a.J0) {
                        View view = zz1Var.A0;
                        if (view == null || !view.isShown()) {
                            zz1Var.dismiss();
                            break;
                        } else {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((yz1) it.next()).a.f();
                            }
                            break;
                        }
                    }
                }
                break;
            case 3:
                d dVar = (d) this.b;
                dVar.O0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = dVar.R0;
                if (hashSet != null && hashSet.size() != 0) {
                    rf8 rf8Var = new rf8(0, dVar);
                    int firstVisiblePosition = dVar.O0.getFirstVisiblePosition();
                    boolean z = false;
                    for (int i = 0; i < dVar.O0.getChildCount(); i++) {
                        View childAt = dVar.O0.getChildAt(i);
                        if (dVar.R0.contains((dh8) dVar.P0.getItem(firstVisiblePosition + i))) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setDuration(dVar.s1);
                            alphaAnimation.setFillEnabled(true);
                            alphaAnimation.setFillAfter(true);
                            if (!z) {
                                alphaAnimation.setAnimationListener(rf8Var);
                                z = true;
                            }
                            childAt.clearAnimation();
                            childAt.startAnimation(alphaAnimation);
                        }
                    }
                    break;
                } else {
                    dVar.k(true);
                    break;
                }
                break;
            default:
                yxd yxdVar = (yxd) this.b;
                if (yxdVar.a() && !yxdVar.t0.J0) {
                    View view2 = yxdVar.y0;
                    if (view2 == null || !view2.isShown()) {
                        yxdVar.dismiss();
                        break;
                    } else {
                        yxdVar.t0.f();
                        break;
                    }
                }
                break;
        }
    }
}
