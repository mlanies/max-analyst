package com.bluelinelabs.conductor.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.fragment.app.a;
import defpackage.b8;
import defpackage.c54;
import defpackage.ie;
import defpackage.je;
import defpackage.w12;
import defpackage.wg7;
import defpackage.x53;
import defpackage.xg7;
import defpackage.yg7;
import defpackage.zg7;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bluelinelabs/conductor/internal/AndroidXLifecycleHandlerImpl;", "Landroidx/fragment/app/a;", "Lwg7;", "Lyg7;", "<init>", "()V", "conductor_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidXLifecycleHandlerImpl extends a implements wg7, yg7 {
    public final xg7 l1 = new xg7(true);

    public AndroidXLifecycleHandlerImpl() {
        a1();
        Y0(true);
    }

    @Override // defpackage.wg7
    public final void A(String str, Intent intent, int i, Bundle bundle) {
        f1(i, str);
        d1(intent, i, bundle);
    }

    @Override // androidx.fragment.app.a
    public final void A0() {
        this.S0 = true;
        getL1().e = false;
        Activity activity = getL1().b;
        if (activity != null) {
            c54.r(this, activity.isChangingConfigurations());
        }
    }

    @Override // defpackage.wg7
    public final void B(int i, String str) {
        f1(i, str);
    }

    @Override // defpackage.wg7
    public final void E(String str, String[] strArr, int i) {
        c54.G(this, str, strArr, i);
    }

    @Override // androidx.fragment.app.a
    public final boolean G0(MenuItem menuItem) {
        return c54.C(this, menuItem, new ie(this, menuItem));
    }

    @Override // defpackage.wg7
    public final void H(Activity activity) {
        c54.F(this, activity, this);
    }

    @Override // androidx.fragment.app.a
    public final void I0(Menu menu) {
        Iterator it = c54.w(this).iterator();
        while (it.hasNext()) {
            ((b8) it.next()).x(menu);
        }
    }

    @Override // androidx.fragment.app.a
    public final void J0(int i, String[] strArr, int[] iArr) {
        c54.D(this, i, strArr, iArr);
    }

    @Override // androidx.fragment.app.a
    public final void L0(Bundle bundle) {
        c54.E(this, bundle);
    }

    @Override // defpackage.wg7
    public final List U() {
        return x53.D0(this.l1.j.values());
    }

    @Override // defpackage.wg7
    public final Activity a() {
        return this.l1.b;
    }

    @Override // defpackage.yg7
    /* renamed from: c, reason: from getter */
    public final xg7 getL1() {
        return this.l1;
    }

    @Override // defpackage.wg7
    public final b8 e(w12 w12Var, Bundle bundle) {
        return c54.v(this, w12Var, bundle, this);
    }

    public final void e1() {
        c54.B(this);
    }

    public final void f1(int i, String str) {
        getL1().h.put(i, str);
    }

    @Override // defpackage.wg7
    public final void g(String str) {
        c54.H(this, str);
    }

    @Override // defpackage.yg7
    public final void j(String str, String[] strArr, int i) {
        c54.G(this, str, strArr, i);
    }

    @Override // defpackage.wg7
    public final void l(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        je jeVar = new je(this, intentSender, i, intent, i2, i3, i4, bundle, 0);
        f1(i, str);
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
        e1();
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

    @Override // androidx.fragment.app.a
    public final void s0(int i, int i2, Intent intent) {
        super.s0(i, i2, intent);
        c54.y(this, i, i2, intent);
    }

    @Override // androidx.fragment.app.a
    public final void u0(Context context) {
        super.u0(context);
        c54.z(this, context);
    }

    @Override // androidx.fragment.app.a
    public final void v0(Bundle bundle) {
        super.v0(bundle);
        c54.A(this, bundle);
    }

    @Override // androidx.fragment.app.a
    public final void w0(Menu menu, MenuInflater menuInflater) {
        Iterator it = c54.w(this).iterator();
        while (it.hasNext()) {
            ((b8) it.next()).v(menu, menuInflater);
        }
    }

    @Override // androidx.fragment.app.a
    public final void y0() {
        this.S0 = true;
        c54.B(this);
    }
}
