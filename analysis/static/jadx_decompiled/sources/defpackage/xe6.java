package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import one.me.sdk.vendor.StoreServicesInfo$ServicesNotAvailableException;

/* loaded from: classes2.dex */
public final class xe6 implements u8e {
    public final Context a;
    public final khe c;
    public final String b = xe6.class.getName();
    public int d = -1;
    public int e = -1;
    public final String f = "Google Play Services";

    public xe6(Context context, je7 je7Var, je7 je7Var2) {
        this.a = context;
        this.c = new khe(new a81(this, je7Var2, je7Var, 3));
    }

    public final boolean a() {
        if (this.d == -1) {
            this.d = ee6.d.b(this.a, fe6.a);
        }
        return this.d == 0;
    }

    public final Object b(tie tieVar) throws StoreServicesInfo$ServicesNotAvailableException {
        FirebaseMessaging firebaseMessaging;
        if (!a()) {
            throw new StoreServicesInfo$ServicesNotAvailableException();
        }
        lqc lqcVar = new lqc(v3c.u(tieVar));
        re6 re6Var = FirebaseMessaging.k;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(fl5.b());
        }
        firebaseMessaging.getClass();
        qne qneVar = new qne();
        firebaseMessaging.f.execute(new nl5(firebaseMessaging, qneVar, 1));
        qneVar.a.i(new qz7(this, 21, lqcVar));
        return lqcVar.a();
    }
}
