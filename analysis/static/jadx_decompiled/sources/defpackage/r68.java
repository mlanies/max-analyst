package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class r68 {
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public final Serializable e;
    public final Cloneable f;
    public final Cloneable g;
    public Object h;

    /* JADX WARN: Type inference failed for: r0v1, types: [float[], java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [float[], java.lang.Cloneable] */
    public r68() {
        this.c = new int[2];
        this.d = new float[2];
        this.e = new float[2];
        this.f = new float[2];
        this.g = new float[2];
        this.h = null;
        b();
    }

    public void a() {
        us usVar = ((cj8) this.h).X;
        s68 s68Var = (s68) this.d;
        b78 b78Var = s68Var.e;
        b78Var.getClass();
        if (usVar.get(((c78) b78Var).a.getBinder()) != s68Var) {
            int i = cj8.w0;
            return;
        }
        int i2 = this.b & 1;
        Bundle bundle = (Bundle) this.f;
        if (i2 != 0) {
            int i3 = cj8.w0;
        }
        try {
            b78 b78Var2 = s68Var.e;
            String str = (String) this.e;
            Bundle bundle2 = (Bundle) this.g;
            c78 c78Var = (c78) b78Var2;
            c78Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            c78Var.a(3, bundle3);
        } catch (RemoteException unused) {
        }
    }

    public void b() {
        this.a = false;
        this.b = 0;
        for (int i = 0; i < 2; i++) {
            ((int[]) this.c)[i] = -1;
        }
    }

    public void c() {
        if (this.a) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.c);
        }
        this.a = true;
        a();
    }

    public void d() {
        uf4 uf4Var;
        if (this.a) {
            this.a = false;
            b9b b9bVar = (b9b) this.h;
            if (b9bVar == null || (uf4Var = (uf4) b9bVar.c) == null || uf4Var.d) {
                return;
            }
            uf4Var.j.set(uf4Var.k);
        }
    }

    public r68(cj8 cj8Var, Object obj, s68 s68Var, String str, Bundle bundle) {
        this.h = cj8Var;
        this.d = s68Var;
        this.e = str;
        this.f = bundle;
        this.g = null;
        this.c = obj;
    }
}
