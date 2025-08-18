package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class hbg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8g b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int o;

    public /* synthetic */ hbg(k8g k8gVar, byte[] bArr, int i, int i2) {
        this.a = i2;
        this.b = k8gVar;
        this.c = bArr;
        this.o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i = this.o;
                k8g k8gVar = this.b;
                Iterator it = ((CopyOnWriteArrayList) k8gVar.b).iterator();
                while (it.hasNext()) {
                    loc locVar = (loc) it.next();
                    try {
                        locVar.getClass();
                        int i2 = wag.a[au1.s(i)];
                        byte[] bArr = this.c;
                        locVar.b.log(locVar.a, "<- ".concat(i2 != 1 ? i2 != 2 ? "<unknown>" : xj6.a(bArr) : new String(bArr)));
                    } catch (Throwable th) {
                        ((a4c) k8gVar.a).reportException("CallsListeners", "rtc.command.handle.listeners.ondatareceive", th);
                    }
                }
                break;
            default:
                int i3 = this.o;
                k8g k8gVar2 = this.b;
                Iterator it2 = ((CopyOnWriteArrayList) k8gVar2.b).iterator();
                while (it2.hasNext()) {
                    loc locVar2 = (loc) it2.next();
                    try {
                        locVar2.getClass();
                        int i4 = wag.a[au1.s(i3)];
                        byte[] bArr2 = this.c;
                        locVar2.b.log(locVar2.a, "-> ".concat(i4 != 1 ? i4 != 2 ? "<unknown>" : xj6.a(bArr2) : new String(bArr2)));
                    } catch (Throwable th2) {
                        ((a4c) k8gVar2.a).reportException("CallsListeners", "rtc.command.handle.listeners.ondatasend", th2);
                    }
                }
                break;
        }
    }
}
