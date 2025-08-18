package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class sh4 implements oh4 {
    public final r5g d;
    public int f;
    public int g;
    public r5g a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public ek4 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public sh4(r5g r5gVar) {
        this.d = r5gVar;
    }

    @Override // defpackage.oh4
    public final void a(oh4 oh4Var) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((sh4) it.next()).j) {
                return;
            }
        }
        this.c = true;
        r5g r5gVar = this.a;
        if (r5gVar != null) {
            r5gVar.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        sh4 sh4Var = null;
        int i = 0;
        while (it2.hasNext()) {
            sh4 sh4Var2 = (sh4) it2.next();
            if (!(sh4Var2 instanceof ek4)) {
                i++;
                sh4Var = sh4Var2;
            }
        }
        if (sh4Var != null && i == 1 && sh4Var.j) {
            ek4 ek4Var = this.i;
            if (ek4Var != null) {
                if (!ek4Var.j) {
                    return;
                } else {
                    this.f = this.h * ek4Var.g;
                }
            }
            d(sh4Var.g + this.f);
        }
        r5g r5gVar2 = this.a;
        if (r5gVar2 != null) {
            r5gVar2.a(this);
        }
    }

    public final void b(oh4 oh4Var) {
        this.k.add(oh4Var);
        if (this.j) {
            oh4Var.a(oh4Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            oh4 oh4Var = (oh4) it.next();
            oh4Var.a(oh4Var);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.h0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
