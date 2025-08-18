package defpackage;

import bolts.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class gne implements gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gne(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu3
    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                fne fneVar = (fne) this.b;
                fneVar.getClass();
                boolean zIsCancelled = task.isCancelled();
                rne rneVar = fneVar.b;
                if (zIsCancelled) {
                    rneVar.a();
                    return null;
                }
                if (task.isFaulted()) {
                    rneVar.b(task.getError());
                    return null;
                }
                rneVar.c(task.getResult());
                return null;
            default:
                Collection collection = (Collection) this.b;
                if (collection.size() == 0) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Task) it.next()).getResult());
                }
                return arrayList;
        }
    }
}
