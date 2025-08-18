package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class sw8 {
    public final rm4 a;

    public sw8(rm4 rm4Var) {
        this.a = rm4Var;
    }

    public static boolean a(e52 e52Var, qe5 qe5Var, boolean z) {
        if (e52Var == null || !e52Var.e0()) {
            return false;
        }
        return !e52Var.I() || e52Var.x() || (((se5) qe5Var).t() && ((e52Var.y() && z) || e52Var.d0() || oag.s(e52Var.e(e52Var.Y), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) || z));
    }

    public static boolean c(e52 e52Var, cu8 cu8Var) {
        k8g k8gVar;
        if (cu8Var.v()) {
            return false;
        }
        return (cu8Var.n() || !oag.t(cu8Var.s0) || (((k8gVar = cu8Var.z0) == null || ((z07) k8gVar.b) == null) && (k8gVar == null || ((wgc) k8gVar.c) == null))) && e52Var != null && e52Var.b.g() && cu8Var.c != 0 && cu8Var.M0 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.e52 r12, defpackage.es8 r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw8.b(e52, es8):boolean");
    }

    public final boolean d(e52 e52Var, es8 es8Var) {
        if (e52Var.U(((p7b) ((m7b) this.a.get())).e) && e52Var.b.g()) {
            cu8 cu8Var = es8Var.a;
            if (cu8Var.c != 0 && cu8Var.M0 == 0) {
                return true;
            }
        }
        return false;
    }
}
