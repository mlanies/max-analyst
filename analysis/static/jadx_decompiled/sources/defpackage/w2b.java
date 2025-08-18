package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class w2b extends Fragment implements wg7, yg7 {
    public final xg7 a = new xg7(false);

    public w2b() {
        setRetainInstance(true);
        setHasOptionsMenu(true);
    }

    @Override // defpackage.wg7
    public final void A(String str, Intent intent, int i, Bundle bundle) {
        h(i, str);
        startActivityForResult(intent, i, bundle);
    }

    @Override // defpackage.wg7
    public final void B(int i, String str) {
        h(i, str);
    }

    @Override // defpackage.wg7
    public final void E(String str, String[] strArr, int i) {
        c54.G(this, str, strArr, i);
    }

    @Override // defpackage.wg7
    public final void H(Activity activity) {
        c54.F(this, activity, this);
    }

    @Override // defpackage.wg7
    public final List U() {
        return x53.D0(this.a.j.values());
    }

    @Override // defpackage.wg7
    public final Activity a() {
        return this.a.b;
    }

    @Override // defpackage.yg7
    /* renamed from: c */
    public final xg7 getL1() {
        return this.a;
    }

    @Override // defpackage.wg7
    public final b8 e(w12 w12Var, Bundle bundle) {
        return c54.v(this, w12Var, bundle, this);
    }

    public final void f() {
        c54.B(this);
    }

    @Override // defpackage.wg7
    public final void g(String str) {
        c54.H(this, str);
    }

    public final void h(int i, String str) {
        getL1().h.put(i, str);
    }

    @Override // defpackage.yg7
    public final void j(String str, String[] strArr, int i) {
        c54.G(this, str, strArr, i);
    }

    @Override // defpackage.wg7
    public final void l(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        je jeVar = new je(this, intentSender, i, intent, i2, i3, i4, bundle, 1);
        h(i, str);
        jeVar.invoke();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        c54.P(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zg7.a.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c54.Q(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        if (getL1().b != activity || activity.isChangingConfigurations()) {
            return;
        }
        f();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        c54.y(this, i, i2, intent);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c54.R(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c54.S(this, activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c54.T(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c54.U(this, activity);
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        c54.z(this, activity);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c54.A(this, bundle);
    }

    @Override // android.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        Iterator it = c54.w(this).iterator();
        while (it.hasNext()) {
            ((b8) it.next()).v(menu, menuInflater);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c54.B(this);
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        getL1().e = false;
        Activity activity = getL1().b;
        if (activity != null) {
            c54.r(this, activity.isChangingConfigurations());
        }
    }

    @Override // android.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return c54.C(this, menuItem, new v2b(this, 0, menuItem));
    }

    @Override // android.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        Iterator it = c54.w(this).iterator();
        while (it.hasNext()) {
            ((b8) it.next()).x(menu);
        }
    }

    @Override // android.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        c54.D(this, i, strArr, iArr);
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        c54.E(this, bundle);
    }

    @Override // android.app.Fragment
    public final boolean shouldShowRequestPermissionRationale(String str) {
        Boolean boolValueOf;
        v2b v2bVar = new v2b(this, 1, str);
        Iterator it = c54.w(this).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((b8) it.next()).a.iterator();
            while (true) {
                u1 u1Var = (u1) it2;
                if (!u1Var.hasNext()) {
                    boolValueOf = null;
                    break;
                }
                coc cocVar = (coc) u1Var.next();
                if (cocVar.a.didRequestPermission(str)) {
                    boolValueOf = Boolean.valueOf(cocVar.a.shouldShowRequestPermissionRationale(str));
                    break;
                }
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
        }
        return ((Boolean) v2bVar.invoke()).booleanValue();
    }

    @Override // android.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        c54.z(this, context);
    }
}
