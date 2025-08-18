package defpackage;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class wye {
    public final String a;
    public final l7b b;
    public volatile boolean c;
    public final Context d;
    public final je7 e = tu0.r(2, new vye(this, 1));
    public final je7 f = tu0.r(2, new vye(this, 0));
    public final qje g = new qje();
    public final x67 h;
    public final jo7 i;
    public final gaa j;
    public final djb k;

    public wye(Context context, String str, l7b l7bVar) {
        this.a = str;
        this.b = l7bVar;
        this.d = context.getApplicationContext();
        this.h = new x67(context, str);
        jo7 jo7Var = new jo7();
        jo7Var.a = context;
        jo7Var.b = str;
        jo7Var.c = new khe(new ie(12, jo7Var));
        this.i = jo7Var;
        this.j = new gaa(str, 28);
        this.k = new djb(context, str, false, 9);
    }

    public final yye a() {
        return (yye) this.e.getValue();
    }

    public final void b(String str, String str2) {
        if (this.c) {
            return;
        }
        qje qjeVar = this.g;
        qjeVar.getClass();
        String strY0 = w9e.Y0(31, str);
        String strY02 = w9e.Y0(31, str2);
        synchronized (((ConcurrentHashMap) qjeVar.b)) {
            String str3 = (String) ((ConcurrentHashMap) qjeVar.b).remove(strY0);
            ((ConcurrentHashMap) qjeVar.b).put(strY0, strY02);
            if (str3 == null && ((ConcurrentHashMap) qjeVar.b).size() > 30) {
                ((ConcurrentHashMap) qjeVar.b).entrySet().iterator().remove();
            }
        }
    }
}
