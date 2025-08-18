package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class pt implements s01 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.s01
    public final void onAsrDataPackage(st stVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((s01) it.next()).onAsrDataPackage(stVar);
        }
    }
}
