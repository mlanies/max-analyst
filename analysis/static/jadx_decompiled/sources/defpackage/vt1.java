package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class vt1 implements Runnable {
    public final /* synthetic */ o9f X;
    public final /* synthetic */ vb0 Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ fu1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ fad o;

    public /* synthetic */ vt1(fu1 fu1Var, String str, fad fadVar, o9f o9fVar, vb0 vb0Var, List list, int i) {
        this.a = i;
        this.b = fu1Var;
        this.c = str;
        this.o = fadVar;
        this.X = o9fVar;
        this.Y = vb0Var;
        this.Z = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fu1 fu1Var = this.b;
                String str = this.c;
                fad fadVar = this.o;
                o9f o9fVar = this.X;
                vb0 vb0Var = this.Y;
                List list = this.Z;
                fu1Var.getClass();
                fu1Var.toString();
                fu1Var.a.I(str, fadVar, o9fVar, vb0Var, list);
                fu1Var.q();
                fu1Var.D();
                fu1Var.K();
                if (fu1Var.S0 == 9) {
                    fu1Var.B();
                    break;
                }
                break;
            case 1:
                fu1 fu1Var2 = this.b;
                fu1Var2.getClass();
                fu1Var2.toString();
                fu1Var2.a.I(this.c, this.o, this.X, this.Y, this.Z);
                fu1Var2.K();
                break;
            default:
                fu1 fu1Var3 = this.b;
                fu1Var3.getClass();
                fu1Var3.toString();
                LinkedHashMap linkedHashMap = (LinkedHashMap) fu1Var3.a.a;
                String str2 = this.c;
                m9f m9fVar = (m9f) linkedHashMap.get(str2);
                fad fadVar2 = this.o;
                o9f o9fVar2 = this.X;
                vb0 vb0Var2 = this.Y;
                List list2 = this.Z;
                if (m9fVar == null) {
                    m9fVar = new m9f(fadVar2, o9fVar2, vb0Var2, list2);
                    linkedHashMap.put(str2, m9fVar);
                }
                m9fVar.f = true;
                fu1Var3.a.I(str2, fadVar2, o9fVar2, vb0Var2, list2);
                fu1Var3.K();
                break;
        }
    }
}
