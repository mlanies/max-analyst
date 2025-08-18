package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g2f {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public g2f(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g2f)) {
            return false;
        }
        g2f g2fVar = (g2f) obj;
        return this.b == g2fVar.b && this.a.equals(g2fVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = rh4.o("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbO.append(this.b);
        sbO.append("\n");
        String strG = au1.g(sbO.toString(), "    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strG = strG + "    " + str + ": " + map.get(str) + "\n";
        }
        return strG;
    }
}
