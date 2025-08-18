package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class znc {
    public final nf0 a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public ViewGroup i;

    public znc() {
        nf0 nf0Var = new nf0();
        this.a = nf0Var;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.g = false;
        this.h = false;
        nf0Var.b = new ync(0, this);
    }

    public static void b(znc zncVar, ArrayList arrayList) {
        zncVar.getClass();
        nf0 nf0Var = zncVar.a;
        ArrayList arrayList2 = new ArrayList(nf0Var.a.size());
        Iterator itC = nf0Var.c();
        while (itC.hasNext()) {
            arrayList2.add(((coc) itC.next()).a);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            uu3 uu3Var = (uu3) it.next();
            if (uu3Var.getView() != null) {
                arrayList.add(uu3Var.getView());
            }
            Iterator<znc> it2 = uu3Var.getChildRouters().iterator();
            while (it2.hasNext()) {
                b(it2.next(), arrayList);
            }
        }
    }

    public static ArrayList l(Iterator it, boolean z) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        while (it.hasNext()) {
            coc cocVar = (coc) it.next();
            if (z2) {
                arrayList.add(cocVar);
            }
            z2 = (cocVar.b() == null || cocVar.b().d()) ? false : true;
            if (z && !z2) {
                break;
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public final void A() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                arrayList.clear();
                return;
            } else {
                zu3.c((wu3) arrayList.get(i));
                i++;
            }
        }
    }

    public final boolean B(uu3 uu3Var) {
        ft.e();
        nf0 nf0Var = this.a;
        coc cocVarA = nf0Var.a();
        ArrayDeque arrayDeque = nf0Var.a;
        if (cocVarA == null || cocVarA.a != uu3Var) {
            Iterator it = nf0Var.iterator();
            coc cocVar = null;
            zu3 zu3VarB = cocVarA != null ? cocVarA.b() : null;
            boolean z = (zu3VarB == null || zu3VarB.d()) ? false : true;
            coc cocVar2 = null;
            while (true) {
                u1 u1Var = (u1) it;
                if (!u1Var.hasNext()) {
                    break;
                }
                coc cocVar3 = (coc) u1Var.next();
                uu3 uu3Var2 = cocVar3.a;
                if (uu3Var2 == uu3Var) {
                    X(cocVar3);
                    arrayDeque.remove(cocVar3);
                    cocVar2 = cocVar3;
                } else if (cocVar2 != null) {
                    if (z && !uu3Var2.isAttached()) {
                        cocVar = cocVar3;
                    }
                }
            }
            if (cocVar2 != null) {
                y(cocVar, cocVar2, false);
            }
        } else {
            X(nf0Var.b());
            y(nf0Var.a(), cocVarA, false);
        }
        return this.e == 3 ? cocVarA != null : !arrayDeque.isEmpty();
    }

    public final boolean C() {
        ft.e();
        coc cocVarA = this.a.a();
        if (cocVarA != null) {
            return B(cocVarA.a);
        }
        throw new IllegalStateException("Trying to pop the current controller when there are none on the backstack.");
    }

    public final void D(String str) {
        coc cocVar;
        ft.e();
        ft.e();
        Iterator it = this.a.iterator();
        do {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return;
            } else {
                cocVar = (coc) u1Var.next();
            }
        } while (!str.equals(cocVar.b));
        E(cocVar);
    }

    public final void E(coc cocVar) {
        nf0 nf0Var = this.a;
        if (nf0Var.a.size() > 0) {
            coc cocVarA = nf0Var.a();
            ArrayList arrayList = new ArrayList();
            Iterator itC = nf0Var.c();
            while (itC.hasNext()) {
                coc cocVar2 = (coc) itC.next();
                arrayList.add(cocVar2);
                if (cocVar2 == cocVar) {
                    break;
                }
            }
            zu3 overriddenPopHandler = cocVarA.a.getOverriddenPopHandler();
            if (overriddenPopHandler == null) {
                overriddenPopHandler = cocVarA.d;
            }
            P(arrayList, overriddenPopHandler);
        }
    }

    public final void F() {
        this.c.clear();
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return;
            }
            coc cocVar = (coc) u1Var.next();
            String instanceId = cocVar.a.getInstanceId();
            HashMap map = zu3.c;
            boolean zK = np8.k(instanceId);
            uu3 uu3Var = cocVar.a;
            if (zK) {
                uu3Var.setNeedsAttach(true);
            }
            uu3Var.prepareForHostDetach();
        }
    }

    public final void G(coc cocVar) {
        ft.e();
        coc cocVarA = this.a.a();
        H(cocVar);
        y(cocVar, cocVarA, true);
    }

    public void H(coc cocVar) {
        nf0 nf0Var = this.a;
        ArrayDeque arrayDeque = nf0Var.a;
        if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (tpa.f(((coc) it.next()).a, cocVar.a)) {
                    throw new IllegalStateException("Trying to push a controller that already exists on the backstack.");
                }
            }
        }
        nf0Var.a.push(cocVar);
        ync yncVar = nf0Var.b;
        if (yncVar != null) {
            yncVar.d();
        }
    }

    public final void I() {
        ft.e();
        nf0 nf0Var = this.a;
        ArrayList arrayList = new ArrayList(nf0Var.a.size());
        Iterator itC = nf0Var.c();
        while (itC.hasNext()) {
            arrayList.add((coc) itC.next());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            coc cocVar = (coc) it.next();
            if (cocVar.a.getNeedsAttach()) {
                z(cocVar, null, true, new gqd(false));
            } else {
                S(cocVar.a);
            }
        }
    }

    public abstract void J(int i, String str);

    public final void K(yu3 yu3Var) {
        this.b.remove(yu3Var);
    }

    public final void L(coc cocVar) {
        ft.e();
        nf0 nf0Var = this.a;
        coc cocVarA = nf0Var.a();
        if (!nf0Var.a.isEmpty()) {
            X(nf0Var.b());
        }
        zu3 zu3VarB = cocVar.b();
        if (cocVarA != null) {
            boolean z = cocVarA.b() == null || cocVarA.b().d();
            boolean z2 = zu3VarB == null || zu3VarB.d();
            if (!z && z2) {
                Iterator it = l(nf0Var.iterator(), true).iterator();
                while (it.hasNext()) {
                    z(null, (coc) it.next(), true, zu3VarB);
                }
            }
        }
        H(cocVar);
        if (zu3VarB != null) {
            zu3VarB.a = true;
        }
        cocVar.c(zu3VarB);
        y(cocVar, cocVarA, true);
    }

    public abstract void M(String str, String[] strArr, int i);

    public void N(Bundle bundle) throws SecurityException {
        Bundle bundle2 = (Bundle) bundle.getParcelable("Router.backstack");
        this.e = au1.v(3)[bundle.getInt("Router.popRootControllerMode")];
        this.f = bundle.getBoolean("Router.onBackPressedDispatcherEnabled");
        nf0 nf0Var = this.a;
        nf0Var.getClass();
        ArrayList parcelableArrayList = bundle2.getParcelableArrayList("Backstack.entries");
        if (parcelableArrayList != null) {
            Collections.reverse(parcelableArrayList);
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                Bundle bundle3 = (Bundle) it.next();
                ArrayDeque arrayDeque = nf0Var.a;
                uu3 uu3VarNewInstance = uu3.newInstance(bundle3.getBundle("RouterTransaction.controller.bundle"));
                HashMap map = zu3.c;
                zu3 zu3VarP = np8.p(bundle3.getBundle("RouterTransaction.pushControllerChangeHandler"));
                zu3 zu3VarP2 = np8.p(bundle3.getBundle("RouterTransaction.popControllerChangeHandler"));
                arrayDeque.push(new coc(uu3VarNewInstance, bundle3.getString("RouterTransaction.tag"), zu3VarP, zu3VarP2, bundle3.getBoolean("RouterTransaction.attachedToRouter"), bundle3.getInt("RouterTransaction.transactionIndex")));
            }
        }
        ync yncVar = nf0Var.b;
        if (yncVar != null) {
            yncVar.d();
        }
        Iterator itC = nf0Var.c();
        while (itC.hasNext()) {
            S(((coc) itC.next()).a);
        }
    }

    public void O(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        nf0 nf0Var = this.a;
        nf0Var.getClass();
        ArrayDeque arrayDeque = nf0Var.a;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(arrayDeque.size());
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            coc cocVar = (coc) it.next();
            cocVar.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putBundle("RouterTransaction.controller.bundle", cocVar.a.saveInstanceState());
            zu3 zu3Var = cocVar.c;
            if (zu3Var != null) {
                bundle3.putBundle("RouterTransaction.pushControllerChangeHandler", zu3Var.j());
            }
            zu3 zu3Var2 = cocVar.d;
            if (zu3Var2 != null) {
                bundle3.putBundle("RouterTransaction.popControllerChangeHandler", zu3Var2.j());
            }
            bundle3.putString("RouterTransaction.tag", cocVar.b);
            bundle3.putInt("RouterTransaction.transactionIndex", cocVar.f);
            bundle3.putBoolean("RouterTransaction.attachedToRouter", cocVar.e);
            arrayList.add(bundle3);
        }
        bundle2.putParcelableArrayList("Backstack.entries", arrayList);
        bundle.putInt("Router.popRootControllerMode", au1.s(this.e));
        bundle.putBoolean("Router.onBackPressedDispatcherEnabled", this.f);
        bundle.putParcelable("Router.backstack", bundle2);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P(java.util.List r13, defpackage.zu3 r14) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.znc.P(java.util.List, zu3):void");
    }

    public final void Q(boolean z) {
        this.a.getSize();
        this.f = z;
    }

    public final void R(coc cocVar) {
        ft.e();
        P(Collections.singletonList(cocVar), cocVar.b());
    }

    public void S(uu3 uu3Var) {
        uu3Var.setRouter(this);
        uu3Var.onContextAvailable();
    }

    public abstract void T(Intent intent);

    public abstract void U(String str, Intent intent, int i);

    public abstract void V(String str, Intent intent, int i, Bundle bundle);

    public abstract void W(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle);

    public final void X(coc cocVar) {
        if (cocVar.a.isDestroyed()) {
            return;
        }
        ArrayList arrayList = this.d;
        uu3 uu3Var = cocVar.a;
        arrayList.add(uu3Var);
        uu3Var.addLifecycleListener(new ia3(5, this));
    }

    public abstract void Y(String str);

    public final void a(yu3 yu3Var) {
        ArrayList arrayList = this.b;
        if (arrayList.contains(yu3Var)) {
            return;
        }
        arrayList.add(yu3Var);
    }

    public void c(boolean z) {
        this.e = 3;
        nf0 nf0Var = this.a;
        nf0Var.getClass();
        ArrayList arrayList = new ArrayList();
        while (!nf0Var.a.isEmpty()) {
            arrayList.add(nf0Var.b());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            X((coc) it.next());
        }
        coc cocVar = null;
        if (z && arrayList.size() > 0) {
            coc cocVar2 = (coc) arrayList.get(0);
            cocVar2.a.addLifecycleListener(new joa((dv3) this, arrayList));
            zu3 overriddenPopHandler = cocVar2.a.getOverriddenPopHandler();
            if (overriddenPopHandler == null) {
                overriddenPopHandler = cocVar2.d;
            }
            z(null, cocVar2, false, overriddenPopHandler);
            cocVar = cocVar2;
        }
        if (arrayList.size() > 0) {
            nq9 nq9Var = new nq9();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                coc cocVar3 = (coc) it2.next();
                if (cocVar3 != cocVar) {
                    uu3 uu3Var = cocVar3.a;
                    av3 av3Var = av3.POP_EXIT;
                    uu3Var.changeStarted(nq9Var, av3Var);
                    cocVar3.a.changeEnded(nq9Var, av3Var);
                }
            }
        }
    }

    public abstract Activity d();

    public final ArrayList e() {
        nf0 nf0Var = this.a;
        ArrayList arrayList = new ArrayList(nf0Var.a.size());
        Iterator itC = nf0Var.c();
        while (itC.hasNext()) {
            arrayList.add((coc) itC.next());
        }
        return arrayList;
    }

    public final uu3 f(String str) {
        uu3 uu3VarFindController;
        Iterator it = this.a.iterator();
        do {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return null;
            }
            uu3VarFindController = ((coc) u1Var.next()).a.findController(str);
        } while (uu3VarFindController == null);
        return uu3VarFindController;
    }

    public final uu3 g(String str) {
        coc cocVar;
        Iterator it = this.a.iterator();
        do {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return null;
            }
            cocVar = (coc) u1Var.next();
        } while (!str.equals(cocVar.b));
        return cocVar.a;
    }

    public final i3a h() {
        Activity activityD = d();
        if (activityD instanceof yb3) {
            return ((yb3) activityD).E();
        }
        return null;
    }

    public abstract znc i();

    public abstract List j();

    public abstract fm5 k();

    public final boolean m() {
        nf0 nf0Var = this.a;
        if (nf0Var.a.isEmpty()) {
            return false;
        }
        if (nf0Var.a().a.handleBack()) {
            return true;
        }
        return (nf0Var.a.size() > 1 || this.e != 1) && C();
    }

    public final boolean n() {
        return this.a.getSize() > 0;
    }

    public abstract void o();

    public void p(Activity activity, boolean z) {
        this.g = false;
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setOnHierarchyChangeListener(null);
        }
        this.b.clear();
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                break;
            }
            coc cocVar = (coc) u1Var.next();
            cocVar.a.activityDestroyed(activity);
            Iterator<znc> it2 = cocVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().p(activity, z);
            }
        }
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            uu3 uu3Var = (uu3) arrayList.get(size);
            uu3Var.activityDestroyed(activity);
            Iterator<znc> it3 = uu3Var.getChildRouters().iterator();
            while (it3.hasNext()) {
                it3.next().p(activity, z);
            }
        }
        this.i = null;
    }

    public final void q(Activity activity) {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return;
            }
            coc cocVar = (coc) u1Var.next();
            cocVar.a.activityPaused(activity);
            Iterator<znc> it2 = cocVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().q(activity);
            }
        }
    }

    public final void r(Activity activity) {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return;
            }
            coc cocVar = (coc) u1Var.next();
            cocVar.a.activityResumed(activity);
            Iterator<znc> it2 = cocVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().r(activity);
            }
        }
    }

    public final void s(Activity activity) {
        this.h = false;
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return;
            }
            coc cocVar = (coc) u1Var.next();
            cocVar.a.activityStarted(activity);
            Iterator<znc> it2 = cocVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().s(activity);
            }
        }
    }

    public final void t(Activity activity) {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                this.h = true;
                return;
            }
            coc cocVar = (coc) u1Var.next();
            cocVar.a.activityStopped(activity);
            Iterator<znc> it2 = cocVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().t(activity);
            }
        }
    }

    public void u() {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return;
            } else {
                ((coc) u1Var.next()).a.onContextAvailable();
            }
        }
    }

    public final void v(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return;
            }
            coc cocVar = (coc) u1Var.next();
            cocVar.a.createOptionsMenu(menu, menuInflater);
            Iterator<znc> it2 = cocVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().v(menu, menuInflater);
            }
        }
    }

    public final boolean w(MenuItem menuItem) {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return false;
            }
            coc cocVar = (coc) u1Var.next();
            if (cocVar.a.optionsItemSelected(menuItem)) {
                return true;
            }
            Iterator<znc> it2 = cocVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                if (it2.next().w(menuItem)) {
                    return true;
                }
            }
        }
    }

    public final void x(Menu menu) {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return;
            }
            coc cocVar = (coc) u1Var.next();
            cocVar.a.prepareOptionsMenu(menu);
            Iterator<znc> it2 = cocVar.a.getChildRouters().iterator();
            while (it2.hasNext()) {
                it2.next().x(menu);
            }
        }
    }

    public void y(coc cocVar, coc cocVar2, boolean z) {
        zu3 overriddenPopHandler;
        if (z && cocVar != null) {
            cocVar.e = true;
        }
        if (z) {
            overriddenPopHandler = cocVar.b();
        } else if (cocVar2 != null) {
            overriddenPopHandler = cocVar2.a.getOverriddenPopHandler();
            if (overriddenPopHandler == null) {
                overriddenPopHandler = cocVar2.d;
            }
        } else {
            overriddenPopHandler = null;
        }
        z(cocVar, cocVar2, z, overriddenPopHandler);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(defpackage.coc r12, defpackage.coc r13, boolean r14, defpackage.zu3 r15) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L6
            uu3 r1 = r12.a
            goto L7
        L6:
            r1 = r0
        L7:
            if (r13 == 0) goto Lb
            uu3 r0 = r13.a
        Lb:
            r13 = 1
            r9 = 0
            if (r12 == 0) goto L23
            fm5 r2 = r11.k()
            int r3 = r12.f
            r4 = -1
            if (r3 != r4) goto L1f
            int r3 = r2.b
            int r3 = r3 + r13
            r2.b = r3
            r12.f = r3
        L1f:
            r11.S(r1)
            goto L44
        L23:
            nf0 r12 = r11.a
            java.util.ArrayDeque r12 = r12.a
            int r12 = r12.size()
            if (r12 != 0) goto L39
            int r12 = r11.e
            r2 = 2
            if (r12 != r2) goto L39
            nq9 r15 = new nq9
            r15.<init>()
        L37:
            r12 = r13
            goto L45
        L39:
            if (r14 != 0) goto L44
            if (r0 == 0) goto L44
            boolean r12 = r0.isAttached()
            if (r12 != 0) goto L44
            goto L37
        L44:
            r12 = r9
        L45:
            if (r14 == 0) goto L71
            if (r1 == 0) goto L71
            boolean r2 = r1.isDestroyed()
            if (r2 != 0) goto L50
            goto L71
        L50:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Trying to push a controller that has already been destroyed. ("
            r12.<init>(r13)
            java.lang.Class r13 = r1.getClass()
            java.lang.String r13 = r13.getSimpleName()
            r12.append(r13)
            java.lang.String r13 = ")"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L71:
            wu3 r10 = new wu3
            android.view.ViewGroup r6 = r11.i
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList r2 = r11.b
            r8.<init>(r2)
            r2 = r10
            r3 = r1
            r4 = r0
            r5 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.ArrayList r14 = r11.c
            int r2 = r14.size()
            if (r2 <= 0) goto L95
            if (r1 == 0) goto L91
            r1.setNeedsAttach(r13)
        L91:
            r14.add(r10)
            goto Lbc
        L95:
            if (r0 == 0) goto Lb9
            if (r15 == 0) goto L9f
            boolean r15 = r15.d()
            if (r15 == 0) goto Lb9
        L9f:
            boolean r15 = r11.g
            if (r15 != 0) goto Lb9
            if (r1 == 0) goto La8
            r1.setNeedsAttach(r13)
        La8:
            r14.add(r10)
            android.view.ViewGroup r14 = r11.i
            if (r14 == 0) goto Lbc
            u3c r15 = new u3c
            r1 = 7
            r15.<init>(r1, r11)
            r14.post(r15)
            goto Lbc
        Lb9:
            defpackage.zu3.c(r10)
        Lbc:
            if (r12 == 0) goto Ld1
            if (r0 == 0) goto Ld1
            android.view.View r11 = r0.getView()
            if (r11 == 0) goto Lce
            android.view.View r11 = r0.getView()
            r0.detach(r11, r13, r9)
            goto Ld1
        Lce:
            r0.destroy()
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.znc.z(coc, coc, boolean, zu3):void");
    }
}
