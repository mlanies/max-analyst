package one.me.sdk.arch.activity;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.m56;
import defpackage.nec;
import defpackage.swb;
import defpackage.tpa;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004B%\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/sdk/arch/activity/ActivityWrapperWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "", "activityName", "Lkotlin/Function1;", "Landroid/content/Context;", "Le5f;", "startActivity", "(Ljava/lang/String;Lm56;)V", "arch_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ActivityWrapperWidget extends Widget implements Application.ActivityLifecycleCallbacks {
    public final String a;
    public final m56 b;

    public ActivityWrapperWidget() {
        super(null, 0, 3, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (tpa.f(nec.a(activity.getClass()).b(), this.a)) {
            getRouter().B(this);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityPaused(Activity activity) {
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // defpackage.uu3
    public final void onActivityStarted(Activity activity) {
    }

    @Override // defpackage.uu3
    public final void onActivityStopped(Activity activity) {
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((Application) viewGroup.getContext().getApplicationContext()).registerActivityLifecycleCallbacks(this);
        m56 m56Var = this.b;
        if (m56Var != null) {
            m56Var.invoke(viewGroup.getContext());
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(swb.arch_activity_wrapper_view_id);
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        ((Application) view.getContext().getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        super.onDestroyView(view);
    }

    public ActivityWrapperWidget(String str, m56 m56Var) {
        this();
        this.a = str;
        this.b = m56Var;
    }
}
