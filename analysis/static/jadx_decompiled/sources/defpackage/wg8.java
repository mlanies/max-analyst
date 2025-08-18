package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class wg8 {
    public static final wg8 c = new wg8(null, new Bundle());
    public final Bundle a;
    public List b;

    public wg8(List list, Bundle bundle) {
        this.a = bundle;
        this.b = list;
    }

    public final void a() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("controlCategories");
            this.b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.b = Collections.emptyList();
            }
        }
    }

    public final ArrayList b() {
        a();
        return new ArrayList(this.b);
    }

    public final boolean c() {
        a();
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wg8)) {
            return false;
        }
        wg8 wg8Var = (wg8) obj;
        a();
        wg8Var.a();
        return this.b.equals(wg8Var.b);
    }

    public final int hashCode() {
        a();
        return this.b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(b().toArray()) + " }";
    }
}
