package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes.dex */
public final /* synthetic */ class nl5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;
    public final /* synthetic */ qne c;

    public /* synthetic */ nl5(FirebaseMessaging firebaseMessaging, qne qneVar, int i) {
        this.a = i;
        this.b = firebaseMessaging;
        this.c = qneVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FirebaseMessaging firebaseMessaging = this.b;
                qne qneVar = this.c;
                re6 re6Var = FirebaseMessaging.k;
                firebaseMessaging.getClass();
                try {
                    bwf bwfVar = firebaseMessaging.c;
                    bwfVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    j1e.b(bwfVar.g(bwfVar.n(jjf.h((fl5) bwfVar.a), "*", bundle)));
                    re6 re6VarC = FirebaseMessaging.c(firebaseMessaging.b);
                    String strD = firebaseMessaging.d();
                    String strH = jjf.h(firebaseMessaging.a);
                    synchronized (re6VarC) {
                        String strM0 = re6.m0(strD, strH);
                        SharedPreferences.Editor editorEdit = ((SharedPreferences) re6VarC.b).edit();
                        editorEdit.remove(strM0);
                        editorEdit.commit();
                    }
                    qneVar.b(null);
                    return;
                } catch (Exception e) {
                    qneVar.a(e);
                    return;
                }
            default:
                qne qneVar2 = this.c;
                re6 re6Var2 = FirebaseMessaging.k;
                FirebaseMessaging firebaseMessaging2 = this.b;
                firebaseMessaging2.getClass();
                try {
                    qneVar2.b(firebaseMessaging2.a());
                    return;
                } catch (Exception e2) {
                    qneVar2.a(e2);
                    return;
                }
        }
    }
}
