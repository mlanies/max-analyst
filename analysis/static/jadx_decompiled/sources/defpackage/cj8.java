package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class cj8 extends Service {
    public static final /* synthetic */ int w0 = 0;
    public s68 Y;
    public final cy Z;
    public x68 a;
    public ai8 s0;
    public final xi8 t0;
    public final ii8 u0;
    public final m5d v0;
    public final gaa b = new gaa(this);
    public final s68 c = new s68(this, "android.media.session.MediaController", -1, -1, null);
    public final ArrayList o = new ArrayList();
    public final us X = new us(0);

    public cj8(ii8 ii8Var) {
        cy cyVar = new cy();
        cyVar.b = this;
        this.Z = cyVar;
        this.t0 = xi8.a(ii8Var.f);
        this.u0 = ii8Var;
        this.v0 = new m5d(ii8Var);
    }

    public final void a(ai8 ai8Var) {
        attachBaseContext(this.u0.f);
        onCreate();
        if (ai8Var == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.s0 != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.s0 = ai8Var;
        x68 x68Var = this.a;
        x68Var.getClass();
        ((cj8) x68Var.d).Z.d(new i76((Object) x68Var, (Object) ai8Var, false, 8));
    }

    public final ph4 b(Bundle bundle) {
        x68 x68Var = this.a;
        x68Var.getClass();
        vi8 vi8VarK = x68Var.K();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        oh8 oh8Var = new oh8(vi8VarK, 0, 0, this.t0.b(vi8VarK), null, bundle);
        AtomicReference atomicReference = new AtomicReference();
        ae3 ae3Var = new ae3(false, 1);
        oaf.W(this.u0.l, new yg3(this, atomicReference, oh8Var, ae3Var, 8));
        try {
            ae3Var.a();
            mh8 mh8Var = (mh8) atomicReference.get();
            mh8Var.getClass();
            this.v0.p(vi8VarK, oh8Var, mh8Var.a, mh8Var.b);
            return j47.X;
        } catch (InterruptedException e) {
            z04.v("Couldn't get a result from onConnect", e);
            return null;
        }
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        x68 x68Var = this.a;
        x68Var.getClass();
        v68 v68Var = (v68) x68Var.b;
        v68Var.getClass();
        return v68Var.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        x68 x68Var = new x68(this);
        this.a = x68Var;
        x68Var.J();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.Z.b = null;
    }
}
