package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zm6 implements nk5 {
    public final String a;
    public final List b;
    public final boolean c;

    public zm6(String str, boolean z, List list) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}
