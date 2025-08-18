package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class bnc extends OrientationEventListener {
    public int a;
    public final /* synthetic */ k8g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnc(k8g k8gVar, Context context) {
        super(context);
        this.b = k8gVar;
        this.a = -1;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        ArrayList arrayList;
        if (i == -1) {
            return;
        }
        int i2 = (i >= 315 || i < 45) ? 0 : i >= 225 ? 1 : i >= 135 ? 2 : 3;
        if (this.a != i2) {
            this.a = i2;
            synchronized (this.b.a) {
                arrayList = new ArrayList(((HashMap) this.b.c).values());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cnc cncVar = (cnc) it.next();
                cncVar.getClass();
                cncVar.b.execute(new l40(i2, 15, cncVar));
            }
        }
    }
}
