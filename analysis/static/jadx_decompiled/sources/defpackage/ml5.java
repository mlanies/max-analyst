package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes.dex */
public final /* synthetic */ class ml5 implements x3a {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ ml5(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    @Override // defpackage.x3a
    public final void a(Object obj) throws NumberFormatException {
        boolean z;
        switch (this.a) {
            case 0:
                uxe uxeVar = (uxe) obj;
                if (!this.b.e.q() || uxeVar.h.a() == null) {
                    return;
                }
                synchronized (uxeVar) {
                    z = uxeVar.g;
                }
                if (z) {
                    return;
                }
                uxeVar.f(0L);
                return;
            default:
                r43 r43Var = (r43) obj;
                re6 re6Var = FirebaseMessaging.k;
                FirebaseMessaging firebaseMessaging = this.b;
                firebaseMessaging.getClass();
                if (r43Var != null) {
                    m6d.v(r43Var.a);
                    firebaseMessaging.f();
                    return;
                }
                return;
        }
    }
}
