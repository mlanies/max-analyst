package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class gdc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ gdc(RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.b;
        switch (this.a) {
            case 0:
                if (recyclerView.I0 && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.G0) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.L0) {
                        recyclerView.s();
                        break;
                    } else {
                        recyclerView.K0 = true;
                        break;
                    }
                }
                break;
            default:
                mdc mdcVar = recyclerView.a1;
                if (mdcVar != null) {
                    yb4 yb4Var = (yb4) mdcVar;
                    ArrayList arrayList = yb4Var.h;
                    boolean z = !arrayList.isEmpty();
                    ArrayList arrayList2 = yb4Var.j;
                    boolean z2 = !arrayList2.isEmpty();
                    ArrayList arrayList3 = yb4Var.k;
                    boolean z3 = !arrayList3.isEmpty();
                    ArrayList arrayList4 = yb4Var.i;
                    boolean z4 = !arrayList4.isEmpty();
                    if (z || z2 || z4 || z3) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            dec decVar = (dec) it.next();
                            View view = decVar.a;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            yb4Var.q.add(decVar);
                            viewPropertyAnimatorAnimate.setDuration(yb4Var.d).alpha(0.0f).setListener(new tb4(yb4Var, decVar, viewPropertyAnimatorAnimate, view)).start();
                            arrayList = arrayList;
                        }
                        arrayList.clear();
                        if (z2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            yb4Var.m.add(arrayList5);
                            arrayList2.clear();
                            sb4 sb4Var = new sb4(yb4Var, arrayList5, 0);
                            if (z) {
                                View view2 = ((xb4) arrayList5.get(0)).a.a;
                                long j = yb4Var.d;
                                WeakHashMap weakHashMap = zmf.a;
                                view2.postOnAnimationDelayed(sb4Var, j);
                            } else {
                                sb4Var.run();
                            }
                        }
                        if (z3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            yb4Var.n.add(arrayList6);
                            arrayList3.clear();
                            h76 h76Var = new h76((Object) yb4Var, (Object) arrayList6, false, 4);
                            if (z) {
                                View view3 = ((wb4) arrayList6.get(0)).a.a;
                                long j2 = yb4Var.d;
                                WeakHashMap weakHashMap2 = zmf.a;
                                view3.postOnAnimationDelayed(h76Var, j2);
                            } else {
                                h76Var.run();
                            }
                        }
                        if (z4) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            yb4Var.l.add(arrayList7);
                            arrayList4.clear();
                            sb4 sb4Var2 = new sb4(yb4Var, arrayList7, 1);
                            if (z || z2 || z3) {
                                long jMax = Math.max(z2 ? yb4Var.e : 0L, z3 ? yb4Var.f : 0L) + (z ? yb4Var.d : 0L);
                                View view4 = ((dec) arrayList7.get(0)).a;
                                WeakHashMap weakHashMap3 = zmf.a;
                                view4.postOnAnimationDelayed(sb4Var2, jMax);
                            } else {
                                sb4Var2.run();
                            }
                        }
                    }
                }
                recyclerView.y1 = false;
                break;
        }
    }
}
