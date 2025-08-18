package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;

/* loaded from: classes2.dex */
public final /* synthetic */ class jqf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lqf b;

    public /* synthetic */ jqf(lqf lqfVar, int i) {
        this.a = i;
        this.b = lqfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lqf lqfVar = this.b;
        boolean z = true;
        switch (this.a) {
            case 0:
                lqfVar.getClass();
                q9b.s0.Y.a(lqfVar.m);
                break;
            case 1:
                ((mqf) lqfVar.a.getValue()).a();
                ike ikeVar = (ike) lqfVar.c.getValue();
                ikeVar.getClass();
                hm9.n("ike", "syncAll");
                ikeVar.e.b(new av2((Object) ikeVar, (Object) Collections.emptyList(), true, 4));
                break;
            default:
                mqf mqfVar = (mqf) lqfVar.a.getValue();
                eua euaVar = (eua) lqfVar.e.getValue();
                euaVar.getClass();
                String[] strArr = eua.d;
                int i = 0;
                while (true) {
                    if (i < 2) {
                        String str = strArr[i];
                        imc imcVar = euaVar.c;
                        if (((SharedPreferences) ((khe) imcVar.c).getValue()).getBoolean(str, false) || z7.c(euaVar.a, str) != 0) {
                            i++;
                        } else {
                            hm9.n("lqf", "forceContactsSync");
                            String[] strArr2 = eua.d;
                            boolean zB = euaVar.b(eua.f);
                            SharedPreferences.Editor editorEdit = ((SharedPreferences) ((khe) imcVar.c).getValue()).edit();
                            for (int i2 = 0; i2 < 2; i2++) {
                                editorEdit.putBoolean(strArr2[i2], zB);
                            }
                            editorEdit.apply();
                        }
                    } else {
                        z = false;
                    }
                }
                mqfVar.b(z);
                break;
        }
    }
}
