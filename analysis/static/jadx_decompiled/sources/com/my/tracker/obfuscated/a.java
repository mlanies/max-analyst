package com.my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.my.tracker.obfuscated.a;
import defpackage.fre;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a {
    final t d;
    final z0 e;
    final Application f;
    final Runnable g;
    final Runnable h;
    final Runnable i;
    final Map a = new WeakHashMap();
    final Handler b = h.b;
    final AtomicBoolean c = new AtomicBoolean();
    long j = 0;
    long k = 0;

    /* renamed from: com.my.tracker.obfuscated.a$a, reason: collision with other inner class name */
    public final class C0000a implements Application.ActivityLifecycleCallbacks {
        public C0000a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            a.this.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            a.this.c(activity);
        }
    }

    private a(t tVar, z0 z0Var, Application application) {
        this.d = tVar;
        this.e = z0Var;
        this.f = application;
        final int i = 0;
        this.g = new Runnable(this) { // from class: qag
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                a aVar = this.b;
                switch (i2) {
                    case 0:
                        aVar.b();
                        break;
                    case 1:
                        aVar.c();
                        break;
                    default:
                        aVar.d();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.h = new Runnable(this) { // from class: qag
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        aVar.b();
                        break;
                    case 1:
                        aVar.c();
                        break;
                    default:
                        aVar.d();
                        break;
                }
            }
        };
        final int i3 = 2;
        this.i = new Runnable(this) { // from class: qag
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        aVar.b();
                        break;
                    case 1:
                        aVar.c();
                        break;
                    default:
                        aVar.d();
                        break;
                }
            }
        };
    }

    public void e() {
        if (this.c.get()) {
            h.b(this.h);
        }
    }

    public void f() {
        y0.a("ActivityHandler: timer tick for buffering period");
        this.d.a();
        e();
    }

    public static a a(t tVar, z0 z0Var, Application application) {
        return new a(tVar, z0Var, application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.c.get()) {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a(x0.a(this.e.e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        p0.a(this.f).c(x0.b(this.j));
    }

    public void a() {
        this.f.registerActivityLifecycleCallbacks(new C0000a());
    }

    public void c(Activity activity) {
        if (this.a.remove(activity) == null || !this.a.isEmpty()) {
            return;
        }
        this.c.set(false);
        this.b.removeCallbacks(this.g);
        this.j = System.currentTimeMillis();
        h.a(this.i);
    }

    public void d(Activity activity) {
        h.b(new fre(this, 28, activity));
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(Activity activity) {
        if (this.a.put(activity, Boolean.TRUE) != null || this.a.size() > 1) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.j >= x0.a(this.e.h()) && this.e.o()) {
            this.d.g();
            a(x0.a(this.e.e()));
            return;
        }
        long j = this.k - jCurrentTimeMillis;
        if (j > 0) {
            a(j);
        } else {
            f();
        }
    }

    public void a(long j) {
        this.b.removeCallbacks(this.g);
        this.c.set(true);
        this.b.postDelayed(this.g, j);
        this.k = System.currentTimeMillis() + j;
    }
}
