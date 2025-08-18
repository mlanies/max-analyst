package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gd4 implements mgc {
    public final Context a;
    public final qqd b;

    public gd4(Context context) {
        this.a = context;
        this.b = new qqd(10, context);
    }

    @Override // defpackage.mgc
    public final vj0[] a(Handler handler, o75 o75Var, o75 o75Var2, o75 o75Var3, o75 o75Var4) {
        ArrayList arrayList = new ArrayList();
        qqd qqdVar = this.b;
        Context context = this.a;
        arrayList.add(new t88(context, qqdVar, handler, o75Var));
        s74 s74Var = new s74();
        s74Var.d = context;
        s74Var.e = t30.c;
        s74Var.g = yb9.b;
        s74Var.a = false;
        s74Var.b = false;
        fm9.k(!s74Var.c);
        s74Var.c = true;
        if (((jo7) s74Var.f) == null) {
            m60[] m60VarArr = new m60[0];
            lpd lpdVar = new lpd();
            vud vudVar = new vud();
            jo7 jo7Var = new jo7();
            m60[] m60VarArr2 = new m60[m60VarArr.length + 2];
            jo7Var.a = m60VarArr2;
            System.arraycopy(m60VarArr, 0, m60VarArr2, 0, m60VarArr.length);
            jo7Var.b = lpdVar;
            jo7Var.c = vudVar;
            m60VarArr2[m60VarArr.length] = lpdVar;
            m60VarArr2[m60VarArr.length + 1] = vudVar;
            s74Var.f = jo7Var;
        }
        if (((ph4) s74Var.h) == null) {
            s74Var.h = new ph4(context, 15);
        }
        arrayList.add(new v78(this.a, this.b, handler, o75Var2, new e84(s74Var)));
        arrayList.add(new xpe(o75Var3, handler.getLooper()));
        arrayList.add(new r99(o75Var4, handler.getLooper()));
        arrayList.add(new ix1());
        arrayList.add(new tv6(ku6.y));
        return (vj0[]) arrayList.toArray(new vj0[0]);
    }
}
