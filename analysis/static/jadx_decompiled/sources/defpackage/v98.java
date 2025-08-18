package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v98 implements ServiceConnection {
    public final Bundle a;
    public final /* synthetic */ w98 b;

    public v98(w98 w98Var, Bundle bundle) {
        this.b = w98Var;
        this.a = bundle;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        a98 a98Var = this.b.a;
        Objects.requireNonNull(a98Var);
        a98Var.G(new nn6(9, a98Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        w98 w98Var = this.b;
        try {
            try {
                boolean zEquals = w98Var.e.a.getPackageName().equals(componentName.getPackageName());
                a98 a98Var = w98Var.a;
                if (!zEquals) {
                    z04.u("Expected connection to " + w98Var.e.a.getPackageName() + " but is connected to " + componentName);
                    Objects.requireNonNull(a98Var);
                    a98Var.G(new nn6(9, a98Var));
                    return;
                }
                sr6 sr6VarK = aj8.k(iBinder);
                if (sr6VarK != null) {
                    sr6VarK.f0(w98Var.c, new oh3(w98Var.d.getPackageName(), Process.myPid(), this.a).b());
                } else {
                    z04.u("Service interface is missing.");
                    Objects.requireNonNull(a98Var);
                    a98Var.G(new nn6(9, a98Var));
                }
            } catch (RemoteException unused) {
                z04.c0("Service " + componentName + " has died prematurely");
                a98 a98Var2 = w98Var.a;
                Objects.requireNonNull(a98Var2);
                a98Var2.G(new nn6(9, a98Var2));
            }
        } catch (Throwable th) {
            a98 a98Var3 = w98Var.a;
            Objects.requireNonNull(a98Var3);
            a98Var3.G(new nn6(9, a98Var3));
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a98 a98Var = this.b.a;
        Objects.requireNonNull(a98Var);
        a98Var.G(new nn6(9, a98Var));
    }
}
