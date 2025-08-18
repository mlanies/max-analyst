package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaBrowserCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z68 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ z68(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.Y = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
        this.X = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                IBinder binder = ((c78) ((b78) this.b)).a.getBinder();
                gaa gaaVar = (gaa) this.Y;
                s68 s68Var = (s68) ((cj8) gaaVar.a).X.get(binder);
                if (s68Var == null) {
                    return;
                }
                cj8 cj8Var = (cj8) gaaVar.a;
                cj8Var.getClass();
                HashMap map = s68Var.f;
                String str = (String) this.c;
                List arrayList = (List) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    IBinder iBinder = (IBinder) this.o;
                    Bundle bundle = (Bundle) this.X;
                    if (!zHasNext) {
                        arrayList.add(new mpa(iBinder, bundle));
                        map.put(str, arrayList);
                        r68 r68Var = new r68(cj8Var, str, s68Var, str, bundle);
                        cj8Var.Y = s68Var;
                        if (bundle == null) {
                            r68Var.c();
                        } else {
                            r68Var.b = 1;
                            r68Var.c();
                        }
                        cj8Var.Y = null;
                        if (r68Var.a) {
                            cj8Var.Y = null;
                            return;
                        }
                        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + s68Var.a + " id=" + str);
                    }
                    mpa mpaVar = (mpa) it.next();
                    if (iBinder == mpaVar.a) {
                        Bundle bundle2 = (Bundle) mpaVar.b;
                        if (bundle == bundle2) {
                            return;
                        }
                        if (bundle == null) {
                            fm9.l(bundle2);
                            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1) {
                                return;
                            }
                        } else if (bundle2 == null) {
                            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1) {
                                return;
                            }
                        } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1)) {
                            return;
                        }
                    }
                }
                break;
            case 1:
                fld fldVar = (fld) this.Y;
                ArrayList arrayList2 = fldVar.s0;
                WeakHashMap weakHashMap = zmf.a;
                View view = (View) this.b;
                arrayList2.remove(omf.k(view));
                fldVar.t0.add(new eld(view, (ViewGroup) view.getParent()));
                ((ViewGroup) view.getParent()).removeView(view);
                if (fldVar.s0.size() == 0) {
                    View view2 = (View) this.c;
                    view2.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) this.o);
                    view2.setVisibility(4);
                    ((i50) this.X).g();
                    return;
                }
                return;
            default:
                try {
                    if (!(((dcd) this.b).a instanceof r0)) {
                        String string = ((UUID) this.c).toString();
                        h8g h8gVarL = ((k7g) this.Y).c.l(string);
                        if (h8gVarL == null || h8gVarL.b.a()) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((y9b) ((k7g) this.Y).b).g(string, (ay5) this.o);
                        ((Context) this.X).startService(uhe.c((Context) this.X, ju0.n(h8gVarL), (ay5) this.o));
                    }
                    ((dcd) this.b).j(null);
                    return;
                } catch (Throwable th) {
                    ((dcd) this.b).k(th);
                    return;
                }
        }
    }
}
