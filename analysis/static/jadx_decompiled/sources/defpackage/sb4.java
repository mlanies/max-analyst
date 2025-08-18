package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class sb4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ yb4 c;

    public /* synthetic */ sb4(yb4 yb4Var, ArrayList arrayList, int i) {
        this.a = i;
        this.c = yb4Var;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    yb4 yb4Var = this.c;
                    if (!zHasNext) {
                        arrayList.clear();
                        yb4Var.m.remove(arrayList);
                        break;
                    } else {
                        xb4 xb4Var = (xb4) it.next();
                        dec decVar = xb4Var.a;
                        yb4Var.getClass();
                        View view = decVar.a;
                        int i = xb4Var.d - xb4Var.b;
                        int i2 = xb4Var.e - xb4Var.c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        yb4Var.p.add(decVar);
                        viewPropertyAnimatorAnimate.setDuration(yb4Var.e).setListener(new ub4(yb4Var, decVar, i, view, i2, viewPropertyAnimatorAnimate)).start();
                    }
                }
            default:
                ArrayList arrayList2 = this.b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    yb4 yb4Var2 = this.c;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        yb4Var2.l.remove(arrayList2);
                        break;
                    } else {
                        dec decVar2 = (dec) it2.next();
                        yb4Var2.getClass();
                        View view2 = decVar2.a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                        yb4Var2.o.add(decVar2);
                        viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(yb4Var2.c).setListener(new tb4(yb4Var2, decVar2, view2, viewPropertyAnimatorAnimate2)).start();
                    }
                }
        }
    }
}
