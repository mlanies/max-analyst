package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class i76 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ i76(ViewGroup viewGroup, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        uq8 uq8Var;
        dr6 dr6Var;
        Set set;
        dr6 rkgVar = null;
        switch (this.a) {
            case 0:
                a76 a76Var = (a76) this.c;
                try {
                    a76Var.a(kq0.n((Future) this.b));
                    return;
                } catch (Error | RuntimeException e) {
                    a76Var.d(e);
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause = e2.getCause();
                    if (cause == null) {
                        a76Var.d(e2);
                        return;
                    } else {
                        a76Var.d(cause);
                        return;
                    }
                }
            case 1:
                e7 e7Var = (e7) this.c;
                wq8 wq8Var = e7Var.c;
                if (wq8Var != null && (uq8Var = wq8Var.X) != null) {
                    uq8Var.Q(wq8Var);
                }
                View view = (View) e7Var.s0;
                if (view != null && view.getWindowToken() != null) {
                    b7 b7Var = (b7) this.b;
                    if (b7Var.b()) {
                        e7Var.D0 = b7Var;
                    } else if (b7Var.f != null) {
                        b7Var.d(0, 0, false, false);
                        e7Var.D0 = b7Var;
                    }
                }
                e7Var.F0 = null;
                return;
            case 2:
                tu0 tu0Var = (tu0) ((mfe) this.b).a;
                if (tu0Var != null) {
                    tu0Var.x((Typeface) this.c);
                    return;
                }
                return;
            case 3:
                y15 y15Var = (y15) this.b;
                if (((AtomicBoolean) y15Var.b).compareAndSet(true, false)) {
                    EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.c;
                    endlessRecyclerView2.Y();
                    endlessRecyclerView2.post(new re(18, y15Var));
                    return;
                }
                return;
            case 4:
                qqe.b((TextView) this.b, (yl5) this.c);
                return;
            case 5:
                rod rodVar = (rod) this.c;
                a4c a4cVar = rodVar.b;
                StringBuilder sb = new StringBuilder("<!> send retry -> ");
                d14 d14Var = (d14) this.b;
                sb.append(d14Var);
                a4cVar.log("OKSignaling", sb.toString());
                rodVar.g.f(d14Var.a);
                return;
            case 6:
                f77 f77Var = (f77) this.c;
                RecyclerView recyclerView = f77Var.C0;
                if (recyclerView == null || !recyclerView.G0) {
                    return;
                }
                b77 b77Var = (b77) this.b;
                if (b77Var.k || b77Var.e.g() == -1) {
                    return;
                }
                mdc itemAnimator = f77Var.C0.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.f()) {
                    ArrayList arrayList = f77Var.A0;
                    int size = arrayList.size();
                    while (i < size) {
                        if (((b77) arrayList.get(i)).l) {
                            i++;
                        }
                    }
                    f77Var.x0.getClass();
                    return;
                }
                f77Var.C0.post(this);
                return;
            case 7:
                synchronized (((bn7) this.c).c) {
                    try {
                        Object objApply = ((bn7) this.c).o.apply(this.b);
                        bn7 bn7Var = (bn7) this.c;
                        Object obj = bn7Var.a;
                        if (obj == null && objApply != null) {
                            bn7Var.a = objApply;
                            bn7Var.X.i(objApply);
                        } else if (obj != null && !obj.equals(objApply)) {
                            bn7 bn7Var2 = (bn7) this.c;
                            bn7Var2.a = objApply;
                            bn7Var2.X.i(objApply);
                        }
                    } finally {
                    }
                }
                return;
            case 8:
                t68 t68Var = (t68) this.c;
                ArrayList arrayList2 = (ArrayList) t68Var.a;
                boolean zIsEmpty = arrayList2.isEmpty();
                ai8 ai8Var = (ai8) this.b;
                if (!zIsEmpty) {
                    pr6 pr6VarA = ai8Var.a();
                    if (pr6VarA != null) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            ((Bundle) it.next()).putBinder("extra_session_binder", pr6VarA.asBinder());
                        }
                    }
                    arrayList2.clear();
                }
                v68 v68Var = (v68) t68Var.b;
                v68Var.getClass();
                MediaSession.Token token = (MediaSession.Token) ai8Var.b;
                token.getClass();
                v68Var.setSessionToken(token);
                return;
            case 9:
                IBinder binder = ((c78) ((b78) this.b)).a.getBinder();
                s68 s68Var = (s68) ((cj8) ((gaa) this.c).a).X.remove(binder);
                if (s68Var != null) {
                    binder.unlinkToDeath(s68Var, 0);
                    return;
                }
                return;
            case 10:
                ((dy8) this.b).setLayout((by8) this.c);
                return;
            case 11:
                jz9 jz9Var = (jz9) this.c;
                try {
                    jz9Var.a.onError((Throwable) this.b);
                    return;
                } finally {
                    jz9Var.o.g();
                }
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((s1a) this.c).a.a((iq1) this.b);
                return;
            case 13:
                super/*android.view.View*/.invalidateDrawable((Drawable) this.c);
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((yia) this.b).removeCallbacks((Runnable) this.c);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                bc7[] bc7VarArr = ProfileChangeLinkScreen.v0;
                ProfileChangeLinkScreen profileChangeLinkScreen = (ProfileChangeLinkScreen) this.c;
                profileChangeLinkScreen.getClass();
                RecyclerView recyclerView2 = (RecyclerView) profileChangeLinkScreen.u0.T0(profileChangeLinkScreen, ProfileChangeLinkScreen.v0[5]);
                recyclerView2.setPadding(recyclerView2.getPaddingLeft(), ((View) this.b).getMeasuredHeight(), recyclerView2.getPaddingRight(), recyclerView2.getPaddingBottom());
                return;
            case 16:
                bc7[] bc7VarArr2 = ProfileEditAdminPermissionsWidget.x0;
                ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = (ProfileEditAdminPermissionsWidget) this.b;
                profileEditAdminPermissionsWidget.getClass();
                RecyclerView recyclerView3 = (RecyclerView) profileEditAdminPermissionsWidget.t0.T0(profileEditAdminPermissionsWidget, ProfileEditAdminPermissionsWidget.x0[4]);
                OneMeButton oneMeButton = (OneMeButton) this.c;
                int measuredHeight = oneMeButton.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = oneMeButton.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
                ViewGroup.LayoutParams layoutParams2 = oneMeButton.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                recyclerView3.setPadding(recyclerView3.getPaddingLeft(), recyclerView3.getPaddingTop(), recyclerView3.getPaddingRight(), i + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0));
                return;
            case LangUtils.HASH_SEED /* 17 */:
                ((ry1) this.c).b((nx3) this.b);
                return;
            case 18:
                ry1 ry1Var = (ry1) this.b;
                try {
                    ry1Var.resumeWith(((bm7) this.c).get());
                    return;
                } catch (Throwable th) {
                    Throwable cause2 = th.getCause();
                    if (cause2 == null) {
                        cause2 = th;
                    }
                    if (th instanceof CancellationException) {
                        ry1Var.cancel(cause2);
                        return;
                    } else {
                        ry1Var.resumeWith(new njc(cause2));
                        return;
                    }
                }
            case 19:
                try {
                    ((Runnable) this.c).run();
                    synchronized (((qm) this.b).X) {
                        ((qm) this.b).a();
                    }
                    return;
                } catch (Throwable th2) {
                    synchronized (((qm) this.b).X) {
                        ((qm) this.b).a();
                        throw th2;
                    }
                }
            case 20:
                List list = (List) this.b;
                int size2 = list.size();
                while (i < size2) {
                    View view2 = (View) list.get(i);
                    WeakHashMap weakHashMap = zmf.a;
                    omf.v(view2, (String) ((fld) this.c).Z.get(omf.k(view2)));
                    i++;
                }
                return;
            case 21:
                bc7[] bc7VarArr3 = StickersScreen.v0;
                RecyclerView recyclerViewM0 = ((StickersScreen) this.c).m0();
                recyclerViewM0.setPadding(recyclerViewM0.getPaddingLeft(), ((View) this.b).getMeasuredHeight(), recyclerViewM0.getPaddingRight(), recyclerViewM0.getPaddingBottom());
                return;
            case 22:
                EndlessRecyclerView2 endlessRecyclerView22 = (EndlessRecyclerView2) this.b;
                ViewGroup.LayoutParams layoutParams3 = endlessRecyclerView22.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                bc7[] bc7VarArr4 = StickersSearchScreen.u0;
                StickersSearchScreen stickersSearchScreen = (StickersSearchScreen) this.c;
                stickersSearchScreen.getClass();
                marginLayoutParams3.topMargin = ((eha) stickersSearchScreen.Y.T0(stickersSearchScreen, StickersSearchScreen.u0[2])).getMeasuredHeight();
                endlessRecyclerView22.setLayoutParams(marginLayoutParams3);
                return;
            case 23:
                dnf dnfVar = ((SwipeDismissBehavior) this.c).a;
                if (dnfVar == null || !dnfVar.f()) {
                    return;
                }
                WeakHashMap weakHashMap2 = zmf.a;
                ((View) this.b).postOnAnimation(this);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                rne rneVar = (rne) this.b;
                try {
                    rneVar.c(((Callable) this.c).call());
                    return;
                } catch (CancellationException unused) {
                    rneVar.a();
                    return;
                } catch (Exception e3) {
                    rneVar.b(e3);
                    return;
                }
            case 25:
                ((s0f) this.b).o = true;
                ((t0f) this.c).a.remove((s0f) this.b);
                return;
            case 26:
                if (((j7g) this.c).a.a instanceof r0) {
                    return;
                }
                try {
                    ay5 ay5Var = (ay5) ((dcd) this.b).get();
                    if (ay5Var == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((j7g) this.c).c.c + ") but did not provide ForegroundInfo");
                    }
                    a14.u().n(j7g.Z, "Updating notification for " + ((j7g) this.c).c.c);
                    j7g j7gVar = (j7g) this.c;
                    dcd dcdVar = j7gVar.a;
                    dy5 dy5Var = j7gVar.X;
                    Context context = j7gVar.b;
                    UUID id = j7gVar.o.getId();
                    k7g k7gVar = (k7g) dy5Var;
                    k7gVar.getClass();
                    dcd dcdVar2 = new dcd();
                    k7gVar.a.l(new z68(k7gVar, dcdVar2, id, ay5Var, context, 2));
                    dcdVar.l(dcdVar2);
                    return;
                } catch (Throwable th3) {
                    ((j7g) this.c).a.k(th3);
                    return;
                }
            case 27:
                if (((v8g) this.c).B0.a instanceof r0) {
                    return;
                }
                try {
                    ((bm7) this.b).get();
                    a14.u().n(v8g.D0, "Starting work for " + ((v8g) this.c).X.c);
                    v8g v8gVar = (v8g) this.c;
                    v8gVar.B0.l(v8gVar.Y.startWork());
                    return;
                } catch (Throwable th4) {
                    ((v8g) this.c).B0.k(th4);
                    return;
                }
            case 28:
                od odVar = (od) this.c;
                kdg kdgVar = (kdg) ((ie6) odVar.Y).u0.get((zk) odVar.c);
                if (kdgVar == null) {
                    return;
                }
                ph3 ph3Var = (ph3) this.b;
                if ((ph3Var.b == 0 ? 1 : 0) == 0) {
                    kdgVar.m(ph3Var, null);
                    return;
                }
                odVar.a = true;
                ok okVar = (ok) odVar.b;
                if (okVar.j()) {
                    if (!odVar.a || (dr6Var = (dr6) odVar.o) == null) {
                        return;
                    }
                    okVar.k(dr6Var, (Set) odVar.X);
                    return;
                }
                try {
                    okVar.k(null, okVar.a());
                    return;
                } catch (SecurityException unused2) {
                    okVar.b("Failed to get service from broker.");
                    kdgVar.m(new ph3(10), null);
                    return;
                }
            default:
                qeg qegVar = (qeg) this.b;
                ph3 ph3Var2 = qegVar.b;
                i = ph3Var2.b == 0 ? 1 : 0;
                xdg xdgVar = (xdg) this.c;
                if (i != 0) {
                    weg wegVar = qegVar.c;
                    fp3.n(wegVar);
                    ph3 ph3Var3 = wegVar.c;
                    if (ph3Var3.b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(ph3Var3)), new Exception());
                        xdgVar.j.i(ph3Var3);
                        xdgVar.i.disconnect();
                        return;
                    }
                    od odVar2 = xdgVar.j;
                    IBinder iBinder = wegVar.b;
                    if (iBinder != null) {
                        int i2 = w4.d;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        rkgVar = iInterfaceQueryLocalInterface instanceof dr6 ? (dr6) iInterfaceQueryLocalInterface : new rkg(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                    }
                    odVar2.getClass();
                    if (rkgVar == null || (set = xdgVar.g) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        odVar2.i(new ph3(4));
                    } else {
                        odVar2.o = rkgVar;
                        odVar2.X = set;
                        if (odVar2.a) {
                            ((ok) odVar2.b).k(rkgVar, set);
                        }
                    }
                } else {
                    xdgVar.j.i(ph3Var2);
                }
                xdgVar.i.disconnect();
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return i76.class.getSimpleName() + "," + ((a76) this.c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i76(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ i76(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public i76(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = 23;
        this.c = swipeDismissBehavior;
        this.b = view;
    }

    public i76(f77 f77Var, b77 b77Var, int i) {
        this.a = 6;
        this.c = f77Var;
        this.b = b77Var;
    }
}
