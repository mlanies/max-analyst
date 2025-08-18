package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class oo6 extends pnf {
    public final je7 X;
    public final SharedPreferences Y;
    public final ArrayList Z;
    public final o23 b;
    public final je7 c;
    public final je7 o;
    public final q0e s0;
    public final s35 t0;

    public oo6() {
        fi4 fi4Var = fi4.a;
        Context context = (Context) fi4Var.getAccessor().c(Context.class);
        khe kheVarD = fi4Var.getAccessor().d(f5a.class);
        khe kheVarD2 = fi4Var.getAccessor().d(m7b.class);
        khe kheVarD3 = fi4Var.getAccessor().d(kke.class);
        this.b = new o23(fi4Var.getAccessor().d(av0.class), fi4Var.getAccessor().d(f5a.class), fi4Var.getAccessor().d(xie.class), (Context) fi4Var.getAccessor().c(Context.class));
        this.c = kheVarD2;
        this.o = kheVarD3;
        this.X = kheVarD;
        this.Y = context.getSharedPreferences("dev_tools", 0);
        List listM = y53.M("api.oneme.ru", "api-test.oneme.ru", "api-tg.oneme.ru", "api-test2.oneme.ru");
        ArrayList arrayList = new ArrayList(listM.size());
        arrayList.addAll(listM);
        d63.X(arrayList, new String[0]);
        this.Z = arrayList;
        this.s0 = r0e.a(r());
        this.t0 = new s35(0);
    }

    public final m7b q() {
        return (m7b) this.c.getValue();
    }

    public final kl7 r() {
        kl7 kl7VarL = j1e.l();
        ArrayList arrayList = this.Z;
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            arrayList2.add(new go6(str, Boolean.valueOf(tpa.f(str, ((p7b) q()).a.D()))));
        }
        kl7VarL.addAll(arrayList2);
        String strI = "";
        String string = this.Y.getString("Custom", "");
        if (string != null && string.length() != 0) {
            strI = zr6.i(" (", string, ")");
        }
        kl7VarL.add(new go6(wg0.i("Custom", strI), Boolean.valueOf(tpa.f(string, ((p7b) q()).a.D()))));
        return j1e.d(kl7VarL);
    }

    public final void s(String str) {
        j47.T(this.a, ((w9a) ((kke) this.o.getValue())).a().plus(xq9.a), null, new no6(str, this, null), 2);
    }
}
