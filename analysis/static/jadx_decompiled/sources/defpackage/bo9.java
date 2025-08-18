package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class bo9 implements ke1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.ke1
    public final void onCallParticipantNetworkStatusChanged(List list) {
        if (((ArrayList) list).isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ke1) it.next()).onCallParticipantNetworkStatusChanged(list);
        }
    }
}
