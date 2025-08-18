package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class j9f implements ao1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.ao1
    public final void onUrlSharingInfoUpdated(zn1 zn1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ao1) it.next()).onUrlSharingInfoUpdated(zn1Var);
        }
    }
}
