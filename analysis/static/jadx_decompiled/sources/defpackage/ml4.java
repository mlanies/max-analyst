package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import one.me.rlottie.RLottie;

/* loaded from: classes2.dex */
public final class ml4 {
    public static ArrayList j;
    public static ml4 k;
    public static final ArrayList l = new ArrayList();
    public static final wdg m = new wdg(2);
    public final int d;
    public int e;
    public int g;
    public boolean h;
    public final ArrayList a = new ArrayList(10);
    public final SparseIntArray b = new SparseIntArray();
    public final ArrayList c = new ArrayList(10);
    public final re i = new re(16, this);
    public final int f = ll4.j.nextInt();

    public ml4(int i) {
        this.d = i;
    }

    public static void a(Runnable runnable, boolean z) {
        if (!he.b()) {
            RLottie.getLogger().o(new RuntimeException("wrong thread"));
            return;
        }
        ArrayList arrayList = j;
        wdg wdgVar = m;
        if (arrayList == null) {
            ArrayList arrayList2 = l;
            if (arrayList2.isEmpty()) {
                j = new ArrayList(100);
            } else {
                j = (ArrayList) arrayList2.remove(arrayList2.size() - 1);
            }
            if (!z) {
                he.d(wdgVar);
            }
        }
        j.add(runnable);
        if (z) {
            he.a.removeCallbacks(wdgVar);
            wdgVar.run();
        }
    }
}
