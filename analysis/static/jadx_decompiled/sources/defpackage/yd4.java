package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class yd4 {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d;
    public boolean e;

    public yd4(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final void a(ovd ovdVar) {
        if (ovdVar.i) {
            k7d.a(ovdVar.a, ovdVar.c.V0(), this.a);
            ovdVar.i = false;
        }
    }

    public final void b(ArrayList arrayList, boolean z) throws Resources.NotFoundException {
        Object obj;
        Object next;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ovd ovdVar = (ovd) next;
            View view = ovdVar.c.U0;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4 && visibility != 8) {
                        throw new IllegalArgumentException(zr6.h(visibility, "Unknown visibility "));
                    }
                } else if (ovdVar.a != 2) {
                    break;
                }
            }
        }
        ovd ovdVar2 = (ovd) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            ovd ovdVar3 = (ovd) objPrevious;
            View view2 = ovdVar3.c.U0;
            if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (visibility2 != 4 && visibility2 != 8) {
                    throw new IllegalArgumentException(zr6.h(visibility2, "Unknown visibility "));
                }
            }
            if (ovdVar3.a == 2) {
                obj = objPrevious;
                break;
            }
        }
        ovd ovdVar4 = (ovd) obj;
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(ovdVar2);
            Objects.toString(ovdVar4);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        a aVar = ((ovd) x53.p0(arrayList)).c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            w06 w06Var = ((ovd) it2.next()).c.X0;
            w06 w06Var2 = aVar.X0;
            w06Var.b = w06Var2.b;
            w06Var.c = w06Var2.c;
            w06Var.d = w06Var2.d;
            w06Var.e = w06Var2.e;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            boolean z2 = false;
            if (!it3.hasNext()) {
                break;
            }
            ovd ovdVar5 = (ovd) it3.next();
            arrayList2.add(new sd4(ovdVar5, z));
            if (!z ? ovdVar5 == ovdVar4 : ovdVar5 == ovdVar2) {
                z2 = true;
            }
            xd4 xd4Var = new xd4(4, ovdVar5);
            int i = ovdVar5.a;
            a aVar2 = ovdVar5.c;
            if (i == 2) {
                if (z) {
                    w06 w06Var3 = aVar2.X0;
                } else {
                    aVar2.getClass();
                }
            } else if (z) {
                w06 w06Var4 = aVar2.X0;
            } else {
                aVar2.getClass();
            }
            if (ovdVar5.a == 2) {
                if (z) {
                    w06 w06Var5 = aVar2.X0;
                } else {
                    w06 w06Var6 = aVar2.X0;
                }
            }
            if (z2) {
                if (z) {
                    w06 w06Var7 = aVar2.X0;
                } else {
                    aVar2.getClass();
                }
            }
            arrayList3.add(xd4Var);
            ovdVar5.d.add(new pd4(this, ovdVar5, 0));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (!((xd4) next2).U1()) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            ((xd4) it5.next()).getClass();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((xd4) it6.next()).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            d63.V(((ovd) ((sd4) it7.next()).b).k, arrayList7);
        }
        boolean z3 = !arrayList7.isEmpty();
        Iterator it8 = arrayList2.iterator();
        boolean z4 = false;
        while (it8.hasNext()) {
            sd4 sd4Var = (sd4) it8.next();
            Context context = this.a.getContext();
            ovd ovdVar6 = (ovd) sd4Var.b;
            ph4 ph4VarZ1 = sd4Var.Z1(context);
            if (ph4VarZ1 != null) {
                if (((AnimatorSet) ph4VarZ1.b) == null) {
                    arrayList6.add(sd4Var);
                } else {
                    a aVar3 = ovdVar6.c;
                    if (!(!ovdVar6.k.isEmpty())) {
                        if (ovdVar6.a == 3) {
                            ovdVar6.i = false;
                        }
                        ovdVar6.j.add(new ud4(sd4Var));
                        z4 = true;
                    } else if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(aVar3);
                    }
                }
            }
        }
        Iterator it9 = arrayList6.iterator();
        while (it9.hasNext()) {
            sd4 sd4Var2 = (sd4) it9.next();
            ovd ovdVar7 = (ovd) sd4Var2.b;
            a aVar4 = ovdVar7.c;
            if (z3) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(aVar4);
                }
            } else if (!z4) {
                ovdVar7.j.add(new rd4(sd4Var2));
            } else if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(aVar4);
            }
        }
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d63.V(((ovd) it.next()).k, arrayList2);
        }
        List listD0 = x53.D0(x53.H0(arrayList2));
        int size = listD0.size();
        for (int i = 0; i < size; i++) {
            ((nvd) listD0.get(i)).b(this.a);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((ovd) arrayList.get(i2));
        }
        List listD02 = x53.D0(arrayList);
        int size3 = listD02.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ovd ovdVar = (ovd) listD02.get(i3);
            if (ovdVar.k.isEmpty()) {
                ovdVar.b();
            }
        }
    }

    public final void d(int i, int i2, e eVar) {
        synchronized (this.b) {
            try {
                ovd ovdVarF = f(eVar.c);
                if (ovdVarF == null) {
                    a aVar = eVar.c;
                    ovdVarF = aVar.y0 ? g(aVar) : null;
                }
                if (ovdVarF != null) {
                    ovdVarF.d(i, i2);
                    return;
                }
                ovd ovdVar = new ovd(i, i2, eVar);
                this.b.add(ovdVar);
                ovdVar.d.add(new pd4(this, ovdVar, 1));
                ovdVar.d.add(new pd4(this, ovdVar, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd4.e():void");
    }

    public final ovd f(a aVar) {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ovd ovdVar = (ovd) next;
            if (tpa.f(ovdVar.c, aVar) && !ovdVar.e) {
                break;
            }
        }
        return (ovd) next;
    }

    public final ovd g(a aVar) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ovd ovdVar = (ovd) next;
            if (tpa.f(ovdVar.c, aVar) && !ovdVar.e) {
                break;
            }
        }
        return (ovd) next;
    }

    public final void h() {
        boolean zIsAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                k();
                j(this.b);
                Iterator it = new ArrayList(this.c).iterator();
                while (it.hasNext()) {
                    ovd ovdVar = (ovd) it.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(ovdVar);
                    }
                    ovdVar.a(this.a);
                }
                Iterator it2 = new ArrayList(this.b).iterator();
                while (it2.hasNext()) {
                    ovd ovdVar2 = (ovd) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(ovdVar2);
                    }
                    ovdVar2.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        Object objPrevious;
        synchronized (this.b) {
            try {
                k();
                ArrayList arrayList = this.b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    ovd ovdVar = (ovd) objPrevious;
                    View view = ovdVar.c.U0;
                    char c = 4;
                    if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            c = 2;
                        } else if (visibility != 4) {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            c = 3;
                        }
                    }
                    if (ovdVar.a == 2 && c != 2) {
                        break;
                    }
                }
                this.e = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ovd ovdVar = (ovd) list.get(i);
            if (!ovdVar.h) {
                ovdVar.h = true;
                int i2 = ovdVar.b;
                e eVar = ovdVar.l;
                if (i2 == 2) {
                    a aVar = eVar.c;
                    View viewFindFocus = aVar.U0.findFocus();
                    if (viewFindFocus != null) {
                        aVar.a0().k = viewFindFocus;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            viewFindFocus.toString();
                            aVar.toString();
                        }
                    }
                    View viewV0 = ovdVar.c.V0();
                    if (viewV0.getParent() == null) {
                        eVar.b();
                        viewV0.setAlpha(0.0f);
                    }
                    if (viewV0.getAlpha() == 0.0f && viewV0.getVisibility() == 0) {
                        viewV0.setVisibility(4);
                    }
                    w06 w06Var = aVar.X0;
                    viewV0.setAlpha(w06Var == null ? 1.0f : w06Var.j);
                } else if (i2 == 3) {
                    a aVar2 = eVar.c;
                    View viewV02 = aVar2.V0();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(viewV02.findFocus());
                        viewV02.toString();
                        aVar2.toString();
                    }
                    viewV02.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d63.V(((ovd) it.next()).k, arrayList);
        }
        List listD0 = x53.D0(x53.H0(arrayList));
        int size2 = listD0.size();
        for (int i3 = 0; i3 < size2; i3++) {
            nvd nvdVar = (nvd) listD0.get(i3);
            if (!nvdVar.a) {
                nvdVar.d(this.a);
            }
            nvdVar.a = true;
        }
    }

    public final void k() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ovd ovdVar = (ovd) it.next();
            int i = 2;
            if (ovdVar.b == 2) {
                int visibility = ovdVar.c.V0().getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(zr6.h(visibility, "Unknown visibility "));
                        }
                        i = 3;
                    }
                }
                ovdVar.d(i, 1);
            }
        }
    }
}
