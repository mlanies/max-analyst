package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class uh3 {
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public final int a;
    public final int b;
    public final qr6 c;
    public final PendingIntent d;
    public final z9d e;
    public final k3b f;
    public final k3b g;
    public final Bundle h;
    public final Bundle i;
    public final m4b j;
    public final zw6 k;

    static {
        int i = oaf.a;
        l = Integer.toString(0, 36);
        m = Integer.toString(1, 36);
        n = Integer.toString(2, 36);
        o = Integer.toString(9, 36);
        p = Integer.toString(3, 36);
        q = Integer.toString(4, 36);
        r = Integer.toString(5, 36);
        s = Integer.toString(6, 36);
        t = Integer.toString(11, 36);
        u = Integer.toString(7, 36);
        v = Integer.toString(8, 36);
        w = Integer.toString(10, 36);
    }

    public uh3(int i, int i2, qr6 qr6Var, PendingIntent pendingIntent, zw6 zw6Var, z9d z9dVar, k3b k3bVar, k3b k3bVar2, Bundle bundle, Bundle bundle2, m4b m4bVar) {
        this.a = i;
        this.b = i2;
        this.c = qr6Var;
        this.d = pendingIntent;
        this.k = zw6Var;
        this.e = z9dVar;
        this.f = k3bVar;
        this.g = k3bVar2;
        this.h = bundle;
        this.i = bundle2;
        this.j = m4bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [qr6] */
    public static uh3 a(Bundle bundle) {
        ffc ffcVarJ;
        or6 or6Var;
        IBinder binder = bundle.getBinder(w);
        if (binder instanceof th3) {
            return ((th3) binder).c;
        }
        int i = bundle.getInt(l, 0);
        int i2 = bundle.getInt(v, 0);
        IBinder binder2 = bundle.getBinder(m);
        binder2.getClass();
        IBinder iBinder = binder2;
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(n);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(o);
        if (parcelableArrayList != null) {
            ww6 ww6VarI = zw6.i();
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i3);
                bundle2.getClass();
                ww6VarI.a(c73.b(i2, bundle2));
            }
            ffcVarJ = ww6VarI.j();
        } else {
            ls5 ls5Var = zw6.b;
            ffcVarJ = ffc.X;
        }
        ffc ffcVar = ffcVarJ;
        Bundle bundle3 = bundle.getBundle(p);
        z9d z9dVarB = bundle3 == null ? z9d.b : z9d.b(bundle3);
        Bundle bundle4 = bundle.getBundle(r);
        k3b k3bVarC = bundle4 == null ? k3b.b : k3b.c(bundle4);
        Bundle bundle5 = bundle.getBundle(q);
        k3b k3bVarC2 = bundle5 == null ? k3b.b : k3b.c(bundle5);
        Bundle bundle6 = bundle.getBundle(s);
        Bundle bundle7 = bundle.getBundle(t);
        Bundle bundle8 = bundle.getBundle(u);
        m4b m4bVarR = bundle8 == null ? m4b.F : m4b.r(i2, bundle8);
        int i4 = sj8.i;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof qr6)) {
            or6 or6Var2 = new or6();
            or6Var2.c = iBinder;
            or6Var = or6Var2;
        } else {
            or6Var = (qr6) iInterfaceQueryLocalInterface;
        }
        return new uh3(i, i2, or6Var, pendingIntent, ffcVar, z9dVarB, k3bVarC2, k3bVarC, bundle6 == null ? Bundle.EMPTY : bundle6, bundle7 == null ? Bundle.EMPTY : bundle7, m4bVarR);
    }

    public final Bundle b(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(l, this.a);
        bundle.putBinder(m, this.c.asBinder());
        bundle.putParcelable(n, this.d);
        zw6 zw6Var = this.k;
        if (!zw6Var.isEmpty()) {
            bundle.putParcelableArrayList(o, nu0.R(zw6Var, new un0(24)));
        }
        z9d z9dVar = this.e;
        z9dVar.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        m5f it = z9dVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((y9d) it.next()).b());
        }
        bundle2.putParcelableArrayList(z9d.c, arrayList);
        bundle.putBundle(p, bundle2);
        k3b k3bVar = this.f;
        bundle.putBundle(q, k3bVar.f());
        k3b k3bVar2 = this.g;
        bundle.putBundle(r, k3bVar2.f());
        bundle.putBundle(s, this.h);
        bundle.putBundle(t, this.i);
        bundle.putBundle(u, this.j.q(j47.R(k3bVar, k3bVar2), false, false).t(i));
        bundle.putInt(v, this.b);
        return bundle;
    }
}
