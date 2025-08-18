package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z9d {
    public static final z9d b = new z9d(new HashSet());
    public static final String c;
    public final jx6 a;

    static {
        int i = oaf.a;
        c = Integer.toString(0, 36);
    }

    public z9d(Collection collection) {
        this.a = jx6.j(collection);
    }

    public static z9d b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c);
        if (parcelableArrayList == null) {
            z04.c0("Missing commands. Creating an empty SessionCommands");
            return b;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashSet.add(y9d.a((Bundle) parcelableArrayList.get(i)));
        }
        return new z9d(hashSet);
    }

    public final boolean a(int i) {
        fm9.e("Use contains(Command) for custom command", i != 0);
        Iterator<E> it = this.a.iterator();
        while (it.hasNext()) {
            if (((y9d) it.next()).a == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z9d) {
            return this.a.equals(((z9d) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
