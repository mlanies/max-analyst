package defpackage;

import android.util.Pair;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class dk8 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object o;

    public /* synthetic */ dk8(WorkDatabase workDatabase, h8g h8gVar, h8g h8gVar2, List list, String str, Set set, boolean z) {
        this.a = 3;
        this.o = workDatabase;
        this.X = h8gVar;
        this.Y = h8gVar2;
        this.Z = str;
        this.b = set;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gk8 gk8Var = (gk8) this.o;
                ((hk8) this.X).u(gk8Var.b, (xj8) gk8Var.c, (xn7) this.Y, (pc8) this.Z, (IOException) this.b, this.c);
                return;
            case 1:
                jn jnVar = (jn) this.o;
                ((ik8) this.X).e(jnVar.b, (yj8) jnVar.c, (yn7) this.Y, (pc8) this.Z, (IOException) this.b, this.c);
                return;
            case 2:
                i74 i74Var = (i74) ((vk8) ((imc) this.o).c).j;
                Pair pair = (Pair) this.X;
                i74Var.e(((Integer) pair.first).intValue(), (yj8) pair.second, (yn7) this.Y, (pc8) this.Z, (IOException) this.b, this.c);
                return;
            default:
                WorkDatabase workDatabase = (WorkDatabase) this.o;
                i8g i8gVarY = workDatabase.y();
                k8g k8gVarZ = workDatabase.z();
                h8g h8gVar = (h8g) this.Y;
                h8g h8gVarB = h8g.b((h8g) this.X, null, h8gVar.b, null, null, h8gVar.k, h8gVar.n, h8gVar.t + 1, 515069);
                ilc ilcVar = (ilc) i8gVarY.a;
                ilcVar.b();
                ilcVar.c();
                try {
                    ((ha4) i8gVarY.c).B(h8gVarB);
                    ilcVar.r();
                    ilcVar.l();
                    ilc ilcVar2 = (ilc) k8gVarZ.a;
                    ilcVar2.b();
                    ktf ktfVar = (ktf) k8gVarZ.c;
                    q36 q36VarF = ktfVar.f();
                    String str = (String) this.Z;
                    q36VarF.f(1, str);
                    ilcVar2.c();
                    try {
                        q36VarF.n();
                        ilcVar2.r();
                        ilcVar2.l();
                        ktfVar.t(q36VarF);
                        k8gVarZ.v(str, (Set) this.b);
                        if (this.c) {
                            return;
                        }
                        i8gVarY.n(-1L, str);
                        workDatabase.x().f(str);
                        return;
                    } catch (Throwable th) {
                        ilcVar2.l();
                        ktfVar.t(q36VarF);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ilcVar.l();
                    throw th2;
                }
        }
    }

    public /* synthetic */ dk8(Object obj, Object obj2, Object obj3, Object obj4, IOException iOException, boolean z, int i) {
        this.a = i;
        this.o = obj;
        this.X = obj2;
        this.Y = obj3;
        this.Z = obj4;
        this.b = iOException;
        this.c = z;
    }
}
