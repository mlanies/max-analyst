package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class wjc implements ide {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public ide b = null;

    public final void a(ide ideVar) {
        this.b = ideVar;
        for (vjc vjcVar : this.a) {
            if (!vjcVar.g()) {
                vjcVar.p(ideVar);
            }
        }
    }

    @Override // defpackage.ide
    public final Object get() {
        vjc vjcVar = new vjc();
        vjcVar.h = null;
        vjcVar.p(this.b);
        this.a.add(vjcVar);
        return vjcVar;
    }
}
