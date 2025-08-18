package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import java.util.List;

/* loaded from: classes.dex */
public final class ba8 implements IBinder.DeathRecipient {
    public final b98 a = new b98(this);
    public t94 b;
    public d98 c;
    public final Handler d;
    public final /* synthetic */ da8 e;

    public ba8(da8 da8Var, Looper looper) {
        this.e = da8Var;
        this.d = new Handler(looper, new hl4(5, this));
    }

    public final void a(f98 f98Var) {
        da8 da8Var = this.e;
        ca8 ca8Var = da8Var.l;
        int i = ca8Var.g;
        da8Var.l = new ca8(f98Var, ca8Var.b, ca8Var.c, ca8Var.d, ca8Var.e, ca8Var.f, i, ca8Var.h);
        k();
    }

    public final void b(boolean z) {
        a98 a98Var = this.e.b;
        a98Var.getClass();
        fm9.k(Looper.myLooper() == a98Var.X.getLooper());
        new Bundle().putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z);
        new y9d("androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED", Bundle.EMPTY);
        a98Var.o.getClass();
        y88.b();
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        i(8, null, null);
    }

    public final void c(Bundle bundle) {
        da8 da8Var = this.e;
        ai3 ai3Var = da8Var.m;
        da8Var.m = new ai3((m4b) ai3Var.a, (z9d) ai3Var.b, (k3b) ai3Var.c, (zw6) ai3Var.o, bundle, null);
        a98 a98Var = da8Var.b;
        a98Var.getClass();
        fm9.k(Looper.myLooper() == a98Var.X.getLooper());
        a98 a98Var2 = da8Var.b;
        a98Var.o.getClass();
    }

    public final void d(hd8 hd8Var) {
        da8 da8Var = this.e;
        ca8 ca8Var = da8Var.l;
        int i = ca8Var.g;
        da8Var.l = new ca8(ca8Var.a, ca8Var.b, hd8Var, ca8Var.d, ca8Var.e, ca8Var.f, i, ca8Var.h);
        k();
    }

    public final void e(i3b i3bVar) {
        da8 da8Var = this.e;
        ca8 ca8Var = da8Var.l;
        i3b i3bVarJ = da8.j(i3bVar);
        int i = ca8Var.g;
        da8Var.l = new ca8(ca8Var.a, i3bVarJ, ca8Var.c, ca8Var.d, ca8Var.e, ca8Var.f, i, ca8Var.h);
        k();
    }

    public final void f(List list) {
        da8 da8Var = this.e;
        ca8 ca8Var = da8Var.l;
        List listI = da8.i(list);
        int i = ca8Var.g;
        da8Var.l = new ca8(ca8Var.a, ca8Var.b, ca8Var.c, listI, ca8Var.e, ca8Var.f, i, ca8Var.h);
        k();
    }

    public final void g(CharSequence charSequence) {
        da8 da8Var = this.e;
        ca8 ca8Var = da8Var.l;
        int i = ca8Var.g;
        da8Var.l = new ca8(ca8Var.a, ca8Var.b, ca8Var.c, ca8Var.d, charSequence, ca8Var.f, i, ca8Var.h);
        k();
    }

    public final void h(String str, Bundle bundle) {
        if (str == null) {
            return;
        }
        a98 a98Var = this.e.b;
        a98Var.getClass();
        fm9.k(Looper.myLooper() == a98Var.X.getLooper());
        new y9d(str, Bundle.EMPTY);
        a98Var.o.getClass();
        y88.b();
    }

    public final void i(int i, Object obj, Bundle bundle) {
        t94 t94Var = this.b;
        if (t94Var != null) {
            Message messageObtainMessage = t94Var.obtainMessage(i, obj);
            if (bundle != null) {
                messageObtainMessage.setData(bundle);
            }
            messageObtainMessage.sendToTarget();
        }
    }

    public final void j(Handler handler) {
        if (handler != null) {
            t94 t94Var = new t94(this, handler.getLooper());
            this.b = t94Var;
            t94Var.b = true;
        } else {
            t94 t94Var2 = this.b;
            if (t94Var2 != null) {
                t94Var2.b = false;
                t94Var2.removeCallbacksAndMessages(null);
                this.b = null;
            }
        }
    }

    public final void k() {
        Handler handler = this.d;
        if (handler.hasMessages(1)) {
            return;
        }
        handler.sendEmptyMessageDelayed(1, 500L);
    }
}
