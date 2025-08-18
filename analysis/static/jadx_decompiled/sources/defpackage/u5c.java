package defpackage;

import java.util.Arrays;
import java.util.Set;

/* loaded from: classes2.dex */
public interface u5c {
    /* JADX WARN: Multi-variable type inference failed */
    static void a(ol olVar, pke pkeVar) {
        pl plVar = olVar.c;
        if (plVar == null) {
            plVar = null;
        }
        if (((Set) ((qyc) ((y7d) plVar.d.getValue())).j.getValue()).contains(pkeVar.b)) {
            hm9.k0(olVar.getClass().getName(), null, "detect common reaction error, call onMaxFailCount() for task", Arrays.copyOf(new Object[]{pkeVar}, 1));
            ((hua) olVar).d();
        }
    }
}
