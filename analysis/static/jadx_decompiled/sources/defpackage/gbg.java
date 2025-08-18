package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class gbg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8g b;
    public final /* synthetic */ hoc c;

    public /* synthetic */ gbg(k8g k8gVar, hoc hocVar, int i) {
        this.a = i;
        this.b = k8gVar;
        this.c = hocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hoc hocVar = this.c;
                k8g k8gVar = this.b;
                Iterator it = ((CopyOnWriteArrayList) k8gVar.b).iterator();
                while (it.hasNext()) {
                    loc locVar = (loc) it.next();
                    try {
                        locVar.d.put(hocVar, Long.valueOf(locVar.c.getAndIncrement()));
                    } catch (Throwable th) {
                        ((a4c) k8gVar.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsubmit", th);
                    }
                }
                break;
            case 1:
                hoc hocVar2 = this.c;
                k8g k8gVar2 = this.b;
                Iterator it2 = ((CopyOnWriteArrayList) k8gVar2.b).iterator();
                while (it2.hasNext()) {
                    try {
                        ((loc) it2.next()).d.remove(hocVar2);
                    } catch (Throwable th2) {
                        ((a4c) k8gVar2.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandremove", th2);
                    }
                }
                break;
            default:
                hoc hocVar3 = this.c;
                k8g k8gVar3 = this.b;
                Iterator it3 = ((CopyOnWriteArrayList) k8gVar3.b).iterator();
                while (it3.hasNext()) {
                    loc locVar2 = (loc) it3.next();
                    try {
                        Long l = (Long) locVar2.d.get(hocVar3);
                        if (l != null) {
                            locVar2.b.log(locVar2.a, "-> [" + l + "]: " + hocVar3);
                        }
                    } catch (Throwable th3) {
                        ((a4c) k8gVar3.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsent", th3);
                    }
                }
                break;
        }
    }
}
