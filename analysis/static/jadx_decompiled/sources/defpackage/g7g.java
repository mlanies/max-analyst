package defpackage;

import android.text.TextUtils;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g7g extends kq0 {
    public static final String t = a14.O("WorkContinuationImpl");
    public final s7g l;
    public final String m;
    public final h65 n;
    public final List o;
    public final ArrayList p;
    public final ArrayList q = new ArrayList();
    public boolean r;
    public imc s;

    public g7g(s7g s7gVar, String str, h65 h65Var, List list) {
        this.l = s7gVar;
        this.m = str;
        this.n = h65Var;
        this.o = list;
        this.p = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String stringId = ((WorkRequest) list.get(i)).getStringId();
            this.p.add(stringId);
            this.q.add(stringId);
        }
    }

    public static HashSet N(g7g g7gVar) {
        HashSet hashSet = new HashSet();
        g7gVar.getClass();
        return hashSet;
    }

    @Override // defpackage.kq0
    public final pma l() {
        if (this.r) {
            a14.u().R(t, "Already enqueued work ids (" + TextUtils.join(", ", this.p) + ")");
        } else {
            imc imcVar = new imc(28);
            this.l.d.l(new h25(this, imcVar));
            this.s = imcVar;
        }
        return this.s;
    }

    @Override // defpackage.kq0
    public final xm7 q() {
        ArrayList<String> arrayList = this.q;
        s7g s7gVar = this.l;
        i8g i8gVarY = s7gVar.c.y();
        i8gVarY.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (");
        int size = arrayList.size();
        a14.c(sb, size);
        sb.append(")");
        xlc xlcVarA = xlc.a(size, sb.toString());
        int i = 1;
        for (String str : arrayList) {
            if (str == null) {
                xlcVarA.W(i);
            } else {
                xlcVarA.f(i, str);
            }
            i++;
        }
        v47 v47Var = ((ilc) i8gVarY.a).e;
        oef oefVar = new oef(i8gVarY, 2, xlcVarA);
        String[] strArrD = v47Var.d(new String[]{"WorkTag", "WorkProgress", "workspec"});
        for (String str2 : strArrD) {
            if (!v47Var.d.containsKey(str2.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2).toString());
            }
        }
        ph4 ph4Var = v47Var.j;
        lmc lmcVar = new lmc((ilc) ph4Var.a, ph4Var, oefVar, strArrD);
        mu1 mu1Var = h8g.v;
        wne wneVar = s7gVar.d;
        Object obj = new Object();
        bn8 bn8Var = new bn8();
        bn8Var.l(lmcVar, new bn7((bkb) wneVar, obj, mu1Var, bn8Var));
        return bn8Var;
    }
}
