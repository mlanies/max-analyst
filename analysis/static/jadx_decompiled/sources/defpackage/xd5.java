package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class xd5 implements fu3, qj3, u98, ri8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ xd5(w98 w98Var, Object obj, int i) {
        this.a = i;
        this.c = w98Var;
        this.o = obj;
        this.b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    @Override // defpackage.qj3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void accept(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd5.accept(java.lang.Object):void");
    }

    @Override // defpackage.ri8
    public void b(oh8 oh8Var) {
        si8 si8Var = (si8) this.c;
        si8Var.getClass();
        ccd ccdVarQ = si8Var.f.q(oh8Var, zw6.n((tb8) this.o), -1, -9223372036854775807L);
        td tdVar = new td(si8Var, oh8Var, this.b, 13);
        ccdVarQ.d(new h76(ccdVarQ, 0, tdVar), nk4.a);
    }

    @Override // defpackage.u98
    public void c(qr6 qr6Var, int i) {
        switch (this.a) {
            case 2:
                w98 w98Var = (w98) this.c;
                w98Var.getClass();
                qr6Var.d(w98Var.c, i, ((h30) this.o).c(), this.b);
                break;
            case 3:
                w98 w98Var2 = (w98) this.c;
                w98Var2.getClass();
                ww6 ww6VarI = zw6.i();
                int i2 = 0;
                while (true) {
                    List list = (List) this.o;
                    if (i2 >= list.size()) {
                        qr6Var.J(w98Var2.c, i, new pu0(ww6VarI.j()), this.b);
                        break;
                    } else {
                        ww6VarI.a(((tb8) list.get(i2)).d(true));
                        i2++;
                    }
                }
            default:
                w98 w98Var3 = (w98) this.c;
                w98Var3.getClass();
                qr6Var.l0(w98Var3.c, i, ((tb8) this.o).d(true), this.b);
                break;
        }
    }

    @Override // defpackage.fu3
    public Object u(Task task) {
        if (((Integer) task.f()).intValue() != 402) {
            return task;
        }
        return imc.F((Context) this.c, (Intent) this.o, this.b).j(new cs(2), new nc5(25));
    }

    public /* synthetic */ xd5(hda hdaVar, boolean z, LinkedHashSet linkedHashSet) {
        this.a = 6;
        this.c = hdaVar;
        this.b = z;
        this.o = linkedHashSet;
    }

    public /* synthetic */ xd5(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = z;
    }
}
