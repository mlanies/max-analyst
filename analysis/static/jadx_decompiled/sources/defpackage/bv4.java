package defpackage;

import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class bv4 {
    public final au8 a;
    public final p82 b;
    public final t6b c;
    public final av0 d;
    public final q33 e;

    public bv4(au8 au8Var, p82 p82Var, t6b t6bVar, av0 av0Var, q33 q33Var) {
        this.a = au8Var;
        this.b = p82Var;
        this.c = t6bVar;
        this.d = av0Var;
        this.e = q33Var;
    }

    public final void a(final long j, long j2, final String str, final List list, final vx8 vx8Var, final List list2, final boolean z) {
        long j3;
        this.c.c.remove(Long.valueOf(j));
        final long jN = ((hyc) this.e).n();
        k56 k56Var = new k56() { // from class: av4
            @Override // defpackage.k56
            public final Object invoke() {
                bv4 bv4Var = this.a;
                au8 au8Var = bv4Var.a;
                long j4 = jN;
                long j5 = j;
                au8Var.A(j5, j4);
                if (z) {
                    ((k24) au8Var.a).c.n(j5, new z72(19, list2));
                }
                bv4Var.a.z(j5, str, list, bv4Var.b, vx8Var);
                return null;
            }
        };
        au8 au8Var = this.a;
        ((OneMeRoomDatabase) ((k24) au8Var.a).c.a.m()).p(new dlc(1, k56Var));
        p82 p82Var = this.b;
        e52 e52VarC = p82Var.C(j2);
        if (e52VarC != null) {
            j3 = j;
            if (e52VarC.b.j == j3) {
                p82Var.k0(j2, au8Var.q(j3), true);
            }
        } else {
            j3 = j;
        }
        if (e52VarC != null && e52VarC.b.L == j3 && au8Var.q(j3) != null) {
            p82Var.o0(j2);
        }
        this.d.c(new l6f(j2, j, 0));
    }
}
